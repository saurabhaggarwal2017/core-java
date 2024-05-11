package challenges.challenge15;

public class ArrayOperations {
    private int[] number;

    public ArrayOperations(int[] number) {
        this.number = number;
    }

    public class Statistics{
        public double mean(){
            double sum = 0;
            for(int num:number){
                sum+=num;
            }
            return sum/number.length;
        }
        public int median(){
            return 0;
        }
    }
}
