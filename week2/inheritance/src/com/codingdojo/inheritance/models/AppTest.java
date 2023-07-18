package com.codingdojo.inheritance.models;

import java.util.ArrayList;
import java.util.Random;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marth marth = new Marth();
		MetaKnight mk = new MetaKnight();
		Jigglypuff jig = new Jigglypuff();
		Sonic sonic = new Sonic();
		KidGoku goku = new KidGoku();
		Sephiroth sephiroth = new Sephiroth();
		Diablo diablo = new Diablo();
		
		ArrayList<Fly> fliers = new ArrayList<>();
		fliers.add(jig);
		fliers.add(mk);
		System.out.println(Fighter.getFighters());
		ArrayList<Fighter> fighters = Fighter.getFighters(); 
		int num = 0;
		while (true) {
			
			for (int i = 0; i < fighters.size(); i++ ) {
				
				Random rand = new Random();
				
				int randomTarget = rand.nextInt(fighters.size());
				
				fighters.get(i).attack(fighters.get(randomTarget));
			}
			
			num++;
			
			if (num > 10) {
				break;
			}
		}
		Fighter winner = checkForWinner(fighters);
		System.out.println("Winner ->" + winner.getName() + "-> " + winner.getDamage() );
		
		
		
		
		
	
	}
	
	public static Fighter checkForWinner(ArrayList<Fighter>fighters) {
		
		double min = fighters.get(0).getDamage();
		Fighter winner = fighters.get(0);
		
		for (Fighter fighter : fighters ) {
			
			if (fighter.getDamage() < min) {
				min = fighter.getDamage();
				winner = fighter;
			} 
		}
		
		return winner;
	}
	
	

}
