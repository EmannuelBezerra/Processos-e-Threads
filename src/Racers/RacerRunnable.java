package Racers;

public class RacerRunnable implements Runnable{
	private int i;
	private static final int MAX_PRINTS = 1000;
	
	public RacerRunnable(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		for(int count = 1; count <= MAX_PRINTS; count++) {
			System.out.println("Racer Runnable "+i+" imprimindo "+count+"/"+MAX_PRINTS);
			
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Racer "+i+" FINALIZOU");
	}
}
