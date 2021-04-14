import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.*;

public class Calculator {

  private Scanner input;
  private double pastValue = 0;

  public Calculator(Scanner input) {
    this.input = input;
  }

  public double sum() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Primeiro número para soma: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para soma: ");
        number2 = input.nextDouble();
        result = number1 + number2;
      } else {
        System.out.println("Informe o número seguinte para soma: ");
        number1 = input.nextDouble();
        result = number1 + this.pastValue;
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double subs() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Primeiro número para a subtracão: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para a subtracão: ");
        number2 = input.nextDouble();
        result = number1 - number2;
      } else {
        System.out.println("Informe o número seguinte para a subtracão: ");
        number1 = input.nextDouble();
        result = this.pastValue - number1;
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double multiply() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Primeiro número para a multiplicacao: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para a multiplicacao: ");
        number2 = input.nextDouble();
        result = number1 * number2;
      } else {
        System.out.println("Informe o número seguinte para a multiplicacao: ");
        number1 = input.nextDouble();
        result = this.pastValue * number1;
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double divide() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Primeiro número para o dividendo: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para o divisor: ");
        number2 = input.nextDouble();
        result = number1 / number2;
      } else {
        System.out.println("Informe o número seguinte para o divisor: ");
        number1 = input.nextDouble();
        result = this.pastValue / number1;
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double pow() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Primeiro número para a base: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para o expoente: ");
        number2 = input.nextDouble();
        result = Math.pow(number1, number2);
      } else {
        System.out.println("Informe o número seguinte para o expoente: ");
        number1 = input.nextDouble();
        result = Math.pow(this.pastValue, number1);
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double sin() {
    double number1, radian;
    try {
      System.out.println("Informe o número em ângulo para o calculo do Seno: ");
      number1 = input.nextDouble();
      radian = Math.toRadians(number1);
      number1 = Math.sin(radian);
      this.pastValue = number1;
      return showResult(number1);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double cos() {
    double number1, radian;
    try {
      System.out.println("Informe o número em ângulo para o calculo do Coseno: ");
      number1 = input.nextDouble();
      radian = Math.toRadians(number1);
      number1 = Math.cos(radian);
      this.pastValue = number1;
      return showResult(number1);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double log() {
    double number1, number2, result;
    try {
      if (this.pastValue == 0) {
        System.out.println("Informe o Segundo número para o Logaritmando: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Primeiro número para a base: ");
        number2 = input.nextDouble();
        result = Math.log(number1) / Math.log(number2);
      } else {
        System.out.println("Informe o número seguinte para o Logaritmando: ");
        number1 = input.nextDouble();
        result = Math.log(number1) / Math.log(this.pastValue);
      }
      this.pastValue = result;
      return showResult(result);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public double showResult(double result) {
    JFrame frame = new JFrame();
    Clipboard clip = frame.getToolkit().getSystemClipboard();
    String results = Double.toString(result);
    StringSelection selection = new StringSelection(results);
    clip.setContents(selection, null);
    System.out.println(
        "Sua resposta é: " + Math.round(result * 100.0) / 100.0 + ". Press [Y/n] to continue with this result...");
    return result;
  }

  public void clear() {
    this.pastValue = 0;
  }
}
