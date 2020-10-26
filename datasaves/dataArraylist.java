package schumm.datasaves;

import java.util.ArrayList;

public class dataArraylist {
    static public ArrayList studentinfo;

    public dataArraylist() {
        studentinfo = new ArrayList();
        studentinfo.add("too");
        studentinfo.add("doggy");
        studentinfo.add("piggy");
    }

    public ArrayList<String> getList() {
        return studentinfo;
    }
    public ArrayList<String> addElement(String element) {
        studentinfo.add(element);
        return studentinfo;
    }
    public ArrayList<String> removeElement(Integer w,String element) {
        studentinfo.remove(element);
        return studentinfo;
    }
    public ArrayList<String> replaceElement(String element,String element2) {
        studentinfo.remove(element);
        studentinfo.add(element2);
        return studentinfo;
    }

}
