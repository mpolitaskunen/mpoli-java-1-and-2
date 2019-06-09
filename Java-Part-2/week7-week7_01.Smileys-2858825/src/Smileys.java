
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
    }
    
    private static void printWithSmileys(String teksti) {
         
        int mPituus = teksti.length();
        String hymio = ":)";
        String white = " ";
        String odd = "";
        
        if (mPituus % 2 == 1) {
            odd = " ";
        }
        
        String keski = hymio + white + teksti + white + odd + hymio;
        
        int kPituus = keski.length();
        int toistot = kPituus/2;
        
        for(int i = 0; i < toistot; i++) {
            System.out.print(hymio);
        }
        
        System.out.println("");
        System.out.println(keski);
        
        for(int i=0; i<toistot; i++) {
            System.out.print(hymio);
        }
        System.out.println();
        
    }

}
