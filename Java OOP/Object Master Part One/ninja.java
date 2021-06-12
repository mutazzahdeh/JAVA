public class ninja extends human{
    public ninja(){
        this.stralth=10;
    }
    public steal(human x){
        x.health-=this.stralth;
        this.health+=this.stralth;
        
    }
    public runAway(human x){
        this.health-=this.stralth;
        
    }
    
}