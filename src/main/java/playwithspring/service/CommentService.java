package playwithspring.service;

import playwithspring.model.Comment;
import playwithspring.proxy.CommentNotificationProxy;
import playwithspring.repository.CommentRepository;

public class CommentService {

    CommentNotificationProxy commentNotificationProxy;
    CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
