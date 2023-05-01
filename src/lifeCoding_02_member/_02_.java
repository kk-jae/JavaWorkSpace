package lifeCoding_02_member;

class Calculator02 {
    static double PI = 3.14;
    static int base = 0; // 클래스 변수인 base 가 추가되었다.
    int left, right; // static 이 붙지 않았으니 인스턴스 맴버임 ( 인스턴스마다 값이 변경 될 수 있음 )

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base); // 더하기에 base 의 값을 포함시킨다.
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2); // 평균치에 base 의 값을 포함시킨다.
    }
}

public class _02_ {
    public static void main(String[] args) {
        Calculator02 c1 = new Calculator02();
        c1.setOprands(10, 20); // 30
        c1.sum();

        Calculator02 c2 = new Calculator02();
        c2.setOprands(20, 40); // 60 출력
        c2.sum();

        Calculator02.base = 10; // 클래스 변수 base 의 값을 10으로 지정했다.

        c1.sum(); // 40
        c2.sum(); // 70

        System.out.println(Calculator02.base); // 새로운 객체 ( new Calculator02 )를 만들지 않아도 바로 불러올 수 있음
        System.out.println(Calculator02.PI); // 새로운 객체 ( new Calculator02 )를 만들지 않아도 바로 불러올 수 있음
    }
}
