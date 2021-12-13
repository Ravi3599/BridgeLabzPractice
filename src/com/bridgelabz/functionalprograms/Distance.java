package com.bridgelabz.functionalprograms;

public class Distance {

		public static void main(String[] args) {

			System.out.println("Enter the co-ordiantes x and y of line");
			int x = Integer.valueOf(args[0]);
			int y = Integer.valueOf(args[1]);
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			System.out.println("Distance of line from origin is " + distance + " units");


	}

}
