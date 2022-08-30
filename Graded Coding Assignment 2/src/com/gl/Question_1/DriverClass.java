package com.gl.Question_1;

import java.util.ArrayList;

public class DriverClass {

	public static void main(String[] args) {
		
		Floor_Contruction building = new Floor_Contruction();
		System.out.println("Enter the Total no. of Floor in Building");
		int size = building.getBuildingFloors();

		ArrayList<Integer> floor = new ArrayList<Integer>();

		floor = building.getFloorDeliverySchedule(size);
		System.out.println("Delivery Schedule of Floors is as follows ->");
		building.printFloorDeliverySchedule(floor);

		System.out.println("Construction Schedule of Floors is as Follows ->");
		building.printFloorConstructSchedule(floor);


	}

}
