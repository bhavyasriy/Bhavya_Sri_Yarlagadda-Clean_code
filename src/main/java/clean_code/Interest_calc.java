package clean_code;

import clean_code.interest;

public class Interest_calc implements interest {
	    private double principal;
	    private double time_years;
	    private double interest_rate;


	    public Interest_calc(double pricipal, double time_years, double interest_rate) {
	        this.principal = pricipal;
	        this.time_years = time_years;
	        this.interest_rate = interest_rate;
	    }

	    public double getPrincipal() {
	        return principal;
	    }

	    public void setPricipal(double pricipal) {
	        this.principal = pricipal;
	    }

	    public double getTime_years() {
	        return time_years;
	    }

	    public void setTime_years(double time_years) {
	        this.time_years = time_years;
	    }

	    public double getInterest_rate() {
	        return interest_rate;
	    }

	    public void setInterest_rate(double interest_rate) {
	        this.interest_rate = interest_rate;
	    }

	    @Override
	    public double calculateSimpleInterest() {
	        return (principal * interest_rate * time_years) / 100;
	    }

	    @Override
	    public double calculateCompoundInterest() {
	        return principal * (Math.pow((1 + interest_rate / 100), time_years));
	    }

}
