
import java.util.Objects;
public class Pizza {

   private String pizzaName;
   private int size;

   public Pizza(String pizzaName, int size) {
      this.pizzaName = pizzaName;
      this.size = size;
   }

   public String getPizzaName() {
      return pizzaName;
   }

   public void setPizzaName(String pizzaName) {
      this.pizzaName = pizzaName;
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) return true;
      if (!(object instanceof Pizza)) return false;
      Pizza pizza = (Pizza) object;
      return size == pizza.size &&
              Objects.equals(pizzaName, pizza.pizzaName);
   }

   @Override
   public int hashCode() {
      return Objects.hash(pizzaName, size);
   }
   public void add(Drinks d, Pizza p  ) {
      System.out.println("Your order" + p + d );
}}




