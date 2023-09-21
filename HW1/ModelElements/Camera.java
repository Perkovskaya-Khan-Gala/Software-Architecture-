package ModelElements;

import java.util.List;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    public List<Point3D> Location;
    public List<Angle3D> Angle;

    public void Rotate(List<Angle3D> Angle) {
    }

    public void Move(List<Point3D> Location) {
    }

    public Camera(List<Point3D> location, List<Angle3D> angle) {
        Location = location;
        Angle = angle;
    }

}
