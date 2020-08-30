// ref https://masterex.github.io/archive/2011/10/23/java-cli-progress-bar.html

public class ProgressBar {
    
    public static void main(String[] args) {
        // a process needs to be converted to numbers.
        // \r resets the line.

        int procs = 100000; // so the loading isn't too fast

        // implemented with percentage counter
        for (int i = 0; i <= procs; i++) { 
            int percent = (i * 100) / procs ;
            System.out.print("\r" + "Processing...  " + percent + " %"); 
        }
        System.out.println();

        // now make it an class that can be used in any project.
    }
}