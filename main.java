package bus_timetable_app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		
		//just for calling functions, cf  = callFunction
		ViewData cf = new ViewData();
		
		//ArrayList<ArrayList<Integer>> t = new ArrayList <ArrayList<Integer>>();
		
		ArrayList<ArrayList<Bus>> bus_stops = Bus.createBusObjects(); 
		cf.addTimetablesToBuses(cf, bus_stops);
		
		
		
		for (int i=0; i< bus_stops.size(); i++) {
			cf.findNextBuses(bus_stops, i);
		}
		
		
	}
	
	
	
	
	
	

}
