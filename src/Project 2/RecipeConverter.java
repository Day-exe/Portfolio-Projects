import java.util.*; //Import utilities

public class RecipeConverter{

    //scanner for user input
    Scanner myObj = new Scanner(System.in);

    //instance variables
    private int numIngredients;
    private int batchNum;
    private int batchNumAlt;
    private String ingredients[];
    private double quant[];
    private double quantAlt[];
    private String measurements[];
    private String measurementsAlt[];

    //constructor
    public RecipeConverter(int numIngredients, int batchNum, String ingredients[], double quant[], String measurements[]){

        this.numIngredients = numIngredients;
        this.batchNum = batchNum;
        this.ingredients = ingredients;
        this.quant = quant;
        this.measurements = measurements;

    }//end constructor

    public void reduce(double factor){

        for(int i = 0; i <= numIngredients; i++){

            quantAlt[i] = quant[i]*factor;

        }//end for

        batchNumAlt = (int)(batchNum*factor);

    }//end reduce

    public static void main(String[] args){



    }//end main

}//end class
