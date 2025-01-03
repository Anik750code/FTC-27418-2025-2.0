package org.firstinspires.ftc.teamcode.Libraries.Navigation._DEPRECIATED_PurePursuit;

import org.firstinspires.ftc.teamcode.Libraries.Geometry.Coordinate;

public class StrafeWaypoint {
    Coordinate coordinate;
    double tangentialVelocity;
    double angularVelocity;

    public StrafeWaypoint(Coordinate coordinate, double tangentialVelocity, double angularVelocity){
        this.coordinate = coordinate;
        this.tangentialVelocity = tangentialVelocity;
        this.angularVelocity = angularVelocity;
    }


    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public double getTangentialVelocity() {
        return tangentialVelocity;
    }

    public void setTangentialVelocity(double tangentialVelocity) {
        this.tangentialVelocity = tangentialVelocity;
    }

    public double getAngularVelocity() {
        return angularVelocity;
    }

    public void setAngularVelocity(double angularVelocity) {
        this.angularVelocity = angularVelocity;
    }

}
