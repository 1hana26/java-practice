import java.util.Scanner;

public class Exam09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산하고자 하는 수 두개를 차례로 입력해주세요");
        System.out.print("첫번째 수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 수 : ");
        int second = sc.nextInt();
        if(first==0 || second==0){
            System.out.println("0을 제외하고 입력해주세요.");
        }else{ 
            System.out.println("덧셈 : "+(first+second));
            System.out.println("덧셈 : "+first+second);
            System.out.println("곱셈 : "+(first*second));
            System.out.println("첫번째 - 두번째 : "+(first-second));
            System.out.println("두번째 - 첫번째 : "+(second-first));
            if(first>second){
                System.out.println("나눗셈 앞이 큼 : "+(first/second));
                System.out.println("나머지는 : "+(first%second));
            }else if(second>first){
                System.out.println("나눗셈 뒤가 큼 : "+(second/first));
                System.out.println("나머지는 : "+(second%first));
            };
        }
    }
}
