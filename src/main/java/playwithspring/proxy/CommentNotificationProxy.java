package playwithspring.proxy;

import playwithspring.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
