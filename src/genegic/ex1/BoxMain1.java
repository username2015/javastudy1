package genegic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerbox = new IntegerBox();
        integerbox.set(10);
        Integer integer = integerbox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
