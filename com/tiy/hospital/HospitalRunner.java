package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("HospitalRunner.main() ...");

        HospitalDoctor firstDoc = new SurgicalOncologist("James", "Glavin", "MIT");
        Patient firstPatient = new Patient("David", "Polk");

        if (firstDoc instanceof SurgicalOncologist) {
            boolean success = ((SurgicalOncologist)firstDoc).operate(firstPatient);
            if (success) {
                System.out.println("Successful operation!");
            } else {
                System.out.println("Operation failed!!!");
            }
        }

        System.out.println("HospitalRunner.main() - done!");
    }
}
