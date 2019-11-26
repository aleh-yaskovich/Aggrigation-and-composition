package by.htp.task3.view;

import java.util.List;
import by.htp.task3.entity.Region;
import by.htp.task3.entity.State;

public class StateView {
	
	// выводим столицу на консоль
	public void viewCapital (State state) {
		String capital = state.getCapital().getName();
		String stateName = state.getNameState();
		System.out.println("Столицей государства "+stateName+" является "+capital);
	}
	
	// выводим количество областей
	public void viewCountRegions (State state) {
		int countRegions = state.getRegions().size();
		String stateName = state.getNameState();
		System.out.println("Государство "+stateName+" состоит из "+countRegions+" областей");
	}
	// выводим площадь государства
	public void viewStateArea (State state) {
		int stateArea = state.getAreaState();
		String stateName = state.getNameState();
		System.out.println("Площадь государства "+stateName+" равна "+stateArea+" кв.км");
	}
	
	// выводим областные центры
	public void viewCenterRegion (State state) {
		List<Region> reg = state.getRegions();
		String stateName = state.getNameState();
		System.out.println("\nВ государство "+stateName+" входят следующие областные центры:");
		for (int i = 0; i < reg.size(); i++) {
			String centerReg = reg.get(i).getCenterRegion().getName();
			String nameReg = reg.get(i).getNameRegion();
			System.out.println(centerReg+" - центр "+nameReg);
		}
	}
	
}
