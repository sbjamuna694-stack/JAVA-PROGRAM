import java.util.Scanner;
public class voter{
    public static void main(String[] args){
        Scanner myobj = new Scanner (System.in);
        System.out.println("Enter a name of user:");
        String name = myobj.nextLine();
        System.out.println("Enter a age of user:");
        int age = myobj.nextInt();
        if (age>=18){
           System.out.println(name + " is eligible to vote because his/her age is "+ age);
        }else{
            System.out.println(name + "is not eligible to vote because his/her age is "+ age);
        }
        }
    }
    

