package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> intergerbox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        intergerbox.set(10);
        //intergerbox.set("문자 100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = intergerbox.get(); //Integer 타입 변환 (캐스팅 x)

        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.set("hello");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능 기본 형은 안됨 int 등 래퍼형 사용하면 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<Double>();
        doubleGenericBox.set(1.1);
        Double doublevalue = doubleGenericBox.get();
        System.out.println("doublevalue = " + doublevalue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> intergerbox1 = new GenericBox<>();

        //메서드는 매개변수에 인자를 전달해서 사용할 값을 결정한다.
        //제네릭 클래스는  타입 매개변수에 타입 인자를 전달해서 사용할 타입을 결정한다.

    }
}
