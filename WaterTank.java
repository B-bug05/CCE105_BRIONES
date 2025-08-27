package secondYear;

import java.util.*;

public abstract class WaterTank {

	protected int maxCap =  0;
	protected int currentlvl = 0;
		
	public WaterTank(int maxCap) {
		this.maxCap = maxCap;
		this.currentlvl = 0;
	}
	
	public abstract void fillTank(int liters);
	public abstract void useWater(int liters);
	public abstract String checkStat();
	
	public boolean isEmpty() {
		return currentlvl == 0;
	}
	public boolean isFull() {
		return currentlvl == maxCap;
	};
	

}
