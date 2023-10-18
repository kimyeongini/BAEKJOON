import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();  // stack의 길이
        int[] array = new int[len]; //길이가 num 인 순열
        Stack<Integer>[] stack1 = new Stack[4]; //4만큼 스택

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt(); //num만큼 순열에 정수로 맞춤
        }
        for (int i = 0; i < 4; i++) {
            stack1[i] = new Stack<>();
            stack1[i].push(0); // 1부터 시작이라 0지정
        }

        for (int num : array){
            for(int i = 0; i<4; i++){
                if(num > stack1[i].peek()){
                    stack1[i].push(num);
                    break;
                }
                if(i == 3 && num <= stack1[i].peek()){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}