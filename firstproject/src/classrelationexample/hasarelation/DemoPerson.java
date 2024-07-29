package classrelationexample.hasarelation;

public class DemoPerson {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Address add = new Address();
		add.setFlatno("607");
		add.setSocname("Rivera");
		add.setArea("Sarkhej");
		add.setpincode(382210);

		Person p1 = new Person();
		p1.setPname("Aryan");
		p1.setPemail("aryan22@gmail.com");
		p1.setAdd(add);

		System.out.println(p1);
	}

}
