import java.util.Random;
public class Tema4_Ejercicio13 {
    public static void main(String[] args)
    {
        Random aleatorio = new Random();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String password="";
        char letraandnum;
        for(int i=0; i<4;i++)
        {
            letraandnum = abc.charAt(aleatorio.nextInt(abc.length()));
            password += letraandnum;
            letraandnum = nums.charAt(aleatorio.nextInt(nums.length()));
            password += letraandnum;
        }
        System.out.println(password);
    }
}
