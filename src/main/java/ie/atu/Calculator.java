package ie.atu;

public class Calculator {
  public int add(int a, int b) {
    if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE)
      throw new ArithmeticException("Value out of range");
    return a + b;
  }

  public int sub(int a, int b) {
    if (a == Integer.MIN_VALUE || b == Integer.MIN_VALUE)
      throw new ArithmeticException("Value out of range");
    return a - b;
  }

  public int mul(int a, int b) {
    long r = (long) a * (long) b;   // compute in 64-bit
    if ((int) r != r) {             // check if result fits into 32-bit
      throw new ArithmeticException("integer overflow");
    }
    return a * b;
  }

  public int div(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("division by zero");
    }
    return a / b;
  }
}
