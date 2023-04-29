package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자가 다르므로 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 같은지 여부 체크

        // 문자열 비교 심화 (자바에서 문자열을 비교하기 위해서는 == 가 아니라 equals 메서드를 사용해야함 ★
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234");  // 각각 테이블에 따라 비밀번호가(메모) 다름
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // 서로 참조가 다르므로 (각각 다른 메모리 공간을 사용) false
    }
}
