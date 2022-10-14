
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
    private int roomLength;
    private int roomWidth;

    public Moebel()
    {
        setRoomLength(500);
        setRoomWidth(400);
        setBezeichnung("Kasten");
        setLaenge(70);
        setBreite(50);
        setPosX(0);
        setPosY(0);
        setGewicht(10);
        setBeweglich(true);
    }
    
    public Moebel(String bezeichnung, int laenge, int breite, int posX, int posY, int gewicht, boolean beweglich, int roomLength, int roomWidth)
    {
        setRoomLength(roomLength);
        setRoomWidth(roomWidth);
        setBezeichnung(bezeichnung);
        setLaenge(laenge);
        setBreite(breite);
        setPosX(posX);
        setPosY(posY);
        setGewicht(gewicht);
        setBeweglich(beweglich);
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
    
    public int getRoomLength() {
        return roomLength;
    }
    
    public int getRoomWidth() {
        return roomWidth;
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
            if((posXNeu + laenge) - roomLength <= 0) {
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
            if(posYNeu + breite <= roomWidth) {
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
    
    public void setRoomLength(int roomLengthNew) {
        if(roomLengthNew >= laenge) {
            roomLength = roomLengthNew;
        } else {
            System.out.println("setRoomLenght: room can't be smaller than Moebel");
        }
    }
    
    public void setRoomWidth(int roomWidthNew) {
        if(roomWidthNew >= breite) {
            roomWidth = roomWidthNew;
        } else {
            System.out.println("setRoomWidth: room can't be smaller than Moebel");
        }
    }
    
    public void verschiebe(int umX, int umY) {
        if(beweglich) {
            if(posX + laenge + umX <= roomLength && posX + umX >= 0 && posY + breite + umY <= roomWidth && posY + umY >= 0) {
                setPosX(posX + umX);
                setPosY(posY + umY);
            }
            else {
                System.out.println("verschieben: invalid move");
            }
        }
        else {
            System.out.println("verschieben: Moebel not beweglich");
        }
    }
    
    public void showRoomSize() {
        System.out.println("Room lenght: " + roomLength + ", room width: " + roomWidth);
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