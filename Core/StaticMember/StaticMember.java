public class StaticMember {
    int x= 10; // Instance variable
    static int y; // static member variable

    //instance function(method)
    public void fun1(){
        // static int a; // error this is not allowed
    }
    //static member function(method)
    public static void fun2(){
        // static int a;  // illegal start of expression
    }

    // static inner classs
    static class InnerTest{
        public static String country = "India";
    }

    public static void main(String[] args){
        StaticMember ex_1 = new StaticMember();
        System.out.println(ex_1);
        StaticMember.y = 5;
        System.out.println(y);
        System.out.println(StaticMember.InnerTest.country);
    }
}

