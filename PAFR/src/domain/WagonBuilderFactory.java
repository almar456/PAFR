package domain;

public class WagonBuilderFactory {
	public String type;

	public WagonBuilderFactoryInterface build(String type) {
		if (type == "Passenger") {
			return new PassengerWagonBuilder(type);
		}else if(type == "Freight") {
			return new FreightWagonBuilder(type);
		} else { return null;}
	}
}
