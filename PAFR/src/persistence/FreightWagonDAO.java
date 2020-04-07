package persistence;

import domain.FreightWagon;

public interface FreightWagonDAO {
	public void addFreightWagon(double length, double weight, String cargo,
			String company);
	public FreightWagon getFreightWagon(int id);
	public boolean deleteFreightWagon(int id);
	public boolean updateFreightWagon(int id, double length, double weight, String cargo, String company, String status);
	public boolean disconnectWagon(int id);
}
