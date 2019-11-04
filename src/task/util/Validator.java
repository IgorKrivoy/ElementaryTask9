package task.util;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public String[] getSplitArrayString(String string) {
        String[] strings = string.split(" ");
        return strings;
    }



    public boolean continuedRequests(String answer) {
        return answer.equals("YES") || answer.equals("Y") ;
    }
}
