public class Figure {
    double height;
    double width;
    double length;

    // constructor without parameters
    public Figure() {
    }

    // constructor with parameters
    public Figure(double height, double width, double length) {
        this.height = height; // in formula - h
        this.width = width; // in formula - b
        this.length = length; // in formula - a
    }
    // method which calculates and returns volume of the figure
    public double calculateVolume(){
        return this.height * this.width * this.height;
    }
    // 5. method which calculates figure surface area without return and parameters
    public void CalculateSurfaceArea() {
        double surfaceArea = 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
        System.out.println("The surface of area is: " + surfaceArea);
    }
    // 4. print to the console the calculated volume
    public static void main(String[] args) {
        Figure figure1 = new Figure(10.0, 16.0, 13.0);
        double calculatedVolume = figure1.calculateVolume();
        System.out.println("The figure volume is: "  +calculatedVolume);
        figure1.CalculateSurfaceArea();
    }

}

