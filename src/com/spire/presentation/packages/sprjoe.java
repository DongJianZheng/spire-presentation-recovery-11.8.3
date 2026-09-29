/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxn;
import com.spire.presentation.packages.sprtf;
import java.io.IOException;
import java.io.OutputStream;

public class sprjoe
implements sprtf {
    private final byte[] cfr_renamed_0 = new byte[128];
    private final byte cfr_renamed_1;
    private static final byte cfr_renamed_2 = 61;
    private final byte[] cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    public sprjoe() {
        this.cfr_renamed_3 = cfr_renamed_4;
        this.cfr_renamed_1 = (byte)61;
        this.cfr_renamed_495();
    }

    private /* synthetic */ int cfr_renamed_508(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        while (n < arg2 && this.cfr_renamed_500((char)arg0[arg1])) {
            n = ++arg1;
        }
        return arg1;
    }

    @Override
    public int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        byte[] byArray = sprkoe.cfr_renamed_433(arg0);
        return this.cfr_renamed_272(byArray, 0, byArray.length, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprjoe(byte[] byArray, byte by) {
        void arg1;
        void arg0;
        if (byArray.length != 32) {
            throw new IllegalArgumentException(spridc.cfr_renamed_9(",D*E-C'Mi^(H%OiD,O-Yi^&\n+OiF,D.^!\nz\u0018"));
        }
        sprjoe sprjoe2 = this;
        sprjoe2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        sprjoe2.cfr_renamed_1 = arg1;
        this.cfr_renamed_495();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int cfr_renamed_499(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IOException {
        int n = arg1;
        int n2 = arg1 + arg2 - 4;
        int n3 = arg4;
        int n4 = n;
        while (n4 < n2) {
            int n5 = n;
            this.cfr_renamed_5218(arg0, n5, arg3, n3);
            n3 += 8;
            n4 = n += 5;
        }
        int n6 = arg2 - (n - arg1);
        if (n6 > 0) {
            byte[] byArray = new byte[5];
            System.arraycopy(arg0, n, byArray, 0, n6);
            this.cfr_renamed_5218(byArray, 0, arg3, n3);
            switch (n6) {
                case 1: {
                    int n7 = n3;
                    int n8 = n3;
                    arg3[n3 + 2] = this.cfr_renamed_1;
                    arg3[n8 + 3] = this.cfr_renamed_1;
                    arg3[n8 + 4] = this.cfr_renamed_1;
                    arg3[n3 + 5] = this.cfr_renamed_1;
                    arg3[n7 + 6] = this.cfr_renamed_1;
                    arg3[n7 + 7] = this.cfr_renamed_1;
                    break;
                }
                case 2: {
                    int n9 = n3;
                    arg3[n3 + 4] = this.cfr_renamed_1;
                    arg3[n3 + 5] = this.cfr_renamed_1;
                    arg3[n9 + 6] = this.cfr_renamed_1;
                    arg3[n9 + 7] = this.cfr_renamed_1;
                    break;
                }
                case 3: {
                    int n10 = n3;
                    arg3[n3 + 5] = this.cfr_renamed_1;
                    arg3[n10 + 6] = this.cfr_renamed_1;
                    arg3[n10 + 7] = this.cfr_renamed_1;
                    break;
                }
                case 4: {
                    arg3[n3 + 7] = this.cfr_renamed_1;
                    break;
                }
            }
            n3 += 8;
        }
        return n3 - arg4;
    }

    @Override
    public int cfr_renamed_5215(int arg0) {
        return (arg0 + 4) / 5 * 8;
    }

    private /* synthetic */ boolean cfr_renamed_500(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }

    public void cfr_renamed_495() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = -1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            sprjoe sprjoe2 = this;
            byte by = sprjoe2.cfr_renamed_3[n];
            byte by2 = (byte)n;
            sprjoe2.cfr_renamed_0[by] = by2;
            n3 = ++n;
        }
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
            int n3 = Math.min(45, n);
            int n4 = this.cfr_renamed_499(arg0, arg1, n3, byArray, 0);
            arg3.write(byArray, 0, n4);
            arg1 += n3;
            n2 = n - n3;
        }
        return (arg2 + 2) / 3 * 4;
    }

    @Override
    public int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        byte[] byArray;
        block9: {
            byArray = new byte[55];
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
        while (n8 > arg1 && n7 != 8) {
            if (!this.cfr_renamed_500((char)arg0[n - 1])) {
                ++n7;
            }
            n8 = --n;
        }
        int n9 = n7 = this.cfr_renamed_508(arg0, arg1, n);
        while (n9 < n) {
            sprjoe sprjoe2 = this;
            sprjoe sprjoe3 = this;
            sprjoe sprjoe4 = this;
            sprjoe sprjoe5 = this;
            sprjoe sprjoe6 = this;
            byte by = arg0[n7];
            ++n7;
            byte by2 = this.cfr_renamed_0[by];
            n7 = sprjoe6.cfr_renamed_508(arg0, n7, n);
            byte by3 = arg0[n7];
            ++n7;
            byte by4 = sprjoe6.cfr_renamed_0[by3];
            n7 = sprjoe6.cfr_renamed_508(arg0, n7, n);
            byte by5 = arg0[n7];
            ++n7;
            byte by6 = sprjoe5.cfr_renamed_0[by5];
            n7 = sprjoe5.cfr_renamed_508(arg0, n7, n);
            byte by7 = arg0[n7];
            ++n7;
            byte by8 = sprjoe5.cfr_renamed_0[by7];
            n7 = sprjoe4.cfr_renamed_508(arg0, n7, n);
            byte by9 = arg0[n7];
            ++n7;
            byte by10 = sprjoe4.cfr_renamed_0[by9];
            n7 = sprjoe3.cfr_renamed_508(arg0, n7, n);
            byte by11 = arg0[n7];
            ++n7;
            byte by12 = sprjoe3.cfr_renamed_0[by11];
            n7 = sprjoe3.cfr_renamed_508(arg0, n7, n);
            byte by13 = arg0[n7];
            ++n7;
            byte by14 = sprjoe2.cfr_renamed_0[by13];
            n7 = sprjoe2.cfr_renamed_508(arg0, n7, n);
            byte by15 = arg0[n7];
            ++n7;
            byte by16 = sprjoe2.cfr_renamed_0[by15];
            if ((by2 | by4 | by6 | by8 | by10 | by12 | by14 | by16) < 0) {
                throw new IOException(sprqxn.cfr_renamed_9("R(M'W/_fX.Z4Z%O#I5\u001b#U%T3U2^4^\"\u001b/UfY'H#\bt\u001b\"Z2Z"));
            }
            byte[] byArray2 = byArray;
            byte[] byArray3 = byArray;
            byArray2[n4++] = (byte)(by2 << 3 | by4 >> 2);
            byArray3[n4++] = (byte)(by4 << 6 | by6 << 1 | by8 >> 4);
            byArray2[n4++] = (byte)(by8 << 4 | by10 >> 1);
            byArray3[n4++] = (byte)(by10 << 7 | by12 << 2 | by14 >> 3);
            byArray2[n4++] = (byte)(by14 << 5 | by16);
            if (n4 == byArray.length) {
                arg3.write(byArray);
                n4 = 0;
            }
            n5 += 5;
            n9 = n7 = this.cfr_renamed_508(arg0, n7, n);
        }
        if (n4 > 0) {
            arg3.write(byArray, 0, n4);
        }
        sprjoe sprjoe7 = this;
        sprjoe sprjoe8 = this;
        sprjoe sprjoe9 = this;
        int n10 = this.cfr_renamed_508(arg0, n7, n3);
        int n11 = sprjoe9.cfr_renamed_508(arg0, n10 + 1, n3);
        int n12 = sprjoe9.cfr_renamed_508(arg0, n11 + 1, n3);
        int n13 = this.cfr_renamed_508(arg0, n12 + 1, n3);
        int n14 = sprjoe8.cfr_renamed_508(arg0, n13 + 1, n3);
        int n15 = sprjoe8.cfr_renamed_508(arg0, n14 + 1, n3);
        int n16 = sprjoe7.cfr_renamed_508(arg0, n15 + 1, n3);
        int n17 = sprjoe7.cfr_renamed_508(arg0, n16 + 1, n3);
        return n5 += this.cfr_renamed_5219(arg3, (char)arg0[n10], (char)arg0[n11], (char)arg0[n12], (char)arg0[n13], (char)arg0[n14], (char)arg0[n15], (char)arg0[n16], (char)arg0[n17]);
    }

    private /* synthetic */ int cfr_renamed_5219(OutputStream arg0, char arg1, char arg2, char arg3, char arg4, char arg5, char arg6, char arg7, char arg8) throws IOException {
        if (arg8 == this.cfr_renamed_1) {
            if (arg7 != this.cfr_renamed_1) {
                sprjoe sprjoe2 = this;
                byte by = sprjoe2.cfr_renamed_0[arg1];
                byte by2 = sprjoe2.cfr_renamed_0[arg2];
                byte by3 = sprjoe2.cfr_renamed_0[arg3];
                byte by4 = sprjoe2.cfr_renamed_0[arg4];
                byte by5 = sprjoe2.cfr_renamed_0[arg5];
                byte by6 = sprjoe2.cfr_renamed_0[arg6];
                byte by7 = sprjoe2.cfr_renamed_0[arg7];
                if ((by | by2 | by3 | by4 | by5 | by6 | by7) < 0) {
                    throw new IOException(spridc.cfr_renamed_9(" D?K%C-\n*B(X(I=O;YiO'I&_'^,X,NiK=\n,D-\n&LiH(Y,\u0019{\n-K=K"));
                }
                OutputStream outputStream = arg0;
                byte by8 = by2;
                outputStream.write(by << 3 | by8 >> 2);
                byte by9 = by4;
                outputStream.write(by8 << 6 | by3 << 1 | by9 >> 4);
                byte by10 = by5;
                outputStream.write(by9 << 4 | by10 >> 1);
                outputStream.write(by10 << 7 | by6 << 2 | by7 >> 3);
                return 4;
            }
            if (arg6 != this.cfr_renamed_1) {
                throw new IOException(sprqxn.cfr_renamed_9("/U0Z*R\"\u001b%S'I'X2^4Hf^(X)N(O#I#_fZ2\u001b#U\"\u001b)]fY'H#\bt\u001b\"Z2Z"));
            }
            if (arg5 != this.cfr_renamed_1) {
                sprjoe sprjoe3 = this;
                byte by = sprjoe3.cfr_renamed_0[arg1];
                byte by11 = sprjoe3.cfr_renamed_0[arg2];
                byte by12 = sprjoe3.cfr_renamed_0[arg3];
                byte by13 = sprjoe3.cfr_renamed_0[arg4];
                byte by14 = sprjoe3.cfr_renamed_0[arg5];
                if ((by | by11 | by12 | by13 | by14) < 0) {
                    throw new IOException(spridc.cfr_renamed_9(" D?K%C-\n*B(X(I=O;YiO'I&_'^,X,NiK=\n,D-\n&LiH(Y,\u0019{\n-K=K"));
                }
                OutputStream outputStream = arg0;
                byte by15 = by11;
                outputStream.write(by << 3 | by15 >> 2);
                byte by16 = by13;
                outputStream.write(by15 << 6 | by12 << 1 | by16 >> 4);
                outputStream.write(by16 << 4 | by14 >> 1);
                return 3;
            }
            if (arg4 != this.cfr_renamed_1) {
                sprjoe sprjoe4 = this;
                byte by = sprjoe4.cfr_renamed_0[arg1];
                byte by17 = sprjoe4.cfr_renamed_0[arg2];
                byte by18 = sprjoe4.cfr_renamed_0[arg3];
                byte by19 = sprjoe4.cfr_renamed_0[arg4];
                if ((by | by17 | by18 | by19) < 0) {
                    throw new IOException(sprqxn.cfr_renamed_9("/U0Z*R\"\u001b%S'I'X2^4Hf^(X)N(O#I#_fZ2\u001b#U\"\u001b)]fY'H#\bt\u001b\"Z2Z"));
                }
                OutputStream outputStream = arg0;
                byte by20 = by17;
                outputStream.write(by << 3 | by20 >> 2);
                outputStream.write(by20 << 6 | by18 << 1 | by19 >> 4);
                return 2;
            }
            if (arg3 != this.cfr_renamed_1) {
                throw new IOException(spridc.cfr_renamed_9(" D?K%C-\n*B(X(I=O;YiO'I&_'^,X,NiK=\n,D-\n&LiH(Y,\u0019{\n-K=K"));
            }
            sprjoe sprjoe5 = this;
            byte by = sprjoe5.cfr_renamed_0[arg1];
            byte by21 = sprjoe5.cfr_renamed_0[arg2];
            if ((by | by21) < 0) {
                throw new IOException(sprqxn.cfr_renamed_9("/U0Z*R\"\u001b%S'I'X2^4Hf^(X)N(O#I#_fZ2\u001b#U\"\u001b)]fY'H#\bt\u001b\"Z2Z"));
            }
            arg0.write(by << 3 | by21 >> 2);
            return 1;
        }
        sprjoe sprjoe6 = this;
        byte by = sprjoe6.cfr_renamed_0[arg1];
        byte by22 = sprjoe6.cfr_renamed_0[arg2];
        byte by23 = sprjoe6.cfr_renamed_0[arg3];
        byte by24 = sprjoe6.cfr_renamed_0[arg4];
        byte by25 = sprjoe6.cfr_renamed_0[arg5];
        byte by26 = sprjoe6.cfr_renamed_0[arg6];
        byte by27 = sprjoe6.cfr_renamed_0[arg7];
        byte by28 = sprjoe6.cfr_renamed_0[arg8];
        if ((by | by22 | by23 | by24 | by25 | by26 | by27 | by28) < 0) {
            throw new IOException(spridc.cfr_renamed_9(" D?K%C-\n*B(X(I=O;YiO'I&_'^,X,NiK=\n,D-\n&LiH(Y,\u0019{\n-K=K"));
        }
        OutputStream outputStream = arg0;
        byte by29 = by22;
        outputStream.write(by << 3 | by29 >> 2);
        byte by30 = by24;
        outputStream.write(by29 << 6 | by23 << 1 | by30 >> 4);
        byte by31 = by25;
        outputStream.write(by30 << 4 | by31 >> 1);
        byte by32 = by27;
        outputStream.write(by31 << 7 | by26 << 2 | by32 >> 3);
        outputStream.write(by32 << 5 | by28);
        return 5;
    }

    @Override
    public int cfr_renamed_3226(int arg0) {
        return arg0 / 8 * 5;
    }

    static {
        byte[] byArray = new byte[32];
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
        byArray[26] = 50;
        byArray[27] = 51;
        byArray[28] = 52;
        byArray[29] = 53;
        byArray[30] = 54;
        byArray[31] = 55;
        cfr_renamed_4 = byArray;
    }

    private /* synthetic */ void cfr_renamed_5218(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        byte by = arg0[arg1];
        int n = arg0[++arg1] & 0xFF;
        int n2 = n;
        int n3 = arg0[++arg1] & 0xFF;
        int n4 = n3;
        int n5 = arg0[++arg1] & 0xFF;
        int n6 = n5;
        int n7 = arg0[++arg1] & 0xFF;
        byte[] byArray = arg2;
        byte[] byArray2 = arg2;
        byte[] byArray3 = arg2;
        byArray2[arg3++] = this.cfr_renamed_3[by >>> 3 & 0x1F];
        byArray3[arg3++] = this.cfr_renamed_3[(by << 2 | n2 >>> 6) & 0x1F];
        byArray2[arg3++] = this.cfr_renamed_3[n2 >>> 1 & 0x1F];
        byArray3[arg3++] = this.cfr_renamed_3[(n2 << 4 | n4 >>> 4) & 0x1F];
        byArray[arg3++] = this.cfr_renamed_3[(n4 << 1 | n6 >>> 7) & 0x1F];
        arg2[arg3++] = this.cfr_renamed_3[n6 >>> 2 & 0x1F];
        byArray[arg3++] = this.cfr_renamed_3[(n6 << 3 | n7 >>> 5) & 0x1F];
        byArray[arg3] = this.cfr_renamed_3[n7 & 0x1F];
    }
}

