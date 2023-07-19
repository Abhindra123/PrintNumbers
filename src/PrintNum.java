import java.util.Scanner;

public class PrintNum {
    public static void printNum(int num){
        if(num==1){
            System.out.println(1+" ");
            return;
        }
        printNum(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=sc.nextInt();
        printNum(num);
    }
}