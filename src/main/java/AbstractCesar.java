import java.io.*;
import java.util.Scanner;

public abstract class AbstractCesar implements Cifrable {
    protected int rotate;
    protected final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //String cifrado = "";
    //
    @Override
    public String cifrar(String text) {
        String cifrado = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = alphabet.indexOf(text.charAt(i));
            cifrado += alphabet.charAt((pos + rotate) % alphabet.length());
        }
        escribirTextoFichero(cifrado);
        return cifrado;
    }

    @Override
    public String descifrar(String text) {
        String cifrado = text;
        String descifrar = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = alphabet.indexOf(text.charAt(i));
            descifrar += alphabet.charAt((pos - rotate) % alphabet.length());
        }
        descifradoTexto(cifrado, descifrar);
        return descifrar;
    }


    public void escribirTextoFichero(String textCifrado) {
        //escribimos la ruta en donde queremos que se almacene la info
        var nombreRuta = "e:\\projects\\src\\java\\demo\\src\\txt\\cifrado.txt";
        //creamos fichero a través de la ruta
        File archivo = new File(nombreRuta);

        try {
            //creamos objeto print para printar contenido al fichero y con filewriter "true" le decimos que se añada contenido, no reemplazar
            PrintWriter escribir = new PrintWriter(new FileWriter(archivo, true));
            escribir.println(textCifrado);
            //cerramos el sobreescribir el fichero mediante close()
            escribir.close();
            System.out.println("Cifrado guardado correctamente!");
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public void descifradoTexto(String textCifrado, String textDescifrado) {
        var nombreRuta = "e:\\projects\\src\\java\\demo\\src\\txt\\descifrado.txt";
        File archivo = new File(nombreRuta);

        try {
            PrintWriter escribir = new PrintWriter(new FileWriter(archivo, true));
            escribir.println(String.format("%s: %s", textCifrado, textDescifrado));
            escribir.close();
            System.out.println("Descifrado correctamente!");
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public void leerFichero() {
        Scanner scanner = new Scanner(System.in);
        String ruta = null;
        boolean estado = false;
        System.out.println("Qué fichero quieres leer: cifrado o descifrado? (1/2)");
        int opcion = scanner.nextInt();

        while (estado == false) {
            if (opcion == 1) {
                ruta = "e:\\projects\\src\\java\\demo\\src\\txt\\cifrado.txt";
                estado = true;
            } else if (opcion == 2) {
                ruta = "e:\\projects\\src\\java\\demo\\src\\txt\\descifrado.txt";
                estado = true;
            } else {
                System.out.println("Ninguna opción es correcta. Vuelve a intentarlo");
                opcion = scanner.nextInt();
            }
        }
        File archivo = new File(ruta);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            int contadorLineas = 0;

            while (lectura != null) {
                System.out.println(String.format("línea %s: %s", contadorLineas, lectura));
                contadorLineas++;
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
