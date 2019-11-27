package general;

public class Train implements Carriage {
	private int id;
	private String type;
	private double length;
	private double selfWeight;
	private double maxPullWeight;
	private String propulsion;
	private double maxSpeed;
	private int constructionYear;
	private String status;
	private String company;
	
	public Train(int id, String type, double length, double selfWeight, double maxPullWeight, String propulsion,
			double maxSpeed, int constructionYear, String status, String company) {
		super();
		this.id = id;
		this.type = type;
		this.length = length;
		this.selfWeight = selfWeight;
		this.maxPullWeight = maxPullWeight;
		this.propulsion = propulsion;
		this.maxSpeed = maxSpeed;
		this.constructionYear = constructionYear;
		this.status = status;
		this.company = company;
	}	
	
	
}
