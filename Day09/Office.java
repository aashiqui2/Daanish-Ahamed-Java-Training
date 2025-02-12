package tamilnadu;
public class Office {
    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        off.vrm();
        off.recruit();

    
    }
    public void work(){
        System.out.println("work in Office");
    }
    void recruit(){
        System.out.println("recruitement");
    }
    void vrm(){
        System.out.println("work from home");
    }

}
