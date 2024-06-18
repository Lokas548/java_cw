import java.util.ArrayList;


public class doubleChar {
    public static String doubleCh(String s){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < s.length();i++){
            String sub = "" + s.charAt(i) + s.charAt(i);
            list.add(sub);
            sub = " ";
        }

        return String.join("",list) ;
    }
}
