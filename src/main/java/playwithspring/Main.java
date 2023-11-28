package playwithspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import playwithspring.config.ProjectConfig;
import playwithspring.model.Comment;
import playwithspring.service.CommentService;

public class Main {

    public static void main(String[] args) {

        var comment = new Comment("Maks", "This is a very first comment");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService1 = context.getBean(CommentService.class);

        commentService1.publishComment(comment);
    }
}
