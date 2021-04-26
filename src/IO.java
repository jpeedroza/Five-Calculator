import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.*;

public class IO {

    private Scanner input = new Scanner(System.in);
    private double number1, number2, pastValue;
    private char usePastValue = 'n';

    public double[] twoOperators() {

        number1 = pastValue;

        if (usePastValue == 'n') {
            System.out.print("Informe o Primeiro operando:");
            number1 = input.nextDouble();
        }
        System.out.print("Informe o Segundo operando: ");
        number2 = input.nextDouble();

        return new double[] { number1, number2 };
    }

    public double oneOperator() {
        number1 = pastValue;

        if (usePastValue == 'n') {
            System.out.print("Informe o operando:");
            number1 = input.nextDouble();
        }

        return number1;

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
