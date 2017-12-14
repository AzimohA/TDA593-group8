package Model;

import java.util.List;

import simbad.sim.EnvironmentDescription;

public abstract class Environment extends EnvironmentDescription {
	protected List<Area> areas;
	
	public Environment() {
		super();
	}
	
	public List<Area> getAreas() {
		return areas;
	}
	
	public abstract void drawMap();
	
	public abstract List<Area> defineAreas();

}