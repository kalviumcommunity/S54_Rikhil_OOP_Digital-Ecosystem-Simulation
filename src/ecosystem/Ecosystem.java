package ecosystem;


import organisms.Organism;
import organisms.Plant;

public class Ecosystem {
    public static void main(String[] args) {
        Organism org1 = new Organism();
        Plant cornPlant = new Plant("corn", 10, 15, 200, 3, 2, 2);
        Plant wheatPlant = new Plant("wheat", 10, 5, 100, 2, 1, 2);
        Plant cottonPlant = new Plant("cotton", 20, 5, 150, 4, 1, 3);
        Plant lemonPlant = new Plant("lemon", 5, 10, 100, 7, 3, 2);
        Plant[] allPlants = new Plant[]{cornPlant, wheatPlant, cottonPlant, lemonPlant};

        System.out.println("Organism Species: "+org1.getSpecies());
        for (Plant plant : allPlants) {
            System.out.println("Species: "+plant.getSpecies());
        }
        System.out.println("Total Plants: " + Plant.getTotalPlants());
        System.out.println("Total Organisms: " + Organism.getTotalOrganisms());
    }
}
