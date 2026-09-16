public class Character {
    String name;
    int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    void attack(){
        System.out.println(name + "の攻撃！");
    }
}
