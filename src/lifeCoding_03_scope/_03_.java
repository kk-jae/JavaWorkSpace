package lifeCoding_03_scope;

public class _03_ {
    static void a() {
        String title = "coding everybody"; // 지역변수
    }
    public static void main(String[] args) {
        a();
        // System.out.println(title); -> a()안에있는 title 을 찾을 수 없음
    }
}
