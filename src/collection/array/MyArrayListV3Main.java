package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        //마지막에 추가 //O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);


        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"addList"); //O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"addFirst"); //O(n)
        System.out.println(list);

        //삭제
        Object removed1 = list.remove((4));//remove LastO(1)
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);//remove First O(n)
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);

        /*
        배열 리스트의 빅오
        데이터 추가
        마지막에 추가: O(1)
        앞,중간에 추가: O(n)

        데이터 삭제
        마지막에 삭제: O(1)
        앞, 중간에 삭제: O(n)
        인덱스 조회: O(1)
        데이터 검색: O(n)
         */
    }
}
