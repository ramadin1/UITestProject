package com.surlatable.ui.test;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(format={"html:output"},tags={"@SmokeTest"})
public class RunCukesTest {
}