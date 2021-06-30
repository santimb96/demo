import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola!¿Quieres cifrar(1),  descifrar(2 o leer fichero(3)? ");
        String selection = scanner.nextLine();
        switch (selection) {
            case "1" -> {
                System.out.println("Cifrado César Clásico o César ROT13?(1/2)");
                String cifType = scanner.nextLine();
                if (cifType.equals("1")) {
                    System.out.println("Introduce el número de saltos de cifrado: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    Cesar cesar = new Cesar(number);
                    System.out.println("Introduce el string a cifrar: ");
                    System.out.println(cesar.cifrar(scanner.nextLine()));
                } else if (cifType.equals("2")) {
                    ROT13 rot13 = new ROT13();
                    System.out.println("Introduce el string a cifrar: ");
                    System.out.println(rot13.cifrar(scanner.nextLine()));
                } else {
                    System.out.println("Has de indicar 1 o 2 dependiendo del cifrado que quieras. Vuelve a intentarlo");
                }
            }
            case "2" -> {
                System.out.println("Descifrado César Clásico o César ROT13?(1/2)");
                String desType = scanner.nextLine();
                if (desType.equals("1")) {
                    System.out.println("Introduce el número de saltos de cifrado: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    Cesar cesar = new Cesar(number);
                    System.out.println("Introduce el string a cifrar: ");
                    System.out.println(cesar.descifrar(scanner.nextLine()));
                } else if (desType.equals("2")) {
                    ROT13 rot13 = new ROT13();
                    System.out.println("Introduce el string a cifrar: ");
                    System.out.println(rot13.descifrar(scanner.nextLine()));
                } else {
                    System.out.println("Has de indicar 1 o 2 dependiendo del descifrado que quieras. Vuelve a intentarlo");
                }
            }
            case "3" -> {
                LecturaFichero lecturaFichero = new LecturaFichero();
                lecturaFichero.leerFichero();
            }
            default -> System.out.println("Has de escoger entre una de las dos opciones. Inténtalo de nuevo");
        }
    }
}



