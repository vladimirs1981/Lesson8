package examples;

public class Car {

	Engine engine = new Engine();
	DriveTrain driveTrain = new DriveTrain();
	
	void go() {
		engine.combust();
		driveTrain.engage();
	}
	
	public static void main(String[] args) {
		new Car().go();
	}

}

class Engine {

	public void combust() {
		System.out.println("burning fuel");
		
	}
}

class DriveTrain {

	public void engage() {
		System.out.println("spinning wheels");
		
	}

}
