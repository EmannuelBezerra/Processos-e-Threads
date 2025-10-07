package Racers;

public class RacerRunnable implements Runnable{
	private int i;
	
	public RacerRunnable(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Racer Runnable "+i+" imprimindo");
			
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
