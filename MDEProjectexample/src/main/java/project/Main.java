package project;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import project.AbstractSimulatorMonitor;
import project.Point;
import simbad.sim.AbstractWall;
import simbad.sim.Boundary;
import simbad.sim.EnvironmentDescription;
import simbad.sim.HorizontalBoundary;
import simbad.sim.HorizontalWall;
import simbad.sim.VerticalBoundary;
import simbad.sim.VerticalWall;

import View.OperatorView;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		EnvironmentDescription e = new EnvironmentDescription();

		Color cGray = Color.GRAY;
		Color cYellow = Color.YELLOW;
		Color cGreen = Color.GREEN;
		Color cRed = Color.RED;
		Color cBlue = Color.BLUE;

		Boundary w1 = new HorizontalBoundary(-10.0f, -10.0f, 10.0f, e, cGray);



        Boundary w2 = new HorizontalBoundary(10.0f, -10.0f, 10.0f, e, cGray);



        Boundary w3 = new VerticalBoundary(10.0f, -10.0f, 10.0f, e, cGray);



        Boundary w4 = new VerticalBoundary(-10.0f, -10.0f, 10.0f, e, cGray);

		AbstractWall underWall = new HorizontalWall(7f, -7f, 7f, e, cYellow);

        AbstractWall overWall = new HorizontalWall(-7f, -7f, 7f, e, cYellow);

        AbstractWall firstMiddleWall = new HorizontalWall(0f, 5f, 7f, e, cGreen);

        AbstractWall secondMiddleWall = new HorizontalWall(0f, -3f, 3f, e, cGreen);

        AbstractWall thirdMiddleWall = new HorizontalWall(0f, -7f, -5f, e, cGreen);



        AbstractWall leftmostUpperWall = new VerticalWall(7f, 7f, 5f, e, cRed);

        AbstractWall leftmostMiddleWall = new VerticalWall(7f, 3f, -3f, e, cRed);

        AbstractWall leftmostUnderWall = new VerticalWall(7f, -5f, -7f, e, cRed);

        

        AbstractWall rightmostUpperWall = new VerticalWall(-7f, 7f, 5f, e, cRed);

        AbstractWall rightmostMiddleWall = new VerticalWall(-7f, 3f, -3f, e, cRed);

        AbstractWall rightmostUnderWall = new VerticalWall(-7f, -5f, -7f, e, cRed);

        

        AbstractWall overMiddleWall = new VerticalWall(0f, 7f, 5f, e, cBlue);

        AbstractWall middleWall = new VerticalWall(0f, 3f, -3f, e, cBlue);

        AbstractWall underMiddleWall = new VerticalWall(0f, -5f, -7f, e, cBlue);

		Set<RobotAvatar> robots = new HashSet<>();

		RobotAvatar robot1 = new RobotAvatar(new Point(1, 1), "Robot 1");
		RobotAvatar robot2 = new RobotAvatar(new Point(1, 3), "Robot 2");

		robots.add(robot1);
		robots.add(robot2);

		//robot2.setDestination(new Point(-1,-3));
		
		AbstractSimulatorMonitor controller = new SimulatorMonitor(robots, e);
		
		OperatorView OV = new OperatorView();

	}

}
