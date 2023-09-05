package UFC;

public class Lutadores{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter f[] = new Fighter[6];
		
		f[0] = new Fighter("João", 22, 1.75, 88.4, "Brazilian", 10, 1, 0, "Light Heavyweight");
		f[1] = new Fighter("Jason", 25, 1.85, 97.4, "British", 12, 0, 1, "Heavyweight");
		f[2] = new Fighter("McGregor", 29, 1.80, 70.2, "Irish", 20, 2, 0, "Lightweight");
		f[3] = new Fighter("Pachovyski", 20, 1.63, 55.4, "Ukrainian", 7, 3, 1, "Flyweight");
		f[4] = new Fighter("Karlsen", 23, 1.77, 87.9, "American", 15, 1, 0, "Light Heavyweight");
		f[5] = new Fighter("Jon Jones", 27, 1.79, 77.5, "American", 22, 3, 0, "Middleweight");
		
		Luta luta = new Luta();
		
		luta.marcarLuta(f[0], f[4]);
		luta.apresentação(f[0], f[4]);
		luta.lutar(f[0], f[4], 12);
		
		
	}
}