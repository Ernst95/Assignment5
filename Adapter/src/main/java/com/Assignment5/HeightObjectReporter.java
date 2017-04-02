package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class HeightObjectReporter implements Height{

    HeightReporter heightReporter;

    public HeightObjectReporter() {
        heightReporter = new HeightReporter();
    }

    public double getHeightInM() {
        return heightReporter.getHeight();
    }

    public double getHeightInF() {
        return mToF(heightReporter.getHeight());
    }

    public void setHeightInM(double heightInM) {
        heightReporter.setHeight(heightInM);
    }

    public void setHeightInF(double heightInF) {
        heightReporter.setHeight(fToM(heightInF));
    }

    private double fToM(double f) {
        return (f / 3.28084);
    }

    private double mToF(double m) {
        return (m * 3.28084);
    }

}
