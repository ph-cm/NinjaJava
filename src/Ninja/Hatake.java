package Ninja;

import Contratos.Sharingan;

public class Hatake extends Ninja implements Sharingan{
	
	public Hatake(String name, int idade, String vila, String rank)
	{
		super(name, idade, vila, rank);
	}
	public void usarChidori()
	{
		System.out.println("Usando Chidori");
	}
	
	public void sharingan()
	{
		System.out.println("Sharingan Ativado");
	}
}
