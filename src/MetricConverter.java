import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters;
        double miles;
        double feet;
        double inches;
        meters=0;
        boolean done= false;
        String trash;
        System.out.println("Please enter your measurment in meters:");
        do
        {
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                done = true;
            }else{
                System.out.println("Invalid entry!");}
            break;
        }while(!done);

            feet=meters*3.28084;
            inches=feet*12;
            miles=feet/5280;
            if(done==true) {
                System.out.println("Your conversion from meters to miles is: " + miles);
                System.out.println("Your converson from meters to feet is: " + feet);
                System.out.println("Your conversion from meters to inches: " + inches);
            }
    }
}
