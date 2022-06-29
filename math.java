import java.util.Scanner;

class math {     
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot és megmutatom az osztóit: ");

        int szam = scanner.nextInt();

        for (int i = 1; i < szam; i++) {
            if(szam%i==0){
                System.out.println(i+" osztója "+szam+"-nak/nek");
            }
        }


        scanner.close();
    }
    
}
