public class Loop {
    void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    void dowhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);}

    void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("For loop" + i);
        }
    }
}
