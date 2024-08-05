import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem-vindo(a) a sua conta!");
        int accountNumber = accountNumber(scanner);
        String agency = agency(scanner);
        String name = name(scanner);
        Double balance = balance(scanner);
        System.out.println(msg(accountNumber, agency, name, balance));
    }

    public static int accountNumber(Scanner scanner){
        System.out.println("Por favor digite o número da sua conta");
        String number = scanner.nextLine();
        while (!number.matches("\\d+")){
            System.out.println("Por favor, digite apenas números para acessar sua conta.");
            number = scanner.nextLine();
        }
        return Integer.parseInt(number);
    }

    public static String agency(Scanner scanner){
        System.out.println("Por favor digite a sua agência");
        return scanner.nextLine();
    }

    public static String name(Scanner scanner) {
        System.out.println("Por favor digite seu nome e sobrenome");
        String name = scanner.nextLine();
        while (name.split(" ").length != 2) {
            System.out.println("Por favor, digite apenas o nome e um sobrenome.");
            name = scanner.nextLine();
        }
        return name;
    }
    public static Double balance(Scanner scanner) {
        System.out.println("Por favor digite seu saldo");
        String balance = scanner.nextLine();
        while (!isDouble(balance)){
            System.out.println("Por favor, digite seu saldo com os centavos separados por '.'.");
            balance = scanner.nextLine();
        }
        return Double.parseDouble(balance);
    }

    public static boolean isDouble(String doubleStr){
        try {
            Double.parseDouble(doubleStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String msg(int accountNumber, String name, String agency, Double balance){
        return ("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e " +
                "seu saldo %.2f já está disponível para saque.").formatted(agency, name, accountNumber, balance);
    }
}
