package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String beginNewGame = "";
		String phoenixName = "";
		int intUserInput;

		do {
			System.out.println("Type \"yes\" to begin a new game.");
			beginNewGame = input.next();
// Need to fix a bug in beginNewGame for else. Still allows to type a name.		
			if (beginNewGame.equalsIgnoreCase("no")) {
				System.out.println("Goodbye.");
				System.exit(0);
			} else if (beginNewGame.equalsIgnoreCase("yes")) {
				System.out.println("A young Phoenix has risen from the ashes and looks to you as her parent.");
				System.out.println("What would you like to name your phoenix? (Alpha characters only, no spaces)");
				phoenixName = input.nextLine();
			} else {
				System.out.println("Please type \"yes\" or \"no\".");
				beginNewGame = input.next();
				if (beginNewGame.equalsIgnoreCase("yes")) {
					System.out.println("A young Phoenix has risen from the ashes and looks to you as her parent.");
					System.out.println("What would you like to name your phoenix? (Alpha characters only, no spaces)");
					phoenixName = input.nextLine();
				} else if (beginNewGame.equalsIgnoreCase("no")) {
					System.out.println("Goodbye.");
					System.exit(0);
				}
			}
//Pet Name
			phoenixName = input.nextLine();
			phoenixName = phoenixName.toLowerCase();
			phoenixName = phoenixName.substring(0, 1).toUpperCase() + phoenixName.substring(1).toLowerCase();
//Create Pet
			VirtualPet petInstance = new VirtualPet(phoenixName);
			petInstance.hatchling();
//pet.petName is pulled from VirtualPet
			System.out.println("");
			System.out.println(petInstance.petName + "'s stats are as follows:");
			System.out.println("");
//Stat numbers are pulled from VirtualPet
			System.out.println("Hunger = " + petInstance.petHunger);
			System.out.println("Mood = " + petInstance.petMood);
			System.out.println("Energy = " + petInstance.petEnergy);
			System.out.println("");
			System.out.println("Remember, if " + phoenixName + "'s stats are all zero, " + phoenixName
					+ " will die and the game will end.");
			System.out.println("");
			while (petInstance.petHunger > -1 & petInstance.petMood > -1 & petInstance.petEnergy > -1) {
				petInstance.userInteractionList();
				System.out.println("");
				petInstance.timeTick();
				intUserInput = input.nextInt();

//UserInteractionList Return
//User Chose Feed
				if (intUserInput == 1) {
					petInstance.feed();
					intUserInput = input.nextInt();
					if (intUserInput == 1) {
						petInstance.feedMeat();
					} else if (intUserInput == 2) {
						petInstance.feedSnack();
					} else if (intUserInput == 3) {
						petInstance.feedNegativity();
					} else {
						if (intUserInput == 1) {
							petInstance.feedMeat();
						} else if (intUserInput == 2) {
							petInstance.feedSnack();
						} else if (intUserInput == 3) {
							petInstance.feedNegativity();
						}
						System.out.println("That is not a valid option.  Please type 1, 2, or 3.");
						petInstance.userInteractionList();
						intUserInput = input.nextInt();
					}
//User Chose Mood
				} else if (intUserInput == 2) {
					petInstance.mood();
					intUserInput = input.nextInt();
					if (intUserInput == 1) {
						petInstance.moodQuest();
						System.out.println("...returning hours later, exhausted and exhilarated.");
					} else if (intUserInput == 2) {
						petInstance.moodRead();
					} else if (intUserInput == 3) {
						petInstance.moodKick();
					} else {
						System.out.println("That is not a valid option.  Please type 1, 2, or 3.");
						intUserInput = input.nextInt();
					}
//User Chose Energy
				} else if (intUserInput == 3) {
					petInstance.energy();
					intUserInput = input.nextInt();
					if (intUserInput == 1) {
						petInstance.restSleep();
					} else if (intUserInput == 2) {
						petInstance.restNap();
					} else if (intUserInput == 3) {
						petInstance.restMeditate();
					} else {
						System.out.println("That is not a valid option.  Please type 1, 2, or 3.");
						intUserInput = input.nextInt();
					}
//Do Nothing
				} else if (intUserInput == 4) {
					petInstance.doNothing();
//Quit Game
				} else if (intUserInput == 5) {
					petInstance.petDeath();
					petInstance.exitGame();
					intUserInput = input.nextInt();
//As For Valid Number
				} else {
					System.out.println("That is not a valid option.  Please type 1, 2, 3, 4, or 5.");
					intUserInput = input.nextInt();
				}

			}

//QuitorRestart
			System.out.println("");
			petInstance.petDeath();
			System.out.println(phoenixName + " bursts into a roaring ball of flames and dies. We mourn " + phoenixName
					+ " and await her rebirth.");
			System.out.println("");
			System.out.println("Would you like to play again? Yes or no?");
			beginNewGame = input.next();
		} while (beginNewGame.equalsIgnoreCase("yes"));
		new Scanner(System.in);
		if (beginNewGame.equalsIgnoreCase("no")) {
			System.out.println(phoenixName + " shall lie lost among the ashes til you return.");
			System.exit(0);
		} else {
			System.out.println(phoenixName + " shall lie lost among the ashes til you return.");
			System.exit(0);
		}

		input.close();
	}
}
