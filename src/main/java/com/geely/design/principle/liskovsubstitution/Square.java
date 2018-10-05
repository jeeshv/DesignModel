package com.geely.design.principle.liskovsubstitution;

/**
 * Created by Administrator on 2018/10/3.
 */
public class Square extends Rectangle{
    private long sideLength;//边长

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
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
