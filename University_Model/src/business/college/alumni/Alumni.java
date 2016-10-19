/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.alumni;

/**
 *
 * @author nithinkartha
 */
public class Alumni {

    private EmployedDirectory employedDirectory;
    private UnemployedDirectory unemployedDirectory;
    private HigherStudiesDirectory higherStudiesDirectory;

    private AcceptedStudentsDirectory acceptedStudentsDirectory;
    private RejectedStudentsDirectory rejectedStudentsDirectory;

    public Alumni() {
        employedDirectory = new EmployedDirectory();
        unemployedDirectory = new UnemployedDirectory();
        higherStudiesDirectory = new HigherStudiesDirectory();

        acceptedStudentsDirectory = new AcceptedStudentsDirectory();
        rejectedStudentsDirectory = new RejectedStudentsDirectory();
    }

    public AcceptedStudentsDirectory getAcceptedStudentsDirectory() {
        return acceptedStudentsDirectory;
    }

    public void setAcceptedStudentsDirectory(AcceptedStudentsDirectory acceptedStudentsDirectory) {
        this.acceptedStudentsDirectory = acceptedStudentsDirectory;
    }

    public RejectedStudentsDirectory getRejectedStudentsDirectory() {
        return rejectedStudentsDirectory;
    }

    public void setRejectedStudentsDirectory(RejectedStudentsDirectory rejectedStudentsDirectory) {
        this.rejectedStudentsDirectory = rejectedStudentsDirectory;
    }

    public EmployedDirectory getEmployedDirectory() {
        return employedDirectory;
    }

    public void setEmployedDirectory(EmployedDirectory employedDirectory) {
        this.employedDirectory = employedDirectory;
    }

    public UnemployedDirectory getUnemployedDirectory() {
        return unemployedDirectory;
    }

    public void setUnemployedDirectory(UnemployedDirectory unemployedDirectory) {
        this.unemployedDirectory = unemployedDirectory;
    }

    public HigherStudiesDirectory getHigherStudiesDirectory() {
        return higherStudiesDirectory;
    }

    public void setHigherStudiesDirectory(HigherStudiesDirectory higherStudiesDirectory) {
        this.higherStudiesDirectory = higherStudiesDirectory;
    }

    public float employedPercentage() {
        float empPercentage = 0;
        int totalNum = employedDirectory.getEmployedDirectory().size() + unemployedDirectory.getUnemployedDirectory().size() + higherStudiesDirectory.getHigherStudiesDirectory().size();

        if (employedDirectory.getEmployedDirectory().isEmpty()) {
            return empPercentage;
        } else {
            int numberOfEmployed = employedDirectory.getEmployedDirectory().size();

            empPercentage = ((float)numberOfEmployed / (float)totalNum ) * 100 ;

        }
        return empPercentage;
    }

    public float unemployedPercentage() {
        float unempPercentage = 0;
        int totalNum = employedDirectory.getEmployedDirectory().size() + unemployedDirectory.getUnemployedDirectory().size() + higherStudiesDirectory.getHigherStudiesDirectory().size();

        if (unemployedDirectory.getUnemployedDirectory().isEmpty()) {
            return unempPercentage;
        } else {
            int numberOfUnEmployed = unemployedDirectory.getUnemployedDirectory().size();

            unempPercentage = ( (float)numberOfUnEmployed / (float)totalNum ) * 100;

        }
        return unempPercentage;
    }

    public float higherPercentage() {
        float higherPercentage = 0;
        int totalNum = employedDirectory.getEmployedDirectory().size() + unemployedDirectory.getUnemployedDirectory().size() + higherStudiesDirectory.getHigherStudiesDirectory().size();

        if (higherStudiesDirectory.getHigherStudiesDirectory().isEmpty()) {
            return higherPercentage;
        } else {
            int numberOfEmployed = higherStudiesDirectory.getHigherStudiesDirectory().size();

            higherPercentage = ((float)numberOfEmployed / (float)totalNum) * 100;

        }
        return higherPercentage;
    }

    public float acceptedPercentage() {
        float acceptedPercentage = 0;
        int total = acceptedStudentsDirectory.getAcceptedStudentsDirectory().size() + rejectedStudentsDirectory.getRejectedStudentsDirectory().size();
        if (acceptedStudentsDirectory.getAcceptedStudentsDirectory().isEmpty()) {
            return acceptedPercentage;
        } else {
            int numberOfAccepted = acceptedStudentsDirectory.getAcceptedStudentsDirectory().size();

            acceptedPercentage = ( (float)numberOfAccepted  / (float)total) * 100;

        }
        return acceptedPercentage;
    }

    public float rejectedPercentage() {
        float rejectedPercentage = 0;
        int total = acceptedStudentsDirectory.getAcceptedStudentsDirectory().size() + rejectedStudentsDirectory.getRejectedStudentsDirectory().size();
        if (rejectedStudentsDirectory.getRejectedStudentsDirectory().isEmpty()) {
            return rejectedPercentage;
        } else {
            int numberOfAccepted = rejectedStudentsDirectory.getRejectedStudentsDirectory().size();

            rejectedPercentage = ( (float)numberOfAccepted / (float)total) * 100  ;

        }
        return rejectedPercentage;
    }
    
    public float employmentRate() {
        float empRate = 0;
        int totalNum = employedDirectory.getEmployedDirectory().size() + unemployedDirectory.getUnemployedDirectory().size();

        if (employedDirectory.getEmployedDirectory().isEmpty()) {
            return empRate;
        } else {
            int numberOfEmployed = employedDirectory.getEmployedDirectory().size();

            empRate = ((float)numberOfEmployed / (float)totalNum ) * 100 ;

        }
        return empRate;
    }

}
