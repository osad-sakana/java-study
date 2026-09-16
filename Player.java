public class Player {
    String name;
    int health;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    void printStatus(){
        System.out.println(name + " has " + health + " health.");
    }

    void takeDamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }
}
