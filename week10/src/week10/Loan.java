package week10;

public abstract class Loan implements LoanConstants {
	int loanNum;
	String customerLastName;
	double loanAmount;
	double interestRate;
	int term;

	/**
	 * @param loanNum
	 * @param customerLastName
	 * @param loanAmount
	 * @param term
	 */
	public Loan(int loanNum, String customerLastName, double loanAmount, int term) {
		if (loanAmount > maxLoanAmount) {
			loanAmount = maxLoanAmount;
		}
		this.loanNum = loanNum;
		this.customerLastName = customerLastName;
		this.loanAmount = loanAmount;
		if (term == mediumTerm || term == longTerm) {
			this.term = term;
		} else {
			this.term = shortTerm;
		}
	}

	public double calculateTotalAmountOwed() {
		double loanFee = loanAmount * 0.01; // Assumed, Loan fee is 1% of loan amount
		return loanAmount + loanFee;
	}

	@Override
	public String toString() {
		return getClass().getName() + "\n Loan Number=" + loanNum + ",\n Customer Last Name=" + customerLastName
				+ ",\n Loan Amount=" + loanAmount + ",\n InterestRate=" + interestRate + ",\n Term=" + term
				+ " years \n Total amount owed=" + String.format("%.2f", calculateTotalAmountOwed());
	}
	
	public Object[] toArray() {
		return new Object[] {getClass().getName(),loanNum,customerLastName,loanAmount,interestRate,term, String.format("%.2f", calculateTotalAmountOwed())};
//		//return getClass().getName() + "\n Loan Number=" + loanNum + ",\n Customer Last Name=" + customerLastName
//				+ ",\n Loan Amount=" + loanAmount + ",\n InterestRate=" + interestRate + ",\n Term=" + term
//				+ " years \n Total amount owed=" + String.format("%.2f", calculateTotalAmountOwed());
	}
	
}

