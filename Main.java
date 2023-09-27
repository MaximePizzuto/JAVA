package Cours270923Java;

public class Main {
    public static void main(String[] args) {

        User moi = new User("Nicolas", "123456");
        // moi.setRole();
        System.out.println(moi.getLogin() + ' ' + moi.getAge() + " " + moi.getAge() + " " + moi.getPassword());

    }
}