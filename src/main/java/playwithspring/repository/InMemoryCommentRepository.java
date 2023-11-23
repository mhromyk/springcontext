package playwithspring.repository;

import org.springframework.stereotype.Component;
import playwithspring.model.Comment;

@Component
public class InMemoryCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.text());
    }
}
