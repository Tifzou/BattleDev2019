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
		int classement=0;
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			if(i>0){
				String[] lectVal=line.split(" ");
				System.err.println(lectVal[0]+'|'+lectVal[1]); 
				int depassees=Integer.parseInt(lectVal[0]); 
				int depassement=Integer.parseInt(lectVal[1]);
				classement = classement + depassees - depassement;
			}else{
				classement=Integer.parseInt(line);
				System.err.println(classement); 
			}
			i++;
		}
        System.err.println(classement);

		if(classement >= 10000)
        {
            System.out.println("KO");
        }
        else if(classement < 10000 && classement > 100)
        {
            System.out.println(100);
        }
        else // classement <= 100
        {
            System.out.println(1000);
        }
	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
	}
}