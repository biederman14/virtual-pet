package virtual_pet;

import java.util.Scanner;

public class VirtualPet {
	Scanner input = new Scanner(System.in);
	int petHunger;
	int petMood;
	int petEnergy;
	String petName;

	// Constructor = Anything that is named the same as your class is called the
	// "constructor"
	public VirtualPet(String petName) {
		petHunger = 10;
		petMood = 10;
		petEnergy = 10;
		this.petName = petName;
	}

	// timeTick
	public int timeTick() {
		System.out.println("Time has passed...");
		System.out.println("");
		System.out.println("Hunger is now " + (petHunger -= 2));
		System.out.println("Mood is now " + (petMood -= 2));
		System.out.println("Energy is now " + (petEnergy -= 2));
		return (petHunger + petMood + petEnergy);
	}

	// Initial userInteractionList
	public void userInteractionList() {
		System.out.println("");
		System.out.println("What would you like to do with " + petName + "?");
		System.out.println("Type the number that corresponds with your action.");
		System.out.println("1. Feed");
		System.out.println("2. Entertain");
		System.out.println("3. Rest");
		System.out.println("4. Do Nothing");
		System.out.println("5. Quit Program");
	}

//Method Feed
	public void feed() {
		System.out.println("");
		System.out.println("What would you like to feed " + petName + "?");
		System.out.println("1. Meat: +5 Hunger");
		System.out.println("2. Snack: +3 Hunger");
		System.out.println("3. Negativity: -5 Hunger");
	}

//Method Mood
	public void mood() {
		System.out.println("");
		System.out.println("1. Go on a quest. +10 Mood");
		System.out.println("2. Read an acient tome. +5 Mood");
		System.out.println("3. Kick your phoenix. -5 Mood");
	}

//Method Energy
	public void energy() {
		System.out.println("");
		System.out.println("1. Put your phoenix to sleep. +10 Energy");
		System.out.println("2. Lay her down for a nap. +5 Energy");
		System.out.println("3. Meditate with your phoenix. +2 Energy");
	}

	// Method Do Nothing
	public void doNothing() {
		System.out.println("");
		System.out.println(petName + " squawks with antici...\n...\n...\n...\npation.");
	}

	// Method Quit Game
	public void exitGame() {
		System.out.println("");
		System.out.println(petName + " bursts into a roaring ball of flames and dies.  \n We mourn " + petName
				+ " and await her rebirth.");
		System.exit(0);
	}

	// print all the variables
	public void printVariables() {
		System.out.println("");
		System.out.println("Hunger = " + petHunger);
		System.out.println("Mood = " + petMood);
		System.out.println("Engergy = " + petEnergy);
	}

	// Method feedMeat
	public int feedMeat() {
		System.out.println("");
		System.out.println(petName + " sqawks with delight and devours the fleshy bits.");
		System.out.println("Hunger = " + (petHunger += 5));
		System.out.println("Mood = " + (petMood += 1));
		System.out.println("Energy = " + (petEnergy += 2));
		return (petHunger + petMood + petEnergy);
	}

//feedSnack
	public int feedSnack() {
		System.out.println("");
		System.out.println(petName + " munches noisily on her snack.");
		System.out.println("Hunger = " + (petHunger += 3));
		System.out.println("Mood = " + (petMood += 1));
		System.out.println("Energy = " + (petEnergy += 1));
		return (petHunger + petMood + petEnergy);
	}

	// feedNegativity
	public int feedNegativity() {
		System.out.println("");
		System.out.println(petName + " screeches and hides from you until you turn off Fox News.");
		System.out.println("Hunger = " + (petHunger -= 5));
		System.out.println("Mood = " + (petMood -= 1));
		System.out.println("Energy = " + (petEnergy -= 2));
		return (petHunger + petMood + petEnergy);
	}

//moodQuest
	public int moodQuest() {
		System.out.println("");
		System.out.println("Off with a dash, " + petName + " is off before the word \"go\"...");
		System.out.println("Hunger = " + (petHunger -= 5));
		System.out.println("Mood = " + (petMood += 10));
		System.out.println("Energy = " + (petEnergy -= 10));
		return (petHunger + petMood + petEnergy);
	}

//moodRead
	public int moodRead() {
		System.out.println("");
		System.out.println("Listening attentively, " + petName + " yawns adorably during the story.");
		System.out.println("Hunger = " + (petHunger -= 2));
		System.out.println("Mood = " + (petMood += 5));
		System.out.println("Energy = " + (petEnergy -= 3));
		return (petHunger + petMood + petEnergy);
	}

//moodKick
	public int moodKick() {
		System.out.println("");
		System.out.println(petName + " screaches and hides from you until you decide to be nice.");
		System.out.println("Hunger = " + (petHunger -= 1));
		System.out.println("Mood = " + (petMood -= 5));
		System.out.println("Energy = " + (petEnergy -= 5));
		return (petHunger + petMood + petEnergy);
	}

//restSleep
	public int restSleep() {
		System.out.println("");
		System.out.println("You tuck " + petName + " lovingly into her nest.");
		System.out.println("Hunger = " + (petHunger -= 5));
		System.out.println("Mood = " + (petMood += 10));
		System.out.println("Energy = " + (petEnergy += 10));
		return (petHunger + petMood + petEnergy);
	}

//restNap
	public int restNap() {
		System.out.println("");
		System.out.println("You play soothing music and rub " + petName + "'s head until she falls asleep.");
		System.out.println("Hunger = " + (petHunger -= 2));
		System.out.println("Mood = " + (petMood += 5));
		System.out.println("Energy = " + (petEnergy += 5));
		return (petHunger + petMood + petEnergy);
	}

//restMeditate
	public int restMeditate() {
		System.out.println("");
		System.out.println(petName + " makes a strange, high-pitched whine that sounds something like \"Olm\".");
		System.out.println("Hunger = " + (petHunger -= 1));
		System.out.println("Mood = " + (petMood += 2));
		System.out.println("Energy = " + (petEnergy += 2));
		return (petHunger + petMood + petEnergy);
	}

//Hatching ascII
	public void hatchling() {
		System.out.println("    _,v\"(     )\"v,_\r\n" + "   _,'  \\_~<\\_/    ',_\r\n" + "  .7,    {   }     ,\\.\r\n"
				+ "   '/:, .m   m.  ,:\\'\r\n" + "    ')\",(/   \\),\"('\r\n" + "       '{'!!!'}'\r\n" + "	   )^(\r\n"
				+ "	    )^(\r\n" + "            )(\r\n" + "            ^\r\n" + "");
	}

//Pet Death ascII
	public void petDeath() {
		System.out.println("(       ((      ^\r\n" + "          ( (      ( )      )   '        )\r\n"
				+ "           '  )   )                )\r\n" + "         '                   )\r\n"
				+ "               _,v\"(     )\"v,_       ^(\r\n" + "   )^       _,'    \\_~<\\_/    ',_      ) ^\r\n"
				+ "             .7,    {   }     ,\\.\r\n" + "         '    '/:, .m   m.  ,:\\'\r\n"
				+ "               ')\",(/   \\),\"('(      ' (\r\n" + "           '     )'{'!!!'}' ('\r\n"
				+ "          (          )^(   )\r\n" + "        (  ) '  (  )  )^(   (   '(\r\n"
				+ "                 (    )(\r\n" + "                      ^\r\n" + "                 )  '\r\n"
				+ "     '     (           )     \r\n" + "       (    (      (    ((    )'\r\n"
				+ "    ^^ / \\   ==/ __ == \\    / \\=\\==\\ '\r\n" + "^^/ ejm 96  ==  \\^ \\ ===^^ / == ==== / ===\r\n"
				+ "      \\\\  /  ==  /  ==== ==== ^^ ^  \\\\ \\\r\n"
				+ "   ^^^^ ===   |  == ===   \\ |=='  == ^^ ^^^^\r\n" + "     ^^     ^^^^ ^^^^ ^^^^         ^^");

	}
}
