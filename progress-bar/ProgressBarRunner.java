public class ProgressBarRunner {
 
    public static void main(String[] args) {

        int procs = 50000; // so the loading isn't too fast
        ProgressBar bar = new ProgressBar(procs, '#');

        for (int i = 0; i <= procs; i++) { 
            System.out.print(bar.update(i)); 
        }
        // System.out.print(bar.clear());
        System.out.println();

    }
}