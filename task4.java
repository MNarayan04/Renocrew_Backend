class Square{
    float lenght;
    public void lengthSetter(float length){
        this.lenght=length;
    }
    public float lengthGetter(){
        return lenght;
    }
    public void AreaOfSquare(){
        System.out.println("Surface area of an square is "+ (lenght*lenght));
    }
}

class Rectangle extends Square {
    float breath;
    float height;
    public void breathSetter(float breath){
        this.breath=breath;
    }
    public float breathGetter(){
        return breath;
    }
    public void heightSetter(float height){
        this.height=height;
    }
    public float heightGetter(){
        return height;
    }

    public void surfaceAreaOfRectangle(){
        System.out.println("Surface area of an Rectangle is "+ 2*(lenght*breath*breath*height*lenght*height));
    }

}
class Circle extends Rectangle{
    float radius;
    public void radiusSetter(float radius){
        this.radius=radius;
    }
    public float radiusGetter(){
        return radius;
    }
    public void surfaceAreaOfCircle(){
        System.out.println("Surface area of an Rectangle is "+ Math.PI*radius*radius);
    }

}
class Cylinder extends Circle{
    public void surfaceAreaOfCylinder(){
        System.out.println("Surface area of an Cylinder is "+ 2*(Math.PI*radius*height)+2*(Math.PI*radius*radius));
    }
}
class Sphere extends Cylinder{
    public void surfaceAreaOfSphere(){
        System.out.println("Surface area of an Sphere is "+ 4*Math.PI*radius*radius);
    }
}
public class task4 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.lengthSetter(23f);
        c.AreaOfSquare();
    }
}