/*
This is a calculator that is used to do basic math.
It was created by Mary in 2023.
*/

public class Calculator{

  public void Calculator(){

  }
  // addition method
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }
    // subtraction method
    public int subtract(int a, int b){
    int diff = a - b;
    return diff;
  }
    // multiplication method
    public int multiply(int a, int b){
    int prod = a * b;
    return prod;
  }
    // division method
    public int divide(int a, int b){
    int div = a / b;
    return div;
  }
    // remainder method
    public int remainder(int a, int b){
    int rem = a % b;
    return rem;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(2, 2));
    System.out.println(myCalculator.subtract(2, 2));
    System.out.println(myCalculator.multiply(2, 2));
    System.out.println(myCalculator.divide(2, 2));
    System.out.println(myCalculator.remainder(2, 2));
  }
}