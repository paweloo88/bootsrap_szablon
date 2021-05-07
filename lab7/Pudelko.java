package lab7;

public class Pudelko {
    private double width;
    private double height;
    private double breadth;

    public Pudelko(double width, double height, double breadth){
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }
    public void newPudelko(double x1, double y1,double z1, double x2, double y2, double z2){
        if(x1==x2&&y1==y2||x1==y2&&x2==y1) System.out.println(x1+"x"+y1+"x"+z1+z2);
        if(x1==x2&&z1==z2||x1==z2&&x2==z1) System.out.println(x1+"x"+y1+y2+"x"+z1);
        if(z1==z2&&y1==y2||z1==y2&&z2==y1) System.out.println(x1+x2+"x"+y1+"x"+z1);
        if(x1==y2&&y1==z2||x2==y1&&y2==z1) System.out.println(x1+"x"+y1+"x"+(z1+x2));
        else System.out.println("Two figures can't be linked.");

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
