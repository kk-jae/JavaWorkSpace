package lifeCoding_03_scope;

// 무한 루프
public class _02_ {
    static int i; // 정적 변수
    static void a() {
        i = 0;
    }
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}
