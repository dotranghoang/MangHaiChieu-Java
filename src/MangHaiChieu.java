import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        HideError();
    }

    private static void HideError() {
        try {
            MaxInArray();
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra vui lòng thử lại: ");
            HideError();
        }
    }

    private static void MaxInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = scanner.nextInt();
        int arr2D[][] = new int[length][length];

        for(int i = 0 ; i < length ; i++) {
            System.out.println("Nhập phần tử cho index " + i +":");
            for (int j = 0 ; j < length ; j++) {
                arr2D[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng sau khi nhập: " + Arrays.deepToString(arr2D));
        int max = arr2D[0][0];
        int index = 0;
        int column = 0;
        int row = 0;
        for(int k = 0 ; k < arr2D.length ; k++) {
            for (int l = 0 ; l < arr2D.length ; l++) {
                if(arr2D[k][l] > max) {
                    max = arr2D[k][l];
                    column = k ;
                    row = l;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + arr2D[column][row]);
        System.out.println("Có vị trí trong mảng là: " + "["+column+"]" + " [" + row +"]");
    }
}
