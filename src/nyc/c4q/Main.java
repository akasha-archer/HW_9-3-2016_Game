package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static String readInput() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
    }

    public static void promptUser(String prompt) {
        System.out.println(prompt);
    }

    public static void log(String input) {
        System.out.println(input);
    }


    public static void startingPoint(String country) {
        System.out.println("Yaaay, you chose " + country + ". Let's get going!");
    }

    public static void main(String[] args) {
        // write your code here
        log("╔═════════════════ ೋღ * * * * ღೋ ══════════════╗");
        log("~ ~ ~ ~ ~ ~ ~ ~ ~ ~  WELCOME TO  ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        log("~ ~ ~ ~ ~ ~ ~ ~ * * * AKASHA'S * * * ~ ~ ~ ~ ~ ~ ~ ~");
        log("~ ~ ~ ~ ~ ~ ~ ~ ~ ADVENTURE GAME ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        log("╚═════════════════ ೋღ * * * * ღೋ ══════════════╝");
        System.out.println('\n');
        log("It's Saturday night and you're all alone with no plans. Suddenly, your Instagram notifications are going crazy!");
        log("You check your phone and see a DM from RIHANNA!!" + " " + " " + "ヽ(⌐■_■)ノ♪♬");
        log("\"The Navy is going on a Caribbean island adventure and you're invited!\" ");
        log("\"Where should we start?\" " + '\n' + "Choose 1 for Jamaica " + '\n' + "or 2 for Barbados");
        log("> ");

        String countryChoice = readInput();
        int badInput = 1;

        if (countryChoice.equals("1")) {
            startingPoint("Jamaica");
            log("Now that we're in Jamaica, we have 2 choices:" + '\n' + "Select 1 if you like living on the edge or 2 to make some new aquatic friends.");
            System.out.println('\n');
            log("> ");
            String activity = readInput();

            // choice of activity for Jamaica
            switch (activity) {
                case "1": log("We're heading to Rick's Cafe! Let's go dive off that cliff into the ocean!");
                    log("  , ,^%---  ");
                    log("         | |>  | we're fllyyyyyinggggggg  ヾ( •́д•̀ ;)ﾉ ");
                    log("      _| ||>    ");
                    log("    (_(/_____>,^____) ~-~-~");
                    log("   ~-~`~-~-~-~-~-~-~'~-~-~");
                    log("  ~ejm~-~- -~-~-~-~");
                    log(" !");
                    log(" !!");
                    log(" ':");
                    log("  !!");
                    log("' :");
                    log(" '! '");
                    log("! :'");
                    log(":'!");
                    log("':!");
                    log("' '!");
                    log(" :'!");
                    log(" '!!");
                    log(" -~'~-~':!");
                    log(" ~-~-~!'");
                    log("~-~!'");
                    break;

                case "2": log("Today is your lucky day!" + '\n' + "Guess what? You swam with dolphins and they dropped you off on a remote island where you found a hidden treasure!");
                    log(",-._");
                    log(" _.-'  '--.");
                    log("  .'      _  -`|_ ");
                    log("  / .----.`_.'----'");
                    log("  ;/     ` ");
                    log(" /_; ");
                    break;
                default: log("Scaredy cat! meow meow. Bye!");
                    break;
            }

        } else if (countryChoice.equals("2")) {
            startingPoint("Barbados");
            log("Barbados will be a blast! What would you like to do?" + '\n' + "Select 1 for water sports or 2 for a diving adventure");
            String activity = readInput();

            // choice of activity for Bermuda
            switch (activity) {
                case "1": log("OMG, so much fun! You went on a glass bottomed boat tour and scored some treasure from a shipwreck! (((o(*ﾟ▽ﾟ*)o))) ");
                    break;
                case "2":
                    log("Oh nooooo...( ⚆ _ ⚆ ) you went on a deep sea diving treasure hunt and got attacked by a school of flying fish. Game over." + '\n' + "You have ");
                    for (int i = 10; i >= 0; i--) {
                        System.out.println(i);
                    }
                    log("seconds left to live.");
                    break;
                default: log("Scaredy cat! meow meow. Bye!");
                    break;
            }

        } else {
            do {
                promptUser("That's not a valid entry. Please try again");
                String userInput = readInput();
                if (!userInput.equals("1") || !userInput.equals("2")) {
                    badInput++;
                }
            } while (badInput <= 3);
            log("You're being difficult. Come back when you're ready to be nice.");
        }
    }
}
