package chapter_1;
import java.util.*;
public class Inventory {
    private List<Guitar> guitars;
    public Inventory() {
        guitars = new LinkedList<>();
    }
    public  void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood)
    {
        Guitar new_guitar =new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(new_guitar);
    }
    public Guitar getGuitar(String serialNumber)
    {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar Search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            String builder = searchGuitar.getBuilder();
            if (builder != null && !builder.isEmpty() && !builder.equals(guitar.getBuilder())) {
                continue; // Skip if the builder doesn't match
            }

            String model = searchGuitar.getModel();
            if (model != null && !model.isEmpty() && !model.equals(guitar.getModel())) {
                continue; // Skip if the model doesn't match
            }

            String type = searchGuitar.getType();
            if (type != null && !type.isEmpty() && !type.equals(guitar.getType())) {
                continue; // Skip if the type doesn't match
            }

            String backWood = searchGuitar.getBackwood();
            if (backWood != null && !backWood.isEmpty() && !backWood.equals(guitar.getBackwood())) {
                continue; // Skip if the backWood doesn't match
            }

            String topWood = searchGuitar.getTopwood();
            if (topWood != null && !topWood.isEmpty() && !topWood.equals(guitar.getTopwood())) {
                continue; // Skip if the topWood doesn't match
            }

            return guitar; // If all conditions pass, return this guitar
        }
        return null; // If no matching guitar is found, return null
    }

}
