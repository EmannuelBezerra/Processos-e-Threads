package entidades;

public class Produtor extends Thread {
	private int tempo;
	Deposito deposito;
	
	public Produtor(Deposito deposito, int tempo) {
		this.tempo = tempo;
		this.deposito = deposito;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public void run() {
		int qtd_itens = deposito.getNumItens();
		if(qtd_itens>=deposito.getCapacidade()) {
			System.out.println("Deposito cheio");
		}else {
			for(int i = qtd_itens; i < deposito.getCapacidade(); i++){
				deposito.colocar();
				System.out.println("Produtor colocou uma caixa, Total: "+deposito.getNumItens());
				try {
					Thread.sleep(tempo);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
