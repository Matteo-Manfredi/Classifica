public class Persona {
    private String nome;
    private int punti;

    public Persona() {
        
    }

    public Persona(String nome, int punti){
        this.nome=nome;
        setPunti(punti);
    }
    //coglione
    public Persona getPersona(){
        return this;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPunti(){
        return this.punti;
    }
    
    public void setNome(String nuovo){
        this.nome = nuovo;
    }

    public void setPunti(int nuovo){
        if(nuovo>0 && nuovo<=10){
            this.punti = nuovo;
        }
    }
    

    public String toString(){
        String s;
        s= "Nome:  "+this.nome+"      Punti:  "+this.punti;
        return s;
    }
}
