package com.spring.playground;

import org.springframework.web.bind.annotation.GetMapping;

public class TaskInfo {
    private String sortBy;
    private String onwer;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getOnwer() {
        return onwer;
    }

    public void setOnwer(String onwer) {
        this.onwer = onwer;
    }

    @GetMapping("/tasks")
    public String getTasks(TaskInfo taskInfo){
        return String.format("sort-by is %s; owner is %s", taskInfo.getSortBy(), taskInfo.getOnwer());
    }
//    @GetMapping(value = "/", method = GET)
//    public List<T> getAll(WebRequest webRequest){
//        Map<String , String[]> params = webRequest.getParameterMap();
//        //...
//    }
}
