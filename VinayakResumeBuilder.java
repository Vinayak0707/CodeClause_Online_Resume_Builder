import java.util.Scanner;

public class VinayakResumeBuilder {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String workExperience;
    private String education;
    private String skills;
    private String[] resumeTemplates = {"Template 1", "Template 2", "Template 3"};

    public VinayakResumeBuilder() {
        
        this.name = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.workExperience = "";
        this.education = "";
        this.skills = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void renderResume(int template) {
        // Method to render the resume in the selected template
        String selectedTemplate = this.resumeTemplates[template];
        System.out.println("Rendering resume in " + selectedTemplate + " template...");
        // Write code to generate the resume in PDF and DOC formats
    }

    public static void main(String[] args) {
        // Main method to run the Online Resume Builder application
        Scanner scanner = new Scanner(System.in);
        VinayakResumeBuilder resumeBuilder = new VinayakVResumeBuilder();

        System.out.println("Welcome to the Online Resume Builder!");

        // Get user input for all the resume fields
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        resumeBuilder.setName(name);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        resumeBuilder.setEmail(email);

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        resumeBuilder.setPhone(phone);

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        resumeBuilder.setAddress(address);

        System.out.print("Enter your work experience: ");
        String workExperience = scanner.nextLine();
        resumeBuilder.setWorkExperience(workExperience);

        System.out.print("Enter your education: ");
        String education = scanner.nextLine();
        resumeBuilder.setEducation(education);

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();
        resumeBuilder.setSkills(skills);

        // Display the available resume templates and ask the user to select one
        System.out.println("Choose a resume template:");
        for (int i = 0; i < resumeBuilder.resumeTemplates.length; i++) {
            System.out.println((i+1) + ". " + resumeBuilder.resumeTemplates[i]);
        }
        int template = scanner.nextInt() - 1;

        // Render the resume in the selected template
        resumeBuilder.renderResume(template);

        System.out.println("Your resume has been generated!");
        System.out.println("Thank you for using the Online Resume Builder.");
    }
}
