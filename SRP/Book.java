public class Book {
    private String title;
    private String author;
    private String text;

    public String replaceWordInText(String word, String replacement) {
        return text.replaceAll(word, replacement);
    }

    public void printTextToConsole() {
        System.out.println(text);
    }

    public void saveToFile() {
    }
}