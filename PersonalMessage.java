public class PersonalMessage {
    public static void main(String[] args){
        
        String first_name = "kim";
        String last_name = "neal";
        //This will take the first character in the work capitalize it and then add the rest of the word to it. 
        String full_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1) +  " " + last_name.substring(0, 1).toUpperCase() + last_name.substring(1);

        System.out.println(full_name);

        //There would be more work that is needed if there are more than 1 word in the string, as you can see below
        String first = "jim bean";
        String last = "jack daniels"; 
        String full = first.substring(0, 1).toUpperCase() + first.substring(1) + " " + last.substring(0, 1).toUpperCase() + last.substring(1);

        System.out.println(full);

    }
}