public class Asignatura {
 private double nota;
 private String nom;
    public Asignatura(String nom, double nota){
     this.nom=nom;
     this.nota=nota;
    }

 public double getNota() {
  return nota;
 }

 public String getNom() {
  return nom;
 }

 public void setNota(double nota) {
  this.nota = nota;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }

 public String mostrar(){
        return this.nom+" ("+this.nota+")";
 }
}
