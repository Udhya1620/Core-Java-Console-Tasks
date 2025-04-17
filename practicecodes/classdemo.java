package practicecodes;
class Box{
	int length;
	int breadth;
	int height;
	
	 void setdim(int l,int b, int h) {
		
		this.length = l;
		this.breadth = b;
		this.height = h;
		
	}
}


public class classdemo {
	static int boxvolume(int length, int breadth, int height) {
		return length*breadth*height;
	}
	public static void main (String[]args) {
	
		Box blackbox;
		blackbox=new Box();
        blackbox.setdim(0,0,0);
		
		Box cubebox;
		cubebox=new Box();
		
		cubebox.length=34;
		cubebox.height=78;
		
		System.out.println(blackbox.height + " and " + blackbox.length);
		System.out.println(boxvolume(20,30,89));
		
		
		
		
		
		
	    
	}

}
