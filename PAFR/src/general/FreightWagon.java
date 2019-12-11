package general;

public class FreightWagon implements Wagon{
	private int id;
	private String type;
	private double length;
	private double emptyWeight;
	private double maxWeight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	
	public FreightWagon(String type) {
		this.type = type;
	}

	
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


	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "This "+type+" wagon belongs to "+company+".\nIt is "+length+"m long and it weighs "+emptyWeight+"kg when empty.\n"
				+ "The maximum supported cargo capacity is "+(maxWeight-emptyWeight)+"kg.\n"
				+ "This wagon is currently "+status+". It was built in "+constructionYear+" and currently contains "+cargo+".";
	}
}
