import java.util.*;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Calculator calc = new Calculator(input);

    String menu = "__________________________________\n" + "| ------------------------------ |\n"
        + "| Qual operação deseja utilizar? |\n" + "| ------------------------------ |\n"
        + "| 1 | Soma                       |\n" + "| 2 | Subtração                  |\n"
        + "| 3 | Multiplicação              |\n" + "| 4 | Divisão                    |\n"
        + "| 5 | Potencia                   |\n" + "| 6 | Seno                       |\n"
        + "| 7 | Cosseno                    |\n" + "| 8 | Logaritmo                  |\n"
        + "| 9 | Limpar                     |\n" + "| 0 | Sair                       |\n"
        + "|________________________________|";

    boolean working = true;
    int operation = 1;
    char reUseLastExp = 'n';

    while (working) {

      System.out.println(menu);
      operation = input.nextInt();

      switch (operation) {
      case 1:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.sum();
        reUseLastExp = input.next().charAt(0);
        break;
      case 2:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.subs();
        reUseLastExp = input.next().charAt(0);
        break;
      case 3:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.multiply();
        reUseLastExp = input.next().charAt(0);
        break;
      case 4:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.divide();
        reUseLastExp = input.next().charAt(0);
        break;
      case 5:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.divide();
        reUseLastExp = input.next().charAt(0);
        break;
      case 6:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.sin();
        reUseLastExp = input.next().charAt(0);
        break;
      case 7:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.cos();
        reUseLastExp = input.next().charAt(0);
        break;
      case 8:
        if (reUseLastExp == 'n') {
          calc.clear();
        }
        calc.log();
        reUseLastExp = input.next().charAt(0);
        break;
      case 9:
        calc.clear();
        break;

      default:
        working = false;
        break;
      }
    }
    input.close();
    System.exit(0);
  }
}