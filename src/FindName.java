import java.util.*;
public class FindName {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fName= scanner.nextLine();

        System.out.println("Enter your Middle name:");
        String mName= scanner.nextLine();

        System.out.println("Enter your last name:");
        String lName= scanner.nextLine();

        String initials= lName+","+ fName+ " "+ mName.charAt(0)+ ".";
        System.out.println("Your full name is :"+ initials);
    }
}
