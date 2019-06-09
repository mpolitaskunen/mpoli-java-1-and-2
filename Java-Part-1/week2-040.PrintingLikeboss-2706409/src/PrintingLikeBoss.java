public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int aloop = 1;
        
        while (aloop <= amount) {
            System.out.print("*");
            aloop++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int bloop = 1;
        
        while (bloop <= amount) {
            System.out.print(" ");
            bloop++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int white = size-1;
        int cloop = 1;

        while (white >= 0) {
            printWhitespaces(white);
            printStars(cloop);
            white--;
            cloop++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int white = height-1;
        int cloop = 1;
        int legwhite = height-2;
        
        while (white >= 0) {
            printWhitespaces(white);
            printStars(cloop);
            white--;
            cloop = cloop + 2;
        }
        
        printWhitespaces(legwhite);
        printStars(3);
        printWhitespaces(legwhite);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
