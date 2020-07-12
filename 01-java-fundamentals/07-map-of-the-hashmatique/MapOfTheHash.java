import java.util.HashMap;

public class MapOfTheHash{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Higher", "It's taking me higher, higher, higher off the ground.");
        trackList.put("Diamonds", "Find light in the beautiful sea, I choose to be happy.");
        trackList.put("Glow In The Dark", "The stars are flickering, the sky is closing in, but I won't let go.");
        trackList.put("Experience As One", "Let's go on a mystical journey, to experience as one.");

        for (HashMap.Entry<String, String> entry : trackList.entrySet()){
            System.out.println("Track: " + entry.getKey() + " Lyrics: " + entry.getValue());
        }
    }
}