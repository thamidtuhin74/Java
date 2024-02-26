class pen{
    // Properties
    String color;
    String type;
    Number price;
    
    // Behaviour

    public void write(){
        System.out.println("writing");
    }
    public void showProperties(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.price + "Taka");
    }

}

public class objectAndClass {
    public static void main(String[] args) {
        System.out.println("Object And Class");

        pen pinpoint = new pen();
        pinpoint.write();
        pinpoint.color = "Black";
        pinpoint.type = "ball Pen";
        pinpoint.price = 6;

        pinpoint.showProperties();
    }
}
