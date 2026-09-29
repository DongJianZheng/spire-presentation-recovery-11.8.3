/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprg;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprtsa;
import java.io.IOException;
import java.io.OutputStream;

public class sprnpa
implements sprg {
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2 = n = arg1;
        while (n2 < arg1 + arg2) {
            int n3 = arg0[n] & 0xFF;
            OutputStream outputStream = arg3;
            outputStream.write(this.cfr_renamed_3[n3 >>> 4]);
            outputStream.write(this.cfr_renamed_3[n3 & 0xF]);
            n2 = ++n;
        }
        return arg2 * 2;
    }

    public sprnpa() {
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
        this.cfr_renamed_3 = byArray;
        this.cfr_renamed_4 = new byte[128];
        this.cfr_renamed_495();
    }

    @Override
    public int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        block6: {
            n4 = 0;
            int n5 = n3 = arg1 + arg2;
            while (n5 > arg1) {
                if (!sprnpa.cfr_renamed_500((char)arg0[n3 - 1])) {
                    n2 = arg1;
                    break block6;
                }
                n5 = --n3;
            }
            n2 = arg1;
        }
        int n6 = n = n2;
        while (n6 < n3) {
            int n7 = n;
            while (n7 < n3 && sprnpa.cfr_renamed_500((char)arg0[n])) {
                n7 = ++n;
            }
            byte by = arg0[n];
            byte by2 = this.cfr_renamed_4[by];
            int n8 = ++n;
            while (n8 < n3 && sprnpa.cfr_renamed_500((char)arg0[n])) {
                n8 = ++n;
            }
            byte by3 = arg0[n];
            ++n;
            byte by4 = this.cfr_renamed_4[by3];
            if ((by2 | by4) < 0) {
                throw new IOException(sprtsa.cfr_renamed_9("\u0015F\nI\u0010A\u0018\b\u001f@\u001dZ\u001dK\bM\u000e[\\M\u0012K\u0013]\u0012\\\u0019Z\u0019L\\A\u0012\b4M\u0004\b\u0018I\bI"));
            }
            ++n4;
            arg3.write(by2 << 4 | by4);
            n6 = n;
        }
        return n4;
    }

    @Override
    public int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = arg0.length();
        while (n4 > 0 && sprnpa.cfr_renamed_500(arg0.charAt(n2 - 1))) {
            n4 = --n2;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n;
            while (n6 < n2 && sprnpa.cfr_renamed_500(arg0.charAt(n))) {
                n6 = ++n;
            }
            char c = arg0.charAt(n);
            byte by = this.cfr_renamed_4[c];
            int n7 = ++n;
            while (n7 < n2 && sprnpa.cfr_renamed_500(arg0.charAt(n))) {
                n7 = ++n;
            }
            char c2 = arg0.charAt(n);
            ++n;
            byte by2 = this.cfr_renamed_4[c2];
            if ((by | by2) < 0) {
                throw new IOException(sprign.cfr_renamed_9("M'R(H @iG!E;E*P,V:\u0004,J*K<J=A;A-\u0004 Jil,\\iW=V J."));
            }
            ++n3;
            arg1.write(by << 4 | by2);
            n5 = n;
        }
        return n3;
    }

    public void cfr_renamed_495() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = -1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            sprnpa sprnpa2 = this;
            byte by = sprnpa2.cfr_renamed_3[n];
            byte by2 = (byte)n;
            sprnpa2.cfr_renamed_4[by] = by2;
            n3 = ++n;
        }
        sprnpa sprnpa3 = this;
        sprnpa3.cfr_renamed_4[65] = this.cfr_renamed_4[97];
        sprnpa sprnpa4 = this;
        sprnpa3.cfr_renamed_4[66] = sprnpa4.cfr_renamed_4[98];
        sprnpa4.cfr_renamed_4[67] = this.cfr_renamed_4[99];
        sprnpa3.cfr_renamed_4[68] = this.cfr_renamed_4[100];
        sprnpa3.cfr_renamed_4[69] = this.cfr_renamed_4[101];
        sprnpa3.cfr_renamed_4[70] = this.cfr_renamed_4[102];
    }

    private static /* synthetic */ boolean cfr_renamed_500(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }
}

