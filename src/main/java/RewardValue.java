public class RewardValue {
    double value;
    public RewardValue(double cash) {
        value = cash;
    }
    public RewardValue(int miles) {
        value = miles*0.0035;
    }
    public double getCashValue() {
        return value;
    }
    public double getMilesValue() {
        return value/0.0035;
    }
}
