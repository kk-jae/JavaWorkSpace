package chap_04;

// 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오

// 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000원 // 주차 요금은 20000원입니다.
// 경차 5시간 주차시 10000원 // 주차 요금은 10000원입니다.
// 장애인 차량 10시간 주차시 15000원 // 주차 요금은 15000원입니다.
public class _Quiz_04 {
    public static void main(String[] args) {
//        int time = 5;
//        String a = "장애인차량";
//        int pay = time * 4000;
//
//        if (a == "일반차량" || a == "경차" || a == "장애인차량") {
//            // 일반 차량
//            if (a == "일반차량" && pay <= 30000) {
//                System.out.println("주차 요금은 " + pay + " 원입니다.");
//            } else if ( a == "일반차량" && pay > 30000) {
//                System.out.println("주차 요금은 30000원입니다.");
//            }
//            // 경차 or 장애인 차량
//            if ((a == "경차" || a == "장애인차량") && pay <= 30000) {
//                System.out.println("주차 요금은 " + (pay / 2) + " 원입니다.");
//            } else if( pay > 30000) {
//                System.out.println("주차 요금은 " + 15000 + " 원입니다.");
//            }
//        } else {
//            System.out.println("차량 종류가 형식에 맞지 않습니다.");
//        }

        int hour = 10;
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)

        // 30000원 초과 시 일일 최대 요금으로 수정
        if ( fee > 30000 ){
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
