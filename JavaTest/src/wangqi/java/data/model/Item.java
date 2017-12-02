package wangqi.java.data.model;

public class Item {
	private int x;
	private int y;

	public Item(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Item item = (Item) obj;
		if (x != item.x) {
			return false;
		}
		if (y != item.y) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "x: " + x + " y: " + y;
	}
}
