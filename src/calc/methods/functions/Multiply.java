package calc.methods.functions;

public class Multiply implements IOperation {
  @Override
  public double apply(double[] numbers) {
    return numbers[0] * numbers[1];
  }
}
