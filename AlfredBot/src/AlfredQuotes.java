import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        Date date = new Date();
        return String.format("Hello, %s lovely to see you", name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")){
            return conversation + "\nRight away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.contains("Alfred")){
            return conversation + "\nAt your service. As you wish, naturally.";
        }else{
            return conversation + "\nRight. And with that I shall retire.";
        }
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

