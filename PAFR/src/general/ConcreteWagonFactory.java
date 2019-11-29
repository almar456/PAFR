package general;

public class ConcreteWagonFactory implements WagonFactory{
	
	public ConcreteWagonFactory() {
	}
	
	@Override
	public Wagon buildWagon(String type) {
		if (type == "Freight") {
			return new FreightWagon(type);
		}else if (type == "Passenger") {
			return new PassengerWagon(type);
		} else {
		return null;
		}
	}
	
}
