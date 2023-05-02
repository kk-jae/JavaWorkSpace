package lifeCoding_03_scope;

// 유효범위 scope
public class _01_ {
    static void a() {
        int i = 0; // 지역 변수
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a(); // a 함수 안에 i 는 a 함수 안에서만 유효합니다.
            System.out.println(i); // for 에서 선언한 i

        }
    }
}
