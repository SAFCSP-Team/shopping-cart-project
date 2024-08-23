
public class ShoppingCart {
     private Node head;
     public void addProduct(String name, double price){
          Node newNode = new Node(new Product(name, price));
          if (head == null){
              head = newNode;
           }
           else{
              newNode.next = head;
              head = newNode;
              }
           }

     public void delete(){
         head = head.next;
         System.out.println("Items in the cart after removing an iteam:");
         displayProducts();
     }

     public void displayProducts(){
          Node current = head;
          while(current != null){
              System.out.println(current.product.getName()+ " - " + current.product.getPrice());
              current = current.next;
          }}

          public void calculateTotalPrice(){
               double totalPrice = 0;
               Node current = head;
               while(current != null){
                    totalPrice = totalPrice + current.product.getPrice();
                   current = current.next;
               }
               System.out.println("the total price is $" +totalPrice);    

          
          }
     }

