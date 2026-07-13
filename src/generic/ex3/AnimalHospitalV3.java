package generic.ex3;

import generic.animal.Animal;
//제네릭도 extends 키워드로 animal하고 그 자식들만 받을 수 있도록 제한한다.
public class AnimalHospitalV3<T extends  Animal> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }
    public T bigger(T target){
        return animal.getSize() > target.getSize() ?  animal : target;
    }
}
