
import java.util.*;

import calc.methods.functions.*;
import calc.methods.interaction.*;

public class App {

  static IO io = new IO();
  static double result;
  static HashMap<String, IOperation> operationMap = new HashMap<String, IOperation>();
  static {
    operationMap.put("1", new Sum());
    operationMap.put("2", new Subs());
    operationMap.put("3", new Multiply());
    operationMap.put("4", new Divide());
    operationMap.put("5", new Pow());
    operationMap.put("6", new Sin());
    operationMap.put("7", new Cos());
    operationMap.put("8", new Log());
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean working = true;
    String menu = "__________________________________\n" + "| ------------------------------ |\n"
        + "| Qual operação deseja utilizar? |\n" + "| ------------------------------ |\n"
        + "| 1 | Soma                       |\n" + "| 2 | Subtração                  |\n"
        + "| 3 | Multiplicação              |\n" + "| 4 | Divisão                    |\n"
        + "| 5 | Potencia                   |\n" + "| 6 | Seno                       |\n"
        + "| 7 | Cosseno                    |\n" + "| 8 | Logaritmo                  |\n"
        + "| 9 | Limpar                     |\n" + "|P/sair a qualquer momento,Ctrl+c|\n"
        + "|________________________________|";

    while (working) {
      System.out.print(menu + "\n Opção -> ");
      String usrChoice = input.nextLine();
      if (!usrChoice.matches("[1-9]")) {
        System.out.println("Digite uma operacão válida");
      } else if (usrChoice.matches("9")) {
        io.clear();
      } else {
        IOperation methodCall = operationMap.get(usrChoice);
        verifyMethodCall(methodCall);
        io.showResult(result);
      }
    }
    input.close();
  }

  public static void verifyMethodCall(IOperation methodCall) {
    if (methodCall.getClass().getName().substring(8, 11).matches("Sin|Cos")) {
      result = methodCall.apply(io.oneOperator());
    } else {
      result = methodCall.apply(io.twoOperators());
    }
  }
}