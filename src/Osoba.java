public class Osoba {
    private String imePrezime, brojTelefona, adresa;
    private Datum datumRodjenja;

    private boolean jeLiSlovo(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' ' ) return true;
        else return false;

    }
    private boolean jeLiImePrezimeOk(String imePrezime) {
        int i = 0;
        while(i < imePrezime.length()){
            if(!jeLiSlovo(imePrezime.charAt(i))) return false;
            while (i < imePrezime.length() && jeLiSlovo(imePrezime.charAt(i))) {
                i++;
            }

        }
        return true;}

    private Osoba(){

    }
    public Osoba(String imePrezime, Datum datumRodjenja, String brojTelefona, String adresa) throws Exception{

        if(!jeLiImePrezimeOk(imePrezime)){
            System.out.println("Niste unijeli tacan podatak.");
            throw new Exception();

        }
        if(jeLiImePrezimeOk(imePrezime)){
            this.imePrezime = imePrezime;
        }
        this.brojTelefona = brojTelefona;
        this.adresa = adresa;
        this.datumRodjenja = datumRodjenja;

    }

    public void setImePrezime(String imePrezime){
        if(jeLiImePrezimeOk(imePrezime)){
            this.imePrezime = imePrezime;
        }

    }

    public void setAdresa(String adresa){
        this.adresa = adresa;
    }
    public void setBrojTelefona(String brojTelefona){
        this.brojTelefona = brojTelefona;
    }

    public String getImePrezime(){
        return this.imePrezime;
    }
    public String getAdresa(){
        return this.adresa;
    }

    public String getBrojTelefona(){
        return this.brojTelefona;
    }

    public Datum getDatumRodjenja(){
        return this.datumRodjenja;
    }


    }

