package playwithspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import playwithspring.config.ProjectConfig;
import playwithspring.model.Comment;
import playwithspring.service.CommentService;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var comment = new Comment("Maks", "This is a very first comment");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService1 = context.getBean(CommentService.class);

        String result = commentService1.publishComment(comment);
        logger.info(" Main method called commentService1 and received: " + result);

    }
}
