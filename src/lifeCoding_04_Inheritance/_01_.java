package lifeCoding_04_Inheritance;

// 상속이란 ? 물려준다.
// 어떤 객체가 있을 때 객체의 필드(변수)와 메소드를 다른 객체가 물려 받을 수 있는 기능
class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class _01_ {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        // c1.substract(); // Calculator 클래스에 substract() 가 없지만 사용하고 싶지만 Calculator 클래스를 수정할 수 없을때 상속 개념 필요
        // 1. 객체를 자신이 만들지 않았을때
        // 2. 객체가 다양한 곳에 활용되고 있는데 메소드를 추가하면 다른곳에서는 불필요한 기능이 포함될 수 있다.

        // 기존의 객체 : 부모 객체 ( 상위 클래스, Super 클래스, Base 클래스, 유도( Derived ) 클래스
        // 새로운 객체 (기존 객체의 기능을 물려 받은 객채) : 자식 객체
    }

}
