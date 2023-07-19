package di.pojo;

public class Car {

	private Tire tire;
	
	public Car() {
	
	}
	
			
//		tire = new KumhoTire();
//		tire = new HankookTire();

	public Car(Tire tire) {
		this.tire = tire;
		
	}
	
	public void printTireBrand() {
		System.out.println("������ Ÿ�̾� : " + tire.getBrand());
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}


	
	
}
