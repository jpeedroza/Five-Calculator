package calc.methods.interaction;

import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.*;

public class IO {

  private Scanner input = new Scanner(System.in);
  private double pastValue;
  private char usePastValue = 'n';

  public double[] twoOperators() {
    double number1, number2;
    number1 = pastValue;
    if (usePastValue == 'n') {
      System.out.print("Informe o primeiro operando: ");
      number1 = input.nextDouble();
    }
    System.out.print("Informe o segundo operando: ");
    number2 = input.nextDouble();

    return new double[] { number1, number2 };
  }

  public double[] oneOperator() {
    double number1;
    number1 = pastValue;
    if (usePastValue == 'n') {
      System.out.print("Informe o operando:");
      number1 = input.nextDouble();
    }
    return new double[] { number1, 0 };
  }

  public void showResult(double result) {
    JFrame frame = new JFrame();
    Clipboard clip = frame.getToolkit().getSystemClipboard();
    String results = Double.toString(result);
    StringSelection selection = new StringSelection(results);
    clip.setContents(selection, null);

    System.out.println("| Sua resposta é: " + Math.round(result * 100.0) / 100.0 + " |\n"
        + ". Pressione [n] para limpar o resultado anterior ou qualquer letra para usá-lo como operando:");
    usePastValue = input.next().charAt(0);

    if (usePastValue == 'n') {
      pastValue = 0;
    } else {
      pastValue = result;
    }
  }

  public void clear() {
    usePastValue = 'n';
    pastValue = 0;
  }
}
