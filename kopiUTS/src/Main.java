public class Main {
    public static void main(String[] args) {
        CoffeShop coffeShop = new CoffeShop("Starcelso");
        coffeShop.addCoffe(new Coffee(1, "Americano", 20000, 2));
        coffeShop.addCoffe(new Coffee(2, "Espresso", 25000, 1.5));

        Latte peanutButter = new Latte(3, "Peanut Butter Latte", 40000, 1, "small");
        peanutButter.setTopping("Butiran kacang");
        peanutButter.addIngredients("Laktosa");
        peanutButter.addIngredients("Kacang");
        coffeShop.addLatte(peanutButter);

        Latte oatmilkLatte = new Latte(4, "Oatmilk Latte", 50000, 1, "small");
        oatmilkLatte.addIngredients("Kacang");
        oatmilkLatte.addIngredients("Coklat");
        oatmilkLatte.addIngredients("Coklat bubuk");
        coffeShop.addLatte(oatmilkLatte);

        Latte caramelLatte = new Latte(5, "Caramel Latte", 35000, 1.5, "medium");
        caramelLatte.addIngredients("laktosa");
        caramelLatte.setTopping("caramel");

        Customer andi = new Customer("Andi", 50000, true);
        andi.addAllergy("coklat");
        Customer bebi = new Customer("Bebi", 55000, false);
        bebi.addAllergy("laktosa");

        System.out.println("####################################################");
        System.out.println(coffeShop.canBuyCoffee(andi));
        System.out.println(coffeShop.canBuyCoffee(bebi));
        System.out.println("####################################################");
        coffeShop.recommendDrink(andi);
        System.out.println("####################################################");
        coffeShop.recommendDrink(bebi);
        System.out.println("####################################################");
        coffeShop.buy(caramelLatte, andi, 2);
        coffeShop.buy(caramelLatte, bebi, 2);
        coffeShop.buy(caramelLatte, andi, 1);
        System.out.println("####################################################");
        coffeShop.printAllBuyers(caramelLatte);
        System.out.println("####################################################");
        ;
    }
}