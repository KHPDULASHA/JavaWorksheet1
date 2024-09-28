import java.util.*;
public class length {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length in centimeters");
        double centimeters= scanner.nextDouble();

        double totalInch=  centimeters/2.54;
        int convertFeet= (int)totalInch/12;
        double inches= totalInch%12;

        System.out.println(centimeters+"cm is roughly equal to"+" "+ convertFeet+" feet and"+" "+ String.format("%.2f", inches)+ "inches");
    }
}
