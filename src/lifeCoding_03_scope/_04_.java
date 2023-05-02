package lifeCoding_03_scope;

public class _04_ {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
         // System.out.println(i); // for 문 안에있는 i를 찾을 수 없음
    }
}
