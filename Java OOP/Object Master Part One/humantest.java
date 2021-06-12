public class humantest{
    public static void main(String[] args){
        human h1= new human();
        human h2= new human();
        System.out.println(h1.health);
        h1.attack(h2);
        System.out.println(h2.health);
    }
}