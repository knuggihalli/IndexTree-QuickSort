/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexTreeShake;


import java.util.ArrayList;
import java.util.List;

public class IndexNode implements Comparable<IndexNode> {

	// The word for this entry
	String word;
	// The number of occurences for this word
	int occurences;
	// A list of line numbers for this word.
	List<Integer> list = new ArrayList<>(); 
	IndexNode left = null;
	IndexNode right = null;
	
	
	//Constructors
        public IndexNode(String word, int lineNumber){
            this.word = word;
            occurences = 0;
            list.add(lineNumber);
        }
        public IndexNode(){
            this.word = null;
            occurences = 0;
            list.add(0);
        }
	
	// Complete This
        @Override
	public int compareTo(IndexNode otherEntry) {
            return word.compareTo(otherEntry.word);
	}
	
	// Complete This
	// return the word and the lines it appears on.
	// string must be one line
        @Override
	public String toString(){
            String answer = word;
            if(list.isEmpty() == false){
                for(int i=0; i<list.size(); i++){
                    answer = answer+","+list.get(i);
                }
            }   
            return answer;
	}
	
	
	
}
