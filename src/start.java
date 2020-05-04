public class start {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5,6,7);
        float[] arr = point3D.getXYZ();
        for (float x:arr
             ) {
            System.out.println(x);
        }
        System.out.println(point3D);
    }
}
