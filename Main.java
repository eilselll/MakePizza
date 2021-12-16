// TestPizza.java

class Main {
  public static void main(String args[]) {
    Pizza pie = new Pizza(); // creating an object for pizza class  
    pie.setDiameter(12); // set will set the value and get will get the value 
    pie.setPrice(13.99); // defining the things that make up a pizza pie 
    pie.setToppings("Pepperoni");
    System.out.println("\nYou have ordered a pizza with " +
      pie.getToppings() + " topping, with a diameter of " +
      pie.getDiameter() + " and a price of " + pie.getPrice());
  }
}

class Pizza {
  // the private data members
  private int diameter;
  private double price;
  private String toppings;

  public void setDiameter(int amt) {
    diameter = amt;
  }

  public int getDiameter() {
    return diameter;
  }

  public void setPrice(double amt) {
    price = amt;
  }

  public double getPrice() {
    return price;
  }
  public void setToppings(String str) {
    toppings = str;
  }
  public String getToppings() {
    return toppings;
  }
}