import java.util.ArrayList;
import java.util.Scanner;

public class Team
	{
		public static void main(String[] args)
			{
				createPokemon();
//				battle();
			}
		
		public static void createPokemon()
		{
			int rH = (int)(Math.random()*5)+1;
			int rA = (int)(Math.random()*5)+1;
			int rD = (int)(Math.random()*2);
		ArrayList <Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Pokemon("Staryu", rH, rA, rD, "Water"));
		team.add(new Pokemon("Ponyta",rH, rA, rD, "Fire"));
		team.add(new Pokemon("Shroomish",rH, rA, rD,"Grass"));
		System.out.println("Choose a Pokemon!");

		int counter = 0;
		for(Pokemon p: team)
			{
				counter++;
				System.out.println(counter + "." + p.getName());
			}
		Scanner userInput = new Scanner (System.in);
		int userChoice = userInput.nextInt();
		
		
		
		if(userChoice == 1)
			{
		System.out.println("Your Pokemon is " + team.get(0).getName());
			}
		else if(userChoice == 2)
			{
			System.out.println("Your Pokemon is " + team.get(1).getName());
			}
		else
			{
			System.out.println("Your Pokemon is " + team.get(2).getName());
			}
		int rAp = (int)(Math.random()*3);
		
		System.out.println("Your opponent is " + team.get(rAp).getName());
		
		
		 boolean noKO = true;
		 while(noKO)
			{
		
			if(team.get(userChoice-1).getAttack() > team.get(rAp).getHP())
				{
					System.out.println("Your attack " + team.get(userChoice-1).getAttack());
					System.out.println("Their Hp " + team.get(rAp).getHP());
					System.out.println("You Win!");
					noKO = false;
				}
			
			else if(team.get(userChoice-1).getAttack() < team.get(rAp).getHP())
				{
					int totalHp = team.get(rAp).getHP();
					int totalHp2 = team.get(userChoice-1).getHP();
					System.out.println("Your attack " + team.get(userChoice-1).getAttack());
					System.out.println("Their Hp " + totalHp);
					int difference = totalHp - team.get(userChoice-1).getAttack();
					team.get(rAp).setHP(totalHp - difference);
					System.out.println("Keep it up!");
					
					System.out.println("Your opponet attacks!");
					int difference2 = totalHp2 - team.get(rAp).getAttack();
					team.get(userChoice-1).setHP(totalHp - difference2);
					
					if(team.get(rAp).getAttack() > team.get(userChoice-1).getHP())
						{
							System.out.println("Your opponent's Pokemon fainted, you win!");
						}
					
					
				}
			else
				{
					System.out.println("Your attack " + team.get(userChoice-1).getAttack());
					System.out.println("Their Hp " + team.get(rAp).getHP());
					System.out.println("You win!");
					noKO = false;
				}
			}
		
		}
	}

	
		
		
		
		
		
	

