/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprove;
import com.spire.presentation.packages.sprtf;
import com.spire.presentation.packages.sprtip;
import java.io.IOException;
import java.io.OutputStream;

public class spryme
implements sprtf {
    public byte cfr_renamed_2;
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    public int cfr_renamed_499(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IOException {
        int n;
        int n2;
        int n3;
        int n4 = arg1;
        int n5 = arg1 + arg2 - 2;
        int n6 = arg4;
        int n7 = n4;
        while (n7 < n5) {
            n3 = arg0[n4];
            int n8 = arg0[++n4] & 0xFF;
            n2 = n8;
            int n9 = arg0[++n4] & 0xFF;
            int n10 = n9;
            byte[] byArray = arg3;
            byArray[n6++] = this.cfr_renamed_3[n3 >>> 2 & 0x3F];
            arg3[n6++] = this.cfr_renamed_3[(n3 << 4 | n2 >>> 4) & 0x3F];
            byArray[n6++] = this.cfr_renamed_3[(n2 << 2 | n10 >>> 6) & 0x3F];
            byArray[n6++] = this.cfr_renamed_3[n10 & 0x3F];
            n7 = ++n4;
        }
        switch (arg2 - (n4 - arg1)) {
            case 1: {
                int n11 = arg0[n4] & 0xFF;
                ++n4;
                n3 = n11;
                byte[] byArray = arg3;
                byte[] byArray2 = arg3;
                byArray[n6++] = this.cfr_renamed_3[n3 >>> 2 & 0x3F];
                byArray2[n6++] = this.cfr_renamed_3[n3 << 4 & 0x3F];
                byArray[n6++] = this.cfr_renamed_2;
                byArray2[n6++] = this.cfr_renamed_2;
                n = n6;
                return n - arg4;
            }
            case 2: {
                int n12 = arg0[n4] & 0xFF;
                n3 = n12;
                int n13 = arg0[++n4] & 0xFF;
                ++n4;
                n2 = n13;
                byte[] byArray = arg3;
                byte[] byArray3 = arg3;
                byArray[n6++] = this.cfr_renamed_3[n3 >>> 2 & 0x3F];
                byArray3[n6++] = this.cfr_renamed_3[(n3 << 4 | n2 >>> 4) & 0x3F];
                byArray[n6++] = this.cfr_renamed_3[n2 << 2 & 0x3F];
                byArray3[n6++] = this.cfr_renamed_2;
                n = n6;
                return n - arg4;
            }
        }
        n = n6;
        return n - arg4;
    }

    @Override
    public int cfr_renamed_3226(int arg0) {
        return arg0 / 4 * 3;
    }

    @Override
    public int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        byte[] byArray;
        block9: {
            byArray = new byte[54];
            n4 = 0;
            int n5 = 0;
            int n6 = n3 = arg1 + arg2;
            while (n6 > arg1) {
                if (!this.cfr_renamed_500((char)arg0[n3 - 1])) {
                    n2 = n3;
                    break block9;
                }
                n6 = --n3;
            }
            n2 = n3;
        }
        if (n2 == 0) {
            return 0;
        }
        int n7 = 0;
        int n8 = n = n3;
        while (n8 > arg1 && n7 != 4) {
            if (!this.cfr_renamed_500((char)arg0[n - 1])) {
                ++n7;
            }
            n8 = --n;
        }
        int n9 = n7 = this.cfr_renamed_508(arg0, arg1, n);
        while (n9 < n) {
            spryme spryme2 = this;
            spryme spryme3 = this;
            byte by = arg0[n7];
            ++n7;
            byte by2 = this.cfr_renamed_4[by];
            n7 = spryme3.cfr_renamed_508(arg0, n7, n);
            byte by3 = arg0[n7];
            ++n7;
            byte by4 = spryme3.cfr_renamed_4[by3];
            n7 = spryme3.cfr_renamed_508(arg0, n7, n);
            byte by5 = arg0[n7];
            ++n7;
            byte by6 = spryme2.cfr_renamed_4[by5];
            n7 = spryme2.cfr_renamed_508(arg0, n7, n);
            byte by7 = arg0[n7];
            ++n7;
            byte by8 = spryme2.cfr_renamed_4[by7];
            if ((by2 | by4 | by6 | by8) < 0) {
                throw new IOException(sprtip.cfr_renamed_9("zwex\u007fpw9pqrkrzg|aj3|}z|l}mvkv}3p}9qx`|%-3}rmr"));
            }
            byte[] byArray2 = byArray;
            byArray2[n4++] = (byte)(by2 << 2 | by4 >> 4);
            byArray[n4++] = (byte)(by4 << 4 | by6 >> 2);
            byArray2[n4++] = (byte)(by6 << 6 | by8);
            if (n4 == byArray.length) {
                arg3.write(byArray);
                n4 = 0;
            }
            n5 += 3;
            n9 = n7 = this.cfr_renamed_508(arg0, n7, n);
        }
        if (n4 > 0) {
            arg3.write(byArray, 0, n4);
        }
        spryme spryme4 = this;
        spryme spryme5 = this;
        int n10 = spryme5.cfr_renamed_508(arg0, n7, n3);
        int n11 = spryme5.cfr_renamed_508(arg0, n10 + 1, n3);
        int n12 = spryme4.cfr_renamed_508(arg0, n11 + 1, n3);
        int n13 = spryme4.cfr_renamed_508(arg0, n12 + 1, n3);
        return n5 += this.cfr_renamed_507(arg3, (char)arg0[n10], (char)arg0[n11], (char)arg0[n12], (char)arg0[n13]);
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
            spryme spryme2 = this;
            byte by = spryme2.cfr_renamed_3[n];
            byte by2 = (byte)n;
            spryme2.cfr_renamed_4[by] = by2;
            n3 = ++n;
        }
    }

    public spryme() {
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
        this.cfr_renamed_3 = byArray;
        this.cfr_renamed_2 = (byte)61;
        this.cfr_renamed_4 = new byte[128];
        this.cfr_renamed_495();
    }

    private /* synthetic */ int cfr_renamed_508(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        while (n < arg2 && this.cfr_renamed_500((char)arg0[arg1])) {
            n = ++arg1;
        }
        return arg1;
    }

    private /* synthetic */ int cfr_renamed_506(String arg0, int arg1, int arg2) {
        int n = arg1;
        while (n < arg2 && this.cfr_renamed_500(arg0.charAt(arg1))) {
            n = ++arg1;
        }
        return arg1;
    }

    @Override
    public int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        byte[] byArray;
        block9: {
            byArray = new byte[54];
            n4 = 0;
            int n5 = 0;
            int n6 = n3 = arg0.length();
            while (n6 > 0) {
                if (!this.cfr_renamed_500(arg0.charAt(n3 - 1))) {
                    n2 = n3;
                    break block9;
                }
                n6 = --n3;
            }
            n2 = n3;
        }
        if (n2 == 0) {
            return 0;
        }
        int n7 = 0;
        int n8 = n = n3;
        while (n8 > 0 && n7 != 4) {
            if (!this.cfr_renamed_500(arg0.charAt(n - 1))) {
                ++n7;
            }
            n8 = --n;
        }
        int n9 = n7 = this.cfr_renamed_506(arg0, 0, n);
        while (n9 < n) {
            spryme spryme2 = this;
            spryme spryme3 = this;
            String string = arg0;
            char c = string.charAt(n7);
            ++n7;
            byte by = this.cfr_renamed_4[c];
            n7 = spryme3.cfr_renamed_506(string, n7, n);
            char c2 = arg0.charAt(n7);
            ++n7;
            byte by2 = spryme3.cfr_renamed_4[c2];
            n7 = spryme3.cfr_renamed_506(arg0, n7, n);
            char c3 = arg0.charAt(n7);
            ++n7;
            byte by3 = spryme2.cfr_renamed_4[c3];
            n7 = spryme2.cfr_renamed_506(arg0, n7, n);
            char c4 = arg0.charAt(n7);
            ++n7;
            byte by4 = spryme2.cfr_renamed_4[c4];
            if ((by | by2 | by3 | by4) < 0) {
                throw new IOException(sprove.cfr_renamed_9("w(h'r/zf}.\u007f4\u007f%j#l5>#p%q3p2{4{\">/pf|'m#(r>\"\u007f2\u007f"));
            }
            byte[] byArray2 = byArray;
            byArray2[n4++] = (byte)(by << 2 | by2 >> 4);
            byArray[n4++] = (byte)(by2 << 4 | by3 >> 2);
            int n10 = n4++;
            n5 += 3;
            byArray2[n10] = (byte)(by3 << 6 | by4);
            if (n4 == byArray.length) {
                arg1.write(byArray);
                n4 = 0;
            }
            n9 = n7 = this.cfr_renamed_506(arg0, n7, n);
        }
        if (n4 > 0) {
            arg1.write(byArray, 0, n4);
        }
        spryme spryme4 = this;
        String string = arg0;
        spryme spryme5 = this;
        int n11 = spryme5.cfr_renamed_506(arg0, n7, n3);
        int n12 = spryme5.cfr_renamed_506(arg0, n11 + 1, n3);
        int n13 = spryme4.cfr_renamed_506(string, n12 + 1, n3);
        int n14 = spryme4.cfr_renamed_506(string, n13 + 1, n3);
        return n5 += this.cfr_renamed_507(arg1, arg0.charAt(n11), arg0.charAt(n12), arg0.charAt(n13), arg0.charAt(n14));
    }

    private /* synthetic */ boolean cfr_renamed_500(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }

    @Override
    public int cfr_renamed_5215(int arg0) {
        return (arg0 + 2) / 3 * 4;
    }

    private /* synthetic */ int cfr_renamed_507(OutputStream arg0, char arg1, char arg2, char arg3, char arg4) throws IOException {
        if (arg3 == this.cfr_renamed_2) {
            if (arg4 != this.cfr_renamed_2) {
                throw new IOException(sprtip.cfr_renamed_9("p}oruz}3z{xaxpmvk`9vwpvfwg|a|w9rm3|}}3vu9qx`|%-3}rmr"));
            }
            spryme spryme2 = this;
            byte by = spryme2.cfr_renamed_4[arg1];
            byte by2 = spryme2.cfr_renamed_4[arg2];
            if ((by | by2) < 0) {
                throw new IOException(sprove.cfr_renamed_9("/p0\u007f*w\">%v'l'}2{4mf{(})k(j#l#zf\u007f2>#p\">)xf|'m#(r>\"\u007f2\u007f"));
            }
            arg0.write(by << 2 | by2 >> 4);
            return 1;
        }
        if (arg4 == this.cfr_renamed_2) {
            spryme spryme3 = this;
            byte by = spryme3.cfr_renamed_4[arg1];
            byte by3 = spryme3.cfr_renamed_4[arg2];
            byte by4 = spryme3.cfr_renamed_4[arg3];
            if ((by | by3 | by4) < 0) {
                throw new IOException(sprtip.cfr_renamed_9("p}oruz}3z{xaxpmvk`9vwpvfwg|a|w9rm3|}}3vu9qx`|%-3}rmr"));
            }
            OutputStream outputStream = arg0;
            byte by5 = by3;
            outputStream.write(by << 2 | by5 >> 4);
            outputStream.write(by5 << 4 | by4 >> 2);
            return 2;
        }
        spryme spryme4 = this;
        byte by = spryme4.cfr_renamed_4[arg1];
        byte by6 = spryme4.cfr_renamed_4[arg2];
        byte by7 = spryme4.cfr_renamed_4[arg3];
        byte by8 = spryme4.cfr_renamed_4[arg4];
        if ((by | by6 | by7 | by8) < 0) {
            throw new IOException(sprove.cfr_renamed_9("/p0\u007f*w\">%v'l'}2{4mf{(})k(j#l#zf\u007f2>#p\">)xf|'m#(r>\"\u007f2\u007f"));
        }
        OutputStream outputStream = arg0;
        byte by9 = by6;
        outputStream.write(by << 2 | by9 >> 4);
        byte by10 = by7;
        outputStream.write(by9 << 4 | by10 >> 2);
        outputStream.write(by10 << 6 | by8);
        return 3;
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
            int n3 = Math.min(54, n);
            int n4 = this.cfr_renamed_499(arg0, arg1, n3, byArray, 0);
            arg3.write(byArray, 0, n4);
            arg1 += n3;
            n2 = n - n3;
        }
        return (arg2 + 2) / 3 * 4;
    }
}

