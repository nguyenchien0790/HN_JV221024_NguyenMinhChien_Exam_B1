package rikkei.academy;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {

        int[] arrInt = new int[100];
        do {
            System.out.println("\n*****HACKATHON-JAVA-BASIC-1-MENU*****");
            System.out.println("Chọn 1 để nhập số phần tử và giá trị cho các phần tử trong mảng.");
            System.out.println("Chọn 2 để in ra giá trị cho các phần tử trong mảng.");
            System.out.println("Chọn 3 để tính tổng và in ra cá phần tử có giá trị lẻ trong mảng.");
            System.out.println("Chọn 4 để in ra giá trị lớn nhất trong mảng.");
            System.out.println("Chọn 5 để thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng.");
            System.out.println("Chọn 6 để in ra mảng đảo ngược.");
            System.out.println("Chọn 7 để in ra các phần tử là số nguyên tố trong mảng.");
            System.out.println("Chọn 8 để sắp xếp mảng tăng dần.");
            System.out.println("Chọn 9 Thoát");
            System.out.print("Mời lựa chọn ( 1/2/3/4/5/6/7/8/9 ) : ");
            int choice =Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    Main.inputArray(arrInt);
                    break;
                case 2:
                    Main.displayArray(arrInt);
                    break;
                case 3:
                    Main.sumOddArray(arrInt);
                    break;
                case 4:
                    Main.minMaxArr(arrInt);
                    break;
                case 5:
                    Main.chiaHetHaiBa(arrInt);
                    break;
                case 6:
                    Main.phanTuDaoNguoc(arrInt);
                    break;
                case 7:
                    Main.soNguyenTo(arrInt);
                    break;
                case 8:
                    Main.sapXepTangDan(arrInt);
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập 1-9");
            }
        }while (true);
    }
    public static void inputArray(int[] arrInt){
        System.out.print("Nhập số lượng phần tử cần nhâp thông tin : ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá trị các phần tử của mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.print("   Nhập phần tử thứ " + (i + 1) + ": ");
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public static void displayArray(int[] arrInt){
        System.out.println("Các phần tử vừa nhập trong mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arrInt[i]);
        }
    }
    public static void sumOddArray(int[] arrInt){
        System.out.print("Các phần tử có gía trị lẻ trong mảng : ");
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (arrInt[i]%2!=0) {
                System.out.println(" " + arrInt[i]);
                sum += arrInt[i];
            }
        }
        System.out.print("Tổng các phần tử lẻ = " +sum);
    }
    public static void minMaxArr(int[] arrInt){
        int max =0;
        int min = arrInt[0];
        for (int i : arrInt) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.print(Arrays.toString(arrInt)+"\n");
        System.out.print("Giá trị lớn nhất trong mảng : " + max+"\n");
        System.out.print("Giá trị nhỏ nhất trong mảng : " + min);
    }

    public static void chiaHetHaiBa(int[] arrInt){
        System.out.print("Số phần tử trong mảng chia hết cho cả 2 và 3 là : ");
        for (int i = 0; i < n; i++) {
            if (arrInt[i]%2==0 && arrInt[i]%3==0){
                System.out.print(" " +arrInt[i]);
            }
        }
    }

    public static void phanTuDaoNguoc(int[] arrInt){
        int[] tempArray = new int[n];
        System.out.print("Mảng ban đầu : ");
        for (int i :arrInt) {
            System.out.println(" "+i);
        }
        for (int i = n - 1; i >= 0; i--) {
            tempArray[n - 1 - i] = arrInt[i];
        }
        arrInt = tempArray;

        for (int i = 0; i < n; i++) {
            System.out.print(arrInt[i] + "\t");
        }
        System.out.print("Mảng sau khi đảo ngược : ");
        for (int i :arrInt) {
            System.out.println(" "+i);
        }
    }

    public static void soNguyenTo(int[] arrInt){
        System.out.println("Các phần tử có giá trị trong mảng là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arrInt[i]);
        }
        boolean check = true;
        System.out.print("Các phần tử là sô nguyên tố trong mảng : ");
        for (int i = 0; i < n; i++) {
            for (int j = 2; j < arrInt[i]; j++) {
                check = true;
                if (arrInt[i]%j==0){
                    check = false;
                }
            }
            if (check){
                System.out.print(" "+arrInt[i]);
            }
        }
    }

    public static void sapXepTangDan(int[] arrInt){
        System.out.print("Cac phần tử trong mảng trước khi sắp xếp : ");
        for (int i :arrInt) {
            System.out.print(" "+ i);
        }

        for (int k = 0; k < n - 1; k++) {
            int min = k;
            for (int j = k + 1; j < n; j++) {
                if (arrInt[j] <arrInt[min]) {
                    min = j;
                }
            }
            int temp = arrInt[k];
            arrInt[k] = arrInt[min];
            arrInt[min] = temp;
        }
        System.out.print("Mảng sau khi sắp xếp là : ");
        for (int i :arrInt) {
            System.out.print(" "+ i);
        }
    }

}
