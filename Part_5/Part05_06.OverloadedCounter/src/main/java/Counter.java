public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {}

    public int value(){
        return startValue;
    }

    public void increase(){
        startValue++;
    }

    public void decrease(){
        startValue--;
    }
    public void increase(int increaseBy){
        if(increaseBy > 0){
            startValue += increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if (decreaseBy > 0){
            startValue -= decreaseBy;
        }
    }
}
