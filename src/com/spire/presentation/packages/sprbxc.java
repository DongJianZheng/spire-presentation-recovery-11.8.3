/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprdjy;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprlrc;
import com.spire.presentation.packages.sprmsc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprbxc {
    public int cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public short cfr_renamed_4;

    public static sprbxc cfr_renamed_2661(InputStream arg0) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg0);
        if (!sprlrc.cfr_renamed_2963(s)) {
            throw new spryad(47);
        }
        InputStream inputStream = arg0;
        int n = sprzsc.cfr_renamed_2660(inputStream);
        sprmsc sprmsc2 = new sprmsc();
        sprbsa.cfr_renamed_472(inputStream, sprmsc2);
        byte[] byArray = sprmsc2.cfr_renamed_3096(n);
        if (byArray == null) {
            return null;
        }
        int n2 = sprmsc2.size() - byArray.length;
        return new sprbxc(s, byArray, n2);
    }

    public void cfr_renamed_3097(sprsc arg0, OutputStream arg1) throws IOException {
        sprbxc sprbxc2 = this;
        sprzsc.cfr_renamed_2676(sprbxc2.cfr_renamed_4, arg1);
        sprzsc.cfr_renamed_2647(sprbxc2.cfr_renamed_3.length);
        sprzsc.cfr_renamed_2648(this.cfr_renamed_3.length, arg1);
        OutputStream outputStream = arg1;
        outputStream.write(this.cfr_renamed_3);
        byte[] byArray = new byte[this.cfr_renamed_2];
        arg0.cfr_renamed_2866().cfr_renamed_1354(byArray);
        outputStream.write(byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprbxc(short s, byte[] byArray, int n) {
        void arg0;
        void arg2;
        void arg1;
        if (!sprlrc.cfr_renamed_2963(s)) {
            throw new IllegalArgumentException(sprdjy.cfr_renamed_9("zX$\\8\u000b}E.\f3C)\f<\f+M1E9\f\u0015I<^)N8M)a8_.M:I\tU-I}Z<@(I"));
        }
        if (arg1 == null || ((void)arg1).length >= 65536) {
            throw new IllegalArgumentException(sprizd.cfr_renamed_9("pM6D;R6Yp\u001d:H$IwU6K2\u001d;X9Z#Uw\u0001w\u000f\t\fa"));
        }
        if (arg2 < 16) {
            throw new IllegalArgumentException(sprdjy.cfr_renamed_9("\u000b-M9H4B:`8B:X5\u000b}A(_)\f?I}M)\f1I<_)\fl\u001a"));
        }
        sprbxc sprbxc2 = this;
        sprbxc2.cfr_renamed_4 = arg0;
        sprbxc2.cfr_renamed_3 = arg1;
        this.cfr_renamed_2 = arg2;
    }
}

