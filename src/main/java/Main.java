public class Main {
    public static void main(String[] args) {
        Person parent = new PersonBuilder()
                .setName("Олег")
                .setSurname("Петров")
                .setAge(25)
                .setAddress("Москва")
                .build();

        Person childe = parent.newChildBuilder()
                .setName("Василий")
                .build();
        System.out.println("Родитель - " + parent + "; ребенок - " + childe);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

