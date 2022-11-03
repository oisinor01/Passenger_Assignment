package ie.atu;

public class Passenger {

public String title(String Title){

    String title = Title;
    if (title == "Mr" || title == "Ms" || title == "Mrs")
    {
        System.out.println(Title + " ");
    }
    else{
        throw new IllegalArgumentException("Error wrong title");
    }
    return Title;

}



     public String determineAge (int Age){
         if (Age < 16)
         {
             throw new IllegalArgumentException("Passenger too young ");
         }
         else{
             return ("Persons age entered");
         }
    }

}
