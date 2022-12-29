import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두자리 계산기입니다.");
        System.out.print("첫번째 수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 수 : ");
        int second = sc.nextInt();
        System.out.println("-------------");
        System.out.println("덧셈 : 1");
        System.out.println("뺄셈 : 2");
        System.out.println("곱셈 : 3");
        System.out.println("나눗셈 : 4");
        System.out.println("나머지 : 5");
        System.out.println("-------------");
        System.out.print("연산을 선택하세요");
        int num = sc.nextInt();

        switch(num){
            case 1:
            System.out.println(sum(first,second));
            break;
            case 2:
            System.out.println(minus(first,second));
            break;
            case 3:
            System.out.println(mul(first,second));
            break;
            case 4:
            System.out.println(div(first,second));
            break;
            case 5:
            System.out.println(rest(first,second));
            break;
            default:
            System.out.println("잘못된 연산입니다.");

        }
    }
    
    public static int sum(int a, int b){
        return a+b;
    }
    
    public static int minus(int a, int b){
        return a>b? a-b:b-a;
    }

    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a>b? a/b:b/a;
    }
    public static int rest(int a, int b){
        return a>b? a%b:b%a;
    }
}
