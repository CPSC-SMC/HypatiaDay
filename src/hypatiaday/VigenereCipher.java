package hypatiaday;

/**
 *
 * @author Steven
 */
public class VigenereCipher {

    public static String encrypt(String message, String key) {
        return code(message, key, 1);
    }

    public static String decrypt(String message, String key) {
        return code(message, key, -1);
    }
    
    public static String computeKey(String message, String encoded) {
        String key = "";
        
        for (int i = 0; i < Math.min(message.length(), encoded.length()); i++) {
            int shift = encoded.toUpperCase().charAt(i) - message.toUpperCase().charAt(i);
            while (shift < 0) { shift += 26; }
            key += (char) ('A' + shift);
        }
        
        return key;
    }
    
    private static String code(String message, String key, int dir) {
        String coded = "";
        for (int i = 0; i < message.length(); i++) {
            int shift = key.toUpperCase().charAt(i % key.length()) - 'A';
            shift *= (dir >= 0) ? 1 : -1;
            coded += CaesarCipher.code(message.substring(i, i+1), shift);
        }
        return coded;
    }
}
