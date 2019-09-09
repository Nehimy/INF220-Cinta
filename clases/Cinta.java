package clases;

import java.util.Scanner;

//Declaramos la clase
public class Cinta{

  //Atributos de la clase
  char caractercito[];
  public int cabezal;
  int EOC;
  boolean pausa;
  
  //Constructor crea un objeto de la cinta
  public Cinta(int dimension){
    caractercito = new char [dimension];
    cabezal = -1;
    EOC = dimension;
    pausa = true;
  }
  
  /////////////////////////////
  /*Metodos de la clase cinta*/
  /////////////////////////////
  public boolean Pertenece(char caracter){
    char [] conjuntoDeCaracteres = {'a','b','c','e','i','o','u'};
    while(i <= conjuntoDeCaracteres.length){
      if(caracter == conjuntoDeCaracteres[i]){
        i = conjuntoDeCaracteres.length;
        return true;
      }else{
        return false;
      }
      i++;
    }
  }
  
  //Inserta un caracter en la cinta
  public void Grabar(char caracter){
    if(pausa){
      if (!(Pertenece(caracter))){
        System.out.println("Error: Caracter invalido");
        //Generally indicates unsuccessful termination.
        System.exit(1);
      }else{
        Avanzar();
        caractercito[cabezal] = caracter;
        System.out.println(caractercito[cabezal]);
      }
    }
  }
  
  //Devuelve el caracter donde esta el cabezal
  //Nombre alternativo Play
  public char SacarCaracter(){
    return caractercito[cabezal];
  }
  
  //Avanzar el cabezal a la siguiente position 
  public void Avanzar(){
    if (pausa){
      if(cabezal >= EOC-1){
        System.out.println("Error: cabezal en el final de cinta");
        System.exit(1);
      } else {
        cabezal++;
      }
    }

  } 
  
  //Devuelve todo el contenido
  public String SacarTodo(){
    String cadena = "";
    int contador = 0;
    while(contador<caractercito.length && caractercito[contador] != 0){
     cadena = cadena + caractercito[contador]+" ";
     contador++;
    }
    return cadena;
  }
  
  //Detiene el avance y mueve el cabezal a la position inicial
  public void Reiniciar(){
    cabezal= -1;
  }
  
  //Detener el avance del cabezal
  public void Detener(){
    pausa=!pausa;
  }
  
  //Mueve el cabezal hasta la siguiente position en blanco
  public void Siguiente(){
    if(cabezal >= EOC-1){
      Avanzar();
    }

  }
  
  //Mueve el cabezal a la position anterior en blanco
  public void Anterior(){
    if(pausa && cabezal > -1){
      cabezal--;
    }  
  }
  
 }
