public enum ECaseOfAction implements Case{
    CASE_1,CASE_2,CASE_3,CASE_4;

    @Override
    public int operation(int x, int y) {
        if( this==CASE_1) return x+y;
        if( this==CASE_2) return x-y;
        if( this==CASE_3) return x*y;
        if( this==CASE_4) return x/y;
        else return 0;
    }
}
