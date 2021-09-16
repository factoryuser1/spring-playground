package com.spring.playground;

import org.springframework.web.bind.annotation.RestController;

public class TaskIds {
    private int taskId;
    private int commentId;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }
}
