import java.lang.Math;
public class Pythagorean {
public static void main(String[] args){
                    
       calculateHypotenuse(3,4);    
       
    }

    public static void calculateHypotenuse(int legA, int legB)
 {
        double AB;
	int x=legA*legA+legB*legB;
	AB=Math.sqrt(x);
	System.out.println(AB);
    }

}