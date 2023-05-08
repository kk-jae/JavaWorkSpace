package lifeCoding_05_constructor;

// 에러 발생

class Calculator01 {
    int left, right;

    public Calculator01(){}; // 에러 방지

    public Calculator01(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator01 extends Calculator01 {
    public SubstractionableCalculator01(int left, int right) {
        //
        this.left = left;
        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class _02_ {
    public static void main(String[] args) {
        SubstractionableCalculator01 c1 = new SubstractionableCalculator01(10, 20);
        // 부모클래스에 Calculator01라는 생성자가 정의되어있지 않습니다.
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
