import java.util.Scanner;

public class LogicalPrograming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to start clock");
        double start = sc.nextDouble();
        start=System.currentTimeMillis();

        System.out.println("Enter 0 to stop clock");
        double stop= sc.nextDouble();
        stop=System.currentTimeMillis();
        double elapsed_time = (stop - start)/1000;
        System.out.println("Elapsed time is " + elapsed_time );

    }
}