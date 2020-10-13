import java.util.Random;
import java.util.Scanner;

class Password_Generator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for your password : ");
        int length = sc.nextInt(); // password length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Password:");
        String Caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#~$%<>?^&*_()=+`-/^€[]{}|\"";

        String passSymbols = Caps + chars + nums + symbols;
        Random rnd = new Random();
        
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) 
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password;
    }
}

