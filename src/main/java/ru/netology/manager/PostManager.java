package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] post;

    //Позволяет искать записи на стене в соответствии с заданными критериями.
    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    //Удаляет запись со стены.
    public void delete(int ownerId, int postId) {
    }
}
