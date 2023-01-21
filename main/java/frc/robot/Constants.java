// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import com.fasterxml.jackson.databind.ObjectWriter.GeneratorSettings;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class ConversionConstants {
    public static final double
      GEAR_RATIO = 8.45,
      CTRE_TICKS = 2048,
      CTRE_TICKS_PER_REV = CTRE_TICKS * GEAR_RATIO,
      WHEEL_DIAMETER = 3.0,
      CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI,
      INCHES_PER_TICK = CIRCUMFERENCE / CTRE_TICKS_PER_REV,
      IPDS_TO_MPH = 0.568,
      IPDS_TO_MEPS = 0.254,
      METERS_PER_TICK = INCHES_PER_TICK / 37.3701,
      CTRE_NATIVE_TO_MPH = INCHES_PER_TICK * IPDS_TO_MPH,
      CTRE_NATIVE_TO_MPS = INCHES_PER_TICK * IPDS_TO_MEPS;

  }
    
  public static final class DriveConstants {
    public static final int 
      FRONT_LEFT_PORT = 1,
      BACK_LEFT_PORT = 4,
      FRONT_RIGHT_PORT = 3,
      BACK_RIGHT_PORT = 2;

    public static final double TRACKWIDTH_METERS = 0.555;
    public static final DifferentialDriveKinematics KINEMATICS =
        new DifferentialDriveKinematics(TRACKWIDTH_METERS);


    // Drive limiters
    
    public static final double
      FORWARD_SCALE_INITIAL = 2.2, // normal scales should be <1.0
      ROT_SCALE_INITIAL = 3.2;
    
    public static double
      FORWARD_SCALE = FORWARD_SCALE_INITIAL,
      ROT_SCALE = ROT_SCALE_INITIAL;

  }
  public static final class PIDConstants {
    public static final int IDX = 0;
    public static final int TIMEOUT_MS = 30;

    public final static Gains DRIVE_VELOCITY  = new Gains(0.10509, 0, 0, 0,  0,  0.6);
    public final static Gains INTAKE_POSITION  = new Gains(0.034, 0.00001, 0, 0,  0,  0.25);
  }
}
