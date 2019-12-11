package general;

public class FreightWagonFactory implements WagonFactory{
	private int id;
	private String type;
	private double length;
	private double emptyWeight;
	private double maxWeight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	
	public FreightWagonFactory(String type) {
		this.type = type;
	}
	
	@Override
	public FreightWagon build() {
		return new FreightWagon(type);
	}
}
