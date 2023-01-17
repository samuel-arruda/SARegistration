package entities;

public class Form {
	private String nome;
	private Integer ano;
	private Integer idade;
	private Character gen;
	
	public Form(String nome, Integer ano, Integer idade, Character gen) {
		
		this.nome = nome;
		this.ano = ano;
		this.idade = idade;
		this.gen = gen;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getGen() {
		return gen;
	}

	public void setGen(Character gen) {
		this.gen = gen;
	}
	
	public String toString() {
		return  "\nNome: "+ nome + "\nAno de Nascimento: " + ano  + "\nIdade: " + idade + " anos" + "\nGênero: " + gen;
	}
}
