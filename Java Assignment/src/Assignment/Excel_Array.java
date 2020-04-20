package Assignment;
import java.util.HashMap;
import java.util.List;
import java.text.DecimalFormat;


public class Excel_Array {

    Excel_Sheet records = new Excel_Sheet();
    double total = records.Excel_Sheet().size() - 1;
    int counter=0;
    List<List<String>> rec = records.Excel_Sheet();
    //Setting Hash map values for each variable in the dataset
    private HashMap<String, Double> tempPos = new HashMap<>();
    private HashMap<String, Double> tempNeg = new HashMap<>();
    private HashMap<String, Double> achePos = new HashMap<>();
    private HashMap<String, Double> acheNeg = new HashMap<>();
    private HashMap<String, Double> coughPos = new HashMap<>();
    private HashMap<String, Double> coughNeg = new HashMap<>();
    private HashMap<String, Double> sorePos = new HashMap<>();
    private HashMap<String, Double> soreNeg = new HashMap<>();
    private HashMap<String, Double> recentlyPos = new HashMap<>();
    private HashMap<String, Double> recentlyNeg = new HashMap<>();
    private HashMap<String, Double> covid19 = new HashMap<>();




    public static void main(String[] args) {
        Excel_Array test = new Excel_Array();
        test.setHashMaps();
        test.hashMapValues();
        test.probability();

    }

    public void setHashMaps()
    {

        //Assigning the values of each to being a String & Double
        tempPos.put("hot",0.0);
        tempPos.put("cold",0.0);
        tempPos.put("normal",0.0);
        tempPos.put("cool",0.0);

        tempNeg.put("hot",0.0);
        tempNeg.put("cold",0.0);
        tempNeg.put("normal",0.0);
        tempNeg.put("cool",0.0);

        achePos.put("yes",0.0);
        achePos.put("no",0.0);

        acheNeg.put("no",0.0);
        acheNeg.put("yes",0.0);

        coughPos.put("yes",0.0);
        coughPos.put("no",0.0);

        coughNeg.put("no",0.0);
        coughNeg.put("yes",0.0);

        sorePos.put("yes",0.0);
        sorePos.put("no",0.0);

        soreNeg.put("no",0.0);
        soreNeg.put("yes",0.0);

        recentlyPos.put("yes",0.0);
        recentlyPos.put("no",0.0);

        recentlyNeg.put("no",0.0);
        recentlyNeg.put("yes",0.0);

        covid19.put("yes",0.0);
        covid19.put("no",0.0);

    }

    public void hashMapValues(){


        // P(A|B) =(P(B|A) * P((A))/P(B)

        for(int i = 1; i < rec.size(); i++)
        {
            counter++;
            Object array[] = rec.get(i).toArray();
            //Temp Positive
            // Temp hot
            //Checks if array[0] is hot and makes sure that array[5] (Covid-19) is yes
            if(array[0].equals("hot") && array[5].equals("yes"))
            {
                tempPos.put("hot",tempPos.get("hot")+1);
            }

            if(array[0].equals("cold") && array[5].equals("yes"))
            {
                tempPos.put("cold",tempPos.get("cold")+1);
            }

            //temp Normal
            if(array[0].equals("normal") && array[5].equals("yes"))
            {
                tempPos.put("normal",tempPos.get("normal")+1);
            }

            //Temp Cool
            if(array[0].equals("cool") && array[5].equals("yes"))
            {
                tempPos.put("cool",tempPos.get("cool")+1);
            }

            //Temp Negative
            //Temp Hot
            //Checks if array[0] is hot and makes sure that array[5] (Covid-19) is no
            if(array[0].equals("hot") && array[5].equals("no"))
            {
                tempNeg.put("hot",tempNeg.get("hot")+1);
            }

            //temp cold
            if(array[0].equals("cold") && array[5].equals("no"))
            {
                tempNeg.put("cold",tempNeg.get("cold")+1);
            }

            //Temp normal;
            if(array[0].equals("normal") && array[5].equals("no"))
            {
                tempNeg.put("normal",tempNeg.get("normal")+1);
            }

            //Temp cool
            if(array[0].equals("cool") && array[5].equals("no"))
            {
                tempNeg.put("cool",tempNeg.get("cool")+1);
            }
            //Ache Positive
            if(array[1].equals("yes") && array[5].equals("yes"))
            {
                achePos.put("yes",achePos.get("yes")+1);
            }
            if(array[1].equals("no") && array[5].equals("yes"))
            {
                achePos.put("no",achePos.get("no")+1);
            }

            //Ache Negative
            if(array[1].equals("no") && array[5].equals("no"))
            {
                acheNeg.put("no",acheNeg.get("no")+1);
            }
            if(array[1].equals("yes") && array[5].equals("no"))
            {
                acheNeg.put("yes",acheNeg.get("yes")+1);
            }

            //Cough Positive
            if(array[2].equals("yes") && array[5].equals("yes"))
            {
                coughPos.put("yes",coughPos.get("yes")+1);
            }
            if(array[2].equals("no") && array[5].equals("yes"))
            {
                coughPos.put("no",coughPos.get("no")+1);
            }

            //Cough Negative
            if(array[2].equals("no") && array[5].equals("no"))
            {
                coughNeg.put("no",coughNeg.get("no")+1);
            }
            if(array[2].equals("yes") && array[5].equals("no"))
            {
                coughNeg.put("yes",coughNeg.get("yes")+1);
            }

            //Sore Throat Positive
            if(array[3].equals("yes") && array[5].equals("yes"))
            {
                sorePos.put("yes",sorePos.get("yes")+1);
            }
            if(array[3].equals("no") && array[5].equals("yes"))
            {
                sorePos.put("no",sorePos.get("no")+1);
            }

            //Sore Throat Negative
            if(array[3].equals("no") && array[5].equals("no"))
            {
                soreNeg.put("no",soreNeg.get("no")+1);
            }
            if(array[3].equals("yes") && array[5].equals("no"))
            {
                soreNeg.put("yes",soreNeg.get("yes")+1);
            }

            //Recently Positive
            if(array[4].equals("yes") && array[5].equals("yes"))
            {
                recentlyPos.put("yes",recentlyPos.get("yes")+1);
            }
            if(array[4].equals("no") && array[5].equals("yes"))
            {
                recentlyPos.put("no",recentlyPos.get("no")+1);
            }

            //Recently Negative
            if(array[4].equals("no") && array[5].equals("no"))
            {
                recentlyNeg.put("no",recentlyNeg.get("no")+1);
            }
            if(array[4].equals("yes") && array[5].equals("no"))
            {
                recentlyNeg.put("yes",recentlyNeg.get("yes")+1);
            }
            //Covid 19
            if(array[5].equals("yes"))
            {
                covid19.put("yes",covid19.get("yes")+1);
            }
            if(array[5].equals("no"))
            {
                covid19.put("no",covid19.get("no")+1);
            }

        }

    }

    public void probability () {
        double posTotal = covid19.get("yes");
        double negTotal = covid19.get("no");

        //Temp Hot Pos
        //Finds the probability of each variable from the Excel sheet
        tempPos.put("hot", tempPos.get("hot") / posTotal);

        //Temp Hot Neg
        tempNeg.put("hot", tempNeg.get("hot") / negTotal);

        //Temp normal Pos
        tempPos.put("normal", tempPos.get("normal") / posTotal);

        //Temp normal Neg
        tempNeg.put("normal", tempNeg.get("normal") / negTotal);

        //Temp Cool Pos
        tempPos.put("cool", tempPos.get("cool") / posTotal);

        //Temp cool Neg
        tempNeg.put("cool", tempNeg.get("cool") / negTotal);

        //Temp Cold Pos
        tempPos.put("cold", tempPos.get("cold") / posTotal);

        //Temp Cold Neg
        tempNeg.put("cold", tempNeg.get("cold") / negTotal);


        //Ache Pos
        achePos.put("yes", achePos.get("yes") / posTotal);
        achePos.put("no", achePos.get("no") / posTotal);


        //Ache Neg
        acheNeg.put("yes", acheNeg.get("yes") / negTotal);
        acheNeg.put("no", acheNeg.get("no") / negTotal);


        //Cough Pos
        coughPos.put("yes", coughPos.get("yes") / posTotal);
        coughPos.put("no", coughPos.get("no") / posTotal);

        //Cough Neg
        coughNeg.put("no", coughNeg.get("no") / negTotal);
        coughNeg.put("yes", coughNeg.get("yes") / negTotal);

        //sore Pos
        sorePos.put("yes", sorePos.get("yes") / posTotal);
        sorePos.put("no", sorePos.get("no") / posTotal);

        //sore Neg
        soreNeg.put("no", soreNeg.get("no") / negTotal);
        soreNeg.put("yes", soreNeg.get("yes") / negTotal);

        //Recently Pos
        recentlyPos.put("yes", recentlyPos.get("yes") / posTotal);
        recentlyPos.put("no", recentlyPos.get("no") / posTotal);

        //Recently Neg
        recentlyNeg.put("no", recentlyNeg.get("no") / negTotal);
        recentlyNeg.put("yes", recentlyNeg.get("yes") / negTotal);

        //Covid Pos
        covid19.put("yes", covid19.get("yes") / total);

        //Covid Neg
        covid19.put("no", covid19.get("no") / total);

    }

    public void results(String[] userInput){

        setHashMaps();
        hashMapValues();
        probability();
        double positive = 1,negative = 1;
        String results;

        //Multiplies the user Input by the positive and negative values of the array
        if(userInput[0].equals("Hot"))
        {
            positive *= tempPos.get("hot");
            negative *= tempNeg.get("hot");

        }

        if(userInput[0].equals("Normal"))
        {
            positive *= tempPos.get("normal");
            negative *= tempNeg.get("normal");

        }

        if(userInput[0].equals("Cool"))
        {
            positive *= tempPos.get("cool");
            negative *= tempNeg.get("cool");

        }

        if(userInput[0].equals("Cold"))
        {
            positive *= tempPos.get("cold");
            negative *= tempNeg.get("cold");

        }

        if(userInput[1].equals("Yes"))
        {

            positive = positive * achePos.get("yes");
            negative = negative * acheNeg.get("yes");

        }

        if(userInput[1].equals("No"))
        {

            positive = positive * achePos.get("no");
            negative = negative * acheNeg.get("no");

        }

        if(userInput[2].equals("Yes"))
        {

            positive = positive * coughPos.get("yes");
            negative = negative * coughNeg.get("yes");

        }
        if(userInput[2].equals("No"))
        {
            positive = positive * coughPos.get("no");

            negative = negative * coughNeg.get("no");

        }

        if(userInput[3].equals("Yes"))
        {
            positive *= sorePos.get("yes");
            negative *= soreNeg.get("yes");

        }
        if(userInput[3].equals("No"))
        {
            positive *= sorePos.get("no");
            negative *= soreNeg.get("no");

        }

        if(userInput[4].equals("Yes"))
        {
            positive *= recentlyPos.get("yes");
            negative *= recentlyNeg.get("yes");

        }
        if(userInput[4].equals("No"))
        {
            positive *= recentlyPos.get("no");
            negative *= recentlyNeg.get("no");

        }
        //tels the array what to print either Negative or Positive
        positive *= covid19.get("yes");
        negative *= covid19.get("no");

        if(negative > positive)
        {
            results = "Negative";
        }
        else{
            results = "Positive";
        }


        CoronaTest finalResults = new CoronaTest(results);
    }

}

