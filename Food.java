import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Food{

    public static void main(String[] args) {
        Drinks pepsi = new Drinks("pepsi", 0.5);
        Drinks water = new Drinks("water", 0.4);
        Drinks beer = new Drinks("beer", 0.2);
        Map<Object, String> drinkList = new HashMap<>();
        drinkList.put(pepsi, "pepsi");
        drinkList.put(water, "water");
        drinkList.put(beer, "beer");

        Pizza margarita = new Pizza("margarita", 25);
        Pizza goralska = new Pizza("goralska", 20);
        Pizza hawajska = new Pizza("margarita", 25);


        Map<Object, String> pizzaList = new HashMap<>();
        pizzaList.put(margarita, "margarita");
        pizzaList.put(goralska, "goralska");
        pizzaList.put(hawajska, "margarita");


        System.out.println(margarita.hashCode());
        System.out.println(hawajska.hashCode());
        System.out.println(water.hashCode());

        System.out.println(margarita.equals(hawajska));// Pomimo ze dwie rozne nazwy , obiekty sa rowne i maja ten sam hashcode(tak przynajmniej mi sie wydaje
        System.out.println(beer.equals(margarita));
        System.out.println(pizzaList.get(margarita));
        System.out.println(pizzaList.get(hawajska));







}}








