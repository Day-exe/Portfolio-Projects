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

    //reduces the batch by the specified amount and adds the new values to a seperate list
    public void reduce(double factor){

        for(int i = 0; i <= numIngredients; i++){

            quantAlt[i] = quant[i]*factor;

        }//end for

        batchNumAlt = (int)(batchNum*factor);

        System.out.print("\nProcessing");
                    try
                    {Thread.sleep(300);}
                    catch(InterruptedException ex)
                    {Thread.currentThread().interrupt();}
                    
                    int delay = 0;
                    int min = numIngredients;
                    int max = numIngredients+1;
                    int dots = (int)Math.floor(Math.random()*(max-min+1)+min);
                    
                    while (delay < dots)
                    {
                        System.out.print(".");
                        try
                        {Thread.sleep(1000);}
                        catch(InterruptedException ex)
                        {Thread.currentThread().interrupt();}
                        delay++;
                    }//end theatrical delay

    }//end reduce

    //returns the new quantities in an orderly fashion
    public void output(){

        for(int i = 0; i <= numIngredients; i++){

            System.out.println(ingredients[i] + ": " + quantAlt[i] + " " + measurements[i]);

        }//end for loop

        System.out.println("\nWill make " + batchNumAlt + " instead of " + batchNum);

    }//end output

    public static void main(String[] args){

        System.out.print("\nLOADING");
                    try
                    {Thread.sleep(300);}
                    catch(InterruptedException ex)
                    {Thread.currentThread().interrupt();}
                    
                    int delay = 0;
                    int min = 3;
                    int max = 5;
                    int dots = (int)Math.floor(Math.random()*(max-min+1)+min);
                    
                    while (delay < dots)
                    {
                        System.out.print(".");
                        try
                        {Thread.sleep(1000);}
                        catch(InterruptedException ex)
                        {Thread.currentThread().interrupt();}
                        delay++;
                    }//end theatrical delay

        System.out.println("\nRecipe Coverter 0.1\n");
        //output current version
        //VERY IMPORTANT. DO NOT FORGET TO UPDATE WHEN PATCHES OR NEW RELEASES ARE MADE. FOLLOW SEMVER SCHEME (MAJOR.MINOR.PATCH)

        System.out.println("This is a program for breaking down recipies. It does exactly what it sounds like it does.");
        System.out.println("You can store a total of ten recipies in a single session.");


    }//end main

}//end class