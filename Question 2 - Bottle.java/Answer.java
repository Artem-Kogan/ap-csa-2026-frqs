public class Bottle {
  double capacity;
  double amount;

  public Bottle(double c) {
    capacity = c;
    amount = c;
  }
  
  public double updateAmount(double a) {
    amount -= a;
    if (amount < capacity * 0.25) {
      amount = capacity;
    }
    return amount;
  }
}
