package generic.test.ex1;


public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainerTest = new Container<>();
        System.out.println("빈값 확인1: " + stringContainerTest.isEmpty());

        stringContainerTest.setItem("data1");
        System.out.println("저장 데이터: " + stringContainerTest.getItem());
        System.out.println("빈값 확인2: " + stringContainerTest.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터: " + integerContainer.getItem());
    }

}
