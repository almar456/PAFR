package general;

public class PassengerWagon implements Wagon {
	private int id;
	private String type;
	private int amountSeats;
	private boolean silent;
	private double length;
	private boolean toilet;
	private String company;
	private int constructionYear;
	private String status;
	private double emptyWeight;
	

	public PassengerWagon(int id, String type, int amountSeats, boolean silent, double length, boolean toilet,
			String company, int constructionYear, String status, double emptyWeight) {
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
		this.emptyWeight = emptyWeight;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public int getAmountSeats() {
		return amountSeats;
	}

	public void setAmountSeats(int amountSeats) {
		this.amountSeats = amountSeats;
	}

	public boolean isSilent() {
		return silent;
	}

	public void setSilent(boolean silent) {
		this.silent = silent;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isToilet() {
		return toilet;
	}

	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}
	
	@Override
	public String toString() {
		return "This "+type+" wagon belongs to "+company+".";
	}
	
}
