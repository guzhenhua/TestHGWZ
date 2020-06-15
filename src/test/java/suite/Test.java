package suite;

import testcase2.TestMethodgu;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(TestMethodgu.class)
@IncludeTags({"huigui","xitong"})
public class Test {

}
