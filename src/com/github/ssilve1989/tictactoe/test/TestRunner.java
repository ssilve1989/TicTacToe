package com.github.ssilve1989.tictactoe.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by steve on 7/28/15.
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        result.getFailures().forEach((failure -> System.out.println(failure.toString())));
        System.out.println(result.wasSuccessful());
    }
}
