package CreationalDesignPattern.FactoryDesignPattern;

import java.util.Objects;

public class Factory {
    public static Profession getInstance(String name){
        if (name.equals("Doctor")) {
            return new Doctor();
        }
        else if(name.equals("Engineer")){
            return new Engineer();
        }
        else{
            return new Lawyer();
        }
    }
}
