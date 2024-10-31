import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Title:");
            String name = sc.nextLine();


            if (name.isEmpty()){
                break;
            }

            System.out.print("Pages:");
            int pages = sc.nextInt();

            System.out.print("Year:");
            int year = sc.nextInt();

            sc.nextLine();

            books.add(new Book(name,year,pages));
        }

        System.out.print("What information will be printed?");
        String option = sc.nextLine();
        if(option.contains("everything")){
            for (Book livro: books){
                System.out.println(livro.getName() + ", " + livro.getPages() + " pages" + ", " + livro.getYear());
            }
        } else if (option.contains("name")){
            for (Book livro: books){
                System.out.println(livro.getName());
            }
        }

    }
}
