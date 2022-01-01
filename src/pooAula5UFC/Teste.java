package pooAula5UFC;

public class Teste {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6]; // Fiz um vetor para criar 6 lutadore
		
		l[0] = new Lutador("Diogo", "e.t.", 23, 1.75f, 89.2f, 2, 9, 1);
		
		l[1] = new Lutador("Cauê", "brasileiro", 25, 2.00f, 60.2f, 0, 10, 0 );

		l[2] = new Lutador("João", "argentino", 46, 1.00f, 100.2f, 4, 5, 9 );
		
		l[3] = new Lutador("Marcus", "angolano", 18, 1.90f, 43.2f, 10, 10, 10 );

		l[4] = new Lutador("Ratinho", "gordolandi", 45, 1.10f, 119.2f, 3, 5, 9 );

		l[5] = new Lutador("Gu", "canadense", 30, 1.50f, 50.2f, 6, 7, 8 );

		
//		l[0].apresentar();
//		l[0].statu();
//		
//		l[1].apresentar();
//		l[1].statu();
//		l[1].ganharLuta(); // ele tem 10 lutas ganhas mas agr add esse methodo ele tem 11 o mesmo vale para derrotas e empates
		
		Luta ufc01 = new Luta();
		ufc01.marcarLuta(l[2], l[4]);
		ufc01.lutar();
	}

}
