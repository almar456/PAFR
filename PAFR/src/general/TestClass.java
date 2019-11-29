package general;
public class TestClass {
	public static void main(String[] args) {
		WagonFactory fact = new ConcreteWagonFactory();
		Wagon pw1 = fact.buildWagon("Passenger");
		pw1.setCompany("NS");
		System.out.println(pw1.toString());
	}
}