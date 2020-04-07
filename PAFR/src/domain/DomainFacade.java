package domain;

import java.util.ArrayList;
import java.util.Collections;

import persistence.FreightWagonPostgresDAOImpl;
import persistence.PassengerWagonPostgresDAOImpl;
import persistence.TrainPostgresDAOImpl;

public class DomainFacade {
	
	public ArrayList<String> getIdsByTrain(int trainId){
		FreightWagonPostgresDAOImpl dao1 = FreightWagonPostgresDAOImpl.getInstance();
		PassengerWagonPostgresDAOImpl dao2 = PassengerWagonPostgresDAOImpl.getInstance();
		
		ArrayList<String> lst1 = dao1.getIdByTrain(trainId);
		ArrayList<String> lst2 = dao2.getIdByTrain(trainId);
		
		lst1.addAll(lst2);
		return lst1;
	}
	
	public void addTrain(double length, double weight, String propulsion, double maxSpeed, String company) {
		TrainPostgresDAOImpl dao = TrainPostgresDAOImpl.getInstance();
		dao.addTrain(length, weight, propulsion, maxSpeed, company);
	}
	
	public void addFWagon(double length, double weight, String cargo, String company) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		dao.addFreightWagon(length, weight, cargo, company);
	}
	
	public void addPWagon(int amountSeats, boolean silent, double length, boolean toilet,
			String company, double weight) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		dao.addPassengerWagon(amountSeats, silent, length, toilet,
				company, weight);
	}

	public Train getTrainFromDb(int id) {
		TrainPostgresDAOImpl dao = TrainPostgresDAOImpl.getInstance();
		Train tr = dao.getTrain(id);
		return tr;
	}
	
	public FreightWagon getFWFromDb(int id) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		FreightWagon fw = dao.getFreightWagon(id);
		return fw;
	}
	
	public PassengerWagon getPWFromDb(int id) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		PassengerWagon pw = dao.getPassengerWagon(id);
		return pw;
	}
	
	public boolean updateTrain(int id, double length, double weight, String propulsion, double speed, String company,
	String status) {
		TrainPostgresDAOImpl dao = TrainPostgresDAOImpl.getInstance();
		if (dao.updateTrain(id, length, weight, propulsion, speed, company, status)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean updateFW(int id, double length, double weight, String cargo, String company, String status) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		if (dao.updateFreightWagon(id, length, weight, cargo, company, status)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean updatePW(int id, double length, double weight, int seats, boolean silent, boolean toilet, String company, String status) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		if (dao.updatePassengerWagon(id, length, weight, seats, silent, toilet, company, status)) {
			return true;
		} else {
		return false;
		}
	}

	public boolean deleteTrainFromDb(int id) {
		TrainPostgresDAOImpl dao = TrainPostgresDAOImpl.getInstance();
		if (dao.deleteTrain(id)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean deleteFWFromDb(int id) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		if (dao.deleteFreightWagon(id)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean deletePWFromDb(int id) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		if (dao.deletePassengerWagon(id)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean disconnectFW(int id) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		if (dao.disconnectWagon(id)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean disconnectPW(int id) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		if (dao.disconnectWagon(id)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean connectPW(int wagonId, int trainId) {
		PassengerWagonPostgresDAOImpl dao = PassengerWagonPostgresDAOImpl.getInstance();
		if (dao.connectWagon(wagonId, trainId)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean connectFW(int wagonId, int trainId) {
		FreightWagonPostgresDAOImpl dao = FreightWagonPostgresDAOImpl.getInstance();
		if (dao.connectWagon(wagonId, trainId)) {
			return true;
		} else {
		return false;
		}
	}

	public boolean addUWagon(String type, int wagonId, int trainId) {
		if (type.equals("Freight")) {
			return this.connectFW(wagonId, trainId);
		} else if (type.equals("Passenger")) {
			return this.connectPW(wagonId, trainId);
		} else {
			return false;
		}
	}
	
}
