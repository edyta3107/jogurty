public class DietMain {

    public static void main(String[] args) {

        CreatorOfDiet breakfast  = new CreatorOfDiet();
        Diet d = new Diet(1);
        breakfast.addComponent(d);
        breakfast.setComponent("beetroot");
        breakfast.setComponent("salad");
        breakfast.setComponent("egg");

CreatorOfDiet lunch = new CreatorOfDiet();
Diet d1 = new Diet(2);
lunch.addComponent(d1);
lunch.setComponent("soup");
lunch.setComponent("meat");
lunch.setComponent("dessert");

    CreatorOfDiet dinner = new CreatorOfDiet();
    Diet d3 = new Diet(3);
    dinner.addComponent(d3);
    dinner.setComponent("beetroot");
    dinner.setComponent("salad");
    dinner.setComponent("egg");
        System.out.println(dinner.equals(breakfast));
        System.out.println(dinner.hashCode());
        System.out.println(breakfast.hashCode());
}}
