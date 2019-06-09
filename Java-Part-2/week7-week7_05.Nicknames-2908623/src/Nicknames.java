
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> nimet = new HashMap<String, String>();
        
        nimet.put("matti","mage");
        nimet.put("mikael","mixu");
        nimet.put("arto","arppa");
        
        System.out.println(nimet.get("mikael"));
    }

}
