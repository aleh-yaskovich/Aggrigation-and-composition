package by.htp.task5.entity;

public enum TypeOfTransport {
	
	BUS("автобус"),
	CAR("автомобиль"),
	AIRPLANE("самолет"),
	LINER("лайнер"),
	BICYCLE("велосипед");
	
	private String type;
	
	private TypeOfTransport(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
