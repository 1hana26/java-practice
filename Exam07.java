public class Exam07{
    public static void main(String[] Args){
        //구구단 2단 출력
        for(int i = 1;i<=9;i++){
            System.out.print( i * 2 + " ");
        }
        System.out.println();
        System.out.println("==========");

        //반복문 중첩을 통해 2단부터 9단 출력
        for(int i = 2;i<=9;i++){
            System.out.print(i+"단 : ");
            for(int j=1;j<=9;j++){
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}