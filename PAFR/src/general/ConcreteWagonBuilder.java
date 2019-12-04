package general;

public class ConcreteWagonBuilder implements WagonBuilder{
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
	
	public ConcreteWagonBuilder() {
	}
	
	@Override
	public Wagon build() {
		if (cargo == null) {
			return new PassengerWagon(id, type, amountSeats, silent, length, toilet,
					company, constructionYear, status, emptyWeight);
		}else {
			return new FreightWagon(id, type, length, emptyWeight, maxWeight, cargo,
					company, constructionYear, status);
		}
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	@Override
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setAmountSeats(int amountSeats) {
		this.amountSeats = amountSeats;
	}

	@Override
	public void setSilent(boolean silent) {
		this.silent = silent;
	}

	@Override
	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}

	
}
