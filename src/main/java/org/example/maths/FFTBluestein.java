package org.example.maths;

import java.util.ArrayList;

public class FFTBluestein {

    public static void fftBluestein(ArrayList<FFT.Complex> x, boolean inverse) {
        int N = x.size();
        int bnSize = 2 * N - 1;
        int direction = inverse ? -1 : 1;
        ArrayList<FFT.Complex> an = new ArrayList<>();
        ArrayList<FFT.Complex> bn = new ArrayList<>();

        for (int i = 0; i < bnSize; i++) {
            bn.add(new FFT.Complex());
        }

        for (int i = 0; i < N; i++) {
            double angle = (i - N + 1) * (i - N + 1) * Math.PI / N * direction;
            bn.set(i, new FFT.Complex(Math.cos(angle), Math.sin(angle)));
            bn.set(bnSize - i - 1, new FFT.Complex(Math.cos(angle), Math.sin(angle)));
        }

        for (int i = 0; i < N; i++) {
            double angle = -i * i * Math.PI / N * direction;
            an.add(x.get(i).multiply(new FFT.Complex(Math.cos(angle), Math.sin(angle))));
        }

        ArrayList<FFT.Complex> convolution = ConvolutionFFT.convolutionFFT(an, bn);

        for (int i = 0; i < N; i++) {
            double angle = -1 * i * i * Math.PI / N * direction;
            FFT.Complex bk = new FFT.Complex(Math.cos(angle), Math.sin(angle));
            x.set(i, bk.multiply(convolution.get(i + N - 1)));
        }

        if (inverse) {
            for (int i = 0; i < N; i++) {
                FFT.Complex z = x.get(i);
                x.set(i, z.divide(N));
            }
        }
    }
}
