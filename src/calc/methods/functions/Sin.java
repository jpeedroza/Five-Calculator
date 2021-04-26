package calc.methods.functions;

public class Sin implements IOperation {
  @Override
  public double apply(double[] numbers) {
    double radian = Math.toRadians(numbers[0]);
    return Math.sin(radian);
  }
}
