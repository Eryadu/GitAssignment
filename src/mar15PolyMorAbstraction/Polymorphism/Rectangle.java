package mar15PolyMorAbstraction.Polymorphism;

public class Rectangle extends Square {
    double length = 12.00;
    double width = 12.00;
// Method override
    public double area( ){
        System.out.println("Area of Square is : " + super.area());

        return length * width;

    }
    double perimeter =12.33;

}
