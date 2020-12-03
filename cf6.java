class Tui{
	protected int s;
	protected double ay;
	
public Tui(){
	s=0;
	ay=0.0;
	System.out.println("make this vox");	
	
}
class RacTui extends Tui{
	public int cont;
	
	public RacTui(){
		cont=0;
		System.out.println("make this room");
		
	}
}
}
public class cf6{
	public static void main(String[]agrs){
		
		Tui[] tuis;
		tuis=new Tui[2];
		
		tuis[0]=new Tui();
		
		tuis[1]=new Tui();
		
		for(int i=0;i<tuis.length;i++){
		Class cl= tuis[i].getClass();
System.out.println((i+1) +"object is" + cl +"<>");		
		}
		
		
	}
}