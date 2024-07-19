import java.util.*;

public class MyInfo{
    public static void main(String []args){
        int age;
        String FirstName;
        String LastName;
        String City;
        Scanner sc= new Scannner(System.in);
        FirstName=sc.nextLine();
        while(!FirstName.matches("[a-zA-Z]+")){
            FirstName=sc.nextLine();
        }
        LastName=sc.nextLine();
        while(!LastName.matches("[a-zA-Z]+")){
            LastName=sc.nextLine();
        }
        age=sc.nextInt();
        while(age<=1||age>=100){
            age=sc.nextInt();
        }
        City=sc.nextLine();
        while(!City.matches("[a-zA-Z ]+")){
            City=sc.nextLine();
        }
        System.out.println("My name is"+FirstName+" "+LastName);
        System.out.println("I am "+age+" years old was born in "+City);
    }
}