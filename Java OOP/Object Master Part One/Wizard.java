public class Wizard extends human{
    public Wizard(){
        this.health=50;
        this.intelligence=8;
    }
    public heal(human x){
        x.health+=this.intelligence;
    }
    public fireball(human x){
       x.health-=this.intelligence*3; 
    }
}