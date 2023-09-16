package cn.fii.demo.entity;

public class Printer {
    private IInk ink;
    private IPaper paper;

    public Printer() {
    }

    public Printer(IInk ink, IPaper paper) {
        this.ink = ink;
        this.paper = paper;
    }

    public IInk getInk() {
        return ink;
    }

    public void setInk(IInk ink) {
        this.ink = ink;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "正在使用" + ink.color() + paper.size() + "纸打印";
    }
}
