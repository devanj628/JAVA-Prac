import java.util.*;

public class MyInfo{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(", ");
        String FirstName = inputParts[0].trim();
        String LastName = inputParts[1].trim();
        int age = Integer.parseInt(inputParts[2].trim());
        String City = inputParts[3].trim();
    if (inputParts.length != 4) {
        return;
    }
        while(!FirstName.matches("[a-zA-Z]+")){
            FirstName=sc.nextLine();
        }
        while(!LastName.matches("[a-zA-Z]+")){
            LastName=sc.nextLine();
        }
        while(age<=1||age>=100){
            age=sc.nextInt();
        }
        while(!City.matches("[a-zA-Z ]+")){
            City=sc.nextLine();
        }
        System.out.println("My name is"+FirstName+" "+LastName);
        System.out.println("I am "+age+" years old was born in "+City);
    }
}