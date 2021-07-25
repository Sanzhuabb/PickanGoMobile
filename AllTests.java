package ca.kpu.info3235.teamproject;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({GroupTest1.class, GroupTest2.class})
@SuiteClasses({accountTest.class, pgMenuTest.class})

public class AllTests {

}