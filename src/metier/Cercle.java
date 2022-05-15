/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author samnd
 */
public class Cercle {
    private Point centre ;
    private double rayon;
    public Cercle(Point c, double r){
     this.centre = c; 
     this.rayon = r;
    
    }
    public Cercle(Point c, Point p){
      this.centre = c;
      this.rayon = centre.distance(p);
    }
    public double getSurface(){
        return Math.PI*rayon*rayon;
    }
    public double getPerimetre(){
        return 2*Math.PI*rayon;
    }
    public boolean appartient(Point p){
     double d=centre.distance(p);
     return(d<=rayon);
    }
    public String toString(){
      return ("Cercle("+centre.x+","+centre.y+","+rayon+")") ;
    }
    
    
}
