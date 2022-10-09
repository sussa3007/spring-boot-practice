package com.springbootprac.springpractice.service;

import com.springbootprac.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;


    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("implementation: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}
