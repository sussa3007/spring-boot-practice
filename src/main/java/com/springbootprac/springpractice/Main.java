package com.springbootprac.springpractice;

import com.springbootprac.springpractice.config.Config;
import com.springbootprac.springpractice.logic.BubbleSort;
import com.springbootprac.springpractice.logic.Sort;
import com.springbootprac.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[Result] = " + sortService.doSort(Arrays.asList(args)));
    }
}
