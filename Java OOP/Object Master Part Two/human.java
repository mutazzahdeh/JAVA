public class human{
    int strength;
    int stralth ;
    int intelligence;
    int health;
    public  human(){
        this.strength=3;
        this.stralth=3;
        this.intelligence=3;
        this.health=100;
    } 
    public void attack(human x){
        x.health-=this.strength;
    }
}