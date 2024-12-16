class SportsCar implements Car {
	private boolean engineOn = false;
	private int rpm = 0;

	public void startEngine() {
		engineOn = true;
		rpm = 1000; 
	       	System.out.println("SportsCar: Двигатель запущен!");
       	}	                  
	
	public int Rpm() {
		if (!engineOn) {
			System.out.println("SportsCar: Двигатель не запущен!");
			return 0;
		}
		rpm += 500;
	       	System.out.println("SportsCar: Обороты двигателя = " + rpm);
		return rpm;
	}                                                                                                    
       
	public int drive(int r) {
		if (!engineOn || r == 0) {
			System.out.println("SportsCar: Невозможно двигаться, двигатель выключен или обороты = 0");
			return 0;
		}
		int speed = r / 10;
		System.out.println("SportsCar: Скорость = " + speed + " км/ч");
		return speed;
	}                                                                                                                                                                               
       
	public void stopEngine() {	
		engineOn = false;
		rpm = 0;
		System.out.println("SportsCar: Двигатель остановлен!");
	}
}
