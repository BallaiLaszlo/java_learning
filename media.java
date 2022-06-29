import java.util.Scanner;

class matek{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int i=0;
        int x=0;
        double med=0;
        double y=0;

        while (true){
            x=scanner.nextInt();
            i++;
            y=x+y;
            med=y/i;
                System.out.println("A media: "+med);

        }
    
    }

}