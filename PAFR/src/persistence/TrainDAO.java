package persistence;

import domain.Train;

public interface TrainDAO {
	public void addTrain(double length, double weight, String propulsion, double maxSpeed, String company);
	public Train getTrain(int id);
	public boolean updateTrain(int id, double length, double weight, String propulsion, double speed, String company,
			String status);
	public boolean deleteTrain(int id);
	public boolean checkWagons(int id);

}
