import java.io.IOException;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("Впиши фразу из 2х слов: ");

            Scanner console = new Scanner(System.in);

            String st1 = console.next();
            String st2 = console.next();

            System.out.println(st2 + " не " + st1);
            if ("stop".equals(st1)){
            break;}
        }



    }
}
