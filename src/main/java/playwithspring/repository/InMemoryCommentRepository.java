package playwithspring.repository;

import org.springframework.stereotype.Repository;
import playwithspring.model.Comment;

@Repository
public class InMemoryCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.text());
    }
}
