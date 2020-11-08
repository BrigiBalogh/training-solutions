package statements;

public class Investment {

    private double cost=0.3;

    private int fund;

    private int interesRate;

    private boolean active=true;

    public Investment(int fund,int interesRate ) {
        this.fund=fund;
        this.interesRate=interesRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield (int days) {
        return fund* interesRate*days/(100*365);
    }

    public double close(int days) {
        double totalAmount=(getFund()+getYield(days))*(1-cost/100) ;
        double payout= active? totalAmount:0;
         active=false;
         return payout;
    }
}
