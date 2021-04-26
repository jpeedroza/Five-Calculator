package calc.methods.functions;

public class Pow implements IOperation {
  @Override
  public double apply(double[] numbers) {
    return Math.pow(numbers[0], numbers[1]);
  }
}
