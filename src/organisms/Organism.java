package organisms;

public class Organism {
    protected String species;
    protected int x, y; // Position in the ecosystem
    protected int energy;
    protected int age;
    protected int maxAge;
    protected int reproductiveAge;
    private static int totalOrganisms;

    // Constructor
    public Organism(){
        this.x = 0;
        this.y = 0;
        this.energy = 0;
        this.age = 0;
        this.maxAge = 0;
        this.reproductiveAge = 0;
        this.species = "Sample";
        Organism.totalOrganisms++;
    }

    public Organism(String species, int x, int y, int energy, int maxAge, int reproductiveAge) {
        this.species = species;
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.age = 0; // Organisms start at age 0
        this.maxAge = maxAge;
        this.reproductiveAge = reproductiveAge;
        Organism.totalOrganisms++;
    }

    public static int getTotalOrganisms() {
        return totalOrganisms;
    }

    // Method to handle organism's death
    public void die() {
        this.energy = 0;
        System.out.println(this.species + " has died.");
    }

    // Method to simulate aging
    public void age() {
        this.age += 1;
        if (this.age > this.maxAge) {
            die();
        }
    }

    public void move() {
        // Simple random movement within a grid
        this.x += (int) (Math.random() * 3) - 1;  // -1, 0, or 1 in x-direction
        this.y += (int) (Math.random() * 3) - 1;  // -1, 0, or 1 in y-direction
    }

    // Getters for the organism's state
    public String getSpecies() {
        return species;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getEnergy() {
        return energy;
    }

    public int getAge() {
        return age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getReproductiveAge() {
        return reproductiveAge;
    }
}