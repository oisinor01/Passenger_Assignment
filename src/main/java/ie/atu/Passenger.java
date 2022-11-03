package ie.atu;

public class Passenger {

public String title(String Title){

    String title = Title;
    if (title == "Mr" || title == "Ms" || title == "Mrs")
    {
        System.out.println(Title + " \n");
    }
    else{
        throw new IllegalArgumentException("Error wrong title\n");
    }
    return Title;

}

public String name(String Name){
    String name = Name;
    if(Name.length() > 3){
        System.out.println(Name + " \n");
    }
    else{
        throw new IllegalArgumentException("Error name is not long enough...\n");
    }
    return Name;
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
