import java.util.Scanner;
public class task1 {
    Scanner in = new Scanner(System.in);
    int i,index,score=0,correct;
    static int numchoices,num;
    static String name;
    static String[] ques;
    static String[] choice;
            public void create(){

                System.out.println("enter the name of the quiz :");
                name =in.next();
                System.out.println("enter the number of questions :");
                num =in.nextInt();
                in.nextLine();

                ques = new String[num+1];
                for ( i = 1; i <=num ; i++) {
                    System.out.println("enter the question  :");
                    ques[i] = in.nextLine();
                    System.out.println("enter number of choices :");
                    numchoices = in.nextInt();
                    in.nextLine();

                    choice = new String[numchoices + 1];
                    for (i = 1; i <= numchoices; i++) {
                        System.out.println("enter choice " + (i) + " :");
                        choice[i] = in.nextLine();
                    }

                        /*for(String k : choice){
                            System.out.println(k);
                        }*/
                    System.out.println("enter the index of correct choice :");
                    index = in.nextInt();
                    in.nextLine();
                     //correct = choice[i];
                    correct = index;
                }
                //System.out.println(correct);
                System.out.println("Quiz created !");
            }
            public void take(){
                System.out.println("enter the name of the quiz:");
                String takename = in.next();
                if(takename.equals(name)){
                    for ( i = 1; i <=num ; i++) {
                        System.out.println("question "+i+" :" +ques[i]);
                        for (i = 1; i <=numchoices ; i++) {
                            System.out.println(i+"."+choice[i]);
                        }
                        System.out.println("enter your answer:");
                         int ans=in.nextInt();
                         if(ans==correct){
                             score++;
                             System.out.println("correct. \nyour score is "+score+" out of "+num);
                         }
                         else {
                             System.out.println("incorrect . the correct answer is "+correct+".");
                             System.out.println("your score is "+score+" out of "+num+".");
                         }
                    }
                }
                else System.out.println("Quiz not found");
            }
            public void view(){
                System.out.println("enter the name of the quiz:");
                String takename = in.next();
                if(takename.equals(name)){
                    for ( i = 1; i <=num ; i++) {
                        System.out.println("question "+i+" :" +ques[i]);
                        for (i = 1; i <=numchoices ; i++) {
                            System.out.println(i+"."+choice[i]);
                        }
                    }
                }
                else System.out.println("Quiz not found");
            }
            public void list(){
                System.out.println("quizzes :");
                System.out.println("- "+name);
            }
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String ch;
            task1 obj = new task1();
            boolean n=true;
            while(n){
                System.out.println("Enter a command : (create, take, view, list, exit)");
                ch=in.next();
                switch(ch){
                    case "create" :
                            obj.create();
                            break;
                    case "take" :
                            obj.take();
                            break;
                    case "view" :
                            obj.view();
                            break;
                    case "list" :
                            obj.list();
                            break;
                    case "exit" :
                        n=false;
                        break;
                }
            }
            System.out.println("---------------");
        }
    }

