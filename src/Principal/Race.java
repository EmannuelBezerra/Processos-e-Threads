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
			
			//Definindo prioridades
			if(i <= 3) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else if (i <= 7) {
				thread.setPriority(Thread.NORM_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			
			racers.add(thread);
		}
		
		System.out.println("Prioridade minima: Racers 1,2,3\nPrioridade normal: Racers 4,5,6,7\nPrioridade máxima: racers 8,9,10");
		for(Thread a : racers) {
			a.start();
		}
	}
}
