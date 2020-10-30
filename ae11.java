class jiv{
	private int sa;
	String nv;
	private double ep;
	
	void show(){
		System.out.println("7days hist:" + sa);
		System.out.println("Mokuteki:"+nv);
		System.out.println("batery:"+ep+ "@");
		
	}
	public void setR(int s,double e){
		sa=s;
		ep=e;
		System.out.println("box irekae kaisi");
		System.out.println("--------");
	}
	
	
}
public class ae11{
	public static void main (String[]agrs){
		System.out.println("private and public cheks");
		
	jiv jiv0;
	jiv0=new jiv();
	
	jiv0.nv="kidou kaisi";
	System.out.println("LLLLL");
	jiv0.setR(250,25.0);
	jiv0.show();
	
	System.out.println("point reback");
	
	System.out.println("KKKKKKK");
	jiv0.setR(4578,-11.0);
	jiv0.nv="nothing";
	jiv0.show();
	
	System.out.println("+<<<>>>+");
	System.out.println("end...");
	
	}
}