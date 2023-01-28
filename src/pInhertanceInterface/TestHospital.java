package pInhertanceInterface;

public class TestHospital {

    public static void main(String[] args) {
        final int i = 10;

    final int days = 100;

    FortisHospital fh = new FortisHospital();
    fh.cardiology();
    fh.covid();
    fh.covidReport("betaOmicron");
    fh.dental();
    fh.erServices();
    fh.medicalFunds();
    fh.oncology();
    fh.opthalmology();
    fh.optionalServices();
    fh.paediatrics();
    fh.physiotherapy();
    fh.radiology();
    fh.rheumatology();
    fh.vaccination();
    
    System.out.println("Min fee per USMedical: "+UsMedical.min_fee);
    UsMedical.billing();
    System.out.println(fh.min_fee);

        //upcasting
        UsMedical us = new FortisHospital();
        us.cardiology();
        us.covid();
        us.erServices();

    }

    
}
