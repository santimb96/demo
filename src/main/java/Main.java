public class Main {
    public static void main(String[] args) {
        Cesar cesar = new Cesar(5);
        ROT13 rot13 = new ROT13();
        System.out.println(rot13.cifrar("Caca"));
        System.out.println(cesar.cifrar("caca"));
    }
}
