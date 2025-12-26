public class BookSRP {
    private String title;
    private String author;
    private String text;
    }

class BookPrinter {
    public void printTextToConsole(String text) {
        System.out.println(text);
    }
}

class BookSaver {
    public void saveToFile(BookSRP book) {
       }
}