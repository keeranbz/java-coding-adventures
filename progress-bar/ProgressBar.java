
/**
 * Loading bar with percentage counter.
 * Inspired by https://masterex.github.io/archive/2011/10/23/java-cli-progress-bar.html
 * @author Keeran Bezuidenhout
 * 
 */
public class ProgressBar {

    private int totalProcesses;
    private char symbol;

    /**
     * Default Constructor.
     */
    public ProgressBar(){
        this.totalProcesses = 0;
        this.symbol = '#';
    }

    /**
     * Constructor.
     * 
     *  @param  totalProcesses  the total number of processes used to calculate progress percentage.
     *  @param  symbol          symbol used to build the progress bar.
     */
    public ProgressBar( int totalProcesses,  char symbol) {
        this.totalProcesses = totalProcesses;
        this.symbol = symbol;
    }

    public void setTotalProcesses( int totalProcesses) {
        this.totalProcesses = totalProcesses;
    }

    public void setSymbol( char symbol) {
        this.symbol = symbol;
    }

    public int getTotalProcesses() {
        return this.totalProcesses;
    }

    public char getSymbol() {
        return this.symbol;
    }

    /**
     * Updates loading bar and percentage counter.
     * @param currentProcess integer of the current number of completed processes used in percentage calculation.
     * @return String of the progress bar with symbol and percentage counter.
     */
    public String update( int currentProcess) {
        int percent = (currentProcess * 100) / totalProcesses;
        int characters = percent / 5;
        String bar = new String(new char[characters]).replace('\0', symbol); // https://stackoverflow.com/questions/2255500/can-i-multiply-strings-in-java-to-repeat-sequences
        return String.format("\r[%-20s]  %d %%", bar, percent);
    }

    /**
     *  Clears loading bar and percentage counter.
     * @return  Returns carriage return character
     */
    public String clear() {
        return String.format("\r %30s", "");
    }
}




