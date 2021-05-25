package br.com.javacore.Bintroducaometodos.classes;

public class Estudante {

   public String nome;
   public int idade;
   public double[] notas;


   public void print(){
      System.out.println(this.nome);
      System.out.println(this.idade);
      for (double nota : notas){
         System.out.println(nota);
      }
   }

   public void tirarMedia(){
      double media = 0;
      for (double nota : notas){
         media += nota;

      }
      media = media / notas.length;

      if (media > 6){
         System.out.println("Media final: "+media + ", Estudante aprovado !!!");
      }else{
         System.out.println("Estudante reprovado, média final: "+ media);
      }
   }

}
