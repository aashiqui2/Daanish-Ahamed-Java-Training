public class ExceptionDemo3 {
    public static void main(String[] args) {
        LowAttendanceException l = new LowAttendanceException("check my attendance");
        try{
            l.checkAttendance(50);
        }
        catch(LowAttendanceException le){
            System.out.println("ready to pay fine");
        }
    }
}

class LowAttendanceException extends RuntimeException {
    public LowAttendanceException(String msg) {
        System.out.println(msg);
    }
    public LowAttendanceException()
    {
        
    }

    public void checkAttendance(int percentange) {
        if (percentange > 60) {
            System.out.println("allow for exam");
        } else {
            // exception possible area
            //  anonymous Object
            throw new LowAttendanceException();

        }
    }
}
