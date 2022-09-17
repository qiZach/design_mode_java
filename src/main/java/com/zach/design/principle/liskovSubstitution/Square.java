package com.zach.design.principle.liskovSubstitution;

public class Square extends Rectangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        this.sideLength = length;
    }

    @Override
    public void setWidth(long width) {
        this.sideLength = width;
    }
}
