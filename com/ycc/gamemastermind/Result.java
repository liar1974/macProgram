package com.ycc.gamemastermind;

public class Result {
	public int hits = 0;
	public int pseudoHits = 0;
	
	public String toString(){
		return "("+hits+","+pseudoHits+")";
	}
}
