
/**
 * 
 *
 * @author (your name)
 */
public class TestMoebel {
    public static void test() {
        Moebel m;
        
        m = new Moebel();
        System.out.println(m);
    }
    
    public static void test1() {
        Moebel m;
        
        m = new Moebel();
        m.setBeweglich(false);
        m.verschiebe(1,1);
    }
    
    public static void test2() {
        Moebel m;
        
        m = new Moebel("Tisch", 120, 90, 250, 200, 6, true, 500, 400);
        System.out.println(m);
        
        m.verschiebe(10,10);
        System.out.println(m);
        
        m.verschiebe(-10,-10);
        System.out.println(m);
        
        m.verschiebe(-251, -201);
        m.verschiebe(-250, -200);
        System.out.println(m);
        
        m.verschiebe(381,311);
        m.verschiebe(380,310);
        System.out.println(m);
    }
}

