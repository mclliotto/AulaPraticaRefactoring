import java.util.Enumeration;

public class HtmlStatement extends Statement {

   @Override
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += each.getMovie().getTitle() + ": " +
                   String.valueOf(each.getCharge()) + "<BR>\n";
      }
      result += "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
      return result;
   }
}