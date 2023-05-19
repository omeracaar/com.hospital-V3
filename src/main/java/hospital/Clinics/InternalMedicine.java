package hospital.Clinics;

import hospital.ClinicsInterface;

public class InternalMedicine implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "InternalMedicine";
    }

    @Override
    public String clinicDoctor() {
        return "Internal_Medicine_Specialist";
    }
}
