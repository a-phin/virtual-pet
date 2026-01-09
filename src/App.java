import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        mainMenu();
        
        Pet[] allPets = new Pet[20];
        String choice;
        int index = 0;
        do {
            String[] petTypes = {"cat", "chicken", "dog", "fox", "horse", "duck", "snake", "turtle"};
            System.out.println("Select a pet:\nCat\tChicken\tDog\tFox\tHorse\tDuck\tSnake\tTurtle");
            String type = input.nextLine();
            for (int t = 0; t < petTypes.length; t++) {
                if (type.equalsIgnoreCase(petTypes[t])) {
                    break;
                }
                else if (t == petTypes.length-1) {
                    System.out.print("Invalid pet type. Please input a valid pet type.\t");
                    type = input.nextLine();
                    t = -1;
                }
            }

            System.out.print("Name your " + type + "!\t");
            String name = input.nextLine();
            switch (type) {
                case "cat":
                    Pet cat = new Cat(name);
                    allPets[index] = cat;
                    break;
                case "chicken":
                    Pet chicken = new Chicken(name);
                    allPets[index] = chicken;
                    break;
                case "dog":
                    Pet dog = new Dog(name);
                    allPets[index] = dog;
                    break;
                case "fox":
                    Pet fox = new Fox(name);
                    allPets[index] = fox;
                    break;
                case "horse":
                    Pet horse = new Horse(name);
                    allPets[index] = horse;
                    break;
                case "duck":
                    Pet duck = new Duck(name);
                    allPets[index] = duck;
                    break;
                case "snake":
                    Pet snake = new Snake(name);
                    allPets[index] = snake;
                    break;
                case "turtle":
                    Pet turtle = new Turtle(name);
                    allPets[index] = turtle;
                    break;
            }

            index++;
            System.out.print("Would you like to add another pet?\t");
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Select the pet you would like to play:");
        for (int p = 0; p < allPets.length; p++) {
            if (allPets[p] == null)
                break;
            System.out.print("(" + p + ") " + allPets[p].getName() + " | ");
        }
        Pet select = allPets[input.nextInt()];
        System.out.println("Loading game. . .\n");
        game(select, allPets);
        System.out.print("Thank you for playing!\nPlease run the program again if you wish to play again.");
        input.close();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        mainMenuArt();
        System.out.println("V I R T U A L\tP E T \nPLAY\t|||\tEXIT");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("exit")) {
            System.out.print("Exiting game...");
            input.close();
            System.exit(0);
        }
        else if (!response.equalsIgnoreCase("play")) {
            System.out.print("Unknown input. Please run the program again.");
            input.close();
            System.exit(0);
        }
    }

    public static void game(Pet pet, Pet[] pets) {
        Scanner sim = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int choice = 0;
        System.out.println(pet.getName() + "'s Stats\nHealth: " + pet.getHealth() + "\tEnergy: " + pet.getEnergy() + "\nHunger: " + pet.getHunger() + "\tThirst: " + pet.getThirst() + "\nHygiene: " + pet.getHygiene() + "\tBladder: " + pet.getBladder() + "\nHappiness: " + pet.getHappiness() + "\n");
        int quote = (int) ((Math.random()*5) + 1);
        switch (quote) {
            case 1:
                pet.idle();
                break;
            case 2:
                pet.sound();
                break;
            case 3:
                pet.sleep();
                break;
            case 4:
                pet.move();
                break;
            case 5:
                System.out.println(pet.getName() + " is waiting for you!");
                break;
        }
        System.out.println("(1) FEED PET\t| (2) GIVE WATER\t| (3) GO POTTY\t| (4) BATHE PET\t| (5) NAP TIME\t| (6) CARE FOR PET\n(7) PLAY WITH PET\t| (8) FIGHT PET\t| (9) RENAME PET\t| (10) SWITCH PET\t| (11) MAIN MENU\t| (12) EXIT GAME");
        choice = sim.nextInt();
        switch(choice) {
            case 1:
                System.out.println("\n" + pet.getName() + " enjoys the treats you give it!");
                pet.setHunger(pet.getHunger() + 25);
                pet.setBladder(pet.getBladder() - 25);
                pet.setEnergy(pet.getEnergy() + 15);
                pet.setHappiness(pet.getHappiness() + 5);
                break;
            case 2:
                pet.setThirst(pet.getThirst() + 20);
                pet.setBladder(pet.getBladder() - 20);
                pet.setEnergy(pet.getEnergy() + 10);
                break;
            case 3:
                pet.setBladder(pet.getBladder() + 30);
                pet.setHygiene(pet.getHygiene() + 10);
                pet.setThirst(pet.getThirst() - 30);
                break;
            case 4:
                int like = (int) ((Math.random()*2) + 1);
                if (like == 1) {
                    System.out.println("\n" + pet.getName() + " is enjoying a nap in the bath. . .");
                    pet.setHappiness(pet.getHappiness() + 15);
                }
                else if (like == 2) {
                    System.out.println("\n" + pet.getName() + " hates baths. It tried to stratch you while you bathed it!");
                    pet.setHappiness(pet.getHappiness() - 20);
                }
                pet.setHygiene(pet.getHygiene() + 40);
                break;
            case 5:
                System.out.println("Zzz. . .");
                pet.setEnergy(pet.getEnergy() + 40);
                pet.setHygiene(pet.getHygiene() - 20);
                pet.setHunger(pet.getHunger() - 30);
                pet.setThirst(pet.getThirst() - 30);
                break;
            case 6:
                System.out.println("\nYou let " + pet.getName() + " rest on your lap while you give it medicine.");
                pet.setHealth(pet.getHealth() + 25);
                break;
            case 7:
                pet.setHappiness(pet.getHappiness() + 40);
                pet.setEnergy(pet.getEnergy() + 30);
                pet.setHygiene(pet.getHygiene() - 35);
                break;
            case 8:
                int petOrOwner = (int) ((Math.random()*2 + 1));
                if (petOrOwner == 1) {
                    int whoWins = (int) ((Math.random()*2) + 1);
                    if (whoWins == 1) {
                        System.out.println("\n" + pet.getName() + " successfully attacked you!");
                        pet.setEnergy(pet.getEnergy() + 40);
                        pet.setHappiness(pet.getHappiness() + 40);
                        pet.setHygiene(pet.getHygiene() - 35);
                    }
                    else if (whoWins == 2) {
                        System.out.println("\nYou won against " + pet.getName() + "!");
                        pet.setEnergy(pet.getEnergy() - 40);
                        pet.setHappiness(pet.getHappiness() - 40);
                        pet.setHygiene(pet.getHygiene() - 50);
                        pet.setHealth(pet.getHealth() - 40);
                    }
                }
                else if (petOrOwner == 2) {
                    int allPets = 0;
                    for (int p = 0; p < pets.length; p++) {
                        if (pets[p] == null)
                            break;
                        allPets++;
                    }
                    Pet randomPet = pets[(int)(Math.random()*(allPets+1))];
                    System.out.println("\n" + pet.getName() + " chose to fight " + randomPet.getName());
                    int whoWins = (int) ((Math.random()*2) + 1);
                    if (whoWins == 1) {
                        System.out.println("\n" + pet.getName() + " defeated " + randomPet.getName() + " in a fight!");
                        pet.setEnergy(pet.getEnergy() + 30);
                        pet.setHappiness(pet.getHappiness() + 30);
                        pet.setHygiene(pet.getHygiene() - 35);
                    }
                    else if (whoWins == 2) {
                        System.out.println("\n" + randomPet.getName() + " defeated " + pet.getName() + ", the pet you're taking care of!");
                        pet.setEnergy(1);
                        pet.setHappiness((int) (Math.random()*2));
                        pet.setHygiene((int) (Math.random()*2));
                        pet.setHealth((int) (Math.random()*2));
                    }
                }
                pet.setHygiene(pet.getHygiene() - 25);
                break;
            case 9:
                System.out.print("\nType the new name of your pet: ");
                String newName = str.nextLine();
                pet.setName(newName);
                break;
            case 11:
                mainMenu();
                break;
        }

        if (pet.getHunger() >= 100)
            pet.setHunger(100);
        if (pet.getThirst() >= 100)
            pet.setThirst(100);
        if (pet.getBladder() >= 100)
            pet.setBladder(100);
        if (pet.getHygiene() >= 100)
            pet.setHygiene(100);
        if (pet.getHappiness() >= 100)
            pet.setHappiness(100);
        if (pet.getHealth() >= 100)
            pet.setHealth(100);
        if (pet.getEnergy() >= 100)
            pet.setEnergy(100);

        if (pet.getBladder() <= 0 || pet.getHygiene() <= 0) {
            if (pet.getBladder() <= 0) {
                System.out.println("Your pet had an accident! Its bladder stats has increased to 100.");
                pet.setBladder(100);
                pet.setHygiene(pet.getHygiene() - 60);
            }
            if (pet.getHygiene() <= 0) {
                System.out.println("Your pet is dirty! Give it a bath to increase their hygiene.");
                pet.setHygiene(0);
                pet.setHealth(pet.getHealth() - 30);
            }
        }

        if (choice == 12 || pet.getHunger() <= 0 || pet.getThirst() <= 0 || pet.getHealth() <= 0 || pet.getEnergy() <= 0) {
            if (pet.getHunger() <= 0) {
                System.out.println(pet.getName() + " died of starvation! Game over!");
                pet.setHunger(0);
                pet.setHealth(0);
            }
            else if (pet.getThirst() <= 0) {
                System.out.println("Your pet died of dehydration! Game over!");
                pet.setThirst(0);
                pet.setHealth(0);
            }
            else if (pet.getEnergy() <= 0) {
                System.out.println("Your pet is tired! We're going to let it sleep, game over!");
                pet.setEnergy(0);
                pet.setHealth(0);
            }
            else if (pet.getHealth() <= 0) {
                System.out.println("Your pet's health is at 0! Game over!");
                pet.setHealth(0);
            }
            System.out.println(pet.getName() + "'s Final Stats\nHealth: " + pet.getHealth() + "\tEnergy: " + pet.getEnergy() + "\nHunger: " + pet.getHunger() + "\tThirst: " + pet.getThirst() + "\nHygiene: " + pet.getHygiene() + "\tBladder: " + pet.getBladder() + "\nHappiness: " + pet.getHappiness() + "\n");
            sim.close();
            str.close();
        }
        else if (choice == 10) {
            System.out.println("Select the pet you would like to play:");
            for (int p = 0; p < pets.length; p++) {
                if (pets[p] == null)
                    break;
                System.out.print("(" + p + ") " + pets[p].getName() + " | ");
            }
            pet = pets[sim.nextInt()];
            game(pet, pets);
        }
        else {
            if (choice == 9)
                pet.setHealth(pet.getHealth());
            else if (pet.getHealth() > 10)
                pet.setHealth(pet.getHealth() - 10);
            game(pet, pets);
        }
    }

    public static void mainMenuArt() {
        int random = (int) ((Math.random()*8) + 1);
        if (random == 1) {
            System.out.println("  ,-.       _,---._ __  / \\\r\n" + //
                                " /  )    .-'       `./ /   \\\r\n" + //
                                "(  (   ,'            `/    /|\r\n" + //
                                " \\  `-\"             \\'\\   / |\r\n" + //
                                "  `.              ,  \\ \\ /  |\r\n" + //
                                "   /`.          ,'-`----Y   |\r\n" + //
                                "  (            ;        |   '\r\n" + //
                                "  |  ,-.    ,-'         |  /\r\n" + //
                                "  |  | (   |        hjw | /\r\n" + //
                                "  )  |  \\  `.___________|/\r\n" + //
                                "  `--'   `--'");
        }
        else if (random == 2) {
            System.out.println("      ,~.\r\n" + //
                                "   ,-'__ `-,\r\n" + //
                                "  {,-'  `. }              ,')\r\n" + //
                                " ,( a )   `-.__         ,',')~,\r\n" + //
                                "&lt;=.) (         `-.__,==' ' ' '}\r\n" + //
                                "  (   )                      /)\r\n" + //
                                "   `-'\\   ,                    )\r\n" + //
                                "       |  \\        `~.        /\r\n" + //
                                "       \\   `._        \\      /\r\n" + //
                                "        \\     `._____,'    ,'\r\n" + //
                                "         `-.             ,'\r\n" + //
                                "            `-._     _,-'\r\n" + //
                                "                77jj'\r\n" + //
                                "               //_||\r\n" + //
                                "            __//--'/`          hjw\r\n" + //
                                "          ,--'/`  '");
        }
        else if (random == 3) {
            System.out.println("   .-------------.       .    .   *       *   \r\n" + //
                                "  /_/_/_/_/_/_/_/ \\         *       .   )    .\r\n" + //
                                " //_/_/_/_/_/_// _ \\ __          .        .   \r\n" + //
                                "/_/_/_/_/_/_/_/|/ \\.' .`-o                    \r\n" + //
                                " |             ||-'(/ ,--'                    \r\n" + //
                                " |             ||  _ |                        \r\n" + //
                                " |             ||'' ||                        \r\n" + //
                                " |_____________|| |_|L                     hjm");
        }
        else if (random == 4) {
            System.out.println("                                                                   ,-,\r\n" + //
                                "                                                             _.-=;~ /_\r\n" + //
                                "                                                          _-~   '     ;.\r\n" + //
                                "                                                      _.-~     '   .-~-~`-._\r\n" + //
                                "                                                _.--~~:.             --.____88\r\n" + //
                                "                              ____.........--~~~. .' .  .        _..-------~~\r\n" + //
                                "                     _..--~~~~               .' .'             ,'\r\n" + //
                                "                 _.-~                        .       .     ` ,'\r\n" + //
                                "               .'                                    :.    ./\r\n" + //
                                "             .:     ,/          `                   ::.   ,'\r\n" + //
                                "           .:'     ,(            ;.                ::. ,-'\r\n" + //
                                "          .'     ./'.`.     . . /:::._______.... _/:.o/\r\n" + //
                                "         /     ./'. . .)  . _.,'               `88;?88|\r\n" + //
                                "       ,'  . .,/'._,-~ /_.o8P'                  88P ?8b\r\n" + //
                                "    _,'' . .,/',-~    d888P'                    88'  88|\r\n" + //
                                " _.'~  . .,:oP'        ?88b              _..--- 88.--'8b.--..__\r\n" + //
                                ":     ...' 88o __,------.88o ...__..._.=~- .    `~~   `~~      ~-._ Seal _.\r\n" + //
                                "`.;;;:='    ~~            ~~~                ~-    -       -   -");
        }
        else if (random == 5) {
            System.out.println("                      ~~%%%%%%%%_,_,\r\n" + //
                                "                   ~~%%%%%%%%%-\"/./\r\n" + //
                                "                 ~~%%%%%%%-'   /  `.\r\n" + //
                                "              ~~%%%%%%%%'  .     ,__;\r\n" + //
                                "            ~~%%%%%%%%'   :       \\O\\\r\n" + //
                                "          ~~%%%%%%%%'    :          `.\r\n" + //
                                "       ~~%%%%%%%%'       `. _,        '\r\n" + //
                                "    ~~%%%%%%%%'          .'`-._        `.\r\n" + //
                                " ~~%%%%%%%%%'           :     `-.     (,;\r\n" + //
                                "~~%%%%%%%%'             :         `._\\_.'\r\n" + //
                                "~~%%jgs%%'              ;");
        }
        else if (random == 6) {
            System.out.println("              .-\"\"-.\r\n" + //
                                "             /      \\\r\n" + //
                                "            /     (0 \\______\r\n" + //
                                "            |         \"_____)\r\n" + //
                                "            \\        ,-----'\r\n" + //
                                "             \\_    _/\r\n" + //
                                "              /    \\\r\n" + //
                                "             /      \\\r\n" + //
                                "            /        \\\r\n" + //
                                "           /          \\\r\n" + //
                                "          /        :   |\r\n" + //
                                "         /     ;   :   |\r\n" + //
                                "\\\\\\     /  _.-'    :   |\r\n" + //
                                " \\\\\\\\  / _'        :   |\r\n" + //
                                "  \\\\\\\\/ ;         :   /\r\n" + //
                                "   \\\\  ;         :   /\r\n" + //
                                "    \\   `._`-'_.'  _/\r\n" + //
                                "     \\     ''' _.-'\r\n" + //
                                "      \\      / /\r\n" + //
                                "  jgs  \\    / /\r\n" + //
                                "        \\  /)(_______\r\n" + //
                                "         )(_________<\r\n" + //
                                "        (__________<");
        }
        else if (random == 7) {
            System.out.println("       ---_ ......._-_--.\r\n" + //
                                "      (|\\ /      / /| \\  \\\r\n" + //
                                "      /  /     .'  -=-'   `.\r\n" + //
                                "     /  /    .'             )\r\n" + //
                                "   _/  /   .'        _.)   /\r\n" + //
                                "  / o   o        _.-' /  .'\r\n" + //
                                "  \\          _.-'    / .'*|\r\n" + //
                                "   \\______.-'//    .'.' \\*|\r\n" + //
                                "    \\|  \\ | //   .'.' _ |*|\r\n" + //
                                "     `   \\|//  .'.'_ _ _|*|\r\n" + //
                                "      .  .// .'.' | _ _ \\*|\r\n" + //
                                "      \\`-|\\_/ /    \\ _ _ \\*\\\r\n" + //
                                "       `/'\\__/      \\ _ _ \\*\\\r\n" + //
                                "      /^|            \\ _ _ \\*\r\n" + //
                                "     '  `             \\ _ _ \\      ASH (+VK)\r\n" + //
                                "                       \\_");
        }
        else if (random == 8) {
            System.out.println("         __.._\r\n" + //
                                "____...-`  \\ /``'-..\r\n" + //
                                "`~-..`(.-~~~|    /  `-.\r\n" + //
                                "    : :   ,``. .<____/ `:_\r\n" + //
                                "    ` `..`   .` /   / \\ /:`-.\r\n" + //
                                "     `. `. ,`  /    \\_.'.`.,,:\r\n" + //
                                "      |`._`-.__\\_.-``.-'  `._\r\n" + //
                                "      `.,,`-`....-.`~`.'`. c `.\r\n" + //
                                "                 HD`-. `,`. ._ )\r\n" + //
                                "                      ```  `--`");
        }
    }
}
