/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author alsul
 */
public class VotingMachineTest extends VotingMachine {
    public static void main(String[] args){
        VotingMachine poll = new VotingMachine();
        poll.addCandidate("khalil");
        poll.addCandidate("maoid");
        poll.addCandidate("mohanad");
        
        poll.castVote("khalil");
        poll.castVote("khalil");
        poll.printResult();
    }
   
}
