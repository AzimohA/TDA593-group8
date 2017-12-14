package project;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import Controller.Monitor;
import Model.*;
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
	
		
		Environment testEnvironment = new UniversityEnvironment(Color.BLUE);
		
		Set<RobotAvatar> robots = new HashSet<>();

		RobotAvatar robot1 = new RobotAvatar(new Point(1, 1), "Robot 1");
		RobotAvatar robot2 = new RobotAvatar(new Point(1, 3), "Robot 2");

		robots.add(robot1);
		robots.add(robot2);

		robot2.setDestination(new Point(-1,-3));
		
		AbstractSimulatorMonitor controller = new SimulatorMonitor(robots, testEnvironment);

	}

}
