import java.util.Scanner;

@SuppressWarnings("resource")

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        boolean finalizar = false;

        while (finalizar != true) {

            System.out.println("Digite o primeiro número :");
            int parametroUm = scan.nextInt();

            System.out.println("Digite o segundo número :");
            int parametroDois = scan.nextInt();

            try {

                contar(parametroUm, parametroDois);
                finalizar = true;

            } catch (ParametrosInvalidosException Exception) {

                System.err.println("O segundo parâmetro deve ser maior que o primeiro");

            }

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {

            throw new ParametrosInvalidosException();

        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {

            System.out.println("Imprimindo número: " + i);

        }

    }

}