import java.util.Enumeration;

public class TextStatement extends Statement {

  protected String getHeader(String name) {
    return "Rental Record for " + name + "\n";
  }

  protected String getLine(String title, String charge) {
    return "\t" + title + "\t" + charge + "\n";
  }

  protected String getFooter(String totalCharge, String totalFrequentRenterPoints) {
    return "Amount owed is " + totalCharge + "\n" + 
    "You earned " + totalFrequentRenterPoints + " frequent renter points";
  }
}