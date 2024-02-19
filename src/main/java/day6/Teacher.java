package day6;
import java.util.Random;
public class Teacher {
    private String name, subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void evaluate(Student s){
        Random rand = new Random();
        int rating = rand.nextInt(5-2+1)+2;
        String ratingName = null;
        switch (rating){
            case 2:
                ratingName = "неудовлетворительно";
                break;
            case 3:
                ratingName = "удовлетворительно";
                break;
            case 4:
                ratingName = "хорошо";
                break;
            case 5:
                ratingName = "отлично";
                break;

        }
        System.out.println("Преподаватель " + name + " оценил студента с именем "+ s.getName() + " по предмету " + subject+  " на оценку " + ratingName);
    }
}
