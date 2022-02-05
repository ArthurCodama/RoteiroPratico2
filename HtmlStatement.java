import java.util.Enumeration;

public class HtmlStatement extends Statement {
  
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
    return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
  }

  private String getLine(String title, String charge) {
    return title + ": " + charge + "<BR>\n";
  }

  private String getFooter(String totalCharge, String totalRenterPoints) {
    return "<P>You owe <EM>" + totalCharge + "</EM><P>\n" + 
    "On this rental you earned <EM>" + totalRenterPoints + "</EM> frequent renter points<P>";
  }
}