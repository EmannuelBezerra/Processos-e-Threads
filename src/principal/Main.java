package principal;

import entidades.Consumidor;
import entidades.Deposito;
import entidades.Produtor;

public class Main {

	public static void main(String[] args) {
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep, 50);
		Consumidor c1 = new Consumidor(dep, 150);
		Consumidor c2 = new Consumidor(dep, 100);
		Consumidor c3 = new Consumidor(dep, 150);
		Consumidor c4 = new Consumidor(dep, 100);
		Consumidor c5 = new Consumidor(dep, 150);
		//Startar o produtor
		p.start();
		
		//Esperar a produção acabar
		try {
			p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Startar os consumidores.
		c1.start(); 
		c2.start(); 
		c3.start();
		c4.start(); 
		c5.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Execucao do main da classe Deposito terminada");
	}

}
