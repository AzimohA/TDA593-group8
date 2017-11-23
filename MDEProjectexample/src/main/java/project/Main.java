package project;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
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

		
		RobotAvatar robot1 = new RobotAvatar(new Point(-3.5, 9), "Robot 1");
		RobotAvatar robot2 = new RobotAvatar(new Point(-3.5, -9), "Robot 2");
		
		RobotAvatar robot3 = new RobotAvatar(new Point(3.5, -9), "Robot 3");
		RobotAvatar robot4 = new RobotAvatar(new Point(3.5, 9), "Robot 4");

		robots.add(robot2);
		robots.add(robot1);
		robots.add(robot3);
		robots.add(robot4);
		
		Point room1 = new Point(-3.5, 3.5);
		Point room2 = new Point(-3.5, -3.5);
		Point room3 = new Point (3.5, -3.5);
		Point room4 = new Point (3.5, 3.5);
		
		ArrayList<Point> missionRobot1 = new ArrayList();
		missionRobot1.add(room1);
		missionRobot1.add(room2);
		missionRobot1.add(new Point(-3.5, -9));
		
		ArrayList<Point> missionRobot2 = new ArrayList();
		missionRobot2.add(room2);
		missionRobot2.add(room3);
		missionRobot2.add(new Point(3.5, -9));
		
		ArrayList<Point> missionRobot3 = new ArrayList();
		missionRobot3.add(room3);
		missionRobot3.add(room4);
		missionRobot3.add(new Point(3.5, 9));
		
		ArrayList<Point> missionRobot4 = new ArrayList();
		missionRobot4.add(room4);
		missionRobot4.add(room1);
		missionRobot4.add(new Point(-3.5, 9));
		
		robot1.setDestination(room1);
		//robot1.setDestination(room2);
		
		robot2.setDestination(room2);
		robot2.setDestination(room3);
		
		robot3.setDestination(room3);
		robot3.setDestination(room4);
		
		robot4.setDestination(room4);
		robot4.setDestination(room1);
	
		
		AbstractSimulatorMonitor controller = new SimulatorMonitor(robots, e);

	}
}
