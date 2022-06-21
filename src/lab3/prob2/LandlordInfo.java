package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> bldings;
	
	public LandlordInfo() {
		this.bldings = new ArrayList<>();
	}

	public List<Building> getBldings() {
		return bldings;
	}

	public Building addBuilding(Building blding) {
		this.bldings.add(blding);
		return blding;
	} 
	
	public double calcProfits() {
		double profit=0;
		for(Building b: bldings) {
			profit += (b.getProfit() - b.getMaintananceCost());
		}
		return profit;
	}
	

}
