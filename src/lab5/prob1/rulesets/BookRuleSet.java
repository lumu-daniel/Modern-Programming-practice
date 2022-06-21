package lab5.prob1.rulesets;

import lab5.prob1.gui.BookWindow;

import java.awt.Component;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bookWindow = (BookWindow) ob;
		nonemptyRule();
		isbnRule();
		isbnFirstDigitRule();
		priceFloatingPointNo();
		priceRule();
	}

	private void nonemptyRule() throws RuleException {
		if(bookWindow.getIsbnValue().trim().isEmpty()||
				bookWindow.getPriceValue().trim().isEmpty()||
				bookWindow.getTitleValue().trim().isEmpty()){
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void isbnRule() throws RuleException {
		String val = bookWindow.getIsbnValue().trim();
		try {
			int x = val.length();
			Integer.parseInt(val);
			if (x != 10 && x != 13) {
				throw new RuleException("Isbn consist of either 10 or 13 characters");
			}
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
		}
	}

	private void isbnFirstDigitRule() throws RuleException {
		String val = bookWindow.getIsbnValue().trim();
		if(val.length()==10){
			if (!val.startsWith("0") && !val.startsWith("1")) {
				throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
			}
		}else if(val.length()==13){
			if (!val.startsWith("978") && !val.startsWith("979")){
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
			}
		}
	}

	private void priceFloatingPointNo() throws RuleException {
		String val = bookWindow.getPriceValue().trim();
		String[] split = val.split("\\.");
		if (split[1].length() != 2) {
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}
	}

	private void priceRule() throws RuleException {
		String val = bookWindow.getPriceValue().trim();
		if (!(Double.parseDouble(val) > 0.49)) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
	}

}
