package Main;

import Ninja.Hatake;

public class Main {

	public static void main(String[] args) {
		
		Hatake kakashi = new Hatake("Kakashi", 30, "Folha", "Kage");
		System.out.println(kakashi);
		
		//Every class derivated from Ninja can
		kakashi.ataqueLeve();
		kakashi.ataquePesado();
		System.out.println("----------------------");
		//Only Hatake class can
		kakashi.usarChidori();
		System.out.println("----------------------");
		//Only classes that has the "Contract" to sharingan
		kakashi.sharingan();
		
		
		

	}

}
