public class SuperHeroRoster {

    //Main Func ofc
    public static void main(String[] args) {
        // 1. Declare and initialize 1D arrays for hero names/people, abilities, and power levels
        String[] heroNames = {"Iron Man", "P Diddy", "Thomas The tank Engine"};
        String[] abilities = {"Technology", "Partying", "Engine + transportation"};
        int[] powerLevels = {80, 95, 69};

        // 2. Print each (my) hero's details using a loop
        System.out.println("--- Superhero Roster ---");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.printf("Hero: %s | Ability: %s | Power Level: %d\n",
                heroNames[i], abilities[i], powerLevels[i]);
        }

        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "P diddy");
        searchHero(heroNames, abilities, powerLevels, "Episten Island");

        // 4. Calculate and display the average power level
        double avgPower = calculateAveragePower(powerLevels);
        System.out.printf("Average Power Level: %.2f\n", avgPower);

        // Optional: Create Superhero objects and display details (I dont know if I did this right)
        Superhero[] superheroes = {
            new Superhero("P Diddy", "Partying", 95),
            new Superhero("Iron Man", "Flying and high-tech armor", 80),
            new Superhero("Thomas The tank Engine", "Engine + transportation", 69)
        };

        System.out.println("--- Superhero Objects ---");
        for (Superhero hero : superheroes) {
            hero.displayHero();
        }
    }
    //search for a hero by name and display their details
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.printf("Found: %s | Ability: %s | Power Level: %d\n",
                    names[i], abilities[i], powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero '" + target + "' not found.");
        }
    }
    //calculate the average power level of the heroes
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}


//define a class Superhero with attributes and methods 
class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public void displayHero() {
        System.out.printf("Superhero: %s | Ability: %s | Power Level: %d\n",
            name, ability, powerLevel);
    }
}