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
	
	
}
