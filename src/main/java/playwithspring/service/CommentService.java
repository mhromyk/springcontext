package playwithspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import playwithspring.model.Comment;
import playwithspring.proxy.CommentNotificationProxy;
import playwithspring.repository.CommentRepository;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @Autowired
    public CommentService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
        System.out.println("Comment service has been initialized");
    }

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.text());
        return "SUCCESS";
    }

    public String editComment(Comment comment) {
        logger.info("Editing comment: " + comment.text());
        return "SUCCESS";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.text());
        return "SUCCESS";
    }
}
