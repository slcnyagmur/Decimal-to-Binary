package W3EXERCİSES;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryNumbers {
    static int num;
    static int bolen;
    static int a; //integer that power of 2
    static ArrayList<Integer>arrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER:");
        num = scan.nextInt();
        for (int i = (int)Math.sqrt(num);i>0;i--){
            if (num>=Math.pow(2,i)){
               bolen = (int) Math.pow(2,i); //the biggest power of 2 and divisor
               a = i;
               break;
            }
        }
        System.out.println("YOUR BİNARY DİGİT İS:");
        ReturnBinary(num,a);
    }
    public static ArrayList ReturnBinary(int number,int divisor){
        while (divisor>=0){
            for (int j = divisor;j>=0;j--){
                if (number>=(int)Math.pow(2,divisor)){
                    arrayList.add(1);
                    return ReturnBinary(number%(int)Math.pow(2,divisor),divisor-1);
                }
                else if (number==0){
                    arrayList.add(0);
                    return ReturnBinary(number,divisor-1);
                }
                else {
                    arrayList.add(0);
                    return ReturnBinary(number,divisor-1);
                }
            }
        }
        for (int k = 0; k<arrayList.size(); k++){
            System.out.print(arrayList.get(k));
        }
    return arrayList;
    }
}

