/*******
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ***/
package com.isograd.exercise;
import java.util.*;

public class IsoContest {
public static void main( String[] argv ) throws Exception {
	String  line;
    Scanner sc = new Scanner(System.in);
    int N=Integer.parseInt(sc.nextLine());
    char[][] mat= new char[N][N];
    int lineIndex=0;
    while(sc.hasNextLine()) {
        line = sc.nextLine();
        for(int i=0;i<N;i++){
            mat[lineIndex][i]=line.charAt(i);
        }
        lineIndex++;
    }
}
