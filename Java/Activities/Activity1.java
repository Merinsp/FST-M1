package activities;

public class Activity1 {
	
	public static void main(String[] args) {
	Car Maruthi= new Car();
	Maruthi.make= 2014;
	Maruthi.colour="Black";
	Maruthi.transmission="Manual";
	System.out.println("What are the charecteristics of the car?");
	Maruthi.displayCharacterstics();
	System.out.println("Is the Car moving?");
    Maruthi.accelerate();
    System.out.println("Is the Car moving?");
    Maruthi.brake();

	
}
}