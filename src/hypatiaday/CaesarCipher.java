/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hypatiaday;

/**
 *
 * @author Steven
 */
public class CaesarCipher {

    public static String encrypt(String message, int shift) {
        return code(message, shift);
    }

    public static String decrypt(String message, int shift) {
        return code(message, -shift);
    }

    static String code(String message, int shift) {
        String decryption = "";
        for (char c : message.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int letter = (c - 'A' + shift) % 26;
                letter += (letter < 0) ? 26 : 0;
                decryption += (char)('A' + letter);
            }
            else
            {
                decryption += c;
            }
        }
        return decryption;
    }
}
