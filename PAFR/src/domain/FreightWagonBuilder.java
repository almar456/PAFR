package domain;

public class FreightWagonBuilder implements WagonBuilderFactoryInterface{
	private int id;
	private String type;
	private double length;
	private double weight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	
	public FreightWagonBuilder(String type) {
		this.type = type;
	}
	
	@Override
	public FreightWagon build() {
		return new FreightWagon(type, length, weight, cargo, company, constructionYear, status);
	}
}
