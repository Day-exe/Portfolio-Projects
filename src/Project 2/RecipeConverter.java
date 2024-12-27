import java.util.*; //Import utilities

public class RecipeConverter{

    //scanner for user input
    static Scanner myObj = new Scanner(System.in);
    
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
    
            //status for all of the recipies
            String statusR1 = "EMPTY";
            String statusR2 = "EMPTY";
            String statusR3 = "EMPTY";
            String statusR4 = "EMPTY";
            String statusR5 = "EMPTY";
            String statusR6 = "EMPTY";
            String statusR7 = "EMPTY";
            String statusR8 = "EMPTY";
            String statusR9 = "EMPTY";
            String statusR10 = "EMPTY";
    
            //used to terminate the run loop
            boolean run = true;
    
            while(run = true){
    
                System.out.println("\nRecipe 1 : " + statusR1 + "\nRecipe 2 : " + statusR2 + "\nRecipe 3 : " + statusR3 + "\nRecipe 4 : " + statusR4 + "\nRecipe 5 : " + statusR5 + "\nRecipe 6 : " + statusR6 + "\nRecipe 7 : " + statusR7 + "\nRecipe 8 : " + statusR8 + "\nRecipe 9 : " + statusR9 + "\nRecipe 10 : " + statusR10);
                int rChoice = myObj.nextInt();
                myObj.nextLine();

                if(rChoice != 1 && rChoice != 2 && rChoice != 3 && rChoice != 4 && rChoice != 5 && rChoice != 6 && rChoice != 7 && rChoice != 8 && rChoice != 9 && rChoice != 10){

                    System.out.println("Bad input. Try again.");

                }else if(rChoice == 1){

                    System.out.print("Number of ingredients: ");
                    int numIngredients = myObj.nextInt();
                    myObj.nextLine();

                }

        }//end run loop


    }//end main

}//end class