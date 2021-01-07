import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola!¿Quieres cifrar(1), o descifrar(2)? ");
        String selection = scanner.nextLine();
        if (selection.equals("1")) {
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
        } else if (selection.equals("2")) {
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
        } else {
            System.out.println("Has de escoger entre una de las dos opciones. Inténtalo de nuevo");
        }
    }
}


        /*System.out.println("Introduce el número de saltos de cifrado: ");
        int number = Integer.parseInt(scanner.nextLine());
        Cesar cesar = new Cesar(number);*/
//ROT13 rot13 = new ROT13();
//Cesar cesar = new Cesar(5);
//System.out.println("Introduce el string a cifrar: ");
//System.out.println(cesar.cifrar(scanner.nextLine()));
//System.out.println(rot13.cifrar(scanner.nextLine()));
//System.out.println(cesar.cifrar("caca"));
//System.out.println(rot13.cifrar("Caca"));


