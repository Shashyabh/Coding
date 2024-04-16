package com.HybridEncryption;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

public class RSA_Algo {

    private static PrivateKey privateKey;
    private static PublicKey publicKey;

    public static void generateKeys() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(1024);
            KeyPair pair = generator.generateKeyPair();
            privateKey = pair.getPrivate();
            publicKey = pair.getPublic();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static String encrypt(final String messsage) throws Exception {

        byte[] messageToBytes=messsage.getBytes("UTF-8");
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(messageToBytes));
    }

    public static String decrypt(String encryptedMessage) throws Exception{
        byte[] encryptedBytes=decode(encryptedMessage);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decryptedMessage=cipher.doFinal(encryptedBytes);
        return new String(decryptedMessage,"UTF8");
    }

    private static byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }

    public static void main(String[] args) throws Exception {
        generateKeys();

        String encrypted = encrypt("Shashyabh");
        System.out.println("Encrypted String: " + encrypted);

        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted String: " + decrypted);
    }

}
