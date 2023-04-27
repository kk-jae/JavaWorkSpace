package chap_01;

// 변수
public class _03_Variables {
    public static void main(String[] args) {
        String name = "권현재"; // 문자열 변수 선언 및 할당
        int hour = 14; // 정수형 변수 선언 및 할당

        System.out.println( name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println( name + "님, 배송이 완료되었습니다.");

        double score = 90.5; // 실수값 변수 선언 및 할당 (정밀한 값이여야 할 경우 주로 사용)
        char grade = 'A'; // 한글자 변수 선언 및 할당
        name = "철수";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false; // 불린형 변수 선언 및 할당
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d =3.1421312412;
        float f =3.14123456789F; // 3.14처럼 정밀한 값을 float 에 선언하기 위해서 뒤에 F 또는 f 를 추가합니다.
        System.out.println(d);
        System.out.println(f);

//        int i = 100000000000000; // int 는 보통 +- 21억까지 가능합니다.
        long l = 1000000000000L; // 21억 보다 클 경우 long 을 사용하고 뒤에 L 또는 l을 추가합니다.
        l = 1_000_000_000_000L; // 컴퓨터는 똑같이 인식, 개발자가 육안으로 구분하기 쉽게 표기
        System.out.println(l);

//        int, long ==>> 숫자
//        double, float ==>> 정수 및 실수
//        char, String ==>> 문자열
//        boolean ==>> 불린형
    }
}
