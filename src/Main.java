import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Rectangle rect1 = new Rectangle(4, 40);
            Rectangle rect2 = new Rectangle(3.5, 35.9);


            System.out.println("Rectangle 1:");
            System.out.println("Width: " + rect1.getWidth());
            System.out.println("Height: " + rect1.getHeight());
            System.out.println("Area: " + rect1.getArea());
            System.out.println("Perimeter: " + rect1.getPerimeter());


            System.out.println("\nRectangle 2:");
            System.out.println("Width: " + rect2.getWidth());
            System.out.println("Height: " + rect2.getHeight());
            System.out.println("Area: " + rect2.getArea());
            System.out.println("Perimeter: " + rect2.getPerimeter());
            System.out.println("\n");

            Stock stock = new Stock("SBER", "PJSC Sberbank");


            stock.setPreviousClosingPrice(281.50);


            stock.setCurrentPrice(282.87);


            System.out.printf("The percentage change in stock price is: %.2f%%\n", stock.getChangePercent());
            System.out.println("\n");
        }
    }

