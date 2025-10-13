package entidades;

public class Deposito {
private int items = 0;
private final int capacidade = 100;

	public int getNumItens(){
		return items;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public synchronized boolean retirar() {
		if(items > 0) {
			items=getNumItens() - 1;
			return true;
		}else return false;
	}
	public synchronized boolean colocar() {
		items=getNumItens() +1;
	return true;
	}
	

}
