package Racers;

public class RacerExtends extends Thread{
	private int i;

	public RacerExtends(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Racer Thread "+i+" imprimindo");
		}
	}
}
