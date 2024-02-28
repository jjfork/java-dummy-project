package org.example.misc;

public final class MedianOfRunningArrayInteger extends MedianOfRunningArray<Integer> {
    @Override
    public Integer calculateAverage(final Integer a, final Integer b) {
        return (a + b) / 2;
    }
}
