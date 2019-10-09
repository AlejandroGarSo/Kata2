package kata2;

public class Kata2 {

    public static void main(String[] args) {

        Histogram histogram = new Histogram(1,1,2,0,2,3,3,4,8,-1,-3,-1,0);
        new ConsoleHistogramDisplay().show(histogram);
    }
   
}
