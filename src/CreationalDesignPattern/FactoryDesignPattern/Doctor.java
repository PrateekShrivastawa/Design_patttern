package CreationalDesignPattern.FactoryDesignPattern;

public class Doctor implements  Profession{
    @Override
    public String profession_name() {
        return "I am a Doctor";
    }
}
