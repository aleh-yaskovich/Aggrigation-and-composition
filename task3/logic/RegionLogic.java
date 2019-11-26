package by.htp.task3.logic;

import java.util.List;
import by.htp.task3.entity.District;

public class RegionLogic {
	
	// складываем площади районов
	public int calculateAreaRegion (List<District> list) {
		int areaRegion = 0;
		for (int i = 0; i < list.size(); i++) {
			int tmp = list.get(i).getAreaDistrict();
			areaRegion = areaRegion + tmp;
		}
		return areaRegion;
	}
	
}
