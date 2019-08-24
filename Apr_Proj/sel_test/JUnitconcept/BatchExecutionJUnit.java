package JUnitconcept;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	A1.class,
	A2.class,
})
public class BatchExecutionJUnit {
public void m()
{
	System.out.println("A");
}

}
