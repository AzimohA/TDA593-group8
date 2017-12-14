package Model;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import project.LocationController;
import project.Point;
import simbad.sim.AbstractWall;
import simbad.sim.Boundary;
import simbad.sim.HorizontalBoundary;
import simbad.sim.HorizontalWall;
import simbad.sim.VerticalBoundary;
import simbad.sim.VerticalWall;

public class UniversityEnvironment extends Environment {
	
	Color color;

	public UniversityEnvironment(Color color) {
		super();
		super.areas = defineAreas();
		this.color = color;
	}

	@Override
	public void drawMap() {
		Boundary w1 = new HorizontalBoundary(-10.0f, -100.0f, 10.0f, this, color);



        Boundary w2 = new HorizontalBoundary(10.0f, -100.0f, 10.0f, this, color);



        Boundary w3 = new VerticalBoundary(10.0f, -100.0f, 10.0f, this, color);



        Boundary w4 = new VerticalBoundary(-10.0f, -100.0f, 10.0f, this, color);

		AbstractWall underWall = new HorizontalWall(7f, -7f, 7f, this, color);

        AbstractWall overWall = new HorizontalWall(-7f, -7f, 7f, this, color);

        AbstractWall firstMiddleWall = new HorizontalWall(0f, 5f, 7f, this, color);

        AbstractWall secondMiddleWall = new HorizontalWall(0f, -3f, 3f, this, color);

        AbstractWall thirdMiddleWall = new HorizontalWall(0f, -7f, -5f, this, color);



        AbstractWall leftmostUpperWall = new VerticalWall(7f, 7f, 5f, this, color);

        AbstractWall leftmostMiddleWall = new VerticalWall(7f, 3f, -3f, this, color);

        AbstractWall leftmostUnderWall = new VerticalWall(7f, -5f, -7f, this, color);

        

        AbstractWall rightmostUpperWall = new VerticalWall(-7f, 7f, 5f, this, color);

        AbstractWall rightmostMiddleWall = new VerticalWall(-7f, 3f, -3f, this, color);

        AbstractWall rightmostUnderWall = new VerticalWall(-7f, -5f, -7f, this, color);

        

        AbstractWall overMiddleWall = new VerticalWall(0f, 7f, 5f, this, color);

        AbstractWall middleWall = new VerticalWall(0f, 3f, -3f, this, color);

        AbstractWall underMiddleWall = new VerticalWall(0f, -5f, -7f, this, color);
	}
	
	public List<Area> defineAreas() {
		
		Point point1 = new Point(-3.5, 3.5);
        Point point2 = new Point(-3.5, -3.5);
        Point point3 = new Point (3.5, -3.5);
        Point point4 = new Point (3.5, 3.5);
        
        List<Area> area = new LinkedList<Area>();
        
        area.add(new Area(point1, 3, "Area1", 3, new LocationController(point1, 3, this)));
        area.add(new Area(point2, 3, "Area2", 3, new LocationController(point2, 3, this)));
        area.add(new Area(point3, 3, "Area3", 3, new LocationController(point3, 3, this)));
        area.add(new Area(point4, 3, "Area4", 3, new LocationController(point4, 3, this)));
		
		return area;
	}

}