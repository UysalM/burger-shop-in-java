import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner get = new Scanner(System.in);
  
  String [] menuItemNo = {"Menu Item 1", "Menu Item 2", "Menu Item 3", "Menu Item 4", "Menu Item 5"};
  String [] menuItemName = {"Hamburger $4.50", "Cheeseburger $4.75", "Chickenburger $4.00", "Chicken Cheeseburger $4.25", "VeggieBurger $3.50"};
  String [] drinkItemNo = {"Drink Item 1", "Drink Item 2", "Drink Item 3"};
  String [] drinkItemName = {"Water $0.75", "Soda $1.00", "Coke $1.10"};
  int entryNo = 0;
  int orderOption = 0;
  int menuItemSel, drinkItemSel;
  double orderTotal = 0.0;

  System.out.println("How many entries are you going to make for your order? e.g: 4\n");
  entryNo = get.nextInt();

  double [] orderEntry = new double [entryNo];
  String [] orderItems = new String [entryNo];

  for(int x = 0; x < entryNo; x++) {
  
  System.out.println("\nWould you like to order a meal or a drink? Enter 1 for meal or 2 for drink: ");
  orderOption = get.nextInt();

  if(orderOption == 1)
  {
    System.out.println("\nPlease review the menu");
    for (int i = 0; i < 5; i++) {
      System.out.println(menuItemNo[i] + "\t" + menuItemName[i]);
    }
    System.out.println("\nEnter the corresponding menu item number you wish to order: ");
    menuItemSel = get.nextInt();
    switch(menuItemSel)
    {
      case 1: orderEntry[x] = 4.50;
              System.out.println("\nYou added 1 Hamburger to your order.");
              orderItems[x] = menuItemName[0];
      break;
      case 2: orderEntry[x] = 4.75;
              System.out.println("\nYou added 1 Cheeseburger to your order.");
              orderItems[x] = menuItemName[1];
      break;
      case 3: orderEntry[x] = 4.00;
              System.out.println("\nYou added 1 Chickenburger to your order.");
              orderItems[x] = menuItemName[2];
      break;
      case 4: orderEntry[x] = 4.25;
              System.out.println("\nYou added 1 Chicken Cheeseburger to your order.");
              orderItems[x] = menuItemName[3];
      break;
      case 5: orderEntry[x] = 3.50;
              System.out.println("\nYou added 1 VeggieBurger to your order.");
              orderItems[x] = menuItemName[4];
      break;
      default: System.out.println("\nInvalid menu item number.");
    }

  }
  else if(orderOption == 2)
  {
    System.out.println("\nPlease review the drinks menu");
    for(int j = 0; j < 3; j++) {
      System.out.println(drinkItemNo[j] + "\t" + drinkItemName[j]);
    }
    System.out.println("\nEnter the corresponding drink item number you wish to order: ");
    drinkItemSel = get.nextInt();
    switch(drinkItemSel)
    {
      case 1: orderEntry[x] = 0.75;
              System.out.println("\nYou added 1 water.");
              orderItems[x] = drinkItemName[0];
      break;
      case 2: orderEntry[x] = 1.00;
              System.out.println("\nYou added 1 soda.");
              orderItems[x] = drinkItemName[1];
      break;
      case 3: orderEntry[x] = 1.10;
              System.out.println("\nYou added 1 coke.");
              orderItems[x] = drinkItemName[2];
      break;
      default: System.out.println("\nInvalid drink item number.");
    }
  }
  else
  System.out.println("\nWrong entry.");
  }
  for(int y = 0; y < entryNo; y++) {
    orderTotal = orderTotal + orderEntry[y];
  }
  System.out.println("\nYour order is: ");
  for(int z = 0; z < entryNo; z++) {
    System.out.println(orderItems[z]);
  }
  System.out.println("\nTotal Bill to pay is: $" + orderTotal + "\nThank you for choosing us. Have a happy meal!");
  }
}