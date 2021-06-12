public class Samurai extends human{
    int number=0;
    public Samurai(){
        this.health=200;
        this.number+=1
    }
    public deathBlow(human x){
        x.health=0;
        this.health/=2
    }
    public void meditate() {
        this.health = 200;
    }
    public void howMany() {
        this.health = 200;
    }
    
}