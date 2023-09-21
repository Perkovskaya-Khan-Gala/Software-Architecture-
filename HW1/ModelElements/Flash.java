package ModelElements;

import java.util.List;

import Stuff.Angle3D;
import Stuff.Point3D;
import Stuff.Color;

public class Flash {
    public List<Point3D> Location;
    public List<Angle3D> Angle;
    public List<Color> Color;
    public Float Power;

    public void Rotate(List<Angle3D> Angle) {
    }

    public void Move(List<Point3D> Location) {
    }

    public Flash(List<Point3D> location, List<Angle3D> angle, List<Color> color, Float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }
}
