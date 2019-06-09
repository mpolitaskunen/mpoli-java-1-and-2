package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        
        // Let's initialize the dictionary...
        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        
        // Let's add some entries...
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        // Let's test an entry
        System.out.println(dict.translate("kuusi"));
        
        // Let's remove an entry
        dict.remove("pii");
        
        // Let's test after removing an entry
        System.out.println(dict.translate("pii"));    
    }
}
