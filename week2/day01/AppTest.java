
public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fighter marth = new Fighter("Marth", "Swordsman", 50.0, true,0.0,"Minna, miteite kure!" );
		Fighter kirby = new Fighter("Kirby", "Swordsman", 60.0, true,0.0,"Minna, miteite kure!" );
		
		marth.attack(kirby);
		kirby.attack(marth);
		
		System.out.println(String.format("%s -> %.2f", marth.getName(), marth.getDamage()));
		System.out.println(String.format("%s -> %.2f", kirby.getName(), kirby.getDamage()));

	}

}
