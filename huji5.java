import java.util.Scanner;
import java.util.logging.ErrorManager;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class huji5 {
    public static void main(String[]agrs){

        int s=0;
        int g=100;
        String u="shinki";

        do{
            
            s=g+1;
            g++;           
            System.out.println(g);


        }while(s<150);
        System.out.println("set comp");
        Scanner ju=new Scanner(System.in);
        System.out.println("sin: kou: cai:");
        System.out.println(">>");
        String sc=ju.next();

        if(sc.equals("sin")){
            
            System.out.println("new line open");
        }else{
            System.out.println("nothing..");
            if(sc.equals("kou")){
                for(int w=0;w<12;w++){
                    System.out.println(w);

                }
                System.out.println("UUU");
                
                System.out.println("charging comp");
            }else{
                System.out.println("nothing..");
                if(sc.equals("cai")){
                    System.out.println("off line mord");
                }else{
                    System.out.println("<<<");
                    
                }
                if(sc.isEmpty()){
                    sc=null;
                    try {
                        sc="";
                    } catch (ArithmeticException e) {
                        System.out.println(">>"+ sc);
                    
                    }
                
                    System.out.println("system out");
                }
                    
            }
}
        System.out.println(sc);
        ju.close();


    }
    
}