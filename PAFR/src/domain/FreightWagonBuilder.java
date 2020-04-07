package domain;

import persistence.FreightWagonPostgresDAOImpl;

public class FreightWagonBuilder implements WagonBuilderFactoryInterface{
	private int id;
	private String type;
	private double length;
	private double weight;
	private String cargo;
	private String company;
	private int constructionYear;
	private String status;
	private int trainId;
	
	public FreightWagonBuilder() {
		
	}
	
	public FreightWagonBuilder(String type) {
		this.type = type;
	}
	
	@Override
	public FreightWagon build() {
		return new FreightWagon(type, length, weight, cargo, company, constructionYear, status, trainId);
	}
	
	@Override
	public FreightWagon buildWithId() {
		return new FreightWagon(id, type, length, weight, cargo, company, constructionYear, status, trainId);
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
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

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
