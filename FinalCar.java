class FinalCar implements Car {
	private boolean engineOn = false;
	private int rpm = 0;
       
	public void startEngine() {
		engineOn = true;
		rpm = 700;
		System.out.println("FinalCar: Двигатель запущен!");
	}

        public int Rpm() {
		if (!engineOn) {
			System.out.println("FinalCar: Двигатель не запущен!");
			return 0;
		}
		rpm += 300; 
		System.out.println("FinalCar: Обороты двигателя = " + rpm);
		return rpm;
	}
    
	public int drive(int r) {
		if (!engineOn || r == 0) {
			System.out.println("FinalCar: Машина не двигается. Скорость = 0 км/ч");
			return 0;
		}
		int speed = r / 8; 
		System.out.println("FinalCar: Скорость = " + speed + " км/ч");
		return speed;
	}

	public void stopEngine() {
		engineOn = false;
		rpm = 0;
		System.out.println("FinalCar: Двигатель остановлен!");						   
       	}
}


