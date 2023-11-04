import java.util.*;
class grade{
    String nam;
    int sum,rollno;
    double per;
    Scanner sc=new Scanner(System.in);
    grade(){
        sum=0;
        rollno=0;
        per=0.0;
        nam="fgdsrfg";
    }
    void input(){     
        
        System.out.println("*******WELCOME TO GRADE CALCULATOR*******");
        System.out.println("ENTER YOUR NAME");
        nam=sc.nextLine();
        System.out.println("ENTER YOUR ROLL NUMBER");
        rollno=sc.nextInt();
        inputmarks();
    }
    void inputmarks(){
        System.out.println("\n\nENTER YOUR MARKS IN EACH SUBJECT");
        int i,arr[]=new int[5];
        String sub[]={"English","Maths","Science","Computer","History"};
        for(i=0;i<5;i++){
            System.out.print(sub[i]+"-");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        cal(arr);
    }
    void cal(int arr[]){
        int i;
        for(i=0;i<5;i++){
            sum+=arr[i];
        }
        per=(sum*100)/500;
        display();
    }
    void display(){
        System.out.println("\n\nNAME-"+nam+"\nROLL NUMBER-"+rollno+"\nTOTAL MARKS-"+sum+"/500"+"\nAVERAGE PERCENTAGE-"+(double)per+"%");
        if(per<100 && per>=85)
        System.out.println("GRADE-A\nPASS");
        else if(per<85 && per>=70)
        System.out.println("GRADE-B\nPASS");
        else if(per<70 && per>=55)
        System.out.println("GRADE-C\nPASS");
        else if(per<55 && per>=40)
        System.out.println("GRADE-D\nPASS");
        else if(per<40)
        System.out.println("GRADE-E\nFAIL");
    }
    public static void main(String args[]){
        grade ob=new grade();
        ob.input();        
    }
    }