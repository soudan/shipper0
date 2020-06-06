import java.util.Set;
import java.util.TreeSet;

public class Seca3 {
    public static void main(String[]agrs){
        System.out.println("junjo demomods");

        Set<String> uka=new TreeSet<String>();
        uka.add("okiru");uka.add("fumin");uka.add("nedone");
        uka.add("haraita");uka.add("shokuatari");uka.add("kusuri");
        uka.add("awateru");

        for(String f:uka){
            System.out.println("///");
            System.out.println(f);
        }
    }
    
}