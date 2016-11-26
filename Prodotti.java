public class Prodotti
{
  private String Nome;
  private double Prezzo;

  public String getName()
  {
    return Nome;
  }

  public double getPrice()
  {
    return Prezzo;
  }

  public double increasePrice(double amount)
  {
    Prezzo = Prezzo + amount;
    return Prezzo;
  }
}
