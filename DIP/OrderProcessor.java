package DIP;

class MySQLDatabase {
    public void save(String data) { System.out.println("Sauvegarde MySQL"); }
}

public class OrderProcessor {
    private MySQLDatabase db = new MySQLDatabase(); // Mauvais : Dépendance directe

    public void process(String order) {
        db.save(order);
    }
}