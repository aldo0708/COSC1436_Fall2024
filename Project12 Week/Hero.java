import java.util.ArrayList;
import java.util.Arrays;

// Enum for Hero Affiliations
enum Affiliation {
    AVENGERS,
    JUSTICE_LEAGUE,
    X_MEN,
    FANTASTIC_FOUR
}

// Hero Class
class Hero {
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    // Constructor
    public Hero(String name, int powerLevel, Affiliation affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    // toString Method
    @Override
    public String toString() {
        return "Name: " + name + ", Power Level: " + powerLevel + ", Affiliation: " + affiliation;
    }
}