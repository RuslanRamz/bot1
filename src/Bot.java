import java.io.IOException;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String name = console.next();
        String age = console.next();

        System.out.println(age +" не " + name);


    }
}
