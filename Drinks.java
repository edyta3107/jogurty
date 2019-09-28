import java.util.Objects;
public class Drinks {
    private String drinkName;
    private double volume;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Drinks (String drinkName, double volume) {
      this.drinkName = drinkName;
      this.volume = volume;


  }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drinks)) return false;
        Drinks drinks = (Drinks) o;
        return Double.compare(drinks.volume, volume) == 0 &&
                Objects.equals(drinkName, drinks.drinkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drinkName, volume);
    }


}

