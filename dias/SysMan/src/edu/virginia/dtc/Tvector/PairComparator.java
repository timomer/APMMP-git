//*********************************************************************************************************************
//  Copyright 2011 by the University of Virginia
//	All Rights Reserved
//
//  Created by Patrick Keith-Hynes
//  Center for Diabetes Technology
//  University of Virginia
//*********************************************************************************************************************
package edu.virginia.dtc.Tvector;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {
	
	public int compare(Pair a, Pair b) {
		if (a.time() < b.time()) {
			return -1;
		}
		else if (a.time() > b.time()) {
			return 1;
		}
		else if (a.endTime() < b.endTime()){
			return -1;
		}
		else if (a.endTime() > b.endTime()){
			return 1;
		}
		else {
			return 0;
		}
	}


}
