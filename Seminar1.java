public class Seminar1 {
    public class PoligonalModel {
        public Poligon poligons;
        public Texture textures;

    }

    public class Texture {

    }

    public class Poligon {
        public Point3D points;
    }

    public class Flash {
        public Point3D location;
        public Angle3D angle;
        public Color color;
        public float power;

        public void rotate(Angle3D a) {

        }

        public void move(Point3D p) {

        }

    }

    public class Camera {
        public Point3D location;
        public Angle3D angle;

        public void rotate(Angle3D a) {

        }

        public void move(Point3D p) {

        }

    }

    public class Scene {
        public int id;
        public PoligonalModel models;
        public Flash flashes;

        public Type method1(Type t) {
            return t;
        }

        public Type method1(Type t, Type t1) {
            return t1;
        }
    }

}
