import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy oszlop és sor számot! :");

        int oszlop = scanner.nextInt() ;
        int sor = scanner.nextInt();
        int so= oszlop+sor;

        System.out.println("Milyen mátrixot akarsz látni? (1: főátló más, 2: mellékátló más ,3:mátrix)"); 

        int pozi= scanner.nextInt();

        switch (pozi){

        case 1 :
            for (int i = 0; i < oszlop; i++) {
                System.out.println();
                for (int j = 0; j < sor; j++) {
                    if(i==j)
                    System.out.print(1);
                
                    else 
                    System.out.print(0);}
                }
                break ;

        case 2 :       
        for (int i = 0; i < oszlop; i++) {
            System.out.println();
            for (int j = 0; j < sor; j++) {
                if(i+j==so+1)
                System.out.print(1);
                    else 
                System.out.print(0);}
            }
            break ; 
        case 3:
            for (int i = 0; i < oszlop; i++) {
                System.out.println();
                for (int j = 0; j < sor; j++) {
                    System.out.print(0);}
               
            }
            break;

            default :
            System.out.println("Milyen mátrixot akarsz látni? (1: főátló más, 2: mellékátló más ,3:mátrix)");
        }
        
        
        scanner.close();
    }
}