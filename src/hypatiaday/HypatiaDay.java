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
public class HypatiaDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // This is a comment. It is just a note for a programmer
        
        // Print a basic message... it appears in the console window below
        System.out.println("Hello world!");
        
        // Make it print your name! 
        // Delete the // on the to make it active and change the name!
        // System.out.println("Liz");
        
        // Let's encrypt your name (replace "Liz" with your name) using a cipher
        // System.out.println(CaesarCipher.encrypt("Liz", 7));
        
        // In the line above, the 7 indicates that we shift the letters forward 7 steps
        // Copy and paste the line above and 
        //      try different shift values instead of 7
        
        
        
        // Encrypt a different word with the Caesar cipher e.g.,
        // System.out.println(CaesarCipher.encrypt("I love Bobby", 12));
        
        
        
        // If you know the encrypted text and the shift, you can recover the
        // original information... notice that we decrypt the encrypted text
        // with the original shift value
        // System.out.println(CaesarCipher.decrypt("U XAHQ NANNK", 12));
        
        
        // Here is an encrypted message: BJQHTRJ YT MDUFYNF IFD
        // Try to decipher it by guessing the shift value
        // In otherwords, try different shift values until you get a message
        // that makes sense.
        
        
        
        // Now, let's try a fancier cipher called Vigenere's cipher. It is like
        // Caesar cipher, except you use a different shift for each letter.
        // Pick a message and a key. If the key isn't the same length as the
        // message repeat it e.g.,
        // System.out.println(VigenereCipher.encrypt("JUSTINBIEBER","TRUEBELIEVER"));
        
        // You can also decrypt a message e.g.,
        // System.out.println(VigenereCipher.decrypt("CLMXJRMQIWII", "TRUEBELIEVER"));
        
        
        // One nice way to create a key is to have two messages. One is "plain"
        // and the other is "encoded". You can compute a key that allows the "plain"
        // message to be encrypted as the "encoded" message.
        // System.out.println(VigenereCipher.computeKey("LOVE", "HATE"));
        // System.out.println(VigenereCipher.encrypt("LOVE", "WMYA"));
        // System.out.println(VigenereCipher.decrypt("HATE", "WMYA"));
        
        // Choose two phrases to generate a Vigenere cipher key and then use that
        // key to encrypt a message
        // System.out.println(VigenereCipher.encrypt("WELCOMETOHYPATIADAY", "WYMAWYMAWYMAWYMAWYM"));
        // System.out.println(VigenereCipher.decrypt("SCXCKKQTKFKPWRUAZYK", "WYMAWYMAWYMAWYMAWYM"));
        
        
    }
    
}
