package UFC;

public class Fighter {
	
	private String name;
	private double age;
	private double height;
	private double weight;
	private String nationality;
	private int fightWins;
	private int fightDefeats;
	private int fightTies;
	private String category;
	
	
	public Fighter(String name, double age, double height, double weight, String nationality, int fightWins, 
			int fightDefeats, int fightTies, String category) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.fightWins = fightWins;
		this.fightDefeats = fightDefeats;
		this.fightTies = fightTies;
		this.category = category;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAge() {
		return age;
	}


	public void setAge(double age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public int getFightWins() {
		return fightWins;
	}


	public void setFightWins(int fightWins) {
		this.fightWins = fightWins;
	}
	
	
	public int getFightDefeats() {
		return fightDefeats;
	}


	public void setFightDefeats(int fightDefeats) {
		this.fightDefeats = fightDefeats;
	}


	public int getFightTies() {
		return fightTies;
	}


	public void setFightTies(int fightTies) {
		this.fightTies = fightTies;
	}


	public String getCategory() {
		return category;
		
	}
	
	
	public void setCategory(String category) {
		this.category = category;
		
		if (this.weight <= 52.2){	
			this.category = "Strawweight";
		} else if (this.weight <= 56.7){
			this.category = "Flyweight";
		} else if (this.weight <= 61.2) {
			this.category = "Bantamweight";
		} else if (this.weight <= 65.8) {
			this.category = "Featherweight";
		} else if (this.weight <= 70.3) {
			this.category = "Lightweight";
		} else if (this.weight <= 77.1) {
			this.category = "Welterweight";
		} else if (this.weight <= 83.9) {
			this.category = "Middleweight";
		} else if (this.weight <= 92.9) {
			this.category = "Light Heavyweight";
		} else if (this.weight <= 120.2) {
			this.category = "Heavyweight";
		} else {
			this.category = "Invalid category";
		}
		
		
	}
}
