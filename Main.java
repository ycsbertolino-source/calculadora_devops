import java.util.Scanner;

public class Main {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Java");
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado;
        switch (operacao) {
            case "+":
                resultado = somar(a, b);
                break;
            case "-":
                resultado = subtrair(a, b);
                break;
            case "*":
                resultado = multiplicar(a, b);
                break;
            case "/":
                resultado = dividir(a, b);
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
