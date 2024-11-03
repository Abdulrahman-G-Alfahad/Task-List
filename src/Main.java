import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> favorites = new ArrayList<>();
        favorites.add("Harry Potter");
        favorites.add("Lord of the Rings");
        favorites.add("Star Wars");
        favorites.add("Game of Thrones");
        favorites.add("The Hobbit");

        favorites.remove(2);

        for (String item : favorites){
            System.out.println(item);
        }
    }
}