package org.example.exception;

public class DemoException {
    public static void main(String[] args){
        MyProcess myProcess = new MyProcess();
        myProcess.process2();
    }
}

class MyProcess {
    int process2() {
        try {
            return 10 / 0;
        } catch (Exception e) {
            throw new BusinessAException(e.getMessage());
        }
    }

    int process1() throws Exception {
        try {
            return 10 / 0;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
