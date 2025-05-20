package interfaces.drawable;

public class Main {
    public static void main(String[] args) {

        Drawable drawable = getShape("Square");
        Drawable drawable1 = getShape("Circle");
        Drawable drawable2 = getShape("Rectangle");

        drawable.draw();
        drawable1.draw();
        drawable2.draw();

    }


    public static Drawable getShape(String type){
        if (type.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")){
            return new Square();
        } else {
            return null;
        }
    }
}
