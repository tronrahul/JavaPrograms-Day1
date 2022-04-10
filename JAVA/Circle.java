public class Circle {
    private double radius;
    private double area;   

    public void setRadius(double rad){
        radius = rad;
    }

    public double getArea(){
        area = radius*radius;
        return area;
    }

    public static void main(String agrs[]) {
        Circle obj = new Circle();
        obj.setRadius(2);
        System.out.println(obj.getArea());
    }


}
