package general;

public class FreightWagon {
	private int id;
	private String type;
	private double length;
	private double emptyWeight;
	private double maxWeight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	
	public FreightWagon(int id, String type, double length, double emptyWeight, double maxWeight, String cargo,
			String company, int constructionYear, String status) {
		super();
		this.id = id;
		this.type = type;
		this.length = length;
		this.emptyWeight = emptyWeight;
		this.maxWeight = maxWeight;
		this.cargo = cargo;
		this.company = company;
		this.constructionYear = constructionYear;
		this.status = status;
	}
}
