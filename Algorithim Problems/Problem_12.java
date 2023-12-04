import java.text.SimpleDateFormat;
import java.util.Date;


public class Problem_12 {

    public static void main(String[] args) {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. "
                + "Your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification "
                + "Thank you BridgeLabz 01/01/2016.";

        String modifiedMessage = customizeMessage(message);
        System.out.println("Modified Message:");
        System.out.println(modifiedMessage);
    }

    private static String customizeMessage(String message) {
        String nameRegex = "<<name>>";
        String fullNameRegex = "<<full name>>";
        String mobileRegex = "91-xxxxxxxxxx";
        String dateRegex = "\\d{2}/\\d{2}/\\d{4}";

        String firstName = "Kriti";
        String fullName = "Kriti Jaiswal"; 
        String contactNumber = "91-9785778447"; 

        message = message.replaceAll(nameRegex, firstName);

        message = message.replaceAll(fullNameRegex, fullName);

        message = message.replaceAll(mobileRegex, contactNumber);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String currentDate = dateFormat.format(new Date());
        message = message.replaceAll(dateRegex, currentDate);

        return message;
    }
}

