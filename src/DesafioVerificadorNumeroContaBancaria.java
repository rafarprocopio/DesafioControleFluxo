import java.util.Scanner;

public class DesafioVerificadorNumeroContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conata: ");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {            
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {            
            throw new IllegalArgumentException("Número de conta invalido. Digite exatamente 8 digitos.");            
        }
    }
}