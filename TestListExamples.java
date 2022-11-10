import static org.junit.Assert.*;
import org.junit.*;

public class TestListExamples {
  // Write your grading tests here!
  @Test 
	public void testFilter() {
        List<String> temp = new ArrayList<>();
        StringChecker s = new StringChecker(){
            public boolean checkString(String s) {
                if(s.length()<4){
                  return true;
                }
                return false;
            }
        };
        temp.add("one");
        temp.add("two");
        temp.add("three");
        List<String> answer = new ArrayList<String>();
        answer.add("one");
        answer.add("two");
        assertEquals(answer, ListExamples.filter(temp, s));
	}
}
