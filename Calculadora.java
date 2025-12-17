public class Calculadora {
    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("help")) {
            help();
            System.exit(0);
        }
        if (args.length != 3) {
            uso();
            System.exit(-1);
        }

        String operacion = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        double resultado = switch (operacion) {
            case "add" -> num1 + num2;
            case "sub" -> num1 - num2;
            case "mul" -> num1 * num2;
            case "div" -> num1 / num2;
            default -> throw new RuntimeException("Operación no soportada");
        };

        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operacion, num2, resultado);
    }

    public static void uso() {
        System.out.println("USO: java Calculadora <operacion> num1 num2");
    }

    public static void help() {
        uso();
        System.out.println("Operaciones soportadas: ");
        System.out.println("add\nsub\nmul\ndiv\n");
    }
}
