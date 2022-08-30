package com.gl.Question_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Floor_Contruction {

	Scanner sc = new Scanner(System.in);

	public int getBuildingFloors() {
		int totalFloors = sc.nextInt();
		return totalFloors;

	}

	public ArrayList<Integer> getFloorDeliverySchedule(int totalFloors) {
		ArrayList<Integer> floor = new ArrayList<Integer>();
		for (int i = 0; i < totalFloors; i++) {
			System.out.println("Enter the Floor size on Day " + (i + 1) + " - ");
			int floorNo = sc.nextInt();
			if (floorNo <= totalFloors) {
				floor.add(floorNo);
			} else {
				System.out.println("Invalid Floor Entered, Please Insert again for Day " + (i + 1));
				i--;
			}
		}
		return floor;
	}

	public void printFloorDeliverySchedule(ArrayList<Integer> floor) {
		for (int i = 0; i < floor.size(); i++) {
			System.out.println("Day - " + (i + 1) + "-> Floor No. -> " + floor.get(i) + " Delivered");
		}
	}
	
	public boolean linearSearch(ArrayList<Integer> floor, int input) {

		for (int i = 0; i < floor.size(); i++) {
			if (input == floor.get(i)) {
				return true;
			}
		}
		return false;
	}
	public void printFloorConstructSchedule(ArrayList<Integer> floor) {
		ArrayList<Integer> floorConstruct = new ArrayList<Integer>();
		int size = floor.size();
		for (int i = 0; i < floor.size(); i++) {
			System.out.print("\n Day " + (i + 1) + " - ");
			floorConstruct.add(floor.get(i));
			while (linearSearch(floorConstruct, size)) {
				System.out.print(size + " ");
				size--;
			}
		}
	}
}
