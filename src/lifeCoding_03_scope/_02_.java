package lifeCoding_03_scope;

// 무한 루프
public class _02_ {
    static int i; // 전역 변수
    static void a() {
        i = 0; // 전역 변수 i 를 할당만 함
        // int i = 0; // int i로 선언할 경우 a() 에서 새로운 i가 생성되고,
        // for 문 안에 있는 a()의 i는 for 문의 i (전역 변수 i)와 다름 -> 무한 반복 x
    }
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { // 전역 변수 i를 할당만 함
            // int = 0; 라고 할 경우 for 문의 중괄호 안에서만 유효한 지역변수가 됨 -> 무한 반복 x
            a(); // 반복문 시작 했는데 i 를 a에서 다시 0 으로 할당 -> 무한 반복
            System.out.println(i); // 0

            // i++를 해도 a()에서 다시 0을 할당 -> 무한 반복
        }
    }
}
