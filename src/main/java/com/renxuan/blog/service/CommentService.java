package com.renxuan.blog.service;

import com.renxuan.blog.po.Comment;

import java.util.List;

/**
 * @author RenXuan
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
