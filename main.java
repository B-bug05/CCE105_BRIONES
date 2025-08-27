package secondYear;

import java.util.Scanner;
import javax.swing.*;
public class main {

	public static void main(String[] args) {
		WaterTank tank;
		
		
		while(true) {
			String tankChoice = JOptionPane.showInputDialog("Enter type of tank:\n(1) HomeTank (200 liters)\n(2) BuildingTank (1000 liters)");
			
			if (tankChoice == null) {
		        JOptionPane.showMessageDialog(null, "Program exited.");
		        System.exit(0);
		    }
			
			if(tankChoice.equals("1")) {
				tank = new HomeTank();
				break;
			}else if(tankChoice.equals("2")){
				tank = new BuildingTank();
				break;
			}else {
				JOptionPane .showMessageDialog(null, "Invalid Choice, Try again","Error",JOptionPane.ERROR_MESSAGE );
				
			}
		}
		
		while(true) {
			String choice = JOptionPane.showInputDialog("Choose Action:\n(1) Fill Tank\n(2) Use Water \n(3)Check Status");
			
			
			switch(choice) {
			case "1":
				int add = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to fill:"));
				tank.fillTank(add);
				if (tank.isFull()) { 
	                JOptionPane.showMessageDialog(null, "Tank is Full! Program ended.");
	                return; 
	            }
				break;
			case "2":
				int use = Integer.parseInt(JOptionPane.showInputDialog("Enter liters to use:"));
				tank.useWater(use);
				 if (tank.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Tank is Empty! Program ended.");
		                return; 
		            }
				break;
				
			case "3":
				JOptionPane.showMessageDialog(null, tank.checkStat());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid choice!");

			}
			
			
			
		}
		
		
	}

}
