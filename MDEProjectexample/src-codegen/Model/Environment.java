package Model;

import java.util.List;

import simbad.sim.EnvironmentDescription;

public abstract class Environment extends EnvironmentDescription {
	protected List<Area> areas;
	
	public Environment(List<Area> areas) {
		super();
		this.areas = areas;
	}
	
	public List<Area> getAreas() {
		return areas;
	}
	
	public abstract void drawMap();

}
