package ISP;

interface Worker {
    void work();
    void eat(); // Problème pour un robot !
}

class Robot implements Worker {
    public void work() { /* travaille */ }
    public void eat() { /* ne fait rien, mais forcé de l'écrire */ }
}