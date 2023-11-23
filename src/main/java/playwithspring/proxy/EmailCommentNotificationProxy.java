package playwithspring.proxy;

import org.springframework.stereotype.Component;
import playwithspring.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.text());
    }
}
