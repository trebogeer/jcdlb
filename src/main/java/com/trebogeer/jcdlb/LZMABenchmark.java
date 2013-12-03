package com.trebogeer.jcdlb;

/**
 * @author dimav
 * Date: 8/8/13
 * Time: 1:48 PM
 */
public class LZMABenchmark extends Benchmark{

    public LZMABenchmark(byte[][] data) {
        super(data);
    }

    @Override
    protected byte[] compressDataChunk(byte[] dataChunk) {
        return new byte[0];
    }

    @Override
    protected byte[] deCompressDataChunk(byte[] dataChunk) {
        return new byte[0];
    }
}
