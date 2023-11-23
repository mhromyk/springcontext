package playwithspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import playwithspring.model.Comment;
import playwithspring.proxy.CommentNotificationProxy;
import playwithspring.repository.CommentRepository;

@Component
public class CommentService {

    CommentNotificationProxy commentNotificationProxy;
    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
