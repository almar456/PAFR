package domain;

import persistence.FreightWagonPostgresDAOImpl;
import persistence.PassengerWagonPostgresDAOImpl;
import persistence.TrainPostgresDAOImpl;

public class DomainFacade {
	
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
	
}
