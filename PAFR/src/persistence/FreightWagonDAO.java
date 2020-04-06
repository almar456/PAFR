package persistence;

public interface FreightWagonDAO {
	public void addFreightWagon(String type, double length, double weight, String cargo,
			String company, int constructionYear);
}
