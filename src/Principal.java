/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
import javax.swing.JOptionPane;
public class Principal {
    // atributos
    int n1;
    int n2; 
    int n3; 
    int comparacion;
    
    
    //metodos
    
    //metodo para pedir datos 
    
    public void leerNumeros(){
        n1=Integer.parseInt(JOptionPane.showInputDialog("digita el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("digita el segundo numero"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("digita el tercer numero"));
    }
    
    public void comparacion(){
        if(n1==n2 && n1==n3){
            System.out.println("los numero son iguales");
        }else if(n1>n2){
            if(n1>n3){
                System.out.println("el numero mayor es el "+n1);
            }else {
                System.out.println("el numero mayor es el "+n3);
            }
        }else if(n2>n3)
        {
            System.out.println("el numero mayor es "+n2);
            
        }else{
            System.out.println("el numero mayor es "+n3);
        }
    }
}
