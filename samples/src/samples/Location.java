package samples;

public class Location {
	private String Name;
	private int locationId, description;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
}
