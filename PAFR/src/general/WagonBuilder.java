package general;

public interface WagonBuilder{
	public void setId(int id);
	public void setType(String type);
	public void setAmountSeats(int amountSeats);
	public void setSilent(boolean silent);
	public void setLength(double length);
	public void setToilet(boolean toilet);
	public void setCompany(String company);
	public void setStatus(String status);
	public void setEmptyWeight(double emptyWeight);
	public void setMaxWeight(double maxWeight);
	public void setCargo(String cargo);
	public Wagon build();
}
