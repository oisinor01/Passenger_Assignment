package ie.atu;

public class Passenger {

public String title(String Title){

    String title = Title;
    if (title == "Mr" || title == "Ms" || title == "Mrs")
    {
        System.out.println(Title + " \n");
    }
    else{
        throw new IllegalArgumentException("Error invalid title\n");
    }
    return title;

}

public String name(String Name){
    String name = Name;
    if(Name.length() > 3){
        System.out.println(Name + " \n");
    }
    else{
        throw new IllegalArgumentException("Name  must be minimum 3 characters.... I don't make the rules\n");
    }
    return name;
}

public String id(String Id){
    String id = Id;
    if (id.length() >= 10)
    {
        System.out.println(id + " \n");
    }
    else{
        throw new IllegalArgumentException("ERROR invalid ID...\n");
    }
    return id;

}

public String phone(String Phone){
    String phone = Phone;
    if(phone.length() >= 7)
    {
        System.out.println(phone + " \n");
    }
    else{
        throw new IllegalArgumentException("Error Phone number must be minimum 7 characters\n");
    }
    return phone;
}


     public int age(int Age){
    int age = Age;
         if (age >= 16)
         {
             System.out.println(age + " \n");
         }
         else{
             throw new IllegalArgumentException("Sorry you must be 16 or over...\n");

         }
         return age;
    }

}
