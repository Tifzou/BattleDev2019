/*******
 * Read input from System.in
/*******
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ***/
package com.isograd.exercise;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IsoContest {
public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
		int i=0;
		int N=0;
		int POIDS_MAX=100;
		LinkedList<Integer> cartons=new LinkedList<Integer>();
		
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			if(i==0){
			    N=Integer.parseInt(line);
			}else{
			    if(i>N+1){
			        break;
			    }
			    cartons.add(Integer.parseInt(line));
			}
			i++;
		}
		
		int somme=0;
		int allerRetour=0;
		int index=0;
		
		while(!cartons.isEmpty()){
		    int poidsCarton=(int)cartons.poll();
		    somme+=poidsCarton;
		    if(somme>POIDS_MAX){
		        allerRetour++;
		        somme=0;
		        cartons.add(poidsCarton);
		    }
		}
		if(somme>0){
		    allerRetour++;
		}
		System.out.println(allerRetour);
	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
	}
}