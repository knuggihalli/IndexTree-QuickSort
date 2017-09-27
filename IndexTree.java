/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexTreeShake;

public class IndexTree{

	// This is your root 
	private IndexNode root;
	
	// Make your constructor
	public IndexTree(){
            root = null;
        }
        
	// call your recursive add method
	public void add(String word, int lineNumber){
           root = add(root,word,lineNumber);
	}

	//your recursive method for add
	// Think about how this works
	// When you add the word to the index, if it already exists, you want to 
	// add it to the IndexNode that already exists
	// otherwise make a new indexNode
	private IndexNode add(IndexNode root, String word, int lineNumber){
            if(root == null){
               root = new IndexNode(word,lineNumber);
               return root;
            }else{
                int compare = word.compareTo(root.word);
                //System.out.println("compare "+word+" to "+root.word+" and "+compare);
                if(compare == 0){//same
                    root.list.add(lineNumber);
                    root.occurences++;
                    return root;
                }else if(compare < 0){//less
                    root.left = add(root.left,word,lineNumber);
                    return root;
                }else if(compare > 0){//more
                    root.right = add(root.right,word,lineNumber);
                    return root;
                }else{
                    return root;
                }
            }
	}

	// returns true if the word is in the index
	public boolean contains(String word){
            return false;
	}
	
	// call your recursive method
	public void delete(String word){
		
	}
	
	// your recursive case
	// remove the word and all the entries for the word
	private IndexNode delete(IndexNode root, String word){
		return null;
	}
	
	
	// prints all the words in the index in inorder order
	public void printIndex(){
            inOrder(this.root);
	}
	
	public static void main(String[] args){	
	}

    private void inOrder(IndexNode root) {
        if(root != null){
            inOrder(root.left);
            int oc;
            if(root.occurences == 0){
                oc = 1;
            }else{
                oc = root.occurences;
            }
            System.out.println("Word: ("+root.word+") # of times in book: "+oc);
            
            inOrder(root.right);
        }
    }
}