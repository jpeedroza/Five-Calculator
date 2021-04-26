package calc.methods.functions;

public class Subs implements IOperation {
  @Override
  public double apply(double[] numbers) {
    return numbers[0] - numbers[1];
  }
}
