/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhmy;
import com.spire.presentation.packages.sprlhs;
import com.spire.presentation.packages.sprtf;
import java.io.IOException;
import java.io.OutputStream;

public class sprwqe
implements sprtf {
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_5215(int arg0) {
        return arg0 * 2;
    }

    public sprwqe() {
        byte[] byArray = new byte[16];
        byArray[0] = 48;
        byArray[1] = 49;
        byArray[2] = 50;
        byArray[3] = 51;
        byArray[4] = 52;
        byArray[5] = 53;
        byArray[6] = 54;
        byArray[7] = 55;
        byArray[8] = 56;
        byArray[9] = 57;
        byArray[10] = 97;
        byArray[11] = 98;
        byArray[12] = 99;
        byArray[13] = 100;
        byArray[14] = 101;
        byArray[15] = 102;
        this.cfr_renamed_4 = byArray;
        this.cfr_renamed_3 = new byte[128];
        this.cfr_renamed_495();
    }

    @Override
    public int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        byte[] byArray;
        int n5;
        block8: {
            n5 = 0;
            byArray = new byte[36];
            n4 = 0;
            int n6 = n3 = arg1 + arg2;
            while (n6 > arg1) {
                if (!sprwqe.cfr_renamed_500((char)arg0[n3 - 1])) {
                    n2 = arg1;
                    break block8;
                }
                n6 = --n3;
            }
            n2 = arg1;
        }
        int n7 = n = n2;
        while (n7 < n3) {
            int n8 = n;
            while (n8 < n3 && sprwqe.cfr_renamed_500((char)arg0[n])) {
                n8 = ++n;
            }
            byte by = arg0[n];
            byte by2 = this.cfr_renamed_3[by];
            int n9 = ++n;
            while (n9 < n3 && sprwqe.cfr_renamed_500((char)arg0[n])) {
                n9 = ++n;
            }
            byte by3 = arg0[n];
            ++n;
            byte by4 = this.cfr_renamed_3[by3];
            if ((by2 | by4) < 0) {
                throw new IOException(sprlhs.cfr_renamed_9("\u0001\u0017\u001e\u0018\u0004\u0010\fY\u000b\u0011\t\u000b\t\u001a\u001c\u001c\u001a\nH\u001c\u0006\u001a\u0007\f\u0006\r\r\u000b\r\u001dH\u0010\u0006Y \u001c\u0010Y\f\u0018\u001c\u0018"));
            }
            byArray[n4++] = (byte)(by2 << 4 | by4);
            if (n4 == byArray.length) {
                arg3.write(byArray);
                n4 = 0;
            }
            ++n5;
            n7 = n;
        }
        if (n4 > 0) {
            arg3.write(byArray, 0, n4);
        }
        return n5;
    }

    public void cfr_renamed_495() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = -1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            sprwqe sprwqe2 = this;
            byte by = sprwqe2.cfr_renamed_4[n];
            byte by2 = (byte)n;
            sprwqe2.cfr_renamed_3[by] = by2;
            n3 = ++n;
        }
        sprwqe sprwqe3 = this;
        sprwqe3.cfr_renamed_3[65] = this.cfr_renamed_3[97];
        sprwqe sprwqe4 = this;
        sprwqe3.cfr_renamed_3[66] = sprwqe4.cfr_renamed_3[98];
        sprwqe4.cfr_renamed_3[67] = this.cfr_renamed_3[99];
        sprwqe3.cfr_renamed_3[68] = this.cfr_renamed_3[100];
        sprwqe3.cfr_renamed_3[69] = this.cfr_renamed_3[101];
        sprwqe3.cfr_renamed_3[70] = this.cfr_renamed_3[102];
    }

    private static /* synthetic */ boolean cfr_renamed_500(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }

    @Override
    public int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        int n;
        int n2;
        int n3 = 0;
        byte[] byArray = new byte[36];
        int n4 = 0;
        int n5 = n2 = arg0.length();
        while (n5 > 0 && sprwqe.cfr_renamed_500(arg0.charAt(n2 - 1))) {
            n5 = --n2;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7 = n;
            while (n7 < n2 && sprwqe.cfr_renamed_500(arg0.charAt(n))) {
                n7 = ++n;
            }
            char c = arg0.charAt(n);
            byte by = this.cfr_renamed_3[c];
            int n8 = ++n;
            while (n8 < n2 && sprwqe.cfr_renamed_500(arg0.charAt(n))) {
                n8 = ++n;
            }
            char c2 = arg0.charAt(n);
            ++n;
            byte by2 = this.cfr_renamed_3[c2];
            if ((by | by2) < 0) {
                throw new IOException(sprhmy.cfr_renamed_9("6W)X3P;\u0019<Q>K>Z+\\-J\u007f\\1Z0L1M:K:]\u007fP1\u0019\u0017\\'\u0019,M-P1^"));
            }
            byArray[n4++] = (byte)(by << 4 | by2);
            if (n4 == byArray.length) {
                arg1.write(byArray);
                n4 = 0;
            }
            ++n3;
            n6 = n;
        }
        if (n4 > 0) {
            arg1.write(byArray, 0, n4);
        }
        return n3;
    }

    @Override
    public int cfr_renamed_3226(int arg0) {
        return arg0 / 2;
    }

    @Override
    public int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        if (arg2 < 0) {
            return 0;
        }
        byte[] byArray = new byte[72];
        int n2 = n = arg2;
        while (n2 > 0) {
            int n3 = Math.min(36, n);
            int n4 = this.cfr_renamed_499(arg0, arg1, n3, byArray, 0);
            arg3.write(byArray, 0, n4);
            arg1 += n3;
            n2 = n - n3;
        }
        return arg2 * 2;
    }

    public int cfr_renamed_499(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IOException {
        int n = arg1;
        int n2 = arg1 + arg2;
        int n3 = arg4;
        int n4 = n;
        while (n4 < n2) {
            int n5 = arg0[n] & 0xFF;
            int n6 = n5;
            arg3[n3++] = this.cfr_renamed_4[n6 >>> 4];
            arg3[n3++] = this.cfr_renamed_4[n6 & 0xF];
            n4 = ++n;
        }
        return n3 - arg4;
    }

    public byte[] cfr_renamed_5216(String arg0, int arg1, int arg2) throws IOException {
        int n;
        if (null == arg0) {
            throw new NullPointerException(sprlhs.cfr_renamed_9("O\n\u001c\u000bOY\u000b\u0018\u0006\u0017\u0007\rH\u001b\rY\u0006\f\u0004\u0015"));
        }
        if (arg1 < 0 || arg2 < 0 || arg1 > arg0.length() - arg2) {
            throw new IndexOutOfBoundsException(sprhmy.cfr_renamed_9("6W)X3P;\u00190_9J:M\u007fX1]pV-\u00193\\1^+Q\u007fJ/\\<P9P:]"));
        }
        if (0 != (arg2 & 1)) {
            throw new IOException(sprlhs.cfr_renamed_9("\u0018H\u0011\r\u0001\t\u001d\r\u001a\u0001\u0014\t\u0015H\u001c\u0006\u001a\u0007\u001d\u0001\u0017\u000fY\u0005\f\u001b\rH\u0011\t\u000f\rY\t\u0017H\u001c\u001e\u001c\u0006Y\u0006\f\u0005\u001b\r\u000bH\u0016\u000eY\u000b\u0011\t\u000b\t\u001a\u001c\u001c\u001a\n"));
        }
        int n2 = arg2 >>> 1;
        byte[] byArray = new byte[n2];
        int n3 = arg1;
        int n4 = n = 0;
        while (n4 < n2) {
            sprwqe sprwqe2 = this;
            char c = arg0.charAt(n3);
            byte by = sprwqe2.cfr_renamed_3[c];
            char c2 = arg0.charAt(++n3);
            ++n3;
            byte by2 = sprwqe2.cfr_renamed_3[c2];
            int n5 = by << 4 | by2;
            if (n5 < 0) {
                throw new IOException(sprhmy.cfr_renamed_9("6W)X3P;\u0019<Q>K>Z+\\-J\u007f\\1Z0L1M:K:]\u007fP1\u0019\u0017\\'\u0019,M-P1^"));
            }
            byArray[n++] = (byte)n5;
            n4 = n;
        }
        return byArray;
    }
}

