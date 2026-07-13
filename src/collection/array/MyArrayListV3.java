package collection.array;

import java.util.Arrays;
import java.util.Date;

public class MyArrayListV3 {
    private  static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV3(){
        elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity){
        elementDate = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        //코드 추가
        if(size == elementDate.length){
            grow();
        }
        elementDate[size] =e;
        size++;
    }
    //코드 추가
    public void add(int index,Object e){
        if(size == elementDate.length){
            grow();
        }
        shiftRightFrom(index);
        elementDate[index] =e;
        size++;
    }
    //코드 추가 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; size++) {
            elementDate[i] = elementDate[i -1];

        }

    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementDate.length;
        int newCapacity = oldCapacity *2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementDate = Arrays.copyOf(elementDate,newCapacity);
        //Arrays.copyOf(기존배열, 새로온배열): 새로운 길이로 배열을 생성하고, 기존 배열의 값을 새로운 배열에 복사한다.
    }

    public  Object get(int index){
        return elementDate[index];
    }
    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }
    //코드추가
    public Object remove(int index){
        Object oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementDate[size] =null;
        return oldValue;
    }
    //코드 추가 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementDate[i] = elementDate[i+i];
        }
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementDate[i])){
                return i;
            }
        }
        return -1;
    }

    public String  toString(){
        //[1,2,3,null,null] size=3
        //[1,2,3] size=3
        return Arrays.toString(Arrays.copyOf(elementDate, size)) //사이즈 만큼 복사 하는것
                + " size= " + size+ ", capacity= " + elementDate.length;
    }
}
