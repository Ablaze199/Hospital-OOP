import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBooking {
    ArrayList<String> doctorName = new ArrayList<String>();
    ArrayList<String> doctorQualification = new ArrayList<String>();
    ArrayList<String> doctorGender = new ArrayList<String>();
    ArrayList<String> doctorPassword = new ArrayList<String>();
    ArrayList<Integer> doctorAge = new ArrayList<Integer>();
    ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
    ArrayList<String> doctorCity = new ArrayList<String>();

    ArrayList<Integer> patientAge = new ArrayList<Integer>();
    ArrayList<String> patientName = new ArrayList<String>();
    ArrayList<String> patientGender = new ArrayList<String>();
    ArrayList<String> patientPassword = new ArrayList<String>();
    ArrayList<String> patientConfirmPassword = new ArrayList<String>();
    ArrayList<Long> patientMobileNumber = new ArrayList<Long>();

    ArrayList<Integer> patientAgeBooking = new ArrayList<Integer>();
    ArrayList<String> patientNameBooking = new ArrayList<String>();
    ArrayList<String> patientGenderBooking = new ArrayList<String>();
    ArrayList<Byte> doctorID = new ArrayList<Byte>();
    private int i;

    void dataAdd() { //methods for creating default doctor list present in database.

        doctorName.add("Johnson Peters");
        doctorName.add("Eniola Ogunjobi");
        doctorName.add("Jude Osas");
        doctorName.add("Paul Walker");
        doctorName.add("Femi ojo");
        doctorName.add("Mike Todd");
        doctorName.add("John Micheal");

        doctorQualification.add("MBBS");
        doctorQualification.add("Er, MBBS");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("BAMS");
        doctorQualification.add("MBBS, MD, Surgeon");
        doctorQualification.add("BANS");

        doctorGender.add("M");
        doctorGender.add("F");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");

        doctorPassword.add("Johnson123");
        doctorPassword.add("Eniola123");
        doctorPassword.add("Jude123");
        doctorPassword.add("Paul123");
        doctorPassword.add("Femi123");
        doctorPassword.add("Mike123");
        doctorPassword.add("John123");

        doctorAge.add(25);
        doctorAge.add(29);
        doctorAge.add(23);
        doctorAge.add(26);
        doctorAge.add(28);
        doctorAge.add(25);
        doctorAge.add(30);

        doctorMobileNumber.add(98176233L);
        doctorMobileNumber.add(123L);
        doctorMobileNumber.add(123L);
        doctorMobileNumber.add(123L);
        doctorMobileNumber.add(123L);
        doctorMobileNumber.add(123L);
        doctorMobileNumber.add(123L);

        doctorCity.add("Lagos");
        doctorCity.add("Ekiti");
        doctorCity.add("Abuja");
        doctorCity.add("PortCity");
        doctorCity.add("Cross-river");
        doctorCity.add("Jos");
        doctorCity.add("Ondo");

    }

    void admin() throws Exception {
        Scanner sc = new Scanner(System.in);
        byte choice;
        boolean flag = true;

        while (flag) {
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
            System.out.println("\t\t________________________");
            System.out.println("\t\t|                        |");
            System.out.println("\t\t|     Welcome Admin      |");
            System.out.println("\t\t________________________");
            System.out.print("\n\n1.Doctor List \t2. Registered Patients \t3. Patients with Appointment \n\nEnter Your Choice");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i <= doctorName.size() - 1; i++) ;
                {
                    System.out.println("Name: \t" + doctorName.get(i));
                }
                byte menuChoice;
                System.out.println("\n\n1. Main menu\t 2. Previous menu");
                menuChoice = sc.nextByte();
                if (menuChoice == 1) {
                    flag = false;
                } else {
                    break;
                }
                break;
                case 2:
                    {

                    }
                }
            }
        }
    }





