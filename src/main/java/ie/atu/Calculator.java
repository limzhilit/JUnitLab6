package ie.atu;

public class Calculator {
  public int add(int a, int b) {
    if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE)
      throw new ArithmeticException("Value out of range");
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int mul(int a, int b) {
    return a * b;
  }

  public int div(int a, int b) {
    return a / b;
  }
}
