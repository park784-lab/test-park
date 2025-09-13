package test;

// 위 Calculator를 "실행"하고 "검증"하는 클래스
public class Test3 {

    public static void main(String[] args) {
        
        // 1. 테스트할 클래스의 인스턴스(객체)를 생성합니다.
        Calculator cal = new Calculator();

        // 2. add 메서드를 호출해 봅니다.
        int addResult = cal.add(10, 5);
        
        // 3. 결과를 수동으로 검증합니다. (이것이 수동 테스트입니다)
        if (addResult == 15) {
            System.out.println("add 테스트 성공 (PASS) 이다..");
        } else {
            System.out.println("add 테스트 실패 (FAIL) --- 기대값: 15, 실제값: " + addResult);
        }

        // 4. subtract 메서드를 호출해 봅니다.
        int subResult = cal.subtract(10, 5);

        // 5. 결과를 수동으로 검증합니다.
        if (subResult == 5) {
            System.out.println("subtract 테스트 성공 (PASS)");
        } else {
            System.out.println("subtract 테스트 실패 (FAIL) --- 기대값: 5, 실제값: " + subResult);
        }
    }
}