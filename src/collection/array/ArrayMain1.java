package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value =10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+ i +"]: " + arr[i]);
            if(arr[i] == value){
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
//공식: 배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
//arr[0] : x100 + (4btye * 0 ): x100
//arr[1] : x100 + (4btye * 1 ): x104
//arr[2] : x100 + (4btye * 2 ): x108

//배열의 크기와 검색 연산
//배열의 크기 1: arr[0] 연산1회
//배열의 크기 2: arr[0], arr[1] 연산2회
//배열의 크기 3: arr[0], arr[1], arr[2] 연산3회
//배열의 크기 10: arr[0], arr[1], arr[2] ... arr[9] 연산10회
//배열의 크기가 n이면 연산도 n만큼 필요하다

//빅오 표기법 예시
/*
O(1) - 상수 시간: 입력 데이터의 크기에 관계없이 알고리즘의 실행 시간이 일정하다 예) 배열에서 인덱스를 사용하는 경우

O(n) - 선형 시간: 알고리즘의 실행 시간이 입력 데이터의 크기에 비례하여 증가한다 예) 배열의 검색, 배열의 모든 요소를 순회하는 경우

O(n2)- 제곱 시간: 알고리즘의 실행 시간이 입력 데이ㅓ의 크기의 제곱에 비례하여 증가한다.
n2은 n*n을 뜻한다 예) 보통 이중 루프를 사용하는 알고리즘에서 나타남

O(log n) - 로그 시간: 알고리즘의 실행 시간이 데이터 크기의 로그에 비례하여 증가한다. 예)이진 탐색

O(n log n) - 선형 로그 시간: 예) 많은 효율적인 정렬 알고리즘들

 */