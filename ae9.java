class pt{
	int fd;
	double se;
	
	void setPt (int f,double e){
		fd=f;
		se=e;
		System.out.println("farst:"+fd+"seca:"+se);
	}
	void show(){
			System.out.println("sinki"+fd);
			System.out.println("chenging"+se);
			
		}
}
public class ae9{
	public static void main(String[]agrs){
		pt pt0;
		pt0=new pt();
		int fdin=389002;
		double sdin=38.98;
		
		pt0.setPt(fdin, sdin);
		System.out.println("++--++--++END");
	}
}