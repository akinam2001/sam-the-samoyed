
/**
 * Write a description of class Story here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Story
{
    public static void main(){
        boolean menu = true;
        while(menu){
            System.out.println("Hi, I love doggies. Welcome to our PAWesome game!!?!");
            System.out.println("Options:");
            System.out.println("1. Info");
            System.out.println("2. Start");
            System.out.println("3. Credits");
            System.out.println("4. Quit");
            System.out.print("Type 1, 2, 3, or 4: ");
            String option = UserInput.getString();
            if(option.equals("1")) info();
            else if (option.equals("2"))setUp();
            else if (option.equals("3"))credits();
            else if (option.equals("4")) menu = false;
            else{
                System.out.println("INVALID INPUT");
                menu = true;
            }
        }
    }
    
    public static void setUp()
    {
        System.out.println("(These choices won't affect outcome)");
        System.out.println("Who are you?");
        System.out.println("My name is:");
        String option = UserInput.getString();
        name = option;
        
        System.out.println("Now choose your puppy!");
        System.out.println("1 = Samoyed");
        System.out.println("2 = Corgi");
        System.out.println("3 = Shiba Inu");
        System.out.println("4 = Pomeranian");
        System.out.println("5 = Golden Retriever");
        String option = UserInput.getString();
        if(option.equals("1")) {}
        else if (option.equals("2")){}
        else if (option.equals("3")) {}
        else if (option.equals("4")){}
        else{
          
        }
        /*
        System.out.println("Are you sure you want to be named " + name + "? (yes or no)");
        String option = UserInput.getString();
        if(option == "yes")one();
        else setUp();
        */

    }
    public static void one()
    {
        
    }
    public static void info(){
        System.out.println("This game is about the adventures of Sam the Samoyed! He has the chance to fight a huge monster and prove that he is the best of the best! Will you be worthy enough to lead Sam to victory?");
    }
    public static void credits(){
        System.out.println("CREDITS");
        System.out.println("Dictator: Anika Mahajan");
        System.out.println("Dog Puns Kween: Aria Koul");
        System.out.println("The Wof: Ester Tsai");
        System.out.println("Idea Hero: Allen Cao");
        System.out.println("Creative Paragon: Alex Shen");
        System.out.println("You are PAWsitively amazing wof!");
    }
}
