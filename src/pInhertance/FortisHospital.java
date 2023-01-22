package pInhertance;

public class FortisHospital extends UNHG implements UsMedical, UkMedical, IndianMedical{

    // UsMedical
    @Override
    public void cardiology() {
        System.out.println("FortisHospital --cardiology");
        
    }

    @Override
    public void erServices() {
        System.out.println("FortisHospital --erServices");
        
    }

    @Override
    public void oncology() {
        System.out.println("FortisHospital --oncology");
        
    }

    @Override
    public void rheumatology() {
        System.out.println("FortisHospital --erServices");
        
    }
    //Medical
    @Override
    public void vaccination() {
        System.out.println("FortisHospital --vaccination");
        
    }

    @Override
    public void medicalFunds(int fee) {
        System.out.println("FortisHospital --medicalFunds fee");
        
    }
    //WHO
    @Override
    public void covid() {
        System.out.println("FortisHospital --covid");
        
    }

    @Override
    public void covidReport(String version) {
        System.out.println("FortisHospital --covidReport" + version);
        
    }

    @Override
    public void physiotherapy() {
        System.out.println("FortisHospital --physiotherapy");
        
    }

    @Override
    public void radiology() {
        System.out.println("FortisHospital --radiology");
        
    }
// Indian
    @Override
    public void dental() {
        System.out.println("FortisHospital --dental");
        
    }

    @Override
    public void opthalmology() {
        System.out.println("FortisHospital --opthalmology");
        
    }

    @Override
    public void paediatrics() {
        System.out.println("FortisHospital --paediatrics");
        
    }

    @Override
    public void medicalFunds(){
        System.out.println("FortisHospital --");
    }
    
    //
    
}
