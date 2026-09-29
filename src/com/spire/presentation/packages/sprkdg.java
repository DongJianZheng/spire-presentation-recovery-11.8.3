/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.sprkzf;
import com.spire.presentation.packages.sprluf;
import com.spire.presentation.packages.sprmqr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrvf;

public class sprkdg
extends sprkzf {
    public short[][][] cfr_renamed_119;
    public short[][][] cfr_renamed_91;
    public byte[] cfr_renamed_0;
    public short[][][] cfr_renamed_1;
    public short[][][] cfr_renamed_2;
    public short[][][] cfr_renamed_3;
    public short[][][] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkdg(sprivf sprivf2, byte[] byArray) {
        void arg1;
        void arg0;
        sprivf sprivf3 = sprivf2;
        sprkdg sprkdg2 = this;
        super(false, (sprivf)arg0);
        int n = sprivf3.cfr_renamed_1186();
        int n2 = sprivf3.cfr_renamed_1146();
        if (sprkdg2.cfr_renamed_284().cfr_renamed_3() == sprrvf.cfr_renamed_4) {
            int n3;
            int n4 = n2;
            this.cfr_renamed_91 = new short[n][n4][n4];
            int n5 = 0;
            int n6 = n3 = 0;
            while (n6 < n2) {
                int n7;
                int n8 = n7 = 0;
                while (n8 < n2) {
                    int n9;
                    int n10 = n9 = 0;
                    while (n10 < n) {
                        if (n3 > n7) {
                            this.cfr_renamed_91[n9][n3][n7] = 0;
                        } else {
                            short s = (short)(arg1[n5] & 0xFF);
                            ++n5;
                            this.cfr_renamed_91[n9][n3][n7] = s;
                        }
                        n10 = ++n9;
                    }
                    n8 = ++n7;
                }
                n6 = ++n3;
            }
        } else {
            int n11;
            this.cfr_renamed_0 = sproze.cfr_renamed_533((byte[])arg1, 0, arg0.cfr_renamed_6143());
            this.cfr_renamed_4 = new short[arg0.cfr_renamed_6136()][arg0.cfr_renamed_1947()][arg0.cfr_renamed_6137()];
            this.cfr_renamed_1 = new short[arg0.cfr_renamed_6136()][arg0.cfr_renamed_6136()][arg0.cfr_renamed_6136()];
            this.cfr_renamed_119 = new short[arg0.cfr_renamed_6136()][arg0.cfr_renamed_6136()][arg0.cfr_renamed_6137()];
            this.cfr_renamed_2 = new short[arg0.cfr_renamed_6136()][arg0.cfr_renamed_6137()][arg0.cfr_renamed_6137()];
            this.cfr_renamed_3 = new short[arg0.cfr_renamed_6137()][arg0.cfr_renamed_6137()][arg0.cfr_renamed_6137()];
            int n12 = n11 = arg0.cfr_renamed_6143();
            int n13 = n11 = n12 + sprluf.cfr_renamed_6124(this.cfr_renamed_4, (byte[])arg1, n12, false);
            int n14 = n11 = n13 + sprluf.cfr_renamed_6124(this.cfr_renamed_1, (byte[])arg1, n13, true);
            int n15 = n11 = n14 + sprluf.cfr_renamed_6124(this.cfr_renamed_119, (byte[])arg1, n14, false);
            int n16 = n11 = n15 + sprluf.cfr_renamed_6124(this.cfr_renamed_2, (byte[])arg1, n15, true);
            n11 = n16 + sprluf.cfr_renamed_6124(this.cfr_renamed_3, (byte[])arg1, n16, true);
            if (n11 != ((void)arg1).length) {
                throw new IllegalArgumentException(sprmqr.cfr_renamed_9("J(O'M5Z\"\u001f\"^2^fV(\u001f-Z?\u001f#Q%P\"V(X"));
            }
        }
    }

    public byte[] cfr_renamed_91() {
        if (this.cfr_renamed_284().cfr_renamed_3() != sprrvf.cfr_renamed_4) {
            byte[] byArray = this.cfr_renamed_0;
            byArray = sproze.cfr_renamed_543(this.cfr_renamed_0, sprluf.cfr_renamed_6125(this.cfr_renamed_4, false));
            byArray = sproze.cfr_renamed_543(byArray, sprluf.cfr_renamed_6125(this.cfr_renamed_1, true));
            byArray = sproze.cfr_renamed_543(byArray, sprluf.cfr_renamed_6125(this.cfr_renamed_119, false));
            byArray = sproze.cfr_renamed_543(byArray, sprluf.cfr_renamed_6125(this.cfr_renamed_2, true));
            byArray = sproze.cfr_renamed_543(byArray, sprluf.cfr_renamed_6125(this.cfr_renamed_3, true));
            return byArray;
        }
        return sprluf.cfr_renamed_6125(this.cfr_renamed_91, true);
    }

    /*
     * WARNING - void declaration
     */
    public sprkdg(sprivf sprivf2, byte[] byArray, short[][][] sArray, short[][][] sArray2, short[][][] sArray3, short[][][] sArray4, short[][][] sArray5) {
        super(false, (sprivf)arg0);
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        this.cfr_renamed_0 = (byte[])byArray.clone();
        sprkdg sprkdg2 = this;
        sprkdg sprkdg3 = this;
        this.cfr_renamed_4 = sprluf.cfr_renamed_6123((short[][][])arg2);
        sprkdg3.cfr_renamed_1 = sprluf.cfr_renamed_6123((short[][][])arg3);
        sprkdg3.cfr_renamed_119 = sprluf.cfr_renamed_6123((short[][][])arg4);
        sprkdg2.cfr_renamed_2 = sprluf.cfr_renamed_6123((short[][][])arg5);
        sprkdg2.cfr_renamed_3 = sprluf.cfr_renamed_6123((short[][][])arg6);
    }

    public short[][][] cfr_renamed_3382() {
        return sprluf.cfr_renamed_6123(this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprkdg(sprivf sprivf2, short[][][] sArray, short[][][] sArray2, short[][][] sArray3, short[][][] sArray4, short[][][] sArray5, short[][][] sArray6, short[][][] sArray7, short[][][] sArray8, short[][][] sArray9, short[][][] sArray10, short[][][] sArray11, short[][][] sArray12) {
        int n;
        int n2;
        void arg0;
        sprivf sprivf3 = sprivf2;
        super(false, (sprivf)arg0);
        void v1 = arg0;
        int n3 = v1.cfr_renamed_1947();
        int n4 = v1.cfr_renamed_6136();
        int n5 = sprivf3.cfr_renamed_6137();
        this.cfr_renamed_91 = new short[sprivf3.cfr_renamed_1186()][arg0.cfr_renamed_1146()][arg0.cfr_renamed_1146()];
        int n6 = n2 = 0;
        while (n6 < n4) {
            int n7 = n = 0;
            while (n7 < n3) {
                void arg3;
                void arg2;
                void arg1;
                int n8 = n2;
                System.arraycopy(arg1[n2][n], 0, this.cfr_renamed_91[n2][n], 0, n3);
                System.arraycopy(arg2[n8][n], 0, this.cfr_renamed_91[n2][n], n3, n4);
                void v5 = arg3[n8][n];
                short[] sArray13 = this.cfr_renamed_91[n2][n];
                System.arraycopy(v5, 0, sArray13, n3 + n4, n5);
                n7 = ++n;
            }
            int n9 = n = 0;
            while (n9 < n4) {
                void arg5;
                void arg4;
                int n10 = n2;
                System.arraycopy(arg4[n10][n], 0, this.cfr_renamed_91[n2][n + n3], n3, n4);
                void v9 = arg5[n10][n];
                short[] sArray14 = this.cfr_renamed_91[n2][n + n3];
                System.arraycopy(v9, 0, sArray14, n3 + n4, n5);
                n9 = ++n;
            }
            int n11 = n = 0;
            while (n11 < n5) {
                void arg6;
                void v12 = arg6[n2][n];
                short[] sArray15 = this.cfr_renamed_91[n2][n + n3 + n4];
                System.arraycopy(v12, 0, sArray15, n3 + n4, n5);
                n11 = ++n;
            }
            n6 = ++n2;
        }
        int n12 = n2 = 0;
        while (n12 < n5) {
            int n13 = n = 0;
            while (n13 < n3) {
                void arg9;
                void arg8;
                void arg7;
                int n14 = n2;
                System.arraycopy(arg7[n2][n], 0, this.cfr_renamed_91[n2 + n4][n], 0, n3);
                System.arraycopy(arg8[n14][n], 0, this.cfr_renamed_91[n2 + n4][n], n3, n4);
                void v17 = arg9[n14][n];
                short[] sArray16 = this.cfr_renamed_91[n2 + n4][n];
                System.arraycopy(v17, 0, sArray16, n3 + n4, n5);
                n13 = ++n;
            }
            int n15 = n = 0;
            while (n15 < n4) {
                void arg11;
                void arg10;
                int n16 = n2;
                System.arraycopy(arg10[n16][n], 0, this.cfr_renamed_91[n2 + n4][n + n3], n3, n4);
                void v21 = arg11[n16][n];
                short[] sArray17 = this.cfr_renamed_91[n2 + n4][n + n3];
                System.arraycopy(v21, 0, sArray17, n3 + n4, n5);
                n15 = ++n;
            }
            int n17 = n = 0;
            while (n17 < n5) {
                void arg12;
                void v24 = arg12[n2][n];
                short[] sArray18 = this.cfr_renamed_91[n2 + n4][n + n3 + n4];
                System.arraycopy(v24, 0, sArray18, n3 + n4, n5);
                n17 = ++n;
            }
            n12 = ++n2;
        }
    }
}

