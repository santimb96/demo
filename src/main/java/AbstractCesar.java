public abstract class AbstractCesar implements Cifrable {
    protected int rotate;
    protected final String alphabet = " abcdefghijklmnopqrstuvwxyz";
    protected final String reverseAlphabet = "zyxwvutsrqponmlkjihgredcba ";
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
        return cifrado;
    }

    @Override
    public String descifrar(String text) {
        String descifrar = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int pos = reverseAlphabet.indexOf(text.charAt(i));
            descifrar += reverseAlphabet.charAt((pos + rotate) % reverseAlphabet.length());

        }
        return descifrar;
    }
}
