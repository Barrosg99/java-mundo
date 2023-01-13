public class App {
    public static void main(String[] args) throws Exception {
        Student Jefferson = new Student();
        Jefferson.setName("User");
        Jefferson.setAge(23);
        Jefferson.setEmail("jeff@gmail.com");
        Jefferson.setCpf("123.456.789-10");
        Jefferson.course.setCollege("UNESP");
        Jefferson.course.setFavoriteSubject("Calculus");
        Jefferson.course.setName("Civil Engineering");
        Jefferson.course.setPeriod(3);

        System.out.println("Name: " + Jefferson.getName());
        System.out.println("Age: " + Jefferson.getAge());
        System.out.println("Email: " + Jefferson.getEmail());
        System.out.println("College: " + Jefferson.course.getCollege());
        System.out.println("Course: " + Jefferson.course.getName());
        System.out.println("Period: " + Jefferson.course.getPeriod()+"º");
        System.out.println("Favorite Subject: " + Jefferson.course.getFavoriteSubject());

    }
}
