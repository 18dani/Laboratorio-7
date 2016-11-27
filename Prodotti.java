public class Prodotti
{

  public Prodotto()
  {
    private String Nome;
    private double Prezzo;
  }

  public void setName(String Nome)
  {
    this.Nome = Nome;
  }

  public void setPrice(double Prezzo)
  {
    this.Prezzo = Prezzo;
  }

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
