package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end) : null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number<=1000 && number>=1;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return end >= start;
    }

    public String generateTable(int start, int end) {
        StringBuilder line = new StringBuilder();
        for (int i=start; i<=end; i++){
            line.append(generateLine(start, i)).append(System.lineSeparator());
        }
        return line.toString().trim();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (int i=start; i<=row; i++){
            line.append(generateSingleExpression(i, row)).append("  ");
        }
        return line.toString().trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d", multiplicand, multiplier, multiplicand*multiplier);
    }
}
