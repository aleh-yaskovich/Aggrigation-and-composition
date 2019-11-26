package by.htp.task2.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task2.entity.Auto;
import by.htp.task2.entity.Engine;
import by.htp.task2.entity.Tank;
import by.htp.task2.entity.Wheel;
import by.htp.task2.logic.AutoLogic;
import by.htp.task2.view.AutoView;

public class Main {

	public static void main(String[] args) {

		Wheel frontLeftWheel = new Wheel(14, 8, "winter", 10, true);
		Wheel frontRightWheel = new Wheel(14, 8, "winter", 10, true);
		Wheel backLeftWheel = new Wheel(14, 8, "winter", 10, true);
		Wheel backRightWheel = new Wheel(14, 8, "winter", 10, true);
		Wheel spareWheel = new Wheel(14, 6, "multiseason", 6, false);
		List<Wheel> wheels = new ArrayList();
		wheels.add(frontLeftWheel);
		wheels.add(frontRightWheel);
		wheels.add(backLeftWheel);
		wheels.add(backRightWheel);
		wheels.add(spareWheel);
		
		Engine engine = new Engine(8, 120, 8, "gas", 1);
		
		Tank tank = new Tank(60);
		
		Auto auto = new Auto();
		auto.setBrand("Ford");
		auto.setWheels(wheels);
		auto.setEngine(engine);
		auto.setTank(tank);
		
		AutoLogic logic = new AutoLogic();
		AutoView view = new AutoView();

		view.viewBrend(auto);
		
		// Меняем колеса
		// view.showWheels(auto.getWheels());
		// int numberWheel = view.whatWheel();
		// auto.setWheels(logic.changeWheel(auto.getWheels(), numberWheel));
		// view.showWheels(auto.getWheels());
		
		// Едем
		boolean[] goAuto = logic.goAuto(auto);
		view.goAutoView(goAuto);
			
		// Заправляем бак
		view.amountOfFuel(auto);
		int amountFuel = view.whatAmountOfFuel(auto);
		auto.setAmountOfFuel(logic.refuel(auto.getAmountOfFuel(), amountFuel));
		view.amountOfFuel(auto);
			
		// Включаем зажигание
		String userRefuel = view.userRefuel(auto);
		auto.setIgnition(logic.refuel(auto, userRefuel));
		
		// Едем
		goAuto = logic.goAuto(auto);
		view.goAutoView(goAuto);
	}

}
