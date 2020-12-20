interface iVehicle{
	void show();
}
class Saji implements iVehicle{
	private int rh;
	private double ft;
	
	public Saji(int r, double f){
		rh=r;
		ft=f;
		System.out.println("nunber:" + rh + "Litter>"+ft);
		System.out.println("set up comp");
	}
	public void show(){
		System.out.println("Saji:"+rh);
		System.out.println("Lit*"+ft);
	}

}

	class Tib implements iVehicle{
		
		private int flu;
		
		public Tib(int f){
			flu=f;
			System.out.println("make Tib comp>"+flu);
		}
		public void show(){
			
			System.out.println("sky-port:"+flu);
		}
	}
	
public class cf12{
	public static void main(String[]agrs){
		
		iVehicle[] ifg;
		ifg =new iVehicle[4];
		
		ifg[2]=new Saji(1221,45.6);
		
		ifg[1]=new Tib(456);
		
		for(int i=0;i<ifg.length;i++){
			ifg[i].show();
		}
	}
}