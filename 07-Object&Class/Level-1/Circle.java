class Circle {
    double radius;
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    void calculateCircumference() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference: " + c);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.calculateArea();
        c1.calculateCircumference();
    }
}