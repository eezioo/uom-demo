/**
 * Created by ISURU on 3/2/2017.
 */
public class Main {


    public static void main(String[] args) {
        Main main = new Main();

        Person person = new Person();
        person.setName("chathura");
        person.setEmail("chathuraP@gmail.com");
        System.out.println(main.saveperson(person));
    }
    public Person saveperson(Person person){

        if (person == null){
            throw new IllegalArgumentException();
        }else{
            person.setId("p100");
            return person;
        }
    }
}



