import config.SpringConfiguration;
import entryPoint.LibraryEntryPoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        LibraryEntryPoint libraryEntryPoint = annotationConfigApplicationContext.getBean(LibraryEntryPoint.class);

        libraryEntryPoint.run();
    }
}
