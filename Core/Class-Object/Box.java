public class Box {
    private int l,b,h;

    public void setDimension(int lh, int bh, int ht){
        l = lh;
        b = bh;
        h = ht;
    }
    public void showDimension(){
        System.out.println("L= "+ l);
        System.out.println("B= "+ b);
        System.out.println("H= "+ h);
    }

}

class Example{
    public static void main(String args[]){
        Box small_box = new Box();
        /* creating the object of class Box, small_box is a reference holding the address of object*/
        small_box.setDimension(3,4,5);
        small_box.showDimension();
        small_box = new Box();
        small_box.showDimension();
    }
}