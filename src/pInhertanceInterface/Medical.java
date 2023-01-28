package pInhertanceInterface;

public interface Medical extends Who{
    public void medicalFunds();

    public void medicalFunds(int fee);

    @Override
    public void vaccination();

    
}
