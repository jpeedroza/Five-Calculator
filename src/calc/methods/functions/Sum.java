package calc.methods.functions;

public class Sum implements IOperation {
  @Override
  public double apply(double[] numbers) {
    return numbers[0] + numbers[1];
  }
}
