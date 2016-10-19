/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class ResumeHistory {
    private ArrayList <Resume> resumeHistory;


    public ResumeHistory() {
        resumeHistory = new ArrayList <Resume> ();
    }
    
    public ArrayList<Resume> getResumeHistory() {
        return resumeHistory;
    }

    public void setResumeHistory(ArrayList<Resume> resumeHistory) {
        this.resumeHistory = resumeHistory;
    }
    
    public void addResume(Resume res)
    {
        resumeHistory.add(res);
    }
    public void deleteResume(Resume res)
    {
        resumeHistory.remove(res);
    }
    
    
}
