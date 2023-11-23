package playwithspring.repository;

import playwithspring.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
