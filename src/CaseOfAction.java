public class CaseOfAction {
    String txt;
    private   static  final CaseOfAction CASE_1 = new CaseOfAction("case_1");
    private   static  final CaseOfAction CASE_2 = new CaseOfAction("case_2");
    private   static  final CaseOfAction CASE_3 = new CaseOfAction("case_3");
    private   static  final CaseOfAction CASE_4 = new CaseOfAction("case_4");

    private CaseOfAction(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "CaseOfAction{" +
                "txt='" + txt + '\'' +
                '}';
    }
}
