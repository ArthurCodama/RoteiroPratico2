import java.util.Enumeration;

public class TextStatement extends Statement {
  
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = this.getHeader(aCustomer.getName());
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        //show figures for each rental
        result += this.getLine(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
    }
    //add footer lines
    result += getFooter(String.valueOf(aCustomer.getTotalCharge()), String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
    return result;
  }

  private String getHeader(String name) {
    return "Rental Record for " + name + "\n";
  }

  private String getLine(String title, String charge) {
    return "\t" + title + "\t" + charge + "\n";
  }

  private String getFooter(String totalCharge, String totalRenterPoints) {
    return "Amount owed is " + totalCharge + "\n" + 
    "You earned " + totalRenterPoints + " frequent renter points";
  }
}