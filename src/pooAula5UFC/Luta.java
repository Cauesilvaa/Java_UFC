package pooAula5UFC;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovado;
	
	//Methodos
	public void marcarLuta(Lutador l1, Lutador l2) {
                          // equal � para compara��o		
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { // se a categoria do l1 for igual a categoria do l2 e(&&) o objeto l1 for diferente do objeto l2
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta marcada");
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Luta não foi marcada");
		}
		
	}

	public void lutar() {
		
		if (this.aprovado) {
			System.out.println("----- Desafiado -------");
			this.desafiado.apresentar();
			System.out.println("----- Desafiante -------");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random(); // Random � para gerar coisas aleatorias
			int vencedor = aleatorio.nextInt(3); // ele vai gerar 0 ou 1 ou 2
			System.out.println("=====Resuldado=====");
			switch (vencedor) {
			case 0: // Empate
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Desafiado vence
				System.out.println(desafiado.getNome() + " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Desafiante vence
				System.out.println(desafiante.getNome() + " ganhou!");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			default:
				break;
			}
			System.out.println("==================");
		}else {
			System.out.println("A luta não pode acontecer");
		}
		
	}

	//G&S
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
}
