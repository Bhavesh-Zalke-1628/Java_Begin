import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {

        // new another way
        // System.out.println("Enter a number");
        // int num = System.in.read();
        // System.out.println(num - 48);

        // using the old way
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());

        System.out.println("Enter a number :-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }
}
