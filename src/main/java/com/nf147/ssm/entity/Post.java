package com.nf147.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Post {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.post_id
     *
     * @mbg.generated
     */
    private Integer postId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.author_id
     *
     * @mbg.generated
     */
    private Integer authorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.post_tite
     *
     * @mbg.generated
     */
    private String postTite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.post_content
     *
     * @mbg.generated
     */
    private String postContent;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date postDate;

    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.post_id
     *
     * @return the value of post.post_id
     *
     * @mbg.generated
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.post_id
     *
     * @param postId the value for post.post_id
     *
     * @mbg.generated
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.author_id
     *
     * @return the value of post.author_id
     *
     * @mbg.generated
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.author_id
     *
     * @param authorId the value for post.author_id
     *
     * @mbg.generated
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.post_tite
     *
     * @return the value of post.post_tite
     *
     * @mbg.generated
     */
    public String getPostTite() {
        return postTite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.post_tite
     *
     * @param postTite the value for post.post_tite
     *
     * @mbg.generated
     */
    public void setPostTite(String postTite) {
        this.postTite = postTite == null ? null : postTite.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.post_content
     *
     * @return the value of post.post_content
     *
     * @mbg.generated
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.post_content
     *
     * @param postContent the value for post.post_content
     *
     * @mbg.generated
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.post_date
     *
     * @return the value of post.post_date
     *
     * @mbg.generated
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.post_date
     *
     * @param postDate the value for post.post_date
     *
     * @mbg.generated
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}