import java.util.ArrayList;

public class AppointmentBooking {
    ArrayList<String> doctorName=new ArrayList<String>();
    ArrayList<String> doctorQualification=new ArrayList<String>();
    ArrayList<String> doctorGender=new ArrayList<String>();
    ArrayList<String> doctorPassword=new ArrayList<String>();
    ArrayList<Integer> doctorAge=new ArrayList<Integer>();
    ArrayList<Long> doctorMobileNumber=new ArrayList<Long>();
    ArrayList<String> doctorCity=new ArrayList<String>();

    ArrayList<Integer> patientAge=new ArrayList<Integer>();
    ArrayList<String> patientName=new ArrayList<String>();
    ArrayList<String> patientGender=new ArrayList<String>();
    ArrayList<String> patientPassword=new ArrayList<String>();
    ArrayList<String> patientConfirmPassword=new ArrayList<String>();
    ArrayList<Long> patientMobileNumber=new ArrayList<Long>();

    ArrayList<Integer> patientAgeBooking=new ArrayList<Integer>();
    ArrayList<String> patientNameBooking=new ArrayList<String>();
    ArrayList<String> patientGenderBooking=new ArrayList<String>();
    ArrayList<Byte> doctorID=new ArrayList<Byte>();

    void dataAdd() { //methods for creating default doctor list present in database.

        doctorName.add("Johnson Peters");
        doctorName.add("Eniola Ogunjobi");
        doctorName.add("Jude Osas");
        doctorName.add("Paul Walker");
        doctorName.add("Femi ojo");
        doctorName.add("Mike Dean");
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

}
