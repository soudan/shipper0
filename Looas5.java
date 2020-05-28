

public class Looas5{
    public static void main(String[]agrs){

        int gt=0;
        int h=30;

        do{
            gt+=1;
            System.out.print(gt);
            if(gt>6){
                System.out.println();
                continue;
            }


        }while(gt<11);
        System.out.print("L"+gt);
        System.out.println();
        if(gt>6){

            System.out.println("-"+gt);

        }
        System.out.println(">>>>");
        do {
            h=h-0;
            System.out.println(h);
            
            if(h>0){
                h=h-5;
                if(h<1){
                    System.out.println(h);
                    System.out.println("<<<>>>");
                    break;
                }

                
                System.out.println("<<<");
            

            }
        } while (h>-1);
        System.out.println("count end");
        
        
    }
}