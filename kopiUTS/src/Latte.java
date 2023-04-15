import java.util.ArrayList;

public class Latte extends Coffee{
//    Attribute
    private String milk;
    private String topping;
    private ArrayList<String> ingredients = new ArrayList<>();

//    Constructor
    public Latte(int id, String name, int price, double shot, String milk) {
        super(id, name, price, shot);
        this.milk = milk;
    }

//    Getter Setter
    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    //    Method
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient.toLowerCase());
    }

}
