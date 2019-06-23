public class StaticMember {
    int x= 10; // Instance variable
    static int y; // static member variable

    //instance function(method)
    public void fun1(){

    }
    //static member function(method)
    public static void fun2(){

    }

    static class InnerTes{

    }

    public static void main(String[] args){
        Example ex_1 = new Example();
        System.out.println(ex_1);
        StaticMember.y = 5;
        System.out.println(y);
    }
}

