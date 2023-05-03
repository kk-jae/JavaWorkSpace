package lifeCoding_Inheritance;

class SubstractionableCalculator extends Calculator { // extends 를 사용하여 Calculator 기능을 SubstractionableCalculator 에 상속함
    public void substract(){ // substract() 추가
        System.out.println(this.left - this.right); // 자식 클래스(SubCalculator) 에 정의되어있지 않기때문에 부모 클래스 변수값(left, right)을 가져옴
    }
}
public class _02_ {

    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
