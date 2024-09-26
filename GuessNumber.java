import java.sql.SQLOutput;
import java.util.*;


public class GuessNumber {


    static int Random_no()
    {
        Random random = new Random();

        int target_no = random.nextInt(100);

        return target_no;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("!--------------------------Welcome to GEUSS THE NUMBER GAME -------------------------!");
        System.out.println("We will generat one number between 0 to 100.");
        System.out.println("You have to enter your guess.");
        System.out.println("Enter" + "  " + " 0 : Exit " + " " +
                " 1 : Start Game");
        int choice = scan.nextInt();
        Start_game(choice);
        System.out.println("Enter " + " " + "0 : Exit" + "   " + "1 : Play Again ");
        choice = scan.nextInt();
        if (choice == 1) {
               Start_game(choice);
        } else {
            System.out.println("**______________________________________Thank You__________________________________**");
        }
    }
            public static void Start_game(int choice) {
                Scanner scan = new Scanner(System.in);

                int guess_no = 0;
                int Attemts = 0;
                int target_no;
                int stop = 0;
                if (choice == 1)
                {
                    System.out.println("                        Let's Start the game!              ");

                    target_no = Random_no();


                    while (stop != 10)
                    {
                        System.out.println("Enter your guess");

                        guess_no = scan.nextInt();
                        Attemts++;

                        if (guess_no > target_no) {
                            System.out.println("The number is to high.");


                        }
                        else if (guess_no < target_no)
                        {
                            System.out.println("The number is low");

                        }
                        else if (guess_no == target_no)
                        {
                            System.out.println("Congratulatons! You guess the correct number.");
                            System.out.println();
                            System.out.println("     It took you" + " " + Attemts + " " + "Attemts.");


                            if (Attemts <= 3) {
                                System.out.println("       Fantastic!");
                                System.out.println("       Your  score is : 50/50");
                                break;
                            } else if (Attemts > 3 && Attemts <= 6) {
                                System.out.println("      Excellent!");
                                System.out.println("      Your Score is : 30/50");
                                break;
                            } else if (Attemts>6 && Attemts<=9){
                                System.out.println("     very Good!");
                                System.out.println("     Your Score is : 20/50");
                                break;
                            }
                            else
                            {
                                System.out.println("     Good!");
                                System.out.println("     Your Score is : 10/50");
                                break;
                            }

                        }
                        stop++;

                    }




                }
                else
                {
                    System.out.println("*_______________________________Thank You___________________________________*");
                }

            }


    }








