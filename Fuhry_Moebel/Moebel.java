
/**
 * 
 *
 * @author Rene Fuhry
 */
public class Moebel
{
    private String bezeichnung;
    private int laenge;
    private int breite;
    private int posX;
    private int posY;
    private int gewicht;
    private boolean beweglich;

    public Moebel()
    {
        setBezeichnung("Kasten");
        setLaenge(70);
        setBreite(50);
        setPosX(0);
        setPosY(0);
        setGewicht(10);
        setBeweglich(true);
    }
    
    public Moebel(String bezeichnung, int laenge, int breite, int posX, int posY, int gewicht, boolean bewglich)
    {
        setBezeichnung("Kasten");
        setLaenge(70);
        setBreite(50);
        setPosX(0);
        setPosY(0);
        setGewicht(10);
        setBeweglich(true);
    }
    
    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public int getLaenge() {
        return laenge;
    }
    
    public int getBreite() {
        return breite;
    }
    
    public int getPosX() {
        return posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
    public int getGewicht() {
        return gewicht;
    }
    
    public boolean getBeweglich() {
        return beweglich;
    }
    
    public void setBezeichnung(String bezeichnungNeu) {
        if(bezeichnungNeu != null) {
            bezeichnung = bezeichnungNeu;
        }
        else {
            System.out.println("setBezeichnung: bezeichnungNeu can't be null");
        }
    }
    
    public void setLaenge(int laengeNeu) {
        if(laengeNeu > 0) {
            laenge = laengeNeu;
        }
        else {
            System.out.println("setLaenge: laengeNeu must be positive");
        }
    }
    
    public void setBreite(int breiteNeu) {
        if(breiteNeu > 0) {
            breite = breiteNeu;
        }
        else {
            System.out.println("setBreite: breiteNeu must be positive");
        }
    }
    
    public void setPosX(int posXNeu) {
        if(posXNeu >= 0) {
            if((posXNeu + laenge) - 500 <= 0) {
                posX = posXNeu;
            }
            else {
            System.out.println("setPosX: invalid position");
            }
        }
        else {
            System.out.println("setPosX: can't be negative");
        }
    }
    
    public void setPosY(int posYNeu) {
        if(posYNeu >= 0) {
            if(posYNeu + breite <= 400) {
                posY = posYNeu;
            }
            else {
            System.out.println("setPosY: invalid position");
            }
        }
        else {
            System.out.println("setPosY: can't be negative");
        }
    }
    
    public void setGewicht(int gewichtNeu) {
        if(gewichtNeu >= 0) {
            gewicht = gewichtNeu;
        }
        else {
            System.out.println("setGewicht: gewichtNeu can't be negative");
        }
    }
    
    public void setBeweglich(boolean beweglichNeu) {
        beweglich = beweglichNeu;
    }
    
    public void verschieben(int umX, int umY) {
        if(beweglich == true) {
            if(posX + laenge + umX <= 500 && posX - umX <= 0) {
                posX = posX + umX;
            }
            else {
                System.out.println("verschieben: invalid move");
            }
            if(posY + breite + umY <= 400 && posY - umY <= 0) {
                posY = posY + umY;
            }
            else {
                System.out.println("verschieben: invalid move");
            }
        }
        else {
            System.out.println("verschieben: Moebel not beweglich");
        }
    }
    
    public String toString() {
        String s;
        s = bezeichnung + " mit laenge von " + laenge + " cm, breite von " + breite + " cm, X-Position von " + posX + " cm, Y-Position von " + posY + " cm, wiegt " + gewicht + " kg und ist";
        
        if(beweglich == true) {
            s = s + " beweglich";
        }
        else {
            s = s + " nicht beweglich";
        }
        
        return s;
    }
}