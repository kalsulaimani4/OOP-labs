/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Vector;

public class VotingMachine {
    Vector<String> CandidateList= new Vector();
    Vector<Integer> CandidateVote = new Vector();
    
    public void addCandidate(String name){
        CandidateList.add(name);
    }
    
    
            
    public void castVote(String name){
        int index =CandidateList.indexOf(name);
    }
    
    public void printResult(){
        for(int i=0;i<CandidateList.size();i++){
           System.out.println("candidate "+CandidateList.get(i)+" has "+CandidateVote.get(i)+" votes ");
        }
    }
    
    
}
