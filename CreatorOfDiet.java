import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class CreatorOfDiet implements DietInterface {

    ArrayList<Diet> dietlist;
    String ingredient;

    public CreatorOfDiet() {

        dietlist = new ArrayList<>();
    }

    @Override
    public void addComponent(Diet d) {dietlist.add(d);}

    @Override
    public void removeComponent(Diet d) {dietlist.add(d);}

    @Override
    public void show() {
        Iterator<Diet> it= dietlist.iterator();
        while(it.hasNext()){
            Diet c =it.next();
            c.update(ingredient);
        }
    }
    public void setComponent(String s ){
        System.out.println("Register new igredient to ur diet "  + " " + s  );
 ingredient = s;
 show();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreatorOfDiet)) return false;
        CreatorOfDiet that = (CreatorOfDiet) o;
        return Objects.equals(dietlist, that.dietlist) &&
                Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dietlist, ingredient);
    }
}
