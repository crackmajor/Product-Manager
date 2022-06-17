public class Smartphone extends Product {
    private String manufacturer;
    private String model;

    public Smartphone(int id, String model, String manufacturer, int price) {
        super(id, "Смартфон", price);
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
