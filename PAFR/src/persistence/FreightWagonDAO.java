package persistence;

import java.util.ArrayList;

import domain.FreightWagon;

public interface FreightWagonDAO {
	public void addFreightWagon(double length, double weight, String cargo,
			String company);
	public FreightWagon getFreightWagon(int id);
	public boolean deleteFreightWagon(int id);
	public boolean updateFreightWagon(int id, double length, double weight, String cargo, String company, String status);
	public boolean disconnectWagon(int id);
	public ArrayList<String> getIdByTrain(int trainId);
	boolean connectWagon(int wagonId, int trainId);
}
