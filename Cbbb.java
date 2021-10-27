package Java08;


class obj{
	double x;
	double y;
}
public class Cbbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj obj1,obj2,avg;
		obj1=new obj();
		obj2=new obj();
		avg=new obj();
		
		obj1.x=5.2;
		obj1.y=3.9;
		
		
		obj2.x=6.5;
		obj2.y=4.6;
		
		avg.x=(obj1.x+obj2.x)/2;
		avg.y=(obj1.y+obj2.y)/2;
		
		
		System.out.println("obj1="+obj1.x+" "+obj1.y);
		System.out.println("obj2="+obj2.x+" "+obj2.y);
		System.out.println("avg="+avg.x+" "+avg.y);
	}

}
