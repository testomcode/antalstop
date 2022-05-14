package se.trafik.antalstop;

import java.util.List;

public class Line implements Comparable<Line>{
    private Integer lineNumber;

    private List<String> stopNames;

    public Line(Integer lineNumber, List<String> stopNames) {
        this.lineNumber = lineNumber;
        this.stopNames = stopNames;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public List<String> getStopNames() {
        return stopNames;
    }

    public void setStopNames(List<String> stopNames) {
        this.stopNames = stopNames;
    }

    @Override
    public int compareTo(Line line) {
        if (this.getStopNames().size() < line.getStopNames().size()) {
            return -1;
        }
        if (this.getStopNames().size() > line.getStopNames().size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;

        Line line = (Line) o;

        if (!getLineNumber().equals(line.getLineNumber())) return false;
        return getStopNames().equals(line.getStopNames());
    }

    @Override
    public int hashCode() {
        int result = getLineNumber().hashCode();
        result = 31 * result + getStopNames().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber=" + lineNumber +
                ", stopNames=" + stopNames +
                '}';
    }
}
