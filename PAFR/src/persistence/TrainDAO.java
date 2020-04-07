package persistence;

public interface TrainDAO {
	public void addTrain(double length, double weight, String propulsion, double maxSpeed, String company);
}
