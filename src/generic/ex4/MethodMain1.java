package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i =10;
        Object obj = Genericmethod.objectmethod(i);
        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = Genericmethod.<Integer>genericmethod(i);
        Integer number = Genericmethod.<Integer>numbermethod(10);
        Double doublevalue = Genericmethod.<Double>numbermethod(1.1);

        //<>생략으로 자바 컴파일러가  타입 인자를 추론할 수 있다
        System.out.println("타입 추론");
        Integer result1 = Genericmethod.genericmethod(i);
        Integer number1 = Genericmethod.numbermethod(10);
        Double doublevalue1 = Genericmethod.numbermethod(1.1);

    }
}
/*
제네릭 타입
정의 GenericClass<T>
타입 인자 전달: 객체를 생성하는 시점

제네릭 메서드
정의<T>T genericMethod(T t)
타입 인자 전달: 메서드를 호출하는 시점
 */
