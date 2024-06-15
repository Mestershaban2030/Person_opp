import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private BirthDate birthDate;
    
    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Invalid name\n");
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 20 && age <= 40)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Invalid age\n");
        }
    }
     public int getAge() {
        return age;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number\n");
        }
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email\n");
        }
    }
    public String getEmail() {
        return email;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }
    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void displayPersonData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Birth Date: " + birthDate.getDay() + "/" + birthDate.getMonth() + "/" + birthDate.getYear());
    }

    

    private boolean isValidName(String name) {
        if (name.isEmpty() || name.length() > 20) {
            return false;
        }

        for(char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("01[0125]\\d{8}");
        /*
        010     //01   0   92944634
        012
        011
        015
        String start = phnum.substring(3);
          if((start.equles("010" || 012 || 015 )) && ph.len == 11 ){

          }
        */
    }

    private boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9]{2,20}@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}");//S2jasjs@gmail.com
    }
//Shaban010929hj.kmds@gmail.com
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        System.out.print("Enter name: ");
        String name = scanner.next();
        person.setName(name);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        person.setPhoneNumber(phoneNumber);

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        person.setEmail(email);

        BirthDate birthDate = new BirthDate();

        System.out.print("Enter day of birth: ");
        int day = scanner.nextInt();
        birthDate.setDay(day);

        System.out.print("Enter month of birth: ");
        int month = scanner.nextInt();
        birthDate.setMonth(month);

        System.out.print("Enter year of birth: ");
        int year = scanner.nextInt();
        birthDate.setYear(year);

        person.setBirthDate(birthDate);

        person.displayPersonData();
    }
}

class BirthDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (isValidDay(day)) {
            this.day = day;
        } else {
            System.out.println("Invalid day.");
        }
    }
    public int getDay() {
        return day;
    }
 
    public void setMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            System.out.println("Invalid month.");
        }
    }
    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }
     public int getYear() {
        return year;
    }

    private boolean isValidDay(int day) {
        return day >= 1 && day <= 31;
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isValidYear(int year) {
        return year >= 1900 && year <= 1940;
    }
}