package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class EjerciciosExamen {
    
    private int arreglosn[];
    
//Ejercicio 1 ingresar un arreglo y sumarlo
    public void ejercicio1() {
        int suma=0;
        int elem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de cuanto va a ser el arreglo"));
        arreglosn = new int[elem];
        for (int i = 0; i < arreglosn.length; i++) {
            arreglosn[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los elementos"));
        }
        for (int i = 0; i < arreglosn.length; i++) {
            suma+=arreglosn[i];
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados es: "+suma);
    }
    
//Ejercicio 2 nombres y comparacion mayores a 18
    private String nombres[];
    private int edades[];
    
    public void ejercicio2(){
        nombres=new String[5];
        edades=new int[5];
        String acum="";
        
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre");
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        }
        for (int i = 0; i < edades.length; i++) {
            if(edades[i]>=18){
                    acum += "\n"+nombres[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Las personas mayores de edad son:"+acum);
    }
    
//Ejercicio 3 arreglo imprimir menor con mensaje
    private int arr[];
    
    public void ejercicio3(){
        int arrel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de cuanto va a ser el arreglo"));
        arr = new int[arrel];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los elementos del arreglo"));
        }
        int menor=arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<menor){
                menor=arr[i];
            }
        }
        Arrays.sort(arr);
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                JOptionPane.showMessageDialog(null, "El numero "+arr[i]+" se repite");
            }
        }
        JOptionPane.showMessageDialog(null, "El numero "+menor+" es el menor");
    }
    
//Ejercicio 4 nombre paises ordenados alfabeticamente
    private String paises[];
    
    public void ejercicio4(){
        paises=new String[5];
        String acump="";
        
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Ingrese los paises");
        }
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<4-i;j++) {
                if (paises[j].compareTo(paises[j+1])>0) {
                    String aux;
                    aux=paises[j];
                    paises[j]=paises[j+1];
                    paises[j+1]=aux;
                }
            }
        }
        
        for (int i = 0; i < paises.length; i++) {
            acump+="\n"+paises[i];
        }
        JOptionPane.showMessageDialog(null,"Los paises ordenados alfabeticamente son:"+acump);
    }
    
//Ejercicio 5 alumnos y notas de mayor a menor
    
    private String nombreAlu[];
    private float notas[];
    
    public void ejercicio5(){
    
        nombreAlu=new String[5];
        notas=new float[5];
        String acum="";
        
        for (int i = 0; i < nombreAlu.length; i++) {
            nombreAlu[i] = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota"));
        }
        
        for(int i=0;i<notas.length;i++) {
            for(int j=0;j<notas.length-1-i;j++) {
                if (notas[j]<notas[j+1]) {
                    
                    float auxnota;
                    auxnota=notas[j];
                    notas[j]=notas[j+1];
                    notas[j+1]=auxnota;
                    
                    String auxnombre;
                    auxnombre=nombreAlu[j];
                    nombreAlu[j]=nombreAlu[j+1];
                    nombreAlu[j+1]=auxnombre;
                }
            }
        }
        for(int i=0;i<notas.length;i++) {
            acum += nombreAlu[i]+" "+notas[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,"Nombre y nota del alumno ordenadas\n"+ acum);
    }
    
//Ejercicio 6 Ingresar nombres de paises con los habitantes, ordenar alfabeticamente, imprimir otra vez con la cantidad de habitantes
    
    private String pais[];
    private int hab[];
    
    public void ejercicio6(){
    
        pais=new String[5];
        hab=new int[5];
        String acumNombre="";
        String acumHab="";
        
        for (int i = 0; i < pais.length; i++) {
            pais[i] = JOptionPane.showInputDialog("Ingrese el nombre del pais");
            hab[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitantes"));
        }
        
        // Ordenado alfabeticamente
        for(int i=0;i<pais.length;i++) {
            for(int j=0;j<pais.length-1-i;j++) {
                if (pais[j].compareTo(pais[j+1])>0){
                    
                    int auxHab;
                    auxHab=hab[j];
                    hab[j]=hab[j+1];
                    hab[j+1]=auxHab;
                    
                    String auxPais;
                    auxPais=pais[j];
                    pais[j]=pais[j+1];
                    pais[j+1]=auxPais;
                }
            }
        }
        for(int i=0;i<pais.length;i++) {
            acumNombre += pais[i]+" "+hab[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,"Nombre del pais y habitantes ordenados alfabeticamente\n"+ acumNombre);
        
        //Ordenar por habitantes
        for(int i=0;i<hab.length;i++) {
            for(int j=0;j<hab.length-1-i;j++) {
                if (hab[j]<hab[j+1]){
                    
                    int auxHab;
                    auxHab=hab[j];
                    hab[j]=hab[j+1];
                    hab[j+1]=auxHab;
                    
                    String auxPais;
                    auxPais=pais[j];
                    pais[j]=pais[j+1];
                    pais[j+1]=auxPais;
                }
            }
        }
        for(int i=0;i<hab.length;i++) {
            acumHab += pais[i]+" "+hab[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,"Nombre del pais y habitantes ordenados de mayor a menor:\n"+ acumHab);
    }
    
    public void menu(){
        int opcion;
        do{
           opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar:"
                + "\n1) Ingresar elementos a un arreglo n e imprimir la suma"
                + "\n2) Ingresar 5 nombres con las edades y comparar si son mayores de edad"
                + "\n3) Ingresar elementos a un arreglo n y comparar el menor"
                + "\n4) Ingresar 5 paises y ordenarlos alfabeticamente"
                + "\n5) Ingresar 5 nombres de alumnos con sus notas y ordenarlas de mayor a menor"
                + "\n6) Ingresar 5 paises con sus habitantes e imprimir en orden alfabetico y tambien la cantidad de habitantes de mayor a menor"
                + "\n7) Salir del programa"));
            switch(opcion){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"ADIOS!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"La opcion ingresada no es valida");
                    break;
            } 
        }
        while(opcion!=7);
    }
}
