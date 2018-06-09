import java.lang.String;

import java.util.Scanner;

/**
 * Created by user on 31.05.2018.
 */
public class WorkWithPatient {
    private void print(Patient patient) {
        System.out.println("Пациент   " + "'" + patient.getName() + "' " + " Возраст  = '" + patient.getAge() + "' " + " Страховка  '" + ((patient.getInsurance() == true) ? " Имеется " : " Нету ") + " ' " + "Местожительство  - " + " ' " + patient.getResidence() + "'");
    }

    public void patientPrint(Patient[] patient) {
        for (int i = 0; i < patient.length; i++) {
            print(patient[i]);
        }
    }

    Patient addPatient(java.lang.String name, int age, boolean insurance, String residence) {
        Patient pat = new Patient(name, age, insurance, residence);
        return pat;
    }

    public Patient[] creatPacient(Patient[] patient) {
        Scanner scan = new Scanner(System.in);
        boolean insurance;
        for (int i = 0; i < patient.length; i++) {
            System.out.println("Введите ФИО Пациента №" + (i + 1));
            String name = scan.next();
            System.out.println("Введите возраст пациента ");
            int age = scan.nextInt();
            System.out.println("Есть ли страховка у пациента / Введите Y (если есть) или  N (если нету) ");
            String insuranceString = scan.next();
            if (insuranceString.equals("Y"))
                insurance = true;
            else
                insurance = false;
            System.out.println("Местожительство пациента");
            String residence = scan.next();
            patient[i] = addPatient(name, age, insurance, residence);
        }
        return patient;
    }

    void findPacientForAge(Patient[] patients) {
        Scanner scan = new Scanner(System.in);
        int countPatient = 0;
        System.out.println("Введите возраст пациента");
        int age = scan.nextInt();
        for (int i = 0; i < patients.length; i++)
            if (patients[i].getAge() == age) {
                print(patients[i]);
                countPatient++;
            }
        if (countPatient == 0)
            System.out.println("Такого пациента не существует");
    }

    void findPacientForName(Patient[] patients) {
        Scanner scan = new Scanner(System.in);
        int countPatient = 0;
        System.out.println("Введите ФИО пациента");
        String name = scan.next();
        for (int i = 0; i < patients.length; i++)
            if (patients[i].getName().equals(name)) {
                print(patients[i]);
                countPatient++;
            }
        if (countPatient == 0)
            System.out.println("Такого пациента не существует ");
    }

     void findPatient(Patient[] patient) {
        Scanner scan = new Scanner(System.in);
        int i = 10;
        System.out.println("Если хотите нати пациента по возрасту введите 1 , если хотите найти по имени введите 2, выход из программы введите 0");
        do {
            i = scan.nextInt();
            if (i == 1)
                findPacientForAge(patient);
            if (i == 2)
                findPacientForName(patient);
            if (i != 0)
                System.out.println("Если хотите нати пациента по возрасту введите 1 , если хотите найти по имени введите 2, выход из программы введите 0");
        } while (i != 0);
    }
}
