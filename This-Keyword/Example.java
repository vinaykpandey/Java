class Box{
	private int l, b, h;
	public void setDimension(int l, int b, int h){ // instance member function
        this.l = l;  //  this.lis instance variable is local variable
        this.b = b;
        this.h = h;
    }

    public void sendBox(){
    	GiftTracker gt = new GiftTracker();
    	gt.acceptGift(this); // this is caller object reference
    }

}
public class Example{

	public static void main(String []args){ // static member function
		Box bx = new Box();
		bx.setDimension(10,15,5);
		bx.sendBox();
	}
}