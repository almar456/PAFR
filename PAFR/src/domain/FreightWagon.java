package domain;

public class FreightWagon implements Wagon{
	private int id;
	private String type;
	private double length;
	private double weight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	private int trainId;
	
	public FreightWagon(String type) {
		this.type = type;
	}

	public FreightWagon(String type, double length, double weight, String cargo,
			String company, int constructionYear, String status, int trainId) {
		super();
		this.type = type;
		this.length = length;
		this.weight = weight;
		this.cargo = cargo;
		this.company = company;
		this.constructionYear = constructionYear;
		this.status = status;
		this.trainId = trainId;
	}

	public FreightWagon(int id, String type, double length, double weight, String cargo,
			String company, int constructionYear, String status, int trainId) {
		super();
		this.id = id;
		this.type = type;
		this.length = length;
		this.weight = weight;
		this.cargo = cargo;
		this.company = company;
		this.constructionYear = constructionYear;
		this.status = status;
		this.trainId = trainId;
	}


	@Override
	public void setId(int id) {
		this.id = id;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	@Override
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}

	public double getWeight() {
		return weight;
	}

	public String getCargo() {
		return cargo;
	}

	public String getCompany() {
		return company;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "This "+type+" wagon belongs to "+company+".\nIt is "+length+"m long and it weighs "+weight+"kg.\n"
				+ "This wagon is currently "+status+". It was built in "+constructionYear+" and currently contains "+cargo+".";
	}
}
