package week10;

public class PersonalLoan extends Loan {

	/**
	 * @param loanNum
	 * @param customerLastName
	 * @param loanAmount
	 * @param term
	 * @param primeInterestRate
	 */
	public PersonalLoan(int loanNum, String customerLastName, double loanAmount, int term, double primeInterestRate) {
		super(loanNum, customerLastName, loanAmount, term);
		this.interestRate = primeInterestRate + 2;
	}

}
