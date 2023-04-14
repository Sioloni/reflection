public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User(1L, "Sem Aliot", "sem@gmail.com");
        ProcessingSubstitute processingSubstitute = new ProcessingSubstitute(user);
        processingSubstitute.process();
        System.out.println(user.toString());





    }
}
