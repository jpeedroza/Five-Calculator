import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.*;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String menu = "Qual operação deseja utilizar?\n" + " 1 - Soma\n" + " 2 - Subtração\n" + " 3 - Multiplicação\n"
        + " 4 - Divisão\n" + " 5 - Potencia\n" + " 6 - Seno\n" + " 7 - Cosseno\n" + " 8 - Logaritmo\n" + " 9 - Clear\n"
        + " 0 - Sair";

    boolean continuar = true;
    double resultado = 0;
    int operacao = 1;
    char wait = 'n';

    while (continuar) {

      System.out.println(menu);
      operacao = input.nextInt();

      switch (operacao) {
      case 1:
        if (wait == 'n') {
          resultado = calcSum(input, 0);
        } else {
          resultado = calcSum(input, resultado);
        }
        wait = input.next().charAt(0);
        break;
      case 2:
        resultado = calcSubs(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 3:
        resultado = calcMultiply(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 4:
        resultado = calcDivide(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 5:
        resultado = calcPow(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 6:
        resultado = calcSin(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 7:
        resultado = calcCos(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 8:
        resultado = calcLog(input);
        System.out.println("Sua resposta é: " + resultado + ". Press n to continue...");
        wait = input.next().charAt(0);
        break;
      case 9:
        resultado = 0;
        break;

      default:
        continuar = false;
        break;
      }
    }
    input.close();
    System.exit(0);
  }

  public static double calcSum(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para soma: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Segundo número para soma: ");
        n2 = input.nextDouble();
        result = n1 + n2;
        showResult(result);
        System.out.println("Sua resposta é: " + result + ". Press n to continue...");
        return result;
      }
      System.out.println("Informe o número seguinte para soma: ");
      n1 = input.nextDouble();
      result = n1 + pastValue;
      showResult(result);
      System.out.println("Sua resposta é: " + result + ". Press n to continue...");
      return result;
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcSubs(Scanner input) {
    System.out.println("Informe o Primeiro número para a subtracão: ");
    double n1 = input.nextDouble();
    System.out.println("Informe o Segundo número para a subtracão: ");
    double n2 = input.nextDouble();
    double result = n1 - n2;
    showResult(result);
    return result;
  }

  public static double calcMultiply(Scanner input) {
    System.out.println("Informe o Primeiro número para a multiplicacao: ");
    double n1 = input.nextDouble();
    System.out.println("Informe o Segundo número para a multiplicacao: ");
    double n2 = input.nextDouble();
    double result = n1 * n2;
    showResult(result);
    return result;
  }

  public static double calcDivide(Scanner input) {
    System.out.println("Informe o Primeiro número para o dividendo: ");
    double n1 = input.nextDouble();
    System.out.println("Informe o Segundo número para o divisor: ");
    double n2 = input.nextDouble();
    double result = n1 / n2;
    showResult(result);
    return result;
  }

  public static double calcPow(Scanner input) {
    System.out.println("Informe o Primeiro número para a base: ");
    double n1 = input.nextDouble();
    System.out.println("Informe o Segundo número para o expoente: ");
    double n2 = input.nextDouble();
    double result = Math.pow(n1, n2);
    showResult(result);
    return result;
  }

  public static double calcSin(Scanner input) {
    System.out.println("Informe o número em ângulo para o calculo do Seno: ");
    double n1 = input.nextDouble();
    double radian = Math.toRadians(n1);
    n1 = Math.sin(radian);
    showResult(n1);
    return n1;
  }

  public static double calcCos(Scanner input) {
    System.out.println("Informe o número em ângulo para o calculo do Coseno: ");
    double n1 = input.nextDouble();
    double radian = Math.toRadians(n1);
    n1 = Math.cos(radian);
    showResult(n1);
    return n1;
  }

  public static double calcLog(Scanner input) {
    System.out.println("Informe o Segundo número para o Logaritmando: ");
    double n1 = input.nextDouble();
    System.out.println("Informe o Primeiro número para a base: ");
    double n2 = input.nextDouble();
    double result = Math.log(n1) / Math.log(n2);
    showResult(result);
    return result;
  }

  public static void showResult(double result) {
    JFrame frame = new JFrame();
    Clipboard clip = frame.getToolkit().getSystemClipboard();
    String results = Double.toString(result);
    StringSelection selection = new StringSelection(results);
    clip.setContents(selection, null);
    /*
     * JLabel resultLabel = new JLabel("Resultado: " + result); JButton copy = new
     * JButton("Copiar"); copy.addActionListener(new ActionListener() {
     * 
     * @Override public void actionPerformed(ActionEvent e) { Clipboard clip =
     * frame.getToolkit().getSystemClipboard(); String results =
     * Double.toString(result); StringSelection selection = new
     * StringSelection(results); clip.setContents(selection, null); } });
     * 
     * JPanel panel = new JPanel(); panel.add(resultLabel); panel.add(copy);
     * frame.add(panel, BorderLayout.CENTER); frame.setSize(200, 100);
     * frame.setLocationRelativeTo(null); frame.setVisible(true);
     */
  }
}