package javaSelenium;

public class WaterUsage2 {

	public static void main(String[] args) {
			    int waterUsage = 0;
			    int costPerLitre = 4;

			    if (waterUsage >= 500 && waterUsage <= 1000) {
			      System.out.println("Water usage is between 500 and 1000 litres");
			      int totalCost = waterUsage * costPerLitre;
			      System.out.println("Total cost: " + totalCost);
			    }
			  }
			}
