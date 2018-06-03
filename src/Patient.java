import java.lang.String;
/**
 * Created by user on 31.05.2018.
 */
class Patient {
        private String name;
        private int age;
        private boolean insurance;
        private String   residence;


        Patient(String  name, int age, boolean insurance, String residence) {
            this.name = name;
           this.age = age;
            this.insurance = insurance;
            this.residence = residence;

        }
         Patient() {
          }
    public String getName()
        {
            return this.name ;
        }
    public int getAge()
    {
        return this.age ;
    }
    public boolean getInsurance()
    {
        return this.insurance ;
    }

    public String getResidence()
    {
        return this.residence ;
    }

}

