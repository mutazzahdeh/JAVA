import java.util.HashMap;
import java.util.Set;
public class MapoftheHashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("song1", "taua ninsa");
        trackList.put("song2", "get bwaqtak");
        trackList.put("song3", "ala babi waqef amarin");
        trackList.put("song4", "ya hobi eli gab");
        System.out.println(trackList.get("song1"));
        System.out.println("@@@@@@@");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
    


}