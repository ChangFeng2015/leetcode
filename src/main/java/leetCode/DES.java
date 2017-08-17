package leetCode;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * DES
 *
 * author Dave
 */
public class DES
{
   public DES(){

   }

    /**
     * encryption
     *
     * @param dataSource
     * @param password
     * @return
     */
   public static byte[] encrypt(byte[] dataSource,String password)
   {
       try
       {
           SecureRandom random = new SecureRandom();

           DESKeySpec desKey = new DESKeySpec(password.getBytes());
           SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
           SecretKey secretKey = secretKeyFactory.generateSecret(desKey);

           Cipher cipher = Cipher.getInstance("DES");
           cipher.init(Cipher.ENCRYPT_MODE,secretKey,random);

           return cipher.doFinal(dataSource);
       }
       catch (Throwable e)
       {
            e.printStackTrace();
       }

        return null;
   }

    /**
     * decrypted
     *
     * @param dataSource
     * @param password
     * @return
     */
   public static byte[] decrypted(byte[] dataSource,String password)
   {
       try
       {
           SecureRandom random = new SecureRandom();

           DESKeySpec desKey = new DESKeySpec(password.getBytes());
           SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
           SecretKey secretKey = secretKeyFactory.generateSecret(desKey);

           Cipher cipher = Cipher.getInstance("DES");
           cipher.init(Cipher.DECRYPT_MODE,secretKey,random);
           return cipher.doFinal(dataSource);
       }
       catch (Throwable e)
       {
           e.printStackTrace();
       }
       return null;
   }

   public static void main(String[] args){
       String str = "test comment";
       //need an integer multiple of 8
       String password = "1076631546236386619515626318738879076666366776";

       byte[] encrypt = DES.encrypt(str.getBytes(),password);
       System.out.println(new String(encrypt));

       System.out.println(new String(DES.decrypted(encrypt,password)));
   }
}
