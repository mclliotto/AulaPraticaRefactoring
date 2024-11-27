import java.util.Vector;
import java.util.Enumeration;

public class Customer {

   private String _name;
   private Vector<Rental> _rentals = new Vector<>();  

   public String statement() {
      return new TextStatement().statement(this);
   }

   public String htmlStatement() {
      return new HtmlStatement().statement(this);
   }

   public Enumeration<Rental> getRentals() {  
      return _rentals.elements();
   }

   public double getTotalCharge() {
      double result = 0;
      Enumeration<Rental> rentals = _rentals.elements();  
      while (rentals.hasMoreElements()) {
         Rental each = rentals.nextElement();
         result += each.getCharge();
      }
      return result;
   }

   public int getTotalFrequentRenterPoints() {
      int result = 0;
      Enumeration<Rental> rentals = _rentals.elements();  
      while (rentals.hasMoreElements()) {
         Rental each = rentals.nextElement();
         result += each.getFrequentRenterPoints();
      }
      return result;
   }

   public void addRental(Rental rental) {
      _rentals.addElement(rental);
   }

   public String getName() {
      return _name;
   }

   public void setName(String name) {
      _name = name;
   }
}
