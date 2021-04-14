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
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para soma: ");
        number1 = input.nextDouble();
        System.out.println("Informe o Segundo número para soma: ");
        number2 = input.nextDouble();
        result = number1 + number2;
      } else {
        System.out.println("Informe o número seguinte para soma: ");
        number1 = input.nextDouble();
        result = number1 + pastValue;
      }
      showResult(result);
      return result;
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public void showResult(double result) {
    JFrame frame = new JFrame();
    Clipboard clip = frame.getToolkit().getSystemClipboard();
    String results = Double.toString(result);
    StringSelection selection = new StringSelection(results);
    clip.setContents(selection, null);
    System.out.println("Sua resposta é: " + result + ". Press n to continue...");
  };

  public void clear() {
    pastValue = 0;
  }
}
