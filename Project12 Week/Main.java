// Main Class
public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // Add Heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 75, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Mr. Fantastic", 80, Affiliation.FANTASTIC_FOUR));

        // Display Original List
        System.out.println("Original Hero List:");
        manager.displayAllHeroes();

        // Bubble Sort by Power Level
        manager.bubbleSortByPower();
        System.out.println("\nHeroes After Bubble Sort by Power Level:");
        manager.displayAllHeroes();

        // Insertion Sort by Power Level
        manager.insertionSortByPower();
        System.out.println("\nHeroes After Insertion Sort by Power Level:");
        manager.displayAllHeroes();

        // Remove a Hero
        manager.removeHero("Batman");
        System.out.println("\nAfter Removing Batman:");
        manager.displayAllHeroes();

        // Add a New Hero
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        System.out.println("\nAfter Adding Wonder Woman:");
        manager.displayAllHeroes();

        // Display as 2D Array
        System.out.println("\nHeroes in 2D Array Format:");
        manager.displayHeroesAs2DArray();
    }
}