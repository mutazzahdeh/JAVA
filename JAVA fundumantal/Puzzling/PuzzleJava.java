import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    public static void main(String[] args){
      int[] arr={3,5,1,2,7,9,8,13,25,32};
      
      System.out.println(Arrays.toString(arryint(arr).toArray()));

      String[] arr2={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
      System.out.println(Arrays.toString(arrystr(arr2).toArray()));
    
      System.out.println(Arrays.toString(chshuffle().toArray()));

      System.out.println(Arrays.toString(random10().toArray()));
      System.out.println(Arrays.toString(random10sort().toArray()));


    System.out.println(randomstr());
    

System.out.println(Arrays.toString(randomstr1().toArray()));

    }
    public static ArrayList<Integer> arryint(int[] arr){
        int sum=0;
        
ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>10)myArray.add(arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(myArray.size());
        
        
        return myArray;

    }
        public static ArrayList<String> arrystr(String[] arr){
        
        
ArrayList<String> myArray = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>5)myArray.add(arr[i]);
            System.out.println(arr[i]);
        }
     
        
        
        return myArray;

    }
    public static ArrayList<Character>  chshuffle(){
          ArrayList<Character> ch = new ArrayList<Character>();
      for(char i='a';i<='z';i++){
         ch.add(i);
        
      }
      System.out.println(Arrays.toString(ch.toArray()));
      Collections.shuffle(ch);
      return ch;

    }

        public static ArrayList<Integer>  random10(){
          ArrayList<Integer> intarr = new ArrayList<Integer>();
 Random ran = new Random();
   for(int i=0;i<10;i++){
         intarr.add(ran.nextInt(55));
      }
    return intarr;

    }
     public static ArrayList<Integer>  random10sort(){
          ArrayList<Integer> intarr = new ArrayList<Integer>();
            intarr=random10();
            Collections.sort(intarr);
   
    return intarr;

    }
public static String  randomstr(){
          String strx="";
 for(int i=0;i<5;i++){
         strx+=(char)Math.floor(Math.random()*(122-97+1)+97);
      }
   
    return strx;

    }
public static ArrayList<String>  randomstr1(){
ArrayList<String> Strarr = new ArrayList<String>();
for(int i=0;i<5;i++){
    
    Strarr.add(randomstr());
}

return Strarr;
    }
}