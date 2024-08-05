package Fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int param1 = getParam(terminal);
        System.out.println("Digite o segundo parâmetro:");
        int param2 = getParam(terminal);
        try {
            count(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getParam(Scanner terminal){
        String param = terminal.nextLine();
        while (!param.matches("\\d+")){
            System.out.println("Apenas números inteiros! Digite novamente.");
            param = terminal.nextLine();
        }
        return Integer.parseInt(param);
    }

    static void count(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2){
            throw new ParametrosInvalidosException("Valor 1 não pode ser maior que valor 2");
        }
        int limit = param2 - param1;
        for (int i = 1; i <= limit; i++){
            String msg = "Imprimindo o número " + i;
            System.out.println(msg);
        }
    }
}

