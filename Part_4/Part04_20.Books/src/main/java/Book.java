public class Book {
    private String name;
    private int year;
    private int pages;

    public Book (String name,int year,int pages){
        this.name = name;
        this.year = year;
        this.pages = pages;
    }


    public int getYear() {
        return year;
    }

    public String getName(){
        return name;
    }

    public int getPages(){
        return pages;
    }
}
