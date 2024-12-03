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
            
            if (true==play.contentEquals("rock")){
                System.out.println("you: rock");
                System.out.println(rock(cw,cd,cl));
            }else if (true==play.contentEquals("paper")){
                System.out.println("you: paper");
                System.out.println(paper(cw,cd,cl));
            }else if (true==play.contentEquals("scissors")){
                System.out.println("you: scissors");
                System.out.println(scissors(cw,cd,cl));
            }else{
            System.out.println("did not enter rock, paper, or scissors");
            }
           
            
            System.out.println("do you want to play again ");
            String again = scanner.nextLine();
            if (true==again.contentEquals("yes")){
            playing=true;
            }else if (true==again.contentEquals("no")){
            playing=false;
            }
        }
         
            System.out.println("thanks for playing");
    }
    
    public static String rock(int w, int d, int l){
            String p= set(ran());
            String a="";
            if (true==p.contentEquals("rock")){
                a="computer: rock \ndual\nwins: "+w+" loses: "+l+" duals: "+cd(d);   
            }else if (true==p.contentEquals("paper")){
                a="computer: paper \nyou lose\nwins: "+w+" loses: "+cl(l)+" duals: "+d; 
         }else if (true==p.contentEquals("scissors")){
                a="computer: scissors \nyou win\nwins: "+cw(w)+" loses: "+l+" duals: "+d;  
            }
            return a;
    }
    
    public static String paper(int w, int d, int l){
     String p= set(ran());
            String a="";
            if (true==p.contentEquals("rock")){
                a="computer: rock \nyou win\nwins: "+cw(w)+" loses: "+l+" duals: "+ d;
            }else if (true==p.contentEquals("paper")){
                a="computer: paper \ndual\nwins: "+w+" loses: "+l+" duals: "+cd(d);  
         }else if (true==p.contentEquals("scissors")){
                a="computer: scissors \nyou lose\nwins: "+w+" loses: "+cl(l)+" duals: "+d; 
            }
            return a;
    }
    
    public static String scissors(int w, int d, int l){
     String p= set(ran());
            String a="";
            if (true==p.contentEquals("rock")){
                a="computer: rock \nyou lose\nwins: "+w+" loses: "+cl(l)+" duals: "+d;  
            }else if (true==p.contentEquals("paper")){
                a="computer: paper \nyou win\nwins: "+cw(w)+" loses: "+l+" duals: "+d;  
         }else if (true==p.contentEquals("scissors")){
                a="computer: scissors \ndual\nwins: "+w+" loses: "+l+" duals: "+cd(d);  
            }
            return a;
    }
    
     public static int ran(){
        int min = 1;
        int max = 3;
        int num = (int)(Math.random() * (max - min + 1)) + min; 
        return num;
    }
     public static String set(int num){
        String p="";
         if (num==1){
        p="rock";
        }else if (num==2){
        p = "paper";
        }else if (num==3){
        p="scissors";
        }
        return p;
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
    //add count funtion
}
