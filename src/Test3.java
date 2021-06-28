import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args){


        int i = enterInt(scanInt2("New.txt"));


        System.out.println(i);
    }
    public static int scanInt2( String paths) {
        File file = new File(paths);

        try {
            Scanner scan = new Scanner(file);
            return scan.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Не удалось найти дорогу", e );

        }catch (InputMismatchException notNumber ) {
            throw new IntegerReaderExeption("Чёт не так",notNumber,true, );
        }


    }


    public static int enterInt(int i) {


        int result = 0;
        while (i > 0) {
            int r = i % 10;
            i = i / 10;
            result = result * 10 + r;

        }
        return result;
    }
}







