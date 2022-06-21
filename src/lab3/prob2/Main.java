package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

/** 
 * Main class is for testing your code; you can uncomment
 * the code here once you have implemented classes. 
 * 
 * However, the way
 * data has been populated into the LandlordInfo and Building
 * objects violates the design indicated in the UML diagram for
 * this problem. Refactor the code in the main method so that
 * data is loaded in a correct manner; you can verify that you
 * have done this successfully by moving the Main class into a
 * different package.
 *
 */
public class Main {

	public static void main(String[] args) {
		LandlordInfo landlord = new LandlordInfo();
		
		
  		Apartment[] apts0 = {
  				new Apartment(600),
  				new Apartment(700)};
  		Apartment[] apts1 = {
  				new Apartment(500), 
  				new Apartment(450)
  		};
  		Apartment[] apts2 = {
  				new Apartment(1100),
  				new Apartment(650)};
  		
  		Apartment[] apts3 = {
  				new Apartment(6750), 
  				new Apartment(945)
  		};
  		
  		
  		Building b1=new Building(150, 400);
  		Building b2=new Building(175, 900);
  		Building b3=new Building(150, 300);
  		Building b4=new Building(175, 775);
  		
  		List<Building> bldgs=new ArrayList<>();
  		

  		for(Apartment a : apts0) {
  			b1.addApartment(a);
  		}
  		for(Apartment a : apts1) {
  			b2.addApartment(a);
  		}
  		for(Apartment a : apts2) {
  			b3.addApartment(a);
  		}
  		for(Apartment a : apts3) {
  			b4.addApartment(a);
  		}
  		
  		bldgs.add(b1);
  		bldgs.add(b2);
  		bldgs.add(b3);
  		bldgs.add(b4);
  		
  		for(Building b: bldgs) {
  			landlord.addBuilding(b);
  		}
  		System.out.println(landlord.calcProfits());
  				
  		}

	}


