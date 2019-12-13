package persistence;

public interface FreightWagonDAO {
	public void addFreightWagon(String type, double length, double emptyWeight, double maxWeight, String cargo,
			String company, int constructionYear);
}
