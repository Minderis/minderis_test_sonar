package test.artifact;

/**
 * type of a party
 * used for searching
 * @author ybozcaada
 *
 */
@CanInvoke
public enum PartyType {

	PersonParty("PersonParty"),
	NonPersonParty("NonPersonParty"),
	LocationParty("LocationParty"),
	VehicleParty("VehicleParty");

	private String name;

	private PartyType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}