 import java.util.Scanner;
public class main
{
    public static void  main(String []args){
        boolean playing =true;
           int cw=0;
           int cd=0;
           int cl=0;
           
        Scanner scanner = new Scanner(System.in);
         while (playing==true){
            System.out.println("welcome to rock paper scissors");
            System.out.println("enter rock, paper, or scissors");
            String play = scanner.nextLine();
            int test = 0;
            String a= "";
            if (true==play.contentEquals("rock")){
                System.out.println("you: rock");
                if ((c())==1){
                    System.out.println("computer: rock"); 
                    cd=cd(cd);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==2){
                    System.out.println("computer: paper");
                    cl=cl(cl);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==3){
                    System.out.println("computer: scissors");
                    cw=cw(cw);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }
            }else if (true==play.contentEquals("paper")){
                System.out.println("you: paper");
                if ((c())==1){
                    System.out.println("computer: rock");
                    cw=cw(cw);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==2){
                     System.out.println("computer: paper");
                     cd=cd(cd);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==3){
                     System.out.println("computer: scissors");
                    cl=cl(cl);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }
            }else if (true==play.contentEquals("scissors")){
                System.out.println("you: scissors");
                if ((c())==1){
                    System.out.println("computer: rock");
                    cl=cl(cl);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==2){
                    System.out.println("computer: paper");
                    cw=cw(cw);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }else if ((c())==3){
                     System.out.println("computer: scissors");
                     cd=cd(cd);
                    System.out.println("wins: "+cw+" loses: "+cl+" duals: "+cd);
                }
            }else{
                System.out.println("you did not enter rock, paper, or scissors");
            }
           
            
            System.out.println("do you want to play again (yes/no)");
            String again = scanner.nextLine();
            if (true==again.contentEquals("yes")){
                playing=true;
            }else if (true==again.contentEquals("no")){
                playing=false;
            }
        }
         
            System.out.println("thanks for playing");
    }
    
    public static int c(){
            int p= ran();
            return p;
    }
    
     public static int ran(){
        int min = 1;
        int max = 3;
        int num = (int)(Math.random() * (max - min + 1)) + min; 
        return num;
    }
    
    public static int cw (int c){
        c++; 
        return c;
    }
    
    public static int cl (int c){
        c++; 
        return c;
    }
    
    public static int cd (int c){
        c++;
        return c;
    }
    
}
