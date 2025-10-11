package Principal;

import java.util.ArrayList;
import java.util.List;

import Racers.RacerRunnable;

public class Race {

	public static void main(String[] args) {
		List<Thread> racersPares = new ArrayList<>();
		List<Thread> racersImpares = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			RacerRunnable racer = new RacerRunnable(i);
			Thread thread = new Thread(racer);
			
			if(i%2==0) {
				racersPares.add(thread);
			}else {
				racersImpares.add(thread);
			}
		}
		
		//Iniciando ímpares
		System.out.println("Iniciando impares");
		for(Thread a : racersImpares) {
			a.start();
		}
		
		try {
			System.out.println("Esperando impares terminarem...");
			for(Thread a : racersImpares) {
				a.join();
			}
			System.out.println("Impares terminaram.");
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		//Iniciando os pares
		System.out.println("Iniciando pares");
		for(Thread a : racersPares) {
			a.start();
		}
		
		try {
			System.out.println("Esperando pares terminarem...");
			for(Thread a : racersPares) {
				a.join();
			}
			System.out.println("Pares terminaram.");
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("===FIM===");
	}
}
