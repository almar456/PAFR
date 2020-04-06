package domain;

public interface Wagon extends Carriage{
	void setId(int id);
	void setCompany(String company);
	void setWeight(double emptyWeight);
	void setLength(double length);
	void setStatus(String status);
	String toString();
}
