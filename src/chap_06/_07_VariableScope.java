package chap_06;

public class _07_VariableScope {
    // 지역 변수
    public static void methodA() {
        // System.out.println(number); // 사용 불가
        // System.out.println(result); // 사용 불가
    }
    public static void methodB() {
        int result = 1; // 지역 변수
    }
    public static void main(String[] args) {
        int number = 3;
        // System.out.println(result); // 사용 불가

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // 사용 불가
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number); // 사용 가능
        }
        // System.out.println(j); // 사용 불가
    }
}
