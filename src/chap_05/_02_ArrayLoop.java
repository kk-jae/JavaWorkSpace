package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" }; // 1차원 배열

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

        // enhanced for (for-each) 반복문, 배열의 모든 요소를 순회
        for (String coffee : coffees) { // coffees 라는 배열의 값을 coffee 라는 이름으로 받는다
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
