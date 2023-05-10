public class Main {
    public static void main(String[] args) {
        //Rectangle myRect;

        //falta inicializar, sino es null. Falta el tipo Rectangle

        //myRect.width = 40;

        //falta la propiedad width y su get/set

        //myRect.height = 50;

        //falta la propiedad height y su get/set

        //System.out.println("myRect's area is " + myRect.area());

        //falta un metodo que calcula el area.

        Rectangle myRect = new Rectangle();
        myRect.setWidth(40);
        myRect.setHeight(50);
        System.out.println("myRect's area is " + myRect.area(myRect.getWidth(), myRect.getHeight()));
    }
}