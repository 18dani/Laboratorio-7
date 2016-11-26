import java.util.*;

public class ProvaProdotti
{
  public static void main()
  {
    Scanner sc = new Scanner(System.in());
    System.out.println("Inserisci il nome del prodotto");
    String name = sc.nextLine();
    Scanner pr = new Scanner(System.in());
    double price = pr.nextLine(); 
  }

  public static void DataPrint(Double price, String name)
  {
    System.out.println(price.getPrice());
    System.out.println(name.getName());
  }
}
