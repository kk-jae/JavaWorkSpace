package lifeCoding_01_class;
class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;

        // this.left -> "Calculator 안에서" 선언된 left
        // left -> 매개변수
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println( (this.left + this.right) / 2);
    }
}
public class _04_ {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        // new Calculator() : Calculator 객체를 새로 만들어 c1에 담음, ( c1은 타입은 new 객체와 동일해야합니다. - 해당 객체만 품을 수 있음 )
        // 인스턴스 : c1에 담겨있는 실제 객체의 내용, 구체적인 객체
        c1.setOprands(10, 20); // c1안에는 Calculator 객체가 들어있고, setOprands 메소드에 10, 20 매개변수 적용
        c1.sum(); // 30
        c1.avg(); // 15

        Calculator c2 = new Calculator(); // new 연산자를 통해 새로운 인스턴스 (c1, c2 ... ) 를 담아 언제든지 sum, avg 메서드를 호출해서 원하는 작업이 가능합니다.
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
