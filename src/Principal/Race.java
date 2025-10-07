package Principal;

import java.util.ArrayList;
import java.util.List;

import Racers.RacerRunnable;

public class Race {

	public static void main(String[] args) {
		List<Thread> racers = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			RacerRunnable racer = new RacerRunnable(i);
			Thread thread = new Thread(racer);
			racers.add(thread);
		}
		
		for(Thread a : racers) {
			a.start();
		}
	}
}
