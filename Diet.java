public class Diet {

    private int  number;

    public Diet(int number){
        this.number =number;
    }
    public void update(String component){
        System.out.println(" System " + number +" "+ "read new component of diet : "+" " + component );
    }
}
