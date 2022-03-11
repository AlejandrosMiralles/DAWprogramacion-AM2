package Formas;

public class Rectangulo extends Forma{
    int ladoMayor;
    int ladoMenor;

    void imprimir(){
        super.imprimir();
        System.out.println("Lado mayor: "+ladoMayor+"\tLado menor: "+ladoMenor);
    }

    int area(){ return ladoMayor * ladoMenor;}
    int perimetro(){ return 2*ladoMayor + 2*ladoMenor;}

    void aumentarEscala(float aumentoEn){
        ladoMayor*= aumentoEn;
        ladoMenor*= aumentoEn;
    }
}
