public abstract class AbstractCesar implements Cifrable {
    protected int rotate;
    protected final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String cifrado = "";
    String descifrar = "";
    @Override
    public String cifrar(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = alphabet.indexOf(text.charAt(i));
            cifrado += alphabet.charAt((pos + rotate) % alphabet.length());
        }
        return cifrado;
    }

    @Override
    public String descifrar(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = alphabet.indexOf(text.charAt(i));
            descifrar += alphabet.charAt((pos - rotate) % alphabet.length());
        }
        return descifrar;
    }
}
