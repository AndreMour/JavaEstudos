package UFC;

public class Luta {

	private Fighter challenging;
	private Fighter challenged;
	private int rounds = 12;
	private boolean approved;

	public void marcarLuta(Fighter f0, Fighter f4) {
		if((f0.getCategory() == f4.getCategory()) && (f0 != f4)){
			this.approved = true;
			this.challenging = f0;
			this.challenged = f4;
		} else {
			this.approved = false;
			System.out.println("Categorias Distintas");
		}
	}
	
	public void apresentação(Fighter f0, Fighter f4) {
		if (this.approved) {
			System.out.println("============== UFC 384 ===============");
			System.out.println("LUTAS DA NOITE:");
			System.out.println();
			System.out.println(f4.getName() + " CONTRA " + f0.getName());
			System.out.println(f4.getAge() + " IDADE " + f0.getAge());
			System.out.println(f4.getHeight() + " ALTURA " + f0.getHeight());
			System.out.println(f4.getWeight() + " PESO " + f0.getWeight());
			System.out.println(f4.getNationality() + " NACIONALIDADE " + f0.getNationality());
			System.out.println(f4.getFightWins() + " VITÓRIAS " + f0.getFightWins());
			System.out.println(f4.getFightDefeats() + " DERROTAS " + f0.getFightDefeats());
			System.out.println(f4.getFightTies() + " EMPATES " + f0.getFightTies());
		}
	}
		
	public void lutar(Fighter f0, Fighter f4, int rounds) {
		if(this.approved) {
			System.out.println();
			System.out.println();
			System.out.println(f4.getName() + " CONTRA " + f0.getName());
			System.out.println("TOTAL DE ROUNDS: " + rounds);
			System.out.println("FIGHT!!!!");
		}
		
		int f0Rounds = 0, f4Rounds = 0;
		
		for(int round=1 ; round <= rounds ; round++) {
			System.out.println();
			System.out.println("ROUND: " + round);
			
			if(Math.random() < 0.5) {
				System.out.println("ROUND PARA " + f0.getName());
				f0Rounds++;
			} else {
				System.out.println("ROUND PARA " + f4.getName());
				f4Rounds++;
			}
		}
		
		if(f0Rounds > f4Rounds) {
			System.out.println("O VENCEDOR É: " + f0.getName() + " !!!!!");
			f0.setFightWins(f0.getFightWins() + 1);
		} else if (f4Rounds > f0Rounds) {
			System.out.println("O VENCEDOR É: " + f4.getName() + " !!!!!");
			f4.setFightWins(f4.getFightWins() + 1);
		} else {
			System.out.println("EMPATE TÉCNICO");
			f0.setFightTies(f0.getFightTies() + 1);
			f4.setFightTies(f4.getFightTies() + 1);
		}
		
	}
	
	
}
