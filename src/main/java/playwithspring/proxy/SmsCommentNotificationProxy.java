package playwithspring.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import playwithspring.model.Comment;

@Component
@Qualifier("SMS")
public class SmsCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending sms notification on new comment: " + comment);
    }
}
