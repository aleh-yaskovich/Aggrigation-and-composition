package by.htp.task3.logic;

import java.util.List;
import by.htp.task3.entity.Region;
import by.htp.task3.entity.State;

public class StateLogic {
	
	// складываем площади областей
	public int calculateAreaState (List<Region> list) {
		int areaState = 0;
		for (int i = 0; i < list.size(); i++) {
			int tmp = list.get(i).getAreaRegion();
			areaState = areaState + tmp;
		}
		return areaState;
	}	
	
	
	
}
