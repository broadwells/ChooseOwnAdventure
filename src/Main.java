import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! What is your name? Please enter name: ");
        String gamerName = scan.nextLine();

        System.out.println("Would you like to play a game? (y/n): ");
        String playGame = scan.next();
        scan.nextLine();
        boolean play = true;
        while (play) {
            if (playGame.equals("n")) {
                System.out.println("It was nice to meet you, " + gamerName + "!");
                play = false;
            } else {
                System.out.println("Awesome, " + gamerName + "!" + " Let's begin!");
                System.out.print("Your village has tasked you with exploring the surrounding land. ");
                System.out.print("While exploring, you come across the cave, that is home to a fire-breathing dragon!");
                System.out.println(" What do you do? (enter 'fight' or 'run'): ");
                String action = scan.nextLine();


                int dragonHead = 0;
                switch (action) {
                    case "fight":
                        System.out.println("You approach the dragon. The dragon has __ heads. (enter 1, 2, or 3): ");
                        dragonHead = scan.nextInt();
                        break;
                    case "run":
                        System.out.println("Thanks for playing! Goodbye, " + gamerName + "!");
                        break;
                    default:
                        System.out.println("Not valid, Goodbye!");
                }

                scan.nextLine();

                String weapon = "";
                switch (dragonHead) {
                    case 1:
                        System.out.print(dragonHead + "-headed dragon, this should be easy! ");
                        System.out.println("Choose your weapon. (enter 'slingshot', 'sword', 'bow and arrow'): ");
                        weapon = scan.nextLine();
                        break;
                    case 2:
                        System.out.print(dragonHead + "-headed dragon, this might be tricky, but not impossible!");
                        System.out.println(" Choose your weapon. (enter 'slingshot', 'sword', 'bow and arrow'): ");
                        weapon = scan.nextLine();
                        break;
                    case 3:
                        System.out.print(dragonHead + "-headed dragon! No one has ever slayed a 3-headed dragon before!");
                        System.out.println(" Choose your weapon. (enter 'slingshot', 'sword', 'bow and arrow'): ");
                        weapon = scan.nextLine();
                        break;
                    default:
                        System.out.println("Not a valid answer!");
                        break;
                }

                scan.nextLine();

                String victory = "";
                switch (weapon.toLowerCase()) {
                    case "slingshot":
                        System.out.print("With your " + weapon + ", you take aim and fling a rock at the dragon.");
                        System.out.println(" Unfortunately, the rock wasn't large enough and the dragon attacks.");
                        System.out.println("Killed. Thanks for playing, " + gamerName + "!");
                        break;
                    case "bow and arrow":
                        System.out.print("With your " + weapon + ", you take aim and fire the arrow at the dragon.");
                        System.out.println(" The dragon was hit and killed!");
                        System.out.println("Do you wish to take the heads of the dragon as proof of your victory? (y/n): ");
                        victory = scan.next();
                        break;
                    case "sword":
                        System.out.print("With your " + weapon + ", you swipe at the dragon.");
                        System.out.println(" You manage to cut off the heads and kill the dragon!");
                        System.out.println("Do you wish to take the heads of the dragon as proof of your victory? (y/n): ");
                        victory = scan.next();
                        break;
                    default:
                        System.out.println("Not valid, goodbye!");
                }

                scan.nextLine();
                if (victory.equals("y")) {
                    System.out.println("You bring the heads back to your village and are crowned the village hero!");
                    System.out.println("Thank you for playing, " + gamerName + "! Do you wish to play again? (y/n)");
                    playGame = scan.next();
                    if (playGame.equals("n")) {
                        System.out.println("It was nice to meet you, " + gamerName + "!");
                        play = false;
                    }
                    else {
                        play = true;
                    }
                }
                else {
                    System.out.println("You return to the village with no story to tell.");
                    System.out.println("Thank you for playing, " + gamerName + "! Do you wish to play again? (y/n)");
                    playGame = scan.next();
                    if (playGame.equals("n")) {
                        System.out.println("It was nice to meet you, " + gamerName + "!");
                        play = false;
                    }
                    else {
                        play = true;
                    }
                }
                scan.nextLine();

            }
        }

    }
}