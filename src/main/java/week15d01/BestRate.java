package week15d01;

public class BestRate {

    private int buyingDay;
    private int sellingDay;
    private int difference;

    public BestRate(int buyingDay, int sellingDay, int difference) {
        this.buyingDay = buyingDay;
        this.sellingDay = sellingDay;
        this.difference = difference;
    }

    public int getBuyingDay() {
        return buyingDay;
    }

    public int getSellingDay() {
        return sellingDay;
    }

    public int getDifference() {
        return difference;
    }

    public void setNewValues(int buyingDay, int sellingDay, int difference) {
        this.buyingDay = buyingDay;
        this.sellingDay = sellingDay;
        this.difference = difference;
    }
}
