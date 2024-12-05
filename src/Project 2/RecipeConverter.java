import java.util.*; //Import utilities

public class RecipeConverter{

    //scanner for user input
    Scanner myObj = new Scanner(System.in);

    //instance variables
    private int numIngredients;
    private String ingredients[];
    private int quant[];
    private int quantAlt[];
    private String measurements[];
    private String measurementsAlt[];

    //constructor
    public RecipeConverter(int numIngredients, String ingredients[], int quant[], String measurements[]){

        this.numIngredients = numIngredients;
        this.ingredients = ingredients;
        this.quant = quant;
        this.measurements = measurements;

    }

    public void split(double factor){

        

    }

    public static void main(String[] args){



    }

}
