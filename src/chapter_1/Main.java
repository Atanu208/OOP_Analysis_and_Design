package chapter_1;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add guitars to the inventory
        inventory.addGuitar("SN001", 1500, "Fender", "Stratocaster", "Electric", "Alder", "Maple");
        inventory.addGuitar("SN002", 2000, "Gibson", "Les Paul", "Electric", "Mahogany", "Maple");

        // Search for a guitar
        Guitar searchGuitar = new Guitar("", 0, "Fender", "Stratocaster", "Electric", "Alder", "Alder");
        Guitar result = inventory.Search(searchGuitar);

        if (result != null) {
            System.out.println("Found a match: " + result.getModel());
        } else {
            System.out.println("No matching guitar found.");
        }
    }
}
