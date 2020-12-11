abstract class Vehicle{
	
	protected int speed;
	void setSpeed(int s){
		speed=s;
		System.out.println("set on:"+ speed);
	}
	abstract void show();
}
class Sell extends Vehicle{
	
	private int den;
	private double fgs;
	
	public Sell(int d, double f){
		den=d;
		fgs=f;
		System.out.println("namber:"+den+":"+"L:<<"+fgs);
	}
	public void show(){
		System.out.println("sell Nber:"+den);
		System.out.println("gas-L:"+fgs);
		System.out.println("top-sp:"+ speed);
	}
	
	
}

class Sky extends Vehicle{
		
		private int fsky;
		
		public Sky(int fs){
			
			fsky=fs;
			System.out.println("set sky-plam>>"+ fsky);
		}
		public void show(){
			System.out.println("skyport><"+fsky);
			System.out.println("Flyspeed:"+speed);
		}
	}
public class cf10{
	public static void main(String[]agrs){
		
		Vehicle[] ji;
		ji=new Vehicle[5];
		
		ji[0]= new Sky(997);
		
		ji[3]= new Sell(2304,23.9);
		ji[3].setSpeed(230);
		
		ji[0].setSpeed(1000);
		
		ji[2] =new Sell(667,20.8);
		ji[2].setSpeed(60);
	
	}
}