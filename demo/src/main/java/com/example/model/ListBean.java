package com.example.model;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ListBean {
    private List<String> list;

    private Set<String> set;

    private Collection<String> collection;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Collection<String> getCollection() {
        return collection;
    }

    public void setCollection(Collection<String> collection) {
        this.collection = collection;
    }
}
