package lifeCoding_02_member;

// 클래스 변수 : 클래스가 가지고 있는 변수를 모든 인스턴스에서 받아서 사용 가능
// 인스턴스 변수 : 인스턴스마다 다른 값을 가지는 변수
class Calculator01 {
    static double PI = 3.14;  // 클래스 변수 ( static -> 클래스 소속변수, 모든 인스턴스에서 동일한 값을 가진다. )
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // this.left -> "Calculator 안에서" 선언된 left
        // left -> 매개변수
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class _01_ {
    // 클래스 맴버, 인스턴스 맴버 ( 구성원 )
    public static void main(String[] args) {
        Calculator01 c1 = new Calculator01();
        System.out.println(c1.PI);

        Calculator01 c2 = new Calculator01();
        System.out.println(c2.PI);

        System.out.println(Calculator01.PI);
    }
}
