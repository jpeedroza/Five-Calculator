import java.util.*;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Calculator calc = new Calculator();
    IO io = new IO();

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
    double result = 0;

    while (working) {

      System.out.print(menu + "\n Opção -> ");
      operation = input.nextInt();

      switch (operation) {
      case 1:
        result = calc.sum(io.twoOperators());
        break;
      case 2:
        result = calc.subs(io.twoOperators());
        break;
      case 3:
        result = calc.multiply(io.twoOperators());
        break;
      case 4:
        result = calc.divide(io.twoOperators());
        break;
      case 5:
        result = calc.pow(io.twoOperators());
        break;
      case 6:
        result = calc.sin(io.oneOperator());
        break;
      case 7:
        result = calc.cos(io.oneOperator());
        break;
      case 8:
        result = calc.log(io.twoOperators());
        break;
      case 9:
        io.clear();
        break;

      default:
        working = false;
        break;
      }

      if (working)
        io.showResult(result);
    }
    input.close();
    System.exit(0);
  }
}