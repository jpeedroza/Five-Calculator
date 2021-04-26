package calc.methods.functions;

public class Log implements IOperation {
  @Override
  public double apply(double[] numbers) {
    return Math.log(numbers[0]) / Math.log(numbers[1]);
  }
}
