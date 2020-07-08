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

        //But what about lower caseing the letters
        String FIRST = "JIM BEAN";
        String LAST = "JACK DANIELS";
        
        //lowercases just the first letter
        String FULL = FIRST.substring(0, 1).toLowerCase() + FIRST.substring(1) + " "
                + LAST.substring(0, 1).toLowerCase() + LAST.substring(1);
        
        //Lowercases all letters
        String lower = FIRST.toLowerCase() + " " + LAST.toLowerCase(); 


        System.out.println(FULL);
        System.out.println(lower);
    }
}