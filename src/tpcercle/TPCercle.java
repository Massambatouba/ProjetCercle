/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcercle;

import metier.Cercle;
import metier.Point;

/**
 *
 * @author samnd
 */
public class TPCercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p = new Point(100,100);
      Cercle C1 = new Cercle(p, 50);
      Cercle C2 = new Cercle(new Point(150,150), new Point(200,200));
        System.out.println(" Périmetre du "+C1.toString()+" est: "+ C1.getPerimetre());
        System.out.println("La surface du "+ C2.toString()+ " est: " + C2.getSurface());
        Point p1 = new Point(130, 130);
        if((C1.appartient(p1)==true)&&(C2.appartient(p1)))
            System.out.println(p+" apparrtient) à l'intersection du "+C1+ " et "+C2);
            else
            System.out.println(p+" n'apparrtient pas) à l'intersection du "+C1+ " et "+C2);
    }
}
