import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
  @Test
  public void testMerge(){
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<String> answer = new ArrayList<>();
    list1.add("a");
    list2.add("b");
    list1.add("c");
    list2.add("d");
    list1.add("e");
    list2.add("f");
    answer.add("a");
    answer.add("b");
    answer.add("c");
    answer.add("d");
    answer.add("e");
    answer.add("f");
    assertEquals(answer, ListExamples.merge(list1, list2));
  }
}
