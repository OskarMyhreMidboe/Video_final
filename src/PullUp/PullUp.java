package PullUp;


class A{
    int num;

    public int addInt(int n){
        return n+2;
    }

}
class B extends A{
    // Class empty before pullup
    // Pulled up from class C
    public int addInt(int n) {
        return super.addInt(n)+1;
    }
}
class C extends B{
    // Class Empty after pullup
    // before Pullup :
    /*
    public int addInt(int n) {
        return super.addInt(n)+1;
    }
     */
}
class D extends B{
    public int addInt(int n) {
        return super.addInt(n)+2;
    }
}
