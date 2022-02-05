import java.util.Enumeration;

public class HtmlStatement extends Statement {

  protected String getHeader(String name) {
    return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
  }

  protected String getLine(String title, String charge) {
    return title + ": " + charge + "<BR>\n";
  }

  protected String getFooter(String totalCharge, String totalFrequentRenterPoints) {
    return "<P>You owe <EM>" + totalCharge + "</EM><P>\n" + 
    "On this rental you earned <EM>" + totalFrequentRenterPoints + "</EM> frequent renter points<P>";
  }
}