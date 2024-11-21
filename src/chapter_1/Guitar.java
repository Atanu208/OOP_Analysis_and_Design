package chapter_1;

public class Guitar {
    private String serialNumber, builder, model, type, backwood, topwood;
    private double price;

    public Guitar(String serialNumber, double price,String builder, String model, String type, String backwood, String topwood) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getBackwood() {
        return backwood;
    }

    public String getTopwood() {
        return topwood;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
}
