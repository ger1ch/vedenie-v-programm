class FamilyCar implements Car {
	private boolean engineOn = false;
	private int rpm = 0;
	
	public void startEngine() {
		engineOn = true;
	    	rpm = 0; 
		System.out.println("FamilyCar: Двигатель запущен!");
	}

	public int Rpm() {
		if (!engineOn) {
			System.out.println("FamilyCar: Двигатель не запущен!");
			return 0;
		}
		if (rpm == 0) {
			System.out.println("FamilyCar: Оборотов нет.");
		} else {
			System.out.println("FamilyCar: Обороты двигателя = " + rpm);
		}
		return rpm;
	}
	public int drive(int r) {
		if (!engineOn) {
			System.out.println("FamilyCar: Двигатель не запущен. Скорость = 0 км/ч");
			return 0;
		}
		rpm = r;
		if (rpm == 0) {
			int defaultSpeed = 60;		
			System.out.println("FamilyCar: Оборотов нет, но машина движется со скоростью = " + defaultSpeed + " км/ч");
			return defaultSpeed;
		}
		int speed = rpm / 15;
		System.out.println("FamilyCar: Скорость = " + speed + " км/ч");
		return speed;
	}

	public void stopEngine() {
		engineOn = false;
		rpm = 0;
		System.out.println("FamilyCar: Двигатель остановлен!");
	}
}
