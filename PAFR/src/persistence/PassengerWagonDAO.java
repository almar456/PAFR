package persistence;

public interface PassengerWagonDAO {
	public void addPassengerWagon(String type, int amountSeats, boolean silent, double length, boolean toilet, String company,
			int constructionYear, double emptyWeight);
}
