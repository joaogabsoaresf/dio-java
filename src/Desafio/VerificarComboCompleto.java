import java.util.Scanner;
import java.util.Stack;

public class VerificarComboCompleto {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {

        // Cria uma pilha que contem todos os servicos
        Stack<String> combo = combo();

        // Itera sobre a entrada e remove o servico da pilha, caso ele esteja no input
        for (String servico : servicosContratados) {
            combo.remove(servico.trim());
        }

        // Retorna "Combo Completo" caso a pilha seja vazia, indicando que todos os itens foram passados
        if (combo.isEmpty()) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }

    public static Stack<String> combo(){
        Stack<String> combo = new Stack<>();
        combo.push("movel");
        combo.push("tv");
        combo.push("banda larga");
        return combo;
    }
}