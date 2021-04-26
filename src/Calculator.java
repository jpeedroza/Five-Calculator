public class Calculator {

  public double sum(double[] numbers) {
    return numbers[0] + numbers[1];
  }

  public double subs(double[] numbers) {
    return numbers[0] - numbers[1];
  }

  public double multiply(double[] numbers) {
    return numbers[0] * numbers[1];
  }

  public double divide(double[] numbers) {
    return numbers[0] / numbers[1];
  }

  public double pow(double[] numbers) {
    return Math.pow(numbers[0], numbers[1]);
  }

  public double sin(double number) {
    double radian = Math.toRadians(number);
    return Math.sin(radian);
  }

  public double cos(double number) {
    double radian = Math.toRadians(number);
    return Math.cos(radian);
  }

  public double log(double[] numbers) {
    return Math.log(numbers[0]) / Math.log(numbers[1]);
  }
}
