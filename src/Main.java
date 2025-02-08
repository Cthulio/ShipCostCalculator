import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //class ShippingCalc
        //  main()
        //      vars
        //      num itemPrice
        //      num shippingCost
        //      site/source: using my own logic from Task 2 of Lab 2 from this week’s assignments. Removed/changed sets for certain variables as they don’t apply here.
        //      if itemPrice>100 then
        //        shippingCost = 0 //free!
        //      else
        //        shippingCost = costSummary*.02
        //      end if
        //      Output "Shipping Cost: "  + shippingCost
        //      Output "Total: " + (costSummary+shippingCost)
        //  return
        //end class
        Scanner in = new Scanner(System.in);
        double itemPrice;
        double shippingCost = -1;
        System.out.println("Please input new item price:");
        itemPrice = in.nextDouble();
        in.nextLine();
        if (itemPrice>=100){
            shippingCost = 0; //free!
        }else{
            shippingCost = itemPrice * .02;
        }
        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Total: "+ (shippingCost+itemPrice));
    }
}