package lifeCoding_04_Inheritance;

// 부모가 만든기능을 자식이 가져올 수 있고 자식을 부모로 한 자식을 또 만들 수 있음
// 가독성 증가
class MultiplicationableCalculator extends Calculator { // 뺄셈 불가능
    public void multiplication(){
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator { // 곱하기 가능
    public void division(){
        System.out.println(this.left / this.right);
    }
}
public class _03_ {
    public static void main(String[] args) {
        DivisionableCalculator c1 = new DivisionableCalculator(); // 뺄셈 기능은 없음
        c1.setOprands(20, 10);
        c1.sum();
        c1.avg();
        c1.multiplication(); // 200
        c1.division(); // 2
    }
}
