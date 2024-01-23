public class Aula {
    private String nomeAula;
    private Studente[] studenti;
    private int studCurr;
    private int studAula;

    public Aula(int studAula){
        studenti=new Studente[studAula];
        studCurr=0;
    }
    public Boolean isFull(){
        if(studCurr>=studenti.length){
            return true;
        }
        return false;
    }
    public Boolean addStudente(){
        if (isFull()){
            return false;
        }
        studCurr++;
        return true;
    }
}
