package cn.weblog.task;

public enum Tap {

    OPEN(1),CLOSE(0);

    private int statu;

    Tap(int statu) {
        this.statu = statu;
    }
}
