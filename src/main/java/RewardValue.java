public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cash) {
        this.cashValue = cash;
    }
    public RewardValue(int miles) {
        this.cashValue = miles*MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public double getMilesValue() {
        return this.cashValue/MILES_TO_CASH_CONVERSION_RATE;
    }
}
