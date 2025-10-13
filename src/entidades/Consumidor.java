package entidades;

public class Consumidor extends Thread {
	private int temp;
	Deposito deposito;
	
	public Consumidor(Deposito deposito, int temp) {
		this.temp = temp;
		this.deposito = deposito;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public void run() {
		
	while(true) {
		if(deposito.getNumItens()<20) {
			System.out.println("Deposito com quantidade insuficiente (Menor que 20)");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			for(int i = 0; i < 20; i++){
				deposito.retirar();
				System.out.println("Consumidor "+Thread.currentThread().getName()+" retirou caixa "+(i+1));
				try {
					Thread.sleep(temp);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			break;
		
	}
		}
	}
}
