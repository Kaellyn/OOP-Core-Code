public class Padre {
    private String name;
    private String code;
    private String image_url;
    private int stock_quantity;
    private double price;
    
    public Padre() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public void addStock(int stock_quantity_toAdd) {
        this.stock_quantity += stock_quantity_toAdd;
    }

    @Override
    public String toString() {
        return "Padre [code=" + code + ", image_url=" + image_url + ", name=" + name + ", price=" + price
                + ", stock_quantity=" + stock_quantity + "]";
    }

    
}
