package lifeCoding_03_scope;

// 정적인 유효범위
// b()의 i는 전역과 b() 에 선언된 i만 사용할 수 있습니다.

// 동적인 유효범위
// a()에서 선언된 i가 b()에서도 사용할 수 있게될 경우 동적인 유효범위라고 합니다.
public class _05_ {
    static int i = 5;

    static void a() {
        int i = 10;
        b();
    }
    static void b(){
        System.out.println(i); // 5
    }

    public static void main(String[] args) {
        a(); // 5
    }
}
