import java.util.ArrayList;

public class ques1{
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(90);
        for (int i = 0; i < marks.size(); i++) {
            if (i >= 90) {
                System.out.println("A");
            }else if(i>=80 && i<90){
                System.out.println("B");
            } else if (i >= 70 && i < 80) {
                System.out.println("C");
            } else if(i<70){
                System.out.println("F");
            }
        }
    }
}