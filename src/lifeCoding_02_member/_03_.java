package lifeCoding_02_member;

class Calculator03 {
    public static void sum(int left, int right) { // static 이 붙어있으면 class 소속이 됩니다. 직접 접근이 가능합니다.
        System.out.println(left + right);
    }
    public static void avg(int left, int right) {
        System.out.println( (left + right) / 2 );
    }
}
public class _03_ {
    // 인스턴스를 만들지 않고 바로 적용
    public static void main(String[] args) {
        Calculator03.sum(10, 20); // Calculator03 에 직접 접근
        Calculator03.avg(10, 20);

        Calculator03.sum(20, 40);
        Calculator03.avg(20, 40);
    }
}
