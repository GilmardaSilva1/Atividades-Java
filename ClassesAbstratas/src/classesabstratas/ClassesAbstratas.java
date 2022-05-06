
package classesabstratas;

public class ClassesAbstratas {

    
    public static void main(String[] args) {
        //Animal a = new Animal();
        
        Animal a = new Cachorro();
        a.falar();
        
        Animal g = new Gato();
        g.falar();
        
        Gato g1 = (Gato) g;
        g1.arranha();
        
        Animal a2 = new Vaca();
        a2.falar();
    }
    
}
