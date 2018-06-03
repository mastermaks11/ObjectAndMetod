import java.lang.String;

/**
 * Created by user on 31.05.2018.
 */
public class DatenbankPatient {
    public static void main(String[] args) {
        WorkWithPatient work = new WorkWithPatient();
        Patient[] patient = new Patient[3];
        work.creatPacient(patient);
        work.patientPrint(patient);
        work.findPatient(patient);
    }
}
