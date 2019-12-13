package persistence;

public interface TrainDAO {
	public void addTrain(String type, double length, double selfWeight, double maxPullWeight, String propulsion, double maxSpeed,
			int constructionYear, String company);
}
