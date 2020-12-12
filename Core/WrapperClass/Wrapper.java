public class Wrapper {
    public static void main(String args[]){
        Integer x =  Integer.valueOf("123");
        System.out.println(x);
        Integer i1 =  Integer.valueOf("101011", 2);
        System.out.println(i1);
        Double d = Double.valueOf("3.14");
        System.out.println(d);
        int  aint = Integer.parseInt("345");
        System.out.println(aint);
        double b = Double.parseDouble("5.87");
        System.out.println(b);

        int c = i1.intValue();
        System.out.println(c);

    }
}
