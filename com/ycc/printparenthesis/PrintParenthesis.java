package com.ycc.printparenthesis;
//Print all combination of parenthesis
public class PrintParenthesis {
	public static void printCombination(int leftParenthesis, int rightParenthesis, String outputCombination){
		if(rightParenthesis == 0){
			System.out.println(outputCombination);
			return;
		}
		if(leftParenthesis > 0){
			printCombination(leftParenthesis-1,rightParenthesis,outputCombination+"(");
			if(leftParenthesis < rightParenthesis){
				printCombination(leftParenthesis,rightParenthesis-1,outputCombination+")");
			}
		}else
			printCombination(leftParenthesis,rightParenthesis-1,outputCombination+")");
		
	}
	public static void main(String [] args){
		PrintParenthesis.printCombination(3, 3, "");
	}
}
