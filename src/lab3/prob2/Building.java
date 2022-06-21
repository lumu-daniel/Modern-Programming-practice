package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintananceCost;
	private double profit;
	private List<Apartment> apartments;
	
	public Building(double maintananceCost, double profit) {
		this.maintananceCost = maintananceCost;
		this.profit = profit;
		apartments = new ArrayList<>();
	}

	public double getMaintananceCost() {
		return maintananceCost;
	}

	public double getProfit() {
		return profit;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}
	
	public Apartment addApartment(Apartment a) {
		apartments.add(a);
		return a;
	}
	
}
