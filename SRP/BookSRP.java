public class BookSRP {
    private String title;
    private String author;
    private String text;
    // La classe ne gère QUE les données du livre
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