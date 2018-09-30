/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico_poo;

import imprimir.Datosperso;
import imprimir.Temperatura;
import imprimir.aritmeticas;
import imprimir.imprime;
import java.util.Scanner;

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Examen_Practico_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner yolo = new Scanner (System.in);

        System.out.println("Convertiremos un numero entero a texto ");
        imprime xs = new imprime ();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0-99: "); 
        int num = scanner.nextInt();
        
        if(num>=0 && num<11)
             System.out.print('\n' + xs.getUnidades() [num]);         
        else if(num<20)
            System.out.print('\n' + xs.getYolo()[num-11]);     // Aqui mostramos los numeros especiales   
        
         else if(num<100){
            int unid = num % 10;
            int dec = num/10;          // Descomponemos el numero y guardamos los digitos
            if(unid == 0)              // Por ejemplo el 11 lo dividimos entre 10 entonces queda 1 y ya lo sumamos
                
                System.out.print('\n' + xs.getDecenas()[dec-2]);                
            else
                System.out.print('\n' + xs.getDecenas()[dec-2] + " y " + xs.getUnidades()[unid]);
        }
        else            
            System.out.print("El numero debe ser menor a 100");
        

        System.out.println("\n");
        System.out.println("____________________");
        System.out.println(" Segunda parte ");
        double form1;
        System.out.println("Ahora convertiremos de Fahrenheit a Celsius  ");
        Temperatura po = new Temperatura();
        System.out.println("Dame la temperatura Fahrenheit: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula C= (F-32)*5/9");
        form1= (po.getTempe() -32)*0.55;  
        System.out.println( po.getTempe()+ "F " + " Equivale a  " +form1 +" C");
        
        
        System.out.println("______________");
        
        
        System.out.println("Ahora de Celsius a Fahrenheit: ");
        System.out.println(" Dame la temperatura en Celsius: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula F= (9/5)C+32 ");
        form1=  (1.8*po.getTempe()+32);
        System.out.println( po.getTempe() + "C " + " Equivale a " +form1 + " F");
        
        System.out.println("______________");
        
        System.out.println("Ahora de Celsius a Kelvin");
        System.out.println(" Dame la temperatura en Celsius: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula K=C+273");
        form1= po.getTempe()+273;
        System.out.println(po.getTempe() + "C " + " Equivale a " +form1 + "K ");
        
        
        System.out.println("\n");
        System.out.println("____________________");
        
        System.out.println(" Tercera parte ");
        int acumulador=0,ac=0,ac2=0,suma;
        System.out.println("Ahora sumaremos n cantidad de numeros");
        aritmeticas pe= new aritmeticas(); 
        
        
        System.out.println("Dame la cantidad de n numeros que sumaras ");
        pe.setNnum(yolo.nextInt());
        for(int x=1; x<=pe.getNnum(); x++){
            System.out.println("Dame un numero");
            pe.setAcum(yolo.nextInt());
        acumulador=acumulador + pe.getAcum();
        if(x==1){
        ac=pe.getAcum();   //
        }
        if(x==pe.getNnum()){
            ac2=pe.getAcum();
        }
            System.out.println("");
            System.out.println("La posicion " +x + "Esta el numero" +pe.getAcum());
        }
        suma= ((ac+ac2)*pe.getNnum())/2;
        System.out.println("N canitdades es " +pe.getNnum());
        System.out.println("A1 es " +ac);
        System.out.println("An " +ac2);
        System.out.println("La suma es " +acumulador);
        
        System.out.println("___________________");
        System.out.println(" Cuarta parte ");
        int dia,mes,año;
        String mes1;
        Datosperso xd= new Datosperso();
        System.out.println("Ahora tomaremos tus datos ");
        
        
        System.out.println("Empezemos ");
        xd.setNombre(yolo.nextLine()); 
        System.out.println("Dame tu nombre ");
        xd.setNombre(yolo.nextLine()); 
        System.out.println("Dame tu apellido paterno ");
        xd.setApepat(yolo.nextLine());
        System.out.println("Dame tu apellido materno ");
        xd.setApemat(yolo.nextLine());
        System.out.println("Dame tu dirección ");
        xd.setDirec(yolo.nextLine());
        System.out.println("Dame tu sexo ");
        xd.setSexo(yolo.nextLine());
        System.out.println("Dame tu ciudad ");
        xd.setCiudad(yolo.nextLine());
        System.out.println("Dame tu correo electronico ");
        xd.setCorreo(yolo.nextLine());
        System.out.println("Dame tu edad ");
        xd.setEdad(yolo.nextInt());
        System.out.println("Dame tu numero de control ");
        xd.setNc(yolo.nextDouble());
        
        

        System.out.println("Dame tu dia de nacimiento ");
        xd.setCumpleaños(yolo.nextInt());
        dia= xd.getCumpleaños();
        
        
        
        System.out.println("Dame tu mes de nacimiento ");
        xd.setCumpleaños(yolo.nextInt());
        mes=xd.getCumpleaños();
        System.out.println("Dame tu año de nacimiento ");
        xd.setCumpleaños(yolo.nextInt());
        año= xd.getCumpleaños();
        if(mes==1){
        mes1="Enero";
        }else if(mes==2){
          mes1="Febrero";  
        }else if(mes==3){
        mes1="Marzo";
        }else if(mes==4){
        mes1="Abril";
        }else if(mes==5){
            mes1="Mayo";
        }else if(mes==6){
            mes1="Junio";
        }else if(mes==7){
            mes1="Julio";
        }else if(mes==8){
            mes1="Agosto";
        }else if(mes==9){
            mes1="Septiembre";
        }else if(mes==10){
            mes1="Octubre";
        }else if(mes==11){
            mes1="Noviembre";
        }else if(mes==12){
            mes1="Diciembre";
        }else{
            System.out.println("No existe la fecha ");
        mes1="No existe";
        }
        
        
        
        System.out.println(" Tus datos son " +xd.getNombre() +" " +xd.getApemat() +" " +xd.getApemat() +"Tu edad es " +xd.getEdad() +" tu sexo es " +xd.getSexo());
        System.out.println("Tu fecha de nacimiento es "+dia +" de "+mes1 + "de "+año);
        System.out.println(" Tu dirección es " +xd.getDirec() + " La ciudad que naciste es " +xd.getCiudad() + " Tu correo es " +xd.getCorreo());
        
        
        
    }
    
}
