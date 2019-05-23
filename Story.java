
/**
 * Write a description of class Story here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Story
{
    private static String name;
    private static String puppy;
    private static String job;
    public static void main(){
        boolean menu = true;
         System.out.println("Hi, I love doggies. Welcome to our PAWesome game!!?!");
        while(menu){
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
        if(option.equals("1")) puppy = "Samoyed";
        else if (option.equals("2")) puppy = "Corgi";
        else if (option.equals("3")) puppy = "Shiba Inu";
        else if (option.equals("4")) puppy = "Pomeranian";
        else if (option.equals("5")) puppy = "Golden Retriever";
        else{
          System.out.println("INVALID INPUT");
          setUp();
        }
        System.out.println("Now choose your class!");
        System.out.println("1 = Warrior - Weapon: Sword");
        System.out.println("2 = Archer - Weapon: Bow and Arrow");
        System.out.println("3 = Mage - Weapon: Staff");
        System.out.println("4 = Thief - Weapon: Throwing Knives");
        System.out.println("5 = Pirate - Weapon: Claw");
        String option = UserInput.getString();
        if(option.equals("1")) job = "Warrior";
        else if (option.equals("2")) puppy = "Corgi";
        else if (option.equals("3")) puppy = "Mage - Weapon: Staff";
        else if (option.equals("4")) puppy = "Pomeranian";
        else if (option.equals("5")) puppy = "Golden Retriever";
        else{
          System.out.println("INVALID INPUT");
          setUp();
        }
        System.out.println("Are you sure you want to be named "  + name + " the "+ job + " " + puppy + " ? (yes or no)");
        String option = UserInput.getString();
        if(option == "yes")one();
        else setUp();
    }
    public static void one()
    {
        boolean valid = true;
        while(valid){
            System.out.println("One day, while strolling the town square plaza and browsing along the busy markets, " + name + " the " + puppy + " , a canine of humble upbringing spots a poster recruiting anyone brave enough to slay the monster");
            System.out.println("Recruiter: Recruiting all valiant enough to fight on behalf of King Roofster IV");
            System.out.println("What will you say?");
            System.out.println("Option 1: I shall go for “His Royal Fluffiness”. This is going to be a PAWsitively fun adventure!");
            System.out.println("Option 2: I’m tired… Might as well fetch some scrumptious food and take a nap.");
            System.out.println("Option 3: I shall instead join the Merchants of Wonders and explore the world in search of glory");
            System.out.println("choose by typing 1, 2, or 3 and pressing enter");
            String choice = UserInput.getString();
            if(choice.equals("1")){
                valid = false;
                pathOne();
            }
            else if (choice.equals("2")){
                valid = false;
                System.out.println("Game Over");
            }
            else if (choice.equals("3")){
                valid = false;
                pathThree();
            }
            else{
               System.out.println("INVALID INPUT");
            }
        }
    }
    public static void pathOne()
    {
        boolean path = true;
        while(path){
            System.out.println(name + ", you must fight a fearsome beast. In order to clear this first trial placed upon you, you must demonstrate that you possess the power");
            System.out.println("If you roll a 3 or higher, you will continue on your journey");
            int random = (int) ((Math.random() * 6) + 1);
            System.out.println("Roll the die");
            System.out.println(random);
            if(random >= 3){
                System.out.println("Congratulations, you have been promoted to the rank of Canine Knight!");
                pathOne_A();
            }
            else{
                System.out.println("Game Over");
            }
        }
    }
    public static void pathOne_A(){
        
        
    }
    public static void info(){
       System.out.println("This game is about the adventures of Sam the Samoyed!");
        System.out.println("He has the chance to fight a huge monster and prove that he is the best of the best!");
        System.out.println("Will you be worthy enough to lead Sam to victory?");
    }
    public static void credits(){
        System.out.println("CREDITS");
        System.out.println("Dogtator: Anika Mahajan");
        System.out.println("Dog Puns Kween: Aria Koul");
        System.out.println("The Wof: Ester Tsai");
        System.out.println("Idea Hero: Allen Cao");
        System.out.println("Creative Paragon: Alex Shen");
        System.out.println("You are PAWsitively amazing wof!");
    }
}
