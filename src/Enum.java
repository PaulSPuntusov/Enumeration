public enum Enum {
    First{int method(int x, int y){return x+y;}},
    Second{int method(int x, int y){return x-y;}},
    Third{int method(int x, int y){return x*y;}},
    Fourth{int method(int x, int y) {return x/y;}};
    abstract int method(int x, int y);
}
