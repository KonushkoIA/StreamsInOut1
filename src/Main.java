import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text2.txt"));
             BufferedReader bufferedReader = new BufferedReader(new FileReader("text1.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                String[] data = line.split("\\.");
                System.out.println(Arrays.toString(data));
                for (String a : data) {
                    int t = TextFormater.checkNumberOfWords(a);
                    boolean f = TextFormater.checkPolindromInLine(a);
                    System.out.println(t);
                    System.out.println(f);
                    if ((t <= 5 && t >= 3) || f) {
                        bufferedWriter.write(a);
                        bufferedWriter.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
