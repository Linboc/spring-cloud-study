import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T {

    public static void main(String[] args) {
        System.out.println(test2("AaBbCcDdasdY"));
    }
    
    public static String test2(String str) {
        
        for (int i = str.toCharArray().length-1, index = str.toCharArray().length; i >= 0; i--) {
            if (str.toCharArray()[i] >= 'A' && str.toCharArray()[i] <= 'Z') {
                if (i == str.toCharArray().length-1) {
                    index--;
                    continue;
                }
                str = str.substring(0, i) + str.substring(i+1, index--) + str.toCharArray()[i] + str.substring(index+1);
            }
        }
        
        return str;
    }
    
}
