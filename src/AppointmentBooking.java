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
                case 2: {
                    if (patientName.isEmpty()) {
                        System.out.println("No Registered Patients yet.");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= patientName.size() - 1; i++) {
                            System.out.println(i + ". " + patientName.get(i));
                        }
                        System.out.println("\n\n1. Main menu\t 2. Previous menu");
                        menuChoice = sc.nextByte();
                        if (menuChoice == 1) {
                            flag = false;
                        } else {
                            break;
                        }
                    }
                    break;

                }
                case 3:
                    if (patientNameBooking.isEmpty()) {
                        System.out.println("\nNo Appointments yet.");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= patientNameBooking.size() - 1; i++) {
                            System.out.println(i + ". " + patientNameBooking.getClass(i));
                        }
                        Thread.sleep(5000);
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("wrong choice");
                    Thread.sleep(1000);
                    flag = true;
            }
        }

    }

    void patient() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t | Welcome to Patient Page!|");
            System.out.println("\t\t |_________________________|");
            System.out.println(" ");
            System.out.println("1.Login \t 2.Registration\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (patientMobileNumber.isEmpty()) {
                        System.out.println("First register yourself then login...!");
                        Thread.sleep(500);
                        break;
                    } else {
                        patientLogin();
                        flag = false;
                    }
                    break;

                case 2:
                    patientRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("\nYou entered wrong choice. enter another choice..!!");
                    flag = true;
                    Thread.sleep(1000);
                    break;
            }
        }
    }

    void doctor() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t | Welcome to Doctor Page!|");
            System.out.println("\t\t |_________________________|");
            System.out.println(" ");

            System.out.println("1.Login \t 2.Registration");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (doctorMobileNumber.isEmpty()) {
                        System.out.println("Register first....!");
                        flag = false;
                        Thread.sleep(500);
                        break;
                    } else {
                        doctorLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    doctorRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("Entered wrong choice..");
                    flag = true;
            }
        }
    }

    void patientLogin() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        long mobileNumber;
        byte choice;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t  _________________________");
        System.out.println("\t\t |                         |");
        System.out.println("\t\t |         Login 		   |");
        System.out.println("\t\t |_________________________|");

        System.out.println("Enter your Username(mobilenumber)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();

        boolean flag1 = false;
        int j;
        for (j = 0; j <= patientMobileNumber.size() - 1; j++) {

            if ((patientMobileNumber.get(j)).equals(mobileNumber) && (patientPassword.get(j)).equals(password)) ;
            {
                flag1 = true;
                break;
            }
        }
        if (flag1 == true) {
            Thread.sleep(1000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t |     Book Appointment    |");
            System.out.println("\t\t |_________________________|");
            // I understand other parts a little but i do not understand this line of code as per patientName.get(j)
            System.out.println("\n Welcome " + patientName.get(j) + ", to book appointment, choose your doctor..");

            for (int i = 0; i <= doctorName.size() - 1; i++) {
                choice = sc.nextByte();
                doctorID.add(choice);

                while (flag) {
                    Thread.sleep(1000);

                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("\t\t  _________________________");
                    System.out.println("\t\t |                         |");
                    System.out.println("\t\t |     Book Appointment    |");
                    System.out.println("\t\t |_________________________|");

                    if (choice <= doctorName.size() && choice > 0) {
                        // i didn't grasp this line of code too
                        System.out.println("\n\nName: \t" + doctorName.get(choice - 1) + "" + "\nAge: \t" + doctorAge.get(choice - 1) + "\nMobile: " + doctorMobileNumber.get(choice - 1) + "\nCity: \t " + doctorCity.get(choice - 1));
                        System.out.println("\n Enter your name: \t");
                        sc.nextLine();
                        patientNameBooking.add(sc.nextLine());
                        System.out.println("Enter your age: \t");
                        patientAgeBooking.add(sc.nextInt());
                        System.out.println(" Enter your gender: \t");
                        patientGenderBooking.add(sc.next());

                        System.out.println("\n Booking Successful..");

                        Thread.sleep(1000);
                        flag = false;
                        break;

                    } else {
                        System.out.println("\n Enter correct input..");
                        flag = true;
                        Thread.sleep(1000);

                    }

                }

            }
           else
            {
                System.out.println("Login unsuccessful..");
                Thread.sleep(900);
                flag = false;
            }

        }


    }

    void patientRegistration() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        long mobileNumber;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n");
        System.out.println("\t\t | Welcome to the Registration Page| ");
        System.out.println("\n");
        System.out.println("Please enter your name");
        patientName.add(sc.nextLine());
        System.out.println("enter your Age: ");
        patientAge.add(sc.nextInt());
        System.out.println("Please Enter your mobile number");
        mobileNumber= sc.nextLong();
        long mno;

        boolean flag=true, flag1=true;

        if(patientMobileNumber.isEmpty())
        {
            patientMobileNumber.add((mobileNumber));
            System.out.println("Enter password");
            patientPassword.add(sc.next());
            System.out.println("Registration is successful");

            Thread.sleep(900);
            flag1=false;

        }
        else
        {
           for(i=0; i<=patientMobileNumber.size()-1; i++)

           {
               // I didn't get this line of Code
               mno=patientMobileNumber.get(i);

               if(mno==mobileNumber)
               {
                   flag1=false;
                   break;
               }
           }
           if(flag1==true)
           {
               patientMobileNumber.add(mobileNumber);
               System.out.println("Enter password");
               patientPassword.add(sc.next());
               System.out.println("Registration is successful");
               Thread.sleep(900);
           }
           else
           {
               System.out.println("same mobile number is not allowed\n");
               Thread.sleep(500);
           }
        }
    }
          void doctorRegistration() throws Exception
          {
              Scanner sc=new Scanner(System.in);
              int i=0;
              long mobileNumber;
              boolean flag=true, flag1=true;

              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

              System.out.println("\t\t ----------------------------------");
              System.out.println("\t\t| This is doctor registration Page |");
              System.out.println("\t\t ----------------------------------");
              System.out.println("\n");

              System.out.println("Please enter your name");
              doctorName.add(sc.nextLine());

              System.out.println("Please enter your  Mobile number");
              mobileNumber=(sc.nextLong());

              long mno;

              if(doctorMobileNumber.isEmpty())
              {
                  doctorMobileNumber.add((mobileNumber));
                  System.out.println("Enter password");
                  doctorPassword.add(sc.next());
                  System.out.println("Registration is Successful");
                  Thread.sleep(900);
                  flag1=false;

              }
              else
              {
               for(i=0; i<=doctorMobileNumber.size()-1; i++)
               {
                   mno=doctorMobileNumber.get(i);
// not very clear
                   if(mno==mobileNumber)
                   {
                       flag1=false;
                       break;
                   }
               }

               if(flag1==true)
               {
                doctorMobileNumber.add(mobileNumber);
                   System.out.println("Enter age:");
                   doctorAge.add(sc.nextInt());
                   System.out.println("Enter City: ");
                   doctorCity.add(sc.next());
                   System.out.println("Registration is successful.");
                   System.out.println("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
                   Thread.sleep(900);
               }
               else
               {
                   System.out.println("same mobile number is not allowed\n");
                   int index=doctorName.size()-1;
                   doctorName.remove(index);
                   Thread.sleep(500);
               }
              }
          }
          void doctorLogin() throws Exception
          {
              Scanner sc=new Scanner(System.in);
              Long mobileNumber;
              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
              System.out.println("\t\t---------------------------------");
              System.out.println("\t\t| This is doctor login page     |");
              System.out.println("\t\t---------------------------------");
              System.out.println("Enter your Username(mobile number)");
              mobileNumber=sc.nextLong();
              System.out.println("Enter your Password");
              String password= sc.next();
              int i =0;
              byte choice;

              boolean flag=false;
              boolean flag11=true;

              for(i=0; i<doctorMobileNumber.size()-1; i++)
              {
                 if((doctorMobileNumber.get(i)).equals(mobileNumber) && (doctorPassword.get(i)).equals((password)))
                 {
                     flag=true;
                     break;
                 }
                 if(flag==true)
                 {
                     while (flag11)
                     {
                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                         System.out.println("\t\t----------------------------------------");
                         System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+" |");
                         System.out.println("\t\t----------------------------------------");
                         System.out.println("\n\nPress 1 to see your Appointments. \n");
                         choice=sc.nextByte();

                         byte j=0;
                         switch (choice)
                         {
                             case 1:
                                 if((doctorID.isEmpty()!=true))
                                 {
                                     //clumsy line of code
                                     while(j<=doctorID.size()-1)
                                     {
                                         if((i+1)==doctorID.get(j))
                                         {
                                             System.out.println("patient name: "+patientNameBooking.get(j));
                                             j++;
                                         }
                                     }
                                     Thread.sleep(4000);
                                 }
                         }
                     }
                 }
              }
          }
}





