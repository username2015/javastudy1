package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringlist = new MyArrayListV4<>();
        stringlist.add("a");
        stringlist.add("b");
        stringlist.add("c");
        String string = stringlist.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intlist = new MyArrayListV4<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);
        Integer integer = intlist.get(0);
        System.out.println("integer = " + integer);
    }
}
