package playwithspring.repository;

import playwithspring.model.Comment;

public class InMemoryCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
