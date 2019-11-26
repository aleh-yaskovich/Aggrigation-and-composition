package by.htp.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Auto {
	
	private String brand;
	private List<Wheel> wheels;
	private Engine engine;
	private Tank tank;
	private int amountOfFuel; // количество топлива
	private boolean ignition; // зажигание
	
	public Auto() {
		this.brand = "Auto";
		this.wheels = new ArrayList<Wheel>();
		this.engine = new Engine();
		this.tank = new Tank();
		this.amountOfFuel = 0;
		this.ignition = false;
	}
	
	public Auto(String brand, List<Wheel> wheels, Engine engine, Tank tank, int amountOfFuel, boolean ignition) {
		this.brand = brand;
		this.wheels = wheels;
		this.engine = engine;
		this.tank = tank;
		if (amountOfFuel <= tank.getVolume()) {
			this.amountOfFuel = amountOfFuel;
		} else {
			this.amountOfFuel = 0;
		}
		this.ignition = ignition;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public int getAmountOfFuel() {
		return amountOfFuel;
	}

	public void setAmountOfFuel(int amountOfFuel) {
		this.amountOfFuel = amountOfFuel;
	}

	public boolean isIgnition() {
		return ignition;
	}

	public void setIgnition(boolean ignition) {
		this.ignition = ignition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountOfFuel;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + (ignition ? 1231 : 1237);
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (amountOfFuel != other.amountOfFuel)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (ignition != other.ignition)
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

}
