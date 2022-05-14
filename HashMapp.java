import java.util.HashMap;
import java.util.Set;

public class HashMapp {

    public static void main(String[] arg) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("track 1", "the very first line");
        trackList.put("track 2", "this is the next song lyric number 2");
        trackList.put("track 3", "the next song lyric number 3");
        trackList.put("track 4", "the last song lyric number 4");

        String song = trackList.get("track 1");
        System.out.println(song);

        Set<String> lyrics = trackList.keySet();
        for (String track : lyrics) {
            System.out.println(track);
            System.out.println(trackList.get(track));
        }


    }
}