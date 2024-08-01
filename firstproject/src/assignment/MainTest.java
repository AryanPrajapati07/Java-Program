package assignment;

public class MainTest {

	public static void main(String[] args) {
		
		 AirIndia airIndia = new AirIndia(4, 900);
	     KingFisher kingFisher = new KingFisher(4, 900);
	     Indigo indigo = new Indigo(4, 900);
	     
	     System.out.printf("AirIndia Amount: "+ airIndia.calculateAmount()+"\n");
	     System.out.printf("KingFisher Amount: "+ kingFisher.calculateAmount()+"\n");
	     System.out.printf("Indigo Amount: "+ indigo.calculateAmount()+"\n");
	}

}
