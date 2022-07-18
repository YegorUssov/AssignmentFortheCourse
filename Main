import java.io.*;


public class Main {
    public static void main(String[] arg) throws IOException {
        WorkWithNumber workWithNumber = new WorkWithNumber();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String  initialString = null;
        int numbersOfSteps = 0;

        System.out.println("Начальное число: ");
        initialString = read.readLine();
        System.out.println("Количесвто ступеней: ");
        numbersOfSteps = Integer.parseInt(read.readLine());

        for(int i = 0; i < numbersOfSteps; i++) {
            initialString = workWithNumber.pars(initialString);
            System.out.println(initialString + ' ');
        }
    }
}
