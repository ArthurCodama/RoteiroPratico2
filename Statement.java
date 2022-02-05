import java.util.Enumeration;

public abstract class Statement {

  protected abstract String getHeader(String name);
  protected abstract String getLine(String title, String charge);
  protected abstract String getFooter(String totalCharge, String totalFrequentRenterPoints);
    
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
}