package com.Day26_HatelManagment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class HotelReservation 
{
	public static void main(String[] args) 
	{
		HotelReservation hotelResrv = new HotelReservation();
		List<String> hotel = hotelResrv.HotelName();
        System.out.println("Reservation hotel names : "+hotel);
        HotelReservation.reservDateHotel();
	}
	
	 HashMap<String, List<Integer>> lakeWood = new HashMap<String, List<Integer>>();
     HashMap<String, List<Integer>> bridgeWood = new HashMap<String, List<Integer>>();
     HashMap<String, List<Integer>> ridgeWood = new HashMap<String, List<Integer>>();
     int lakeWoodRating;
     int bridgeWoodRating;
     int rigdeWoodRating;

    public HotelReservation() 
    {
        setLakeWood();
        setBridgeWood();
        setRidgeWood();
        reservDateHotel();
    }
    
    public static void reservDateHotel() {
    	String date;
		int time;
		Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the date(dd/mm/yyyy):");
    	System.out.println("Enter the time:");
        
        String Date = scan.nextLine();
        //int time = scan.nextInt();
				
	}

	public List<String>  HotelName()
    {
    	List<String> hotelName = new ArrayList<String>();
    	hotelName.add("LakeWood");
    	hotelName.add("BridgeWood");
    	hotelName.add("RidgeWood");
    	return hotelName;
    }

    public void setRidgeWood() 
    {
    	List<Integer> lakeWoodReward = new ArrayList<Integer>();
    	lakeWoodReward.add(80);
    	lakeWoodReward.add(80);

        List<Integer> lakeWoodRegular = new ArrayList<Integer>();
        lakeWoodRegular.add(110);
        lakeWoodRegular.add(90);

        lakeWood.put("Rewards", lakeWoodReward);
        lakeWood.put("Regular", lakeWoodReward);
        lakeWoodRating = 3;
		
	}

    public void setBridgeWood() 
    {
		List<Integer> bridgeWoodReward = new ArrayList<Integer>();
		bridgeWoodReward.add(110);
		bridgeWoodReward.add(50);

        List<Integer> bridgeWoodRegular = new ArrayList<Integer>();
        bridgeWoodRegular.add(160);
        bridgeWoodRegular.add(60);

        bridgeWood.put("Rewards", bridgeWoodReward);
        bridgeWood.put("Regular", bridgeWoodReward);
        bridgeWoodRating = 4;
		
	}

    public void setLakeWood() 
    {
        List<Integer> lakeWoodReward = new ArrayList<Integer>();
        lakeWoodReward.add(80);
        lakeWoodReward.add(80);

        List<Integer> lakeWoodRegular = new ArrayList<Integer>();
        lakeWoodRegular.add(110);
        lakeWoodRegular.add(90);
        
        lakeWood.put("Rewards", lakeWoodReward);
        lakeWood.put("Regular", lakeWoodReward);
        lakeWoodRating = 3;
    }

}


