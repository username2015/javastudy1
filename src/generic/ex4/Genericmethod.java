package generic.ex4;

public class Genericmethod {
    public static Object objectmethod(Object obj){
        System.out.println("object print: " + obj);
        return obj;
    }

    public static <T> T genericmethod(T t){
        System.out.println("object print: " + t);
        return t;
    }

    public static <T extends Number> T numbermethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }
}
