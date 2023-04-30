package chap_05;

// 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 ( 재고 있음 )
// 사이즈 255 ( 재고 있음 )
// 사이즈 260 ( 재고 있음 )
// 사이즈 265 ( 재고 있음 )
// 사이즈 270 ( 재고 있음 )
// 사이즈 275 ( 재고 있음 )
// 사이즈 280 ( 재고 있음 )
// 사이즈 285 ( 재고 있음 )
// 사이즈 290 ( 재고 있음 )
// 사이즈 295 ( 재고 있음 )
public class _Quiz_05 {
    public static void main(String[] args) {
//        int[] size = new int[10];
//        size[0] = 250;
//        for (int i = 1; i < size.length; i++) {
//            size[i] = size[i - 1] + 5;
//        }
//        for (int i = 0; i < size.length; i++) {
//            System.out.println("사이즈 " + size[i] + " (재고 있음)");
//        }

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
