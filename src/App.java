import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.*;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String menu = "__________________________________\n" + "| ------------------------------ |\n"
        + "| Qual operação deseja utilizar? |\n" + "| ------------------------------ |\n"
        + "| 1 | Soma                       |\n" + "| 2 | Subtração                  |\n"
        + "| 3 | Multiplicação              |\n" + "| 4 | Divisão                    |\n"
        + "| 5 | Potencia                   |\n" + "| 6 | Seno                       |\n"
        + "| 7 | Cosseno                    |\n" + "| 8 | Logaritmo                  |\n"
        + "| 9 | Limpar                     |\n" + "| 0 | Sair                       |\n"
        + "|________________________________|";

    boolean working = true;
    double result = 0;
    int operation = 1;
    char reUseLastExp = 'n';

    while (working) {

      System.out.println(menu);
      operation = input.nextInt();

      switch (operation) {
      case 1:
        if (reUseLastExp == 'n') {
          result = calcSum(input, 0);
        } else {
          result = calcSum(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 2:
        if (reUseLastExp == 'n') {
          result = calcSubs(input, 0);
        } else {
          result = calcSubs(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 3:
        if (reUseLastExp == 'n') {
          result = calcMultiply(input, 0);
        } else {
          result = calcMultiply(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 4:
        if (reUseLastExp == 'n') {
          result = calcDivide(input, 0);
        } else {
          result = calcDivide(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 5:
        if (reUseLastExp == 'n') {
          result = calcPow(input, 0);
        } else {
          result = calcPow(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 6:
        if (reUseLastExp == 'n') {
          result = calcSin(input, 0);
        } else {
          result = calcSin(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 7:
        if (reUseLastExp == 'n') {
          result = calcCos(input, 0);
        } else {
          result = calcCos(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 8:
        if (reUseLastExp == 'n') {
          result = calcLog(input, 0);
        } else {
          result = calcLog(input, result);
        }
        reUseLastExp = input.next().charAt(0);
        break;
      case 9:
        result = 0;
        break;

      default:
        working = false;
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
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para soma: ");
        n1 = input.nextDouble();
        result = pastValue + n1;
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcSubs(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para a subtracão: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Segundo número para a subtracão: ");
        n2 = input.nextDouble();
        result = n1 - n2;
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para a subtracão: ");
        n1 = input.nextDouble();
        result = pastValue - n1;
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcMultiply(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para a multiplicacao: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Segundo número para a multiplicacao: ");
        n2 = input.nextDouble();
        result = n1 * n2;
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para a multiplicacao: ");
        n1 = input.nextDouble();
        result = pastValue * n1;
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcDivide(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para o dividendo: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Segundo número para o divisor: ");
        n2 = input.nextDouble();
        result = n1 / n2;
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para o divisor: ");
        n1 = input.nextDouble();
        result = pastValue / n1;
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcPow(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Primeiro número para a base: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Segundo número para o expoente: ");
        n2 = input.nextDouble();
        result = Math.pow(n1, n2);
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para o expoente: ");
        n1 = input.nextDouble();
        result = Math.pow(pastValue, n1);
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcSin(Scanner input, double pastValue) {
    double n1, radian;
    try {
      System.out.println("Informe o número em ângulo para o calculo do Seno: ");
      n1 = input.nextDouble();
      radian = Math.toRadians(n1);
      n1 = Math.sin(radian);
      return showResult(n1);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcCos(Scanner input, double pastValue) {
    double n1, radian;
    try {
      System.out.println("Informe o número em ângulo para o calculo do Coseno: ");
      n1 = input.nextDouble();
      radian = Math.toRadians(n1);
      n1 = Math.cos(radian);
      return showResult(n1);
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double calcLog(Scanner input, double pastValue) {
    double n1, n2, result;
    try {
      if (pastValue == 0) {
        System.out.println("Informe o Segundo número para o Logaritmando: ");
        n1 = input.nextDouble();
        System.out.println("Informe o Primeiro número para a base: ");
        n2 = input.nextDouble();
        result = Math.log(n1) / Math.log(n2);
        return showResult(result);
      } else {
        System.out.println("Informe o número seguinte para o Logaritmando: ");
        n1 = input.nextDouble();
        result = Math.log(n1) / Math.log(pastValue);
        return showResult(result);
      }
    } catch (Exception err) {
      System.out.println("******\nErro na captura dos dados, insira os números corretamente\n******");
      return 0;
    }
  }

  public static double showResult(double result) {
    JFrame frame = new JFrame();
    Clipboard clip = frame.getToolkit().getSystemClipboard();
    String results = Double.toString(result);
    StringSelection selection = new StringSelection(results);
    clip.setContents(selection, null);
    System.out.println(
        "Sua resposta é: " + Math.round(result * 100.0) / 100.0 + ". Press [Y/n] to continue with this result...");
    return result;
  }
}