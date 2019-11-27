package general;

public class PassengerWagon {
	private int id;
	private String type;
	private int amountSeats;
	private boolean silent;
	private double length;
	private boolean toilet;
	private String company;
	private int constructionYear;
	private String status;
	private double weight;
	
	public PassengerWagon(int id, String type, int amountSeats, boolean silent, double length, boolean toilet,
			String company, int constructionYear, String status, double weight) {
		super();
		this.id = id;
		this.type = type;
		this.amountSeats = amountSeats;
		this.silent = silent;
		this.length = length;
		this.toilet = toilet;
		this.company = company;
		this.constructionYear = constructionYear;
		this.status = status;
		this.weight = weight;
	}
}
