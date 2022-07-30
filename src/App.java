public class App {
    public static void main(String[] args) throws Exception {
        Producto prd = new Producto("Cola", "0001", "https://www.img.com/prueba");
        
        System.out.println(prd.getName());
    }
}

