public class Main {

    public static void main(String[] args) {
      ShoppingCart obj = new ShoppingCart();
      obj.addProduct("Shirt", 100.97);
      obj.addProduct("dress", 299.1);
      obj.addProduct("shoes", 369.8);
      obj.displayProducts();
      obj.calculateTotalPrice();


    }
}
