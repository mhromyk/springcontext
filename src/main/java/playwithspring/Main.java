package playwithspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import playwithspring.config.ProjectConfig;
import playwithspring.model.Comment;
import playwithspring.proxy.EmailCommentNotificationProxy;
import playwithspring.repository.InMemoryCommentRepository;
import playwithspring.service.CommentService;

public class Main {

    public static void main(String[] args){

//        var commentRepository = new InMemoryCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//
//        var commentService = new CommentService(commentNotificationProxy, commentRepository);

        var comment = new Comment("Maks", "This is first comment");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService1 = context.getBean(CommentService.class);
        var commentService2 = context.getBean(CommentService.class);

        commentService1.publishComment(comment);
        System.out.println("Instance of commentService1 is equal to commentService2 : " + (commentService1 == commentService2));
    }
}
