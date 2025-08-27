package secondYear;

import javax.swing.*;

public class BuildingTank extends WaterTank {
	public BuildingTank() {
		super(1000);
	}
	
	@Override
	public void fillTank(int liters) {
		if(currentlvl + liters > maxCap) {
			currentlvl = maxCap;
			JOptionPane.showMessageDialog(null, "Tank overflow prevented! Tank is now Full");
		}else {
			currentlvl += liters;
			JOptionPane.showMessageDialog(null, liters + " liters added. Current level: " + currentlvl + "/" + maxCap);
			
		}
	}
	@Override
	public void useWater(int liters) {
		if (currentlvl - liters < 0) {
			currentlvl = 0;
			JOptionPane.showMessageDialog(null, "Not enough water! Tank is now EMPTY");
		}else {
			currentlvl -= liters;
			JOptionPane.showMessageDialog(null, liters + " liters used. Current level: " + currentlvl + "/" + maxCap);
		}
	}
	@Override
	public String checkStat() {
		if(currentlvl == 0) {
			return "Tank is empty";
		}else if(currentlvl == maxCap) {
			return "Tank is full";
		}else {
			return "Tank is in use";
		}
	}
	
	
}
