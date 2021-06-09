import java.util.ArrayList;
public class Basic{
public static void main(String[] args){ 
    int[] arr={5,6,7,-6,9,-10};
     arr=ShiftingtheValuesintheArray(arr);
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);

    }
public static void print(){
for(int i=1;i<=255;i++){
System.out.println(i);
}
}
public static void Printoddnumbers(){
    for(int i=0;i<255;i++){
        if(i%2>0)System.out.println(i);

    }
}
public static void Sum(){
int sum=0;

for(int i=0;i<=255;i++){
sum+=i;;

System.out.print("New number: ");
System.out.print(i);
System.out.print(" sum : ");
System.out.print(sum);
System.out.print("\n");
}
}
public static void Iteratingthroughanarray(){
int[] arr = {1,3,5,7,9,13};
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
}
public static void Findmax(){
int[] numbers={-3 ,5,4,3,2};
  int maxValue = numbers[0];
  for(int i=1;i < numbers.length;i++){
    if(numbers[i] > maxValue)
      maxValue = numbers[i];
    
  }
System.out.println(maxValue);
}
public static void getAverage(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    float av=(float)sum/arr.length;
    System.out.println(av);

}
public static void ArraywithOddNumbers(){
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for(int i=1;i<255;i++){
        if(i%2>0)myArray.add(i);
    }
    System.out.println(myArray);
}
public static Integer GreaterThanY(int[] arr,int y){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>y)count++;
    }
    return count;
}
public static int[] Squarethevalues(int[] arr){
 for(int i=0;i<arr.length;i++){
arr[i]=arr[i]*arr[i];
 }  
 return arr;
}

//
public static int[] EliminateNegativeNumbers(int[] arr){
 for(int i=0;i<arr.length;i++){
if(arr[i]<0)arr[i]=0;
 }  
 return arr;
}
//
public static float[] MaxMinandAverage(int[] arr){
    int sum=0;
    int max=arr[0];
    int min=arr[0];
 for(int i=0;i<arr.length;i++){
     sum+=arr[i];
if(arr[i]<min)min=arr[i];
if(arr[i]>max)max=arr[i];
 }  
 float av=(float)sum/arr.length;
 float[] x={max,min,av};
 return x;

}
//
public static int[] ShiftingtheValuesintheArray(int[] arr){
   
 for(int i=0;i<arr.length;i++){
     if(i==arr.length-1){arr[i]=0;break;}
arr[i]=arr[i+1];
 }  
 return arr;

}
}
    