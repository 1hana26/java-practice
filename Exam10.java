import java.util.Scanner;;

public class Exam10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            //사용자가 종료를 할때까지 물어보기
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.더하기 ");
            System.out.println("2.빼기 ");
            System.out.println("3.곱하기 ");
            System.out.println("4.나누기 ");
            System.out.println("0.종료 ");
            
            int menu = sc.nextInt();
            //0을 입력한 경우 반복문 종료
            if(menu == 0){
                System.out.println("시스템이 종료됩니다.");
                break;
            }

            //예외처리
            //기존의 메뉴번호가 아닌경우
            //숫자를 입력하지 않은 경우는 nextInt()부분에서 에러가 발생함.
            if(menu>4){
                System.out.println("메뉴를 잘못 선택했습니다.");
                continue;
            }else{
                System.out.print("첫번째 수를 입력해주세요:");
                int num1 = sc.nextInt();

                System.out.print("두번째 수를 입력해주세요:");
                int num2 = sc.nextInt();

                if(menu == 1){
                    System.out.println("결과 : "+(num1+num2));
                }
                if(menu == 2){
                    System.out.println("결과 : "+(num1-num2));
                }
                if(menu == 3){
                    System.out.println("결과 : "+(num1*num2));
                }
                if(menu == 4){                    
                    System.out.println("결과 : "+(num1/num2)+" 나머지 :"+(num1%num2));
                }
            }

        }
        
        
    }
}
