import java.util.Scanner;

/**
 * Created by user on 01.06.2018.
 */
public class NumberOfPage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Of News ");
        int NumberOfNews = scan.nextInt();
        System.out.println(" Number Of Page = " + amountOfPageMetod(NumberOfNews));
    }

    static int amountOfPageMetod(int N) {
        int pages;
        if (N % 10 == 0)
            pages = (int) (N / 10);
        else
            pages = (int) (N / 10) + 1;
        return pages;
    }
}
