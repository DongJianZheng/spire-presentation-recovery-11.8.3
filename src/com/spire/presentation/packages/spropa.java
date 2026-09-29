/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprg;
import com.spire.presentation.packages.sprwsia;
import com.spire.presentation.packages.sprzxe;
import java.io.IOException;
import java.io.OutputStream;

public class spropa
implements sprg {
    public final byte[] cfr_renamed_2;
    public byte cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    public spropa() {
        byte[] byArray = new byte[64];
        byArray[0] = 65;
        byArray[1] = 66;
        byArray[2] = 67;
        byArray[3] = 68;
        byArray[4] = 69;
        byArray[5] = 70;
        byArray[6] = 71;
        byArray[7] = 72;
        byArray[8] = 73;
        byArray[9] = 74;
        byArray[10] = 75;
        byArray[11] = 76;
        byArray[12] = 77;
        byArray[13] = 78;
        byArray[14] = 79;
        byArray[15] = 80;
        byArray[16] = 81;
        byArray[17] = 82;
        byArray[18] = 83;
        byArray[19] = 84;
        byArray[20] = 85;
        byArray[21] = 86;
        byArray[22] = 87;
        byArray[23] = 88;
        byArray[24] = 89;
        byArray[25] = 90;
        byArray[26] = 97;
        byArray[27] = 98;
        byArray[28] = 99;
        byArray[29] = 100;
        byArray[30] = 101;
        byArray[31] = 102;
        byArray[32] = 103;
        byArray[33] = 104;
        byArray[34] = 105;
        byArray[35] = 106;
        byArray[36] = 107;
        byArray[37] = 108;
        byArray[38] = 109;
        byArray[39] = 110;
        byArray[40] = 111;
        byArray[41] = 112;
        byArray[42] = 113;
        byArray[43] = 114;
        byArray[44] = 115;
        byArray[45] = 116;
        byArray[46] = 117;
        byArray[47] = 118;
        byArray[48] = 119;
        byArray[49] = 120;
        byArray[50] = 121;
        byArray[51] = 122;
        byArray[52] = 48;
        byArray[53] = 49;
        byArray[54] = 50;
        byArray[55] = 51;
        byArray[56] = 52;
        byArray[57] = 53;
        byArray[58] = 54;
        byArray[59] = 55;
        byArray[60] = 56;
        byArray[61] = 57;
        byArray[62] = 43;
        byArray[63] = 47;
        this.cfr_renamed_2 = byArray;
        this.cfr_renamed_3 = (byte)61;
        this.cfr_renamed_4 = new byte[128];
        this.cfr_renamed_495();
    }

    private /* synthetic */ int cfr_renamed_506(String arg0, int arg1, int arg2) {
        int n = arg1;
        while (n < arg2 && this.cfr_renamed_500(arg0.charAt(arg1))) {
            n = ++arg1;
        }
        return arg1;
    }

    private /* synthetic */ boolean cfr_renamed_500(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }

    @Override
    public int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        int n;
        int n2 = 0;
        int n3 = n = arg0.length();
        while (n3 > 0 && this.cfr_renamed_500(arg0.charAt(n - 1))) {
            n3 = --n;
        }
        int n4 = 0;
        int n5 = n - 4;
        int n6 = n4 = this.cfr_renamed_506(arg0, n4, n5);
        while (n6 < n5) {
            spropa spropa2 = this;
            spropa spropa3 = this;
            String string = arg0;
            char c = string.charAt(n4);
            ++n4;
            byte by = this.cfr_renamed_4[c];
            n4 = spropa3.cfr_renamed_506(string, n4, n5);
            char c2 = arg0.charAt(n4);
            ++n4;
            byte by2 = spropa3.cfr_renamed_4[c2];
            n4 = spropa3.cfr_renamed_506(arg0, n4, n5);
            char c3 = arg0.charAt(n4);
            ++n4;
            byte by3 = spropa2.cfr_renamed_4[c3];
            n4 = spropa2.cfr_renamed_506(arg0, n4, n5);
            char c4 = arg0.charAt(n4);
            ++n4;
            byte by4 = spropa2.cfr_renamed_4[c4];
            if ((by | by2 | by3 | by4) < 0) {
                throw new IOException(sprzxe.cfr_renamed_9("J\bU\u0007O\u000fGF@\u000eB\u0014B\u0005W\u0003Q\u0015\u0003\u0003M\u0005L\u0013M\u0012F\u0014F\u0002\u0003\u000fMFA\u0007P\u0003\u0015R\u0003\u0002B\u0012B"));
            }
            OutputStream outputStream = arg1;
            byte by5 = by2;
            outputStream.write(by << 2 | by5 >> 4);
            byte by6 = by3;
            outputStream.write(by5 << 4 | by6 >> 2);
            n2 += 3;
            outputStream.write(by6 << 6 | by4);
            n6 = n4 = this.cfr_renamed_506(arg0, n4, n5);
        }
        return n2 += this.cfr_renamed_507(arg1, arg0.charAt(n - 4), arg0.charAt(n - 3), arg0.charAt(n - 2), arg0.charAt(n - 1));
    }

    private /* synthetic */ int cfr_renamed_508(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        while (n < arg2 && this.cfr_renamed_500((char)arg0[arg1])) {
            n = ++arg1;
        }
        return arg1;
    }

    private /* synthetic */ int cfr_renamed_507(OutputStream arg0, char arg1, char arg2, char arg3, char arg4) throws IOException {
        if (arg3 == this.cfr_renamed_3) {
            spropa spropa2 = this;
            byte by = spropa2.cfr_renamed_4[arg1];
            byte by2 = spropa2.cfr_renamed_4[arg2];
            if ((by | by2) < 0) {
                throw new IOException(sprwsia.cfr_renamed_9("{(d'~/vfq.s4s%f#`52#|%}3|2w4w\"2'ffw(vf} 2$s5wp&fv'f'"));
            }
            arg0.write(by << 2 | by2 >> 4);
            return 1;
        }
        if (arg4 == this.cfr_renamed_3) {
            spropa spropa3 = this;
            byte by = spropa3.cfr_renamed_4[arg1];
            byte by3 = spropa3.cfr_renamed_4[arg2];
            byte by4 = spropa3.cfr_renamed_4[arg3];
            if ((by | by3 | by4) < 0) {
                throw new IOException(sprzxe.cfr_renamed_9("\u000fM\u0010B\nJ\u0002\u0003\u0005K\u0007Q\u0007@\u0012F\u0014PFF\b@\tV\bW\u0003Q\u0003GFB\u0012\u0003\u0003M\u0002\u0003\tEFA\u0007P\u0003\u0015R\u0003\u0002B\u0012B"));
            }
            OutputStream outputStream = arg0;
            byte by5 = by3;
            outputStream.write(by << 2 | by5 >> 4);
            outputStream.write(by5 << 4 | by4 >> 2);
            return 2;
        }
        spropa spropa4 = this;
        byte by = spropa4.cfr_renamed_4[arg1];
        byte by6 = spropa4.cfr_renamed_4[arg2];
        byte by7 = spropa4.cfr_renamed_4[arg3];
        byte by8 = spropa4.cfr_renamed_4[arg4];
        if ((by | by6 | by7 | by8) < 0) {
            throw new IOException(sprwsia.cfr_renamed_9("{(d'~/vfq.s4s%f#`52#|%}3|2w4w\"2'ffw(vf} 2$s5wp&fv'f'"));
        }
        OutputStream outputStream = arg0;
        byte by9 = by6;
        outputStream.write(by << 2 | by9 >> 4);
        byte by10 = by7;
        outputStream.write(by9 << 4 | by10 >> 2);
        outputStream.write(by10 << 6 | by8);
        return 3;
    }

    public void cfr_renamed_495() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = -1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2.length) {
            spropa spropa2 = this;
            byte by = spropa2.cfr_renamed_2[n];
            byte by2 = (byte)n;
            spropa2.cfr_renamed_4[by] = by2;
            n3 = ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        int n3;
        block7: {
            int n4;
            n3 = arg2 % 3;
            int n5 = arg2 - n3;
            int n6 = n4 = arg1;
            while (n6 < arg1 + n5) {
                int n7 = arg0[n4] & 0xFF;
                int n8 = arg0[n4 + 1] & 0xFF;
                int n9 = arg0[n4 + 2] & 0xFF;
                OutputStream outputStream = arg3;
                spropa spropa2 = this;
                arg3.write(this.cfr_renamed_2[n7 >>> 2 & 0x3F]);
                arg3.write(spropa2.cfr_renamed_2[(n7 << 4 | n8 >>> 4) & 0x3F]);
                outputStream.write(spropa2.cfr_renamed_2[(n8 << 2 | n9 >>> 6) & 0x3F]);
                outputStream.write(this.cfr_renamed_2[n9 & 0x3F]);
                n6 = n4 += 3;
            }
            switch (n3) {
                case 0: {
                    break;
                }
                case 1: {
                    int n10 = arg0[arg1 + n5] & 0xFF;
                    n4 = n10 >>> 2 & 0x3F;
                    int n11 = n10 << 4 & 0x3F;
                    n2 = n5;
                    OutputStream outputStream = arg3;
                    spropa spropa3 = this;
                    arg3.write(this.cfr_renamed_2[n4]);
                    arg3.write(spropa3.cfr_renamed_2[n11]);
                    outputStream.write(spropa3.cfr_renamed_3);
                    outputStream.write(this.cfr_renamed_3);
                    break block7;
                }
                case 2: {
                    int n12 = arg0[arg1 + n5] & 0xFF;
                    int n13 = arg0[arg1 + n5 + 1] & 0xFF;
                    n4 = n12 >>> 2 & 0x3F;
                    int n14 = (n12 << 4 | n13 >>> 4) & 0x3F;
                    int n15 = n13 << 2 & 0x3F;
                    OutputStream outputStream = arg3;
                    spropa spropa4 = this;
                    arg3.write(this.cfr_renamed_2[n4]);
                    arg3.write(spropa4.cfr_renamed_2[n14]);
                    outputStream.write(spropa4.cfr_renamed_2[n15]);
                    outputStream.write(this.cfr_renamed_3);
                }
            }
            n2 = n5;
        }
        int n16 = n2 / 3 * 4;
        if (n3 == 0) {
            n = 0;
            return n16 + n;
        }
        n = 4;
        return n16 + n;
    }

    @Override
    public int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        block4: {
            int n3 = 0;
            int n4 = n2 = arg1 + arg2;
            while (n4 > arg1) {
                if (!this.cfr_renamed_500((char)arg0[n2 - 1])) {
                    n = arg1;
                    break block4;
                }
                n4 = --n2;
            }
            n = arg1;
        }
        int n5 = n;
        int n6 = n2 - 4;
        int n7 = n5 = this.cfr_renamed_508(arg0, n5, n6);
        while (n7 < n6) {
            spropa spropa2 = this;
            spropa spropa3 = this;
            byte by = arg0[n5];
            ++n5;
            byte by2 = this.cfr_renamed_4[by];
            n5 = spropa3.cfr_renamed_508(arg0, n5, n6);
            byte by3 = arg0[n5];
            ++n5;
            byte by4 = spropa3.cfr_renamed_4[by3];
            n5 = spropa3.cfr_renamed_508(arg0, n5, n6);
            byte by5 = arg0[n5];
            ++n5;
            byte by6 = spropa2.cfr_renamed_4[by5];
            n5 = spropa2.cfr_renamed_508(arg0, n5, n6);
            byte by7 = arg0[n5];
            ++n5;
            byte by8 = spropa2.cfr_renamed_4[by7];
            if ((by2 | by4 | by6 | by8) < 0) {
                throw new IOException(sprzxe.cfr_renamed_9("J\bU\u0007O\u000fGF@\u000eB\u0014B\u0005W\u0003Q\u0015\u0003\u0003M\u0005L\u0013M\u0012F\u0014F\u0002\u0003\u000fMFA\u0007P\u0003\u0015R\u0003\u0002B\u0012B"));
            }
            OutputStream outputStream = arg3;
            byte by9 = by4;
            outputStream.write(by2 << 2 | by9 >> 4);
            byte by10 = by6;
            outputStream.write(by9 << 4 | by10 >> 2);
            n3 += 3;
            outputStream.write(by10 << 6 | by8);
            n7 = n5 = this.cfr_renamed_508(arg0, n5, n6);
        }
        return n3 += this.cfr_renamed_507(arg3, (char)arg0[n2 - 4], (char)arg0[n2 - 3], (char)arg0[n2 - 2], (char)arg0[n2 - 1]);
    }
}

