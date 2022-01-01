package pooAula5UFC;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade, votorias, dderrotas, empates;
	private float altura;
	private float peso;
	private String categoria;
	
	//Construtor
	public Lutador(String no, String na, int ida, float al, float pe, int de, int vi,  int em) {
	
		this.nome = no;
		this.nacionalidade =  na;
		this.idade = ida;
		this.altura = al;
		this.setPeso(pe); // Tive que usar o set
		this.votorias = vi;
		this.dderrotas = de;
		this.empates = em;
		
	}
	
	//G&T
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVotorias() {
		return votorias;
	}

	public void setVotorias(int votorias) {
		this.votorias = votorias;
	}

	public int getDderrotas() {
		return dderrotas;
	}

	public void setDderrotas(int dderrotas) {
		this.dderrotas = dderrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(); // aqui
	}

	public String getCategoria() {
		return categoria;
	}
    // E tbm mudei para private  - Tirei o que esta dentro dos () e coloquei no setPeso
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	//Methodos 
	public void apresentar() {
		System.out.println("------------ Apresentação ------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Nacinalidade: " + getNacionalidade());
		System.out.println("Com: " + this.getIdade() + "anos e " + this.getAltura());
		System.out.println("Pesando: " + this.getPeso());
		System.out.println(this.getVotorias() + " vitorias");
		System.out.println(getDderrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");	
	}
	
	public void statu() {
		System.out.println("----- Status --------------");
		System.out.println(this.getNome() + " � um peso " + this.getCategoria());
		System.out.println("Ganhou: " + this.getVotorias() + " lutas");
		System.out.println("Empatou: " + this.getEmpates() + " lutas");
		System.out.println("Perdeu: " + this.getDderrotas() + " lutas");
		
	}
	
	public void ganharLuta() {
		this.setVotorias(this.getVotorias() + 1);
	}
	
	public void perderLuta() {
		this.setDderrotas(this.getDderrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
