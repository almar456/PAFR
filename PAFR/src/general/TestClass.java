package general;
public class TestClass {
	public static void main(String[] args) {
		WagonBuilder bld = new ConcreteWagonBuilder();
		Wagon pw1 = bld.build();
		pw1.setCompany("NS");
		System.out.println(pw1.toString());
	}
}