public class Huji{
    static  void test(){
        System.out.println("static arra test");
    }
    static void iki(String y){
        System.out.println("you"+ y +"desu");

    }
    static void tru(int n){
        System.out.print("hikisu:"+n);

    }
    static void awa(int d,int r){
        int c=d+r;

        System.out.println("total:"+ c +",desu");
    }
    void sam(){
        System.out.println("this id public seet");

    }
    public static void main(String[]agrs){

    String f="miraim";
    int t=0;
    

        System.out.println("sistem mord");
        
        if(t==0){
            while(true){
                t=1;
                System.out.println(t);
                if(t!=0)
                t=1;
                System.out.println("----"+t);
                break;
        

            }
            test();
            iki("421");
            iki("123");
            System.out.println("<<");
            tru(52);
            System.out.println("<<");
            awa(122,256);
            awa(1095,2020);
            System.out.println("///////");


        }
    }
    
}