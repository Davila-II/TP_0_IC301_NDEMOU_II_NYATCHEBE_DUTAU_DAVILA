public class Book {
    private String title;
    private String author;
    private String text;

    // Gestion des données
    public String replaceWordInText(String word, String replacement) {
        return text.replaceAll(word, replacement);
    }

    // Affichage (Mauvais : ne devrait pas être ici)
    public void printTextToConsole() {
        System.out.println(text);
    }

    // Persistance (Mauvais : ne devrait pas être ici)
    public void saveToFile() {
        // Logique pour sauvegarder dans un fichier
    }
}