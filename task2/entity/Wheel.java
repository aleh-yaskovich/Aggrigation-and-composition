package by.htp.task2.entity;

public class Wheel {
	
	private int diametr;
	private int width;
	private String type;
	private int treadDepth;
	private boolean position;
	
	public Wheel() {
		this.diametr = 0;
		this.width = 0;
		this.type = "multiseason";
		this.treadDepth = 0;
		this.position = true;
	}
	
	public Wheel(int diametr, int width, String type, int treadDepth, boolean position) {
		this.diametr = diametr;
		this.width = width;
		this.type = type;
		this.treadDepth = treadDepth;
		this.position = position;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTreadDepth() {
		return treadDepth;
	}

	public void setTreadDepth(int treadDepth) {
		this.treadDepth = treadDepth;
	}

	public boolean isPosition() {
		return position;
	}

	public void setPosition(boolean position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametr;
		result = prime * result + (position ? 1231 : 1237);
		result = prime * result + treadDepth;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + width;
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
		Wheel other = (Wheel) obj;
		if (diametr != other.diametr)
			return false;
		if (position != other.position)
			return false;
		if (treadDepth != other.treadDepth)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
}
