package by.htp.task2.logic;

import java.util.List;

import by.htp.task2.entity.Auto;
import by.htp.task2.entity.Wheel;

public class AutoLogic {
	
	// Проверка количества колес
	private boolean numberOfWheels (List<Wheel> wheels) {
		boolean res = true;
		int count = 0;
		for (int i = 0; i < wheels.size(); i++) {
			boolean position = wheels.get(i).isPosition();
			if (position == true) {
				count++;
			}
		}
		if (count != 4) {
			res = false;
		}
		return res;
	}
	
	// Проверка количества топлива
	private boolean amountOfFuel (int amountOfFuel) {
		boolean res = true;
		if (amountOfFuel == 0) {
			res = false;
		}
		return res;
	}
	
	// Проверка зажигания
	private boolean checkThePlugs (boolean ignition) {
		boolean res = true;
		if (!ignition) {
			res = false;
		}
		return res;
	}
	
	// Менять колесо
	public List<Wheel> changeWheel (List<Wheel> wheels, int numberWheel) {
		Wheel temp = wheels.get(numberWheel-1);
		wheels.set(numberWheel-1, wheels.get(4));
		wheels.set(4, temp);
		wheels.get(numberWheel-1).setPosition(true);
		wheels.get(4).setPosition(false);
		return wheels;
	}
	
	// Заправляться
	public int refuel (int a, int b) {
		int res = a + b;
		return res;
	}
	
	// Включить зажигание
	public boolean refuel (Auto auto, String userRefuel) {
		boolean res = true;
		if (userRefuel.compareTo("+") == 0) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}
	
	// Ехать
	public boolean[] goAuto (Auto auto) {
		boolean[] goAuto = new boolean[3];
		goAuto[0] = numberOfWheels(auto.getWheels());
		goAuto[1] = amountOfFuel(auto.getAmountOfFuel());
		goAuto[2] = checkThePlugs(auto.isIgnition());
		return goAuto;
	}
	
}
