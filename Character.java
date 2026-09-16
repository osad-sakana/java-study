public class Character implements Attackable {
    String name;
    int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    @Override
    public void attack(){
        System.out.println(name + "の攻撃！");
    }
}
