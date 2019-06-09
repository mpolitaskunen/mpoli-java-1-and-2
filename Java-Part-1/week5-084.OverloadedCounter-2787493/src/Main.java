public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter laskuri = new Counter(10,true);
        Counter nollalaskuri = new Counter(true);
        Counter minuslaskuri = new Counter(false);
        
        System.out.println("Kymppilaskuri: " + laskuri.value());
        System.out.println("Nollalaskuri: " + nollalaskuri.value());
        System.out.println("Minuslaskuri: " + minuslaskuri.value());
                   
        laskuri.increase();
        nollalaskuri.increase();
        minuslaskuri.decrease();
        
        System.out.println(laskuri.value());
        System.out.println("Nollalaskuri: " + nollalaskuri.value());
        System.out.println("Minuslaskuri: " + minuslaskuri.value());
        
        laskuri.decrease();
        nollalaskuri.decrease(5);
        minuslaskuri.increase(5);
        
        System.out.println(laskuri.value());
        System.out.println("Nollalaskuri: " + nollalaskuri.value());
        System.out.println("Minuslaskuri: " + minuslaskuri.value());
        
        
    }
}
