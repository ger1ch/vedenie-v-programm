public class CarDemo {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar();
		Car familyCar = new FamilyCar();
		Car finalCar = new FinalCar();
		
		System.out.println("=== SportsCar ===");
		sportsCar.startEngine();
		sportsCar.Rpm();
		sportsCar.drive(3000);					       
	       	sportsCar.stopEngine();

		System.out.println("\n=== FamilyCar ===");							     
	     	familyCar.startEngine();					
		familyCar.Rpm();									      
	      	familyCar.drive(0);     										      
	      	familyCar.drive(1200); 										       
	      	familyCar.drive(0);     											       
	       	familyCar.stopEngine();												   

		System.out.println("\n=== FinalCar ===");
		finalCar.startEngine();
		finalCar.Rpm();
		finalCar.drive(2000);   
		finalCar.stopEngine();
	}
}
