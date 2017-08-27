package cn.weblog.task;

import cn.weblog.task.quote.Line;

import java.util.List;

public class Quote {


    private List<Line> lines;


    public Quote(List<Line> lines) {
        this.lines = lines;
    }


    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }
}
