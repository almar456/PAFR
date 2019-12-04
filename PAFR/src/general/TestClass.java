package general;
public class TestClass {
	public static void main(String[] args) {
		WagonBuilder bld = new ConcreteWagonBuilder();
		bld.setCargo("Joden");
		bld.setCompany("NS");
		bld.setEmptyWeight(2000);
		bld.setId(1);
		bld.setLength(6.7);
		bld.setMaxWeight(4000);
		bld.setStatus("unused");
		bld.setType("Cargo");
		Wagon fw1 = bld.build();
		
		WagonBuilder bld2 = new ConcreteWagonBuilder();
		bld2.setCompany("NS");
		bld2.setEmptyWeight(2000);
		bld2.setId(2);
		bld2.setLength(6.7);
		bld2.setStatus("unused");
		bld2.setType("Intercity");
		bld2.setAmountSeats(200);
		
		Wagon pw1 = bld2.build();
		
		System.out.println(fw1.toString()+"\n\n"+pw1.toString());
	}
}