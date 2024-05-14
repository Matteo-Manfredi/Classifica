public class App {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona("alberto",3);
        Persona p1 = new Persona("Gianno Beethoven",10);
        Persona p2 = new Persona("Giorgio",30);
        Persona p3 = new Persona("Giovanni",5);
        Persona[] ppl = {p,p1,p2,p3};
        Persona p4 = new Persona("Gioberto",4);
        System.out.println(p);
        GestioneClassifica clas = new GestioneClassifica(ppl);
        clas.InserisciPersona(p4);
        System.out.println(clas);
        clas.CancellaPersona("Giorgio");
        System.out.println("."+clas);
        GestioneClassifica media = clas.estrazionePersoneconPunteggioInferiore(clas.CalcoloMedia());
        System.out.println(media);
    }
}
