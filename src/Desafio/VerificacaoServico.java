import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contratado = false;

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Iterando sobre cada uma das partes da entrada
        String[] partes = entradaCliente.split(",");
        for (String item : partes){
            if (item.equals(servico)){
                contratado = true;
                break;
            }
        }

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}

