package Principal;
import Racers.RacerExtends;
import Racers.RacerRunnable;
public class programa01 {

	public static void main(String[] args) {
		RacerExtends racer1 = new RacerExtends(1);
		racer1.run();
		
		RacerRunnable racer2 = new RacerRunnable(2);
		Thread thread = new Thread(racer2);
		thread.start();

	}

}
