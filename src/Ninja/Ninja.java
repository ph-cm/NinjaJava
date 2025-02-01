package Ninja;

public class Ninja {
	
	private String name;
	private int idade;
	private String vila;
	private String ninjaNivel;
	
	//Construtors
	public Ninja()
	{
		
	}
	
	public Ninja(String name, int idade, String vila, String ninjaNivel)
	{
		this.name = name;
		this.idade = idade;
		this.vila = vila;
		this.ninjaNivel = ninjaNivel;
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getVila() {
		return vila;
	}

	public void setVila(String vila) {
		this.vila = vila;
	}

	public String getNinjaNivel() {
		return ninjaNivel;
	}
	
	public void setNinjaNivel(String ninjaNivel) {
		this.ninjaNivel = ninjaNivel;
	}
	
	public void lancarShuriken()
	{
		System.out.println("Lancando Shuriken");
	}
	
	public void ataqueLeve()
	{
		System.out.println("Voce deu um ataque leve");
	}
	
	public void ataquePesado()
	{
		System.out.println("Voce deu um ataque pesado");
	}
	
	public String toString()
	{
		return "Nome: " + name
				+ "\nIdade: " + idade
				+ "\nVila: "  + vila
				+ "\nNivel do Ninja: " + ninjaNivel;
	}
}
