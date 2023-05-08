package lifeCoding_03_scope;

class C {
    int v = 10;
    void m() {
        int v =  20;
        System.out.println("v : " + v);           // 지역변수
        System.out.println("this.v : " + this.v); // 전역변수
    }
}
public class _06_ {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
