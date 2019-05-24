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
        System.out.println("");
        System.out.println("(These choices won't affect outcome)");
        System.out.println("Who are you?");
        System.out.println("My name is:");
        String option = UserInput.getString();
        name = option;

        System.out.println("");
        System.out.println("Now choose your breed!");
        System.out.println("1 = Samoyed");
        System.out.println("2 = Corgi");
        System.out.println("3 = Shiba Inu");
        System.out.println("4 = Pomeranian");
        System.out.println("5 = Golden Retriever");
        option = UserInput.getString();

        System.out.println("");
        if(option.equals("1")) puppy = "Samoyed";
        else if (option.equals("2")) puppy = "Corgi";
        else if (option.equals("3")) puppy = "Shiba Inu";
        else if (option.equals("4")) puppy = "Pomeranian";
        else if (option.equals("5")) puppy = "Golden Retriever";
        else{
            System.out.println("INVALID INPUT");
        }

        System.out.println("");
        System.out.println("Now choose your class!");
        System.out.println("1 = Warrior - Weapon: Sword");
        System.out.println("2 = Archer - Weapon: Bow and Arrow");
        System.out.println("3 = Mage - Weapon: Staff");
        System.out.println("4 = Thief - Weapon: Throwing Knives");
        System.out.println("5 = Pirate - Weapon: Claw");
        String decide = UserInput.getString();

        System.out.println("");
        if(decide.equals("1")) job = "Warrior";
        else if (decide.equals("2")) job = "Archer";
        else if (decide.equals("3")) job = "Mage";
        else if (decide.equals("4")) job = "Thief";
        else if (decide.equals("5")) job = "Pirate";
        else{
            System.out.println("INVALID INPUT");
        }

        System.out.println("Are you sure you want to be named "  + name + " the "+ job + " " + puppy + "? (1) Yes  (2) No");
        option = UserInput.getString();
        if(option.equals("1") || option.equals("yes")) one();
        else setUp();
    }

    public static void one()
    {
        boolean valid = true;
        while(valid){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("One day, while strolling the town square plaza and browsing along the busy markets, ");
            System.out.println(name + " the " + puppy + " , a canine of humble upbringing spots a poster recruiting anyone brave enough to slay the monster");
            System.out.println("Recruiter: Recruiting all valiant enough to fight on behalf of King Roofster IV");
            System.out.println("");
            System.out.println("What will you say?");
            System.out.println("");
            System.out.println("Option 1: I shall go for “His Royal Fluffiness”. This is going to be a PAWsitively fun adventure!");
            System.out.println("Option 2: I’m tired… Might as well fetch some scrumptious doggo food and take a nap.");
            System.out.println("Option 3: I shall instead join the Mercenaries of Woofwonders and plunder the world's riches for glory!");
            System.out.println("choose by typing 1, 2, or 3 and pressing enter");
            String choice = UserInput.getString();
            if(choice.equals("1")){
                valid = false;
                pathOne();
            }
            else if (choice.equals("2")){
                valid = false;
                System.out.println("You're tired to death. Game Over");
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
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(name + ", you must fight a fearsome beast.");
            System.out.println("In order to clear this first trial placed upon you, you must demonstrate that you possess the power.");
            System.out.println("If you roll a 3 or higher, you will continue on your journey.");
            int random = (int) ((Math.random() * 6) + 1);
            System.out.println("");
            System.out.println("Roll the die");
            System.out.println("");
            System.out.println(random);
            if(random >= 3){
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Congratulations, you have been promoted to the rank of Canine Knight!");
                path = false;
                pathOne_A();
            }
            else{
                System.out.println("----------------------------------------------------------------------------------------");
                path = false;
                System.out.println("You failed your first trial. Game Over");
                System.out.println("");
            }
        }
    }

    public static void pathOne_A(){
        boolean path = true;
        while(path){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("For your first mission, you have to go with Lucas the meek, Manny the average, and Alex the muscular to find a spy in the city and uncover the monster's secret plan.");
            System.out.println("Will you, " + name + " the " + job + " " + puppy + ", (1)investigate the central park or (2) the city gate entrance?");
            String choice = UserInput.getString();
            if(choice.equals("1")){
                path = false;
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("You found nothin");
                System.out.println("Game Over");
                System.out.println("");
            }
            else if (choice.equals("2")){
                path = false;
                System.out.println(" ");
                pathOne_A_2();
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }
    }

    public static void pathOne_A_2(){
        boolean path = true;
        while(path){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("You investigate the city gate");
            System.out.println("You find a bomb on a bench");
            System.out.println("Will you, " + name + " the " + job + " " + puppy + ", (1)cut the yellow wire or (2)the blue wire?");
            String choice = UserInput.getString();
            if(choice.equals("1")){
                path = false;
                System.out.println(" ");
                pathOne_A_2_b();
            }
            else if (choice.equals("2")){
                path = false;
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("You diffused the bomb!");
                System.out.println("You saved the kingdom");
                System.out.println("You, " + name + " the " + job + " " + puppy + ", are honored by the King and now are a Honorary Dawg");
                System.out.println("You win!!");
                System.out.println(" ");
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }
    }

    public static void pathOne_A_2_b(){
        boolean path = true;
        while(path){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("You picked the yellow wire");
            System.out.println("The bomb explodes and opens up the gates");
            System.out.println("A whole swarm of monsters appear and invade");
            System.out.println("If you roll a 5 or higher, you will defeat the monsters");
            int random = (int) ((Math.random() * 6) + 1);
            System.out.println(" ");
            System.out.println("Roll the die");
            System.out.println(" ");
            System.out.println(random);
            if(random >= 5){
                path = false;
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Congratulations, you defeated the monsters");
                System.out.println("You saved the kingdom");
                System.out.println("You, " + name + " the " + job + " " + puppy + ", are honored by the King and now are a Honorary Dawg");
                System.out.println("You win!!");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("");
            }
            else{
                path = false;
                System.out.println("---------------------------------------------------------------------------------------- ");
                System.out.println("You are eaten by the monster. Game Over");
                System.out.println(" ");
            }
        }
    }

    public static void pathThree()
    {
        boolean path = true;
        while(path){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(name + "’s first mission is to invade the King’s castle for gold.");
            System.out.println("Can " + name + " pinlock the lock correctly? Pick a number between 1 and 10.");
            System.out.println("I pick the number: ");
            String choice = UserInput.getString();

            if(Integer.parseInt(choice) > 5 && Integer.parseInt(choice) < 9){
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println(name + " succeeds!");
                System.out.println(name + " gets access to gold.");
                System.out.println(name + " hides in the gold to hide from the King’s Holy Blood Hounds due to gold’s musty, metallic smell.");
                System.out.println(name + " escapes && very rich");
                System.out.println("");
                System.out.println("Should " + name + " (1)buy doggo food or (2)invade and conquer the kingdom by hiring mercenary monsters.");
                choice = UserInput.getString();
                if(choice.equals("1")){
                    path = false;
                    pathThree_A();
                }
                else if(choice.equals("2")){
                    path = false;
                    pathThree_B();
                }
                else System.out.println("INVALID INPUT");
            }

            else{
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println(name + " fails!");
                System.out.println(name + " is chased down by the King’s Holy Blood Hounds.");
                System.out.println(name + " must play labyrinth game in order to escape.");
                int random = (int) ((Math.random() * 6) + 1);
                System.out.println("Roll the die to determine your success.");
                System.out.println("");
                System.out.println(random);
                if(random >= 2)
                {
                    path = false;
                    pathThree_C();
                }
                else
                {
                    path = false;
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("You are trapped in the maze. Game Over");
                    System.out.println("");
                }
            }
        }
    }

    public static void pathThree_A()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(name + " lives happily ever after. THE END.");
        System.out.println("");
    }

    public static void pathThree_B()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("King Roofster IV's Honorary Doge Knight retaliates and puts down the whole invasion. " + name + ", blinded by greed, is thrown into the castle prison."); 
        System.out.println("GAME OVER");
        System.out.println("");
    }

    public static void pathThree_C()
    {
        boolean path = true;
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(name + " successfully completed the maze!");
        System.out.println(name + " escapes the dungeon successfully but is now very poor.");
        System.out.println("One sunny afternoon, " + name + "  troupes past the castle gates and witnesses an outbreak of war between King Roofster IV’s army and a sinister, 10 foot silver feline with razor sharp claws.");
        System.out.println("Would you (1) intervene to help or (2) escape and leave the royal soldiers to fend for themselves?");
        String choice = UserInput.getString();
        if(choice.equals("1"))
        {
            path = false;
            pathThree_C_1();
        }
        else if(choice.equals("2")) 
        {
            path = false;
            System.out.println("");
            System.out.println("A monster stomped over you.");
            System.out.println("GAME OVER");
            System.out.println("");
        }
        else System.out.println("INVALID INPUT");
    }

    public static void pathThree_C_1()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("If you roll a 3 or higher, you will beat your enemies.");
        int random = (int) ((Math.random() * 6) + 1);
        System.out.println("Roll the die.");
        System.out.println(random);
        if(random >= 2) System.out.println(name + " has ranked up! " + name + " has been promoted to the royal title of “Honorary Dawg.” The End.");  
        else System.out.println("You lost in the battle. Game Over");
        System.out.println("");
    }

    public static void info(){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("This game is about the adventures of Sam the Samoyed!");
        System.out.println("He has the chance to fight a huge monster and prove that he is the best of the best!");
        System.out.println("Will you be worthy enough to lead Sam to victory?");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void credits(){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("CREDITS");
        System.out.println("Dogtator: Anika Mahajan");
        System.out.println("Dog Puns Kween: Aria Koul");
        System.out.println("The Wof: Ester Tsai");
        System.out.println("Idea Doge: Allen Cao");
        System.out.println("Woof Paragon: Alex Shen");
        System.out.println("You are PAWsitively amazing wof!");
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
