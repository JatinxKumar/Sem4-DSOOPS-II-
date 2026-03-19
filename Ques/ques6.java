// Question 6 — Dynamic Playlist Manager
// (ArrayList Advanced)
// Problem Statement
// A music app stores songs.
// Support operations:
// ADD song
// REMOVE index
// PLAY index
// Sample Input
// ADD A
// ADD B
// PLAY 1
// REMOVE 0
// PLAY 0
// Sample Output
// B
// B
import java.util.ArrayList;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();
        while (sc.hasNext()) {
            String command = sc.next();
            if (command.equals("ADD")) {
                String song = sc.next();
                playlist.add(song);
            } else if (command.equals("REMOVE")) {
                int index = sc.nextInt();
                if (index >= 0 && index < playlist.size()) {
                    playlist.remove(index);
                }
            } else if (command.equals("PLAY")) {
                int index = sc.nextInt();
                if (index >= 0 && index < playlist.size()) {
                    System.out.println(playlist.get(index));
                }
            }
        }
    }
}