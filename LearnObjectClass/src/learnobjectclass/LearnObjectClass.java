package learnobjectclass;

import learnobjectclass.geometry.Circle;
import learnobjectclass.geometry.RectAngle;

public class LearnObjectClass {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        RectAngle angle = new RectAngle();
        angle.hight = 12;
        angle.width = 10;
        System.out.println(angle.getArea());
        System.out.println(angle.getPerimeter());

    }

}
