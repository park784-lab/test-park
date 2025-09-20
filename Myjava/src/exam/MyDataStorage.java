package exam;

import java.util.ArrayList; // 내부에서 ArrayList를 활용

// 1. 클래스 이름을 "MyDataStorage"로 정했습니다. (아무 이름 가능)
// 2. <T>를 붙여서 이 클래스가 '제네릭' 클래스임을 선언합니다.
//    (T는 Type의 약자로, 어떤 타입이든 들어올 수 있다는 'placeholder')
public class MyDataStorage<T> {

    // 내부에서 데이터를 보관할 List (여기선 ArrayList 사용)
    // T 타입의 데이터만 저장하도록 합니다.
    private ArrayList<T> internalData = new ArrayList<>();

    // T 타입의 데이터를 추가하는 메소드
    public void add(T data) {
        internalData.add(data);
    }

    // T 타입의 데이터를 꺼내는 메소드
    public T get(int index) {
        return internalData.get(index);
    }
    
    public int size() {
    	return internalData.size();
    }

    // 테스트용 main 메소드
    public static void main(String[] args) {
        
        // T 자리에 Integer를 넣어서 객체 생성
        // 이 intStorage 객체는 Integer만 다룹니다.
        MyDataStorage<Integer> intStorage = new MyDataStorage<>();
        intStorage.add(10);
        intStorage.add(20);
        intStorage.add(50);
        System.out.println("Integer 저장소: " + intStorage.get(2)); // 10
        System.out.println("Integer 저장소: " + intStorage.size()); // 10

      // T 자리에 String을 넣어서 객체 생성
        // 이 stringStorage 객체는 String만 다룹니다.
        MyDataStorage<String> stringStorage = new MyDataStorage<>();
        stringStorage.add("Hello");
        stringStorage.add("Java");
        System.out.println("String 저장소: " + stringStorage.get(1)); // "Java"
    }
}