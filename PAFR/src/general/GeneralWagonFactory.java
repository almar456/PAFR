package general;

public class GeneralWagonFactory {
	public String type;

	public WagonFactory build(String type) {
		if (type == "Passenger") {
			return new PassengerWagonFactory(type);
		}else if(type == "Freight") {
			return new FreightWagonFactory(type);
		} else { return null;}
	}
}
