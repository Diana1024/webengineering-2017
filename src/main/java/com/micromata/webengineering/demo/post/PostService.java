package com.micromata.webengineering.demo.post;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 * Handle all CRUD operations for posts.
 */
@Service
public class PostService {
    private List<PojoPost> posts = new LinkedList<>();

    /**
     * Retrieve the list of all posts.
     *
     * @return post list
     */
    public List<PojoPost> getPosts() {
        return posts;
    }


    /**
     * Add a new post.
     *
     * @param title the post title.
     */
    public void addPost(String title) {
        PojoPost p = new PojoPost();
        p.setTitelProperty(title);
        p.setDateProperty(new Date());
        posts.add(p);
    }
}
