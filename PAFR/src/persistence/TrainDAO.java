package persistence;

public interface TrainDAO {
	public void addTrain(String type, double length, double weight, String propulsion, double maxSpeed,
			int constructionYear, String company);
}
