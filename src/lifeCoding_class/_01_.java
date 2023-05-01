package lifeCoding_class;

public class _01_ {
    // 객체는 상태( new ... => 인스턴스 ) 와 행위( 메서드 )로 이루어진 객채로 만드는 것이다.
    public static void main(String[] args) {
        // 아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자.
        System.out.println(10 + 20); // 1,000 줄
        System.out.println(20 + 40); // 1,000 줄

        // 총 2,000 줄일 때 비효울적인 코드이므로 리팩토링 필요한 코드입니다. ( 중복 제거 )
    }
}
