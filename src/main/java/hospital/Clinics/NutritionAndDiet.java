package hospital.Clinics;

import hospital.ClinicsInterface;

public class NutritionAndDiet implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "NutritionAndDiet";
    }

    @Override
    public String clinicDoctor() {
        return "NutritionAndDietSpecialist";
    }
}
