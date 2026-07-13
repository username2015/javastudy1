package generic.ex3;


import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainv2 {
    public static void main(String[] args) {
        //제네릭도 타입 제한을 안두면 Integer Object등등 모든 타입이 다 가능해서 문제가 발생한다
       AnimalHospitalV2<Dog> dogAnimalHospitalV2 = new AnimalHospitalV2<>();
       AnimalHospitalV2<Cat> catAnimalHospitalV2 = new AnimalHospitalV2<>();
       AnimalHospitalV2<Integer> integerAnimalHospitalV2 = new AnimalHospitalV2<>();
       AnimalHospitalV2<Object> objectAnimalHospitalV2 = new AnimalHospitalV2<>();

    }
}
