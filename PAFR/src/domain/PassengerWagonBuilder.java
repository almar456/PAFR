package domain;

public class PassengerWagonBuilder implements WagonBuilderFactoryInterface{
	private int id;
	private String type;
	private double length;
	private double weight;
	private String company;
	private int constructionYear;
	private String status;
	private int amountSeats;
	private boolean silent;
	private boolean toilet;
	
	public PassengerWagonBuilder(String type) {
		this.type = type;
	}
	
	@Override
	public Wagon build() {
			return new PassengerWagon(id, type, amountSeats, silent, length, toilet,
					company, constructionYear, status, weight);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public void setLength(double length) {
		this.length = length;
	}

	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public void setCompany(String company) {
		this.company = company;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public void setAmountSeats(int amountSeats) {
		this.amountSeats = amountSeats;
	}

	
	public void setSilent(boolean silent) {
		this.silent = silent;
	}

	
	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}

	
}
