package general;

public class PassengerWagonFactory implements WagonFactory{
	private int id;
	private String type;
	private double length;
	private double emptyWeight;
	private double maxWeight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	private int amountSeats;
	private boolean silent;
	private boolean toilet;
	
	public PassengerWagonFactory(String type) {
		this.type = type;
	}
	
	@Override
	public Wagon build() {
			return new PassengerWagon(id, type, amountSeats, silent, length, toilet,
					company, constructionYear, status, emptyWeight);
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

	
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
