public class Producto extends Padre{

    private int stock;

    public Producto(String name, String code, String imageUrl) {
        super();
        this.setName(name);
        this.setCode(code);
        this.setImage_url(imageUrl);
    }

    @Override
    public void addStock(int stock_quantity_toAdd) {

        if(stock_quantity_toAdd > 0){
            this.stock += stock_quantity_toAdd;
        }
    }
    
}
