package calc.methods.functions;

public class Cos implements IOperation {
  @Override
  public double apply(double[] numbers) {
    double radian = Math.toRadians(numbers[0]);
    return Math.cos(radian);
  }
}
