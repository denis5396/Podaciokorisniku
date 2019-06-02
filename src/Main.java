import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        do{
            String imePrezime = input.nextLine();
            String brojTelefona = input.nextLine();
            String adresa = input.nextLine();
        try{
            Datum datumObj = new Datum(5,3,1996);
            System.out.println("");
            Osoba osobaObj = new Osoba(imePrezime, datumObj, brojTelefona , adresa);

            osobaObj.setAdresa("dsds");

            System.out.print(osobaObj.getImePrezime());
            System.out.println("");
            System.out.print(osobaObj.getBrojTelefona());
            System.out.println("");
            System.out.print(osobaObj.getAdresa());
            x = 2;

        }catch (Exception e){
            System.out.println("Pokusajte opet.");
        }
    }while(x == 1);
    }

}



