
import java.util.Scanner;

public class example {

    static void pattern(){
        Scanner input = new Scanner(System.in);

        System.out.println("N sayısı:");
        int n =input.nextInt();

        int temp = n;

        while (temp <= n){
            if (temp > 0){
                temp -= 5;
                System.out.println(temp);
            } else
                break;
        }
        while (temp < n){
            temp += 5;
            System.out.println(temp);
        }


    }

    public static void main(String[] args) {
        pattern();
    }
}
