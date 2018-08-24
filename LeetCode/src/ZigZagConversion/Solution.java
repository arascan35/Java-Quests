package ZigZagConversion;

public class Solution {
	public String convert(String s, int numRows){
		
		StringBuilder sb = new StringBuilder(s);
		
		int numOfChar=sb.length();
	
		int numColumn=sb.length(); // max column num
		int counter=0;
		int j=0;
		int i=0;	
		
		char [][] solutionMatrix = new char[numRows][numColumn];
		
		while(i<numColumn && counter !=numOfChar){
			if(j==0){
				while (j<numRows  && counter !=numOfChar) {
					solutionMatrix[j][i] = sb.charAt(counter);
					//System.out.println("j= "+j+" i= "+i);
					//System.out.println(sb.charAt(counter));
					counter++;
					j++;
				}
				j--;
			}
			i++; //increase column
			j--; // decrease row
			if(j!=0){
				solutionMatrix[j][i] = sb.charAt(counter);
				//System.out.println("j= "+j+" i= "+i);
				//System.out.println(sb.charAt(counter));
				counter++;
			}
		}
		StringBuilder sb2 = new StringBuilder();
		for (int k = 0; k < numRows; k++) {
			for (int k2 = 0; k2<numColumn; k2++) {
				if(solutionMatrix[k][k2]!=0){
					//System.out.println(k+" "+k2+" "+solutionMatrix[k][k2]);
					sb2.append(solutionMatrix[k][k2]);
				}
				
			}
		}
		
		return sb2.toString();
	}
}
