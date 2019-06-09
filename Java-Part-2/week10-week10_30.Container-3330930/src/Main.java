import containers.*;    

public class Main {

    public static void main(String[] args) {
        // write test code here
        ProductContainerRecorder mtv = new ProductContainerRecorder("kahvi", 10, 5);
        System.out.println("Volume: " + mtv.getVolume());
        mtv.takeFromTheContainer(7);
        System.out.println("Volume: " + mtv.getVolume());

        
    }

}
