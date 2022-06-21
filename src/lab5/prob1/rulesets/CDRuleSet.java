package lab5.prob1.rulesets;

import lab5.prob1.gui.CDWindow;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		priceFloatingPointNo();
		priceRule();
	}

	private void nonemptyRule() throws RuleException {
		if(cdWindow.getPriceValue().trim().isEmpty()||
				cdWindow.getTitleValue().trim().isEmpty()||
				cdWindow.getArtistValue().trim().isEmpty()){
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void priceFloatingPointNo() throws RuleException {
		String val = cdWindow.getPriceValue().trim();
		String[] split = val.split("\\.");
		if (split[1].length() != 2) {
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}
	}

	private void priceRule() throws RuleException {
		String val = cdWindow.getPriceValue().trim();
		if (!(Double.parseDouble(val) > 0.49)) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
	}
	
}
