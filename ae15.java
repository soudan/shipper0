class uh{
	private int f;
	private double j;
	
	public uh(){
		f=0;
		j=0.0;
		System.out.println("make this room");		
	}
	public void show(){
		System.out.println("roomnunber>"+f);
		System.out.println("logu-info:"+j);
		System.out.println("gests>:"+f);
	}
	public uh(int fi,double ji){
		f=fi;
		j=ji;
		System.out.println("room-info");
		System.out.println("roomnunber"+f);
		System.out.println("logu-info:"+j);
		
	}
		
}
public class ae15{
	public static void main(String[]agrs){
		
		uh uh0=new uh();
		uh0.show();
		
		uh uh1=new uh(5,3.1);
		uh1.show();
	}
}