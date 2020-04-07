package domain;

public class Train implements Carriage {
	private int id;
	private String type;
	private double length;
	private double weight;
	private String propulsion;
	private double maxSpeed;
	private int constructionYear;
	private String status;
	private String company;
	
	public Train(int id, String type, double length, double weight, String propulsion,
			double maxSpeed, int constructionYear, String status, String company) {
		super();
		this.id = id;
		this.type = type;
		this.length = length;
		this.weight = weight;
		this.propulsion = propulsion;
		this.maxSpeed = maxSpeed;
		this.constructionYear = constructionYear;
		this.status = status;
		this.company = company;
	}

	public Train() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}	
	
	
}
