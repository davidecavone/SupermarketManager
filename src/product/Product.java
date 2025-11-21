package product;


public class Product {
    private String barcode;
    private String name;
    private double price;
    private Category category;


    public Product(String barcode, String name, double price, Category category){
        this.barcode=barcode;
        this.name=name;
        this.price=price;
        this.category= category;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return this.category;
    }

    @Override
    public String toString(){

        return "Barcode: " + this.getBarcode() + " Name: " + this.getName()
                +" Price: " + this.getPrice() + " Category: " + this.getCategory();
    }


}
