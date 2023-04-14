import java.lang.reflect.Field;

public class ProcessingSubstitute {
    private Object object;


    public ProcessingSubstitute(Object object) {
        this.object = object;
    }

    public ProcessingSubstitute() {
    }


    public void process() throws IllegalAccessException {
        Class<? extends Object> clazz = object.getClass();
        for (Field i : clazz.getDeclaredFields()) {
            if (i.isAnnotationPresent(Substitute.class)
                    && i.getType().getSimpleName().equals("String")) {
                i.setAccessible(true);
                char index = i.getAnnotation(Substitute.class).index();
                char sim = ' ';
                if (i.getAnnotation(Substitute.class).sim() != ' ') {
                    sim = i.getAnnotation(Substitute.class).sim();
                }
                String field = (String) i.get(object); //"Sem Alsion"
                char[] arr = field.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == ' ' || arr[j] == sim) {
                        arr[j] = index;
                    }
                }
                String result = String.valueOf(arr);
                i.set(object, result);
            }
        }
    }
}
