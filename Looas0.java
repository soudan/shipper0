import java.time.LocalDate;
import java.util.Scanner;

public class Looas0 {
    public static void main(String[]agrs){

        LocalDate juc=LocalDate.now();
        Scanner gh = new Scanner(System.in);
        String hih=gh.next();
            System.out.println(">"+ hih + ":" + juc.toString());

            String jij=gh.next();
            if(jij==jij){
                System.out.println("n/a");
            }else{
                System.out.println(jij + ":" + juc.toString());
            }
            gh.close();

        
    }
}