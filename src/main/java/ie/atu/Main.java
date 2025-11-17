package ie.atu;

public class Main {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    int x = cal.mul(Integer.MAX_VALUE, 4);
    System.out.println(x);

  }
}
