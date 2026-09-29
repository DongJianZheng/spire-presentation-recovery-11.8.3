/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spral;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprchf;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdze;
import com.spire.presentation.packages.spreye;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.sprnff;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprsxe;
import com.spire.presentation.packages.sprugf;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprycb;
import com.spire.presentation.packages.sprygf;
import java.security.SecureRandom;

public class sprzze
implements sprwn {
    private SecureRandom cfr_renamed_0;
    private sprygf cfr_renamed_1;
    private sprugf cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprnff cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_5614(sprgf arg0) {
        sprgf sprgf2 = arg0;
        byte[] byArray = new byte[sprgf2.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        if (this.cfr_renamed_3) {
            sprzze sprzze2 = this;
            return sprzze2.cfr_renamed_5615(byArray, sprzze2.cfr_renamed_1);
        }
        return this.cfr_renamed_5616(byArray, this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_2.cfr_renamed_91;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3) {
            sprzze sprzze2;
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprzze sprzze3 = this;
                sprzze3.cfr_renamed_0 = sprbgk2.cfr_renamed_1295();
                sprzze3.cfr_renamed_1 = (sprygf)sprbgk2.cfr_renamed_284();
                sprzze2 = this;
            } else {
                this.cfr_renamed_0 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_1 = (sprygf)arg1;
                sprzze2 = this;
            }
            sprzze2.cfr_renamed_2 = this.cfr_renamed_1.cfr_renamed_284();
            return;
        }
        this.cfr_renamed_4 = (sprnff)arg1;
        this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_284();
    }

    public sprhgf cfr_renamed_5617(sprhgf arg0, spral arg1, sprhgf arg2) {
        sprhgf sprhgf2;
        sprhgf sprhgf3 = sprhgf2 = arg1.cfr_renamed_3238(arg2, this.cfr_renamed_2.cfr_renamed_93);
        sprhgf3.cfr_renamed_5454(arg0, this.cfr_renamed_2.cfr_renamed_93);
        sprhgf3.cfr_renamed_766(this.cfr_renamed_2.cfr_renamed_93);
        return sprhgf3;
    }

    private /* synthetic */ sprhm cfr_renamed_1334(byte[] arg0, byte[] arg1) {
        sprdze sprdze2 = new sprdze(arg0, this.cfr_renamed_2);
        if (this.cfr_renamed_2.cfr_renamed_185 == 1) {
            sprzze sprzze2 = this;
            sprsxe sprsxe2 = new sprsxe(sprzze2.cfr_renamed_5618(sprdze2, sprzze2.cfr_renamed_2.cfr_renamed_88));
            sprzze sprzze3 = this;
            sprsxe sprsxe3 = new sprsxe(sprzze3.cfr_renamed_5618(sprdze2, sprzze3.cfr_renamed_2.cfr_renamed_126));
            sprzze sprzze4 = this;
            sprsxe sprsxe4 = new sprsxe(sprzze4.cfr_renamed_5618(sprdze2, sprzze4.cfr_renamed_2.cfr_renamed_96));
            return new spreye(sprsxe2, sprsxe3, sprsxe4);
        }
        sprzze sprzze5 = this;
        int n = sprzze5.cfr_renamed_2.spr\ufe34;
        boolean bl = sprzze5.cfr_renamed_2.cfr_renamed_0;
        int[] nArray = this.cfr_renamed_5618(sprdze2, n);
        if (bl) {
            return new sprsxe(nArray);
        }
        return new sprchf(nArray);
    }

    private /* synthetic */ byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, arg1 < arg0.length ? arg1 : arg0.length);
        return byArray;
    }

    private /* synthetic */ byte[] cfr_renamed_5616(byte[] arg0, sprnff arg1) throws sprull {
        sprhgf sprhgf2;
        sprhgf sprhgf3;
        sprhgf sprhgf4;
        sprnff sprnff2 = arg1;
        sprhm sprhm2 = sprnff2.cfr_renamed_3;
        sprhgf sprhgf5 = sprnff2.cfr_renamed_4;
        sprhgf sprhgf6 = sprnff2.cfr_renamed_2;
        sprzze sprzze2 = this;
        int n = sprzze2.cfr_renamed_2.cfr_renamed_119;
        int n2 = sprzze2.cfr_renamed_2.cfr_renamed_93;
        int n3 = sprzze2.cfr_renamed_2.cfr_renamed_152;
        int n4 = sprzze2.cfr_renamed_2.cfr_renamed_91;
        int n5 = sprzze2.cfr_renamed_2.cfr_renamed_4;
        int n6 = sprzze2.cfr_renamed_2.cfr_renamed_114;
        int n7 = sprzze2.cfr_renamed_2.cfr_renamed_86;
        boolean bl = sprzze2.cfr_renamed_2.cfr_renamed_137;
        byte[] byArray = sprzze2.cfr_renamed_2.cfr_renamed_272;
        if (n4 > 255) {
            throw new sprddl(sprycb.cfr_renamed_9("V\u0004C(H\u0002w\u0000U'B\u0011^\u0016\u001b\u0013Z\tN\u0000HEY\f\\\u0002^\u0017\u001b\u0011S\u0004UE\tP\u000eEZ\u0017^EU\nOEH\u0010K\u0015T\u0017O\u0000_"));
        }
        int n8 = n3 / 8;
        sprhgf sprhgf7 = sprhgf.cfr_renamed_768(arg0, n, n2);
        sprhgf sprhgf8 = this.cfr_renamed_5619(sprhgf7, sprhm2, sprhgf5);
        if (sprhgf8.cfr_renamed_780(-1) < n5) {
            throw new sprull(sprrob.cfr_renamed_9("\u0006J9\\j[\"N$\u000f.Bz\u000f)@/I,F)F/A>\\jJ;Z+Cj\u0002{"));
        }
        if (sprhgf8.cfr_renamed_780(0) < n5) {
            throw new sprull(sprycb.cfr_renamed_9(")^\u0016HEO\rZ\u000b\u001b\u0001VU\u001b\u0006T\u0000]\u0003R\u0006R\u0000U\u0011HE^\u0014N\u0004WE\u000b"));
        }
        if (sprhgf8.cfr_renamed_780(1) < n5) {
            throw new sprull(sprrob.cfr_renamed_9("c/\\9\u000f>G+AjK'\u001fjL%J,I#L#J$[9\u000f/^?N&\u000f{"));
        }
        sprhgf sprhgf9 = sprhgf4 = (sprhgf)sprhgf7.clone();
        sprhgf9.cfr_renamed_5456(sprhgf8);
        sprhgf9.cfr_renamed_762(n2);
        sprhgf sprhgf10 = sprhgf3 = (sprhgf)sprhgf9.clone();
        sprhgf10.cfr_renamed_762(4);
        byte[] byArray2 = sprhgf10.cfr_renamed_783(4);
        sprhgf sprhgf11 = this.cfr_renamed_1333(byArray2, n, n7, bl);
        sprhgf sprhgf12 = sprhgf8;
        sprhgf12.cfr_renamed_5456(sprhgf11);
        sprhgf12.cfr_renamed_756();
        byte[] byArray3 = sprhgf12.cfr_renamed_775();
        byte[] byArray4 = new byte[n8];
        System.arraycopy(byArray3, 0, byArray4, 0, n8);
        int n9 = byArray3[n8] & 0xFF;
        if (n9 > n4) {
            throw new sprull(new StringBuilder().insert(0, sprycb.cfr_renamed_9("(^\u0016H\u0004\\\u0000\u001b\u0011T\n\u001b\tT\u000b\\_\u001b")).append(n9).append(">").append(n4).toString());
        }
        byte[] byArray5 = new byte[n9];
        System.arraycopy(byArray3, n8 + 1, byArray5, 0, n9);
        byte[] byArray6 = new byte[byArray3.length - (n8 + 1 + n9)];
        System.arraycopy(byArray3, n8 + 1 + n9, byArray6, 0, byArray6.length);
        if (!sproze.cfr_renamed_559(byArray6, new byte[byArray6.length])) {
            throw new sprull(sprrob.cfr_renamed_9("\u001eG/\u000f'J9\\+H/\u000f#\\jA%[jI%C&@=J.\u000f(VjU/]%J9"));
        }
        byte[] byArray7 = sprhgf6.cfr_renamed_783(n2);
        sprzze sprzze3 = this;
        byte[] byArray8 = sprzze3.cfr_renamed_523(byArray7, n6 / 8);
        sprhgf sprhgf13 = sprhgf2 = sprzze3.cfr_renamed_1334(sprzze3.cfr_renamed_1335(byArray, byArray5, n9, byArray4, byArray8), byArray5).cfr_renamed_5442(sprhgf6);
        sprhgf13.cfr_renamed_762(n2);
        if (!sprhgf13.equals(sprhgf4)) {
            throw new sprull(sprycb.cfr_renamed_9(",U\u0013Z\tR\u0001\u001b\b^\u0016H\u0004\\\u0000\u001b\u0000U\u0006T\u0001R\u000b\\"));
        }
        return byArray5;
    }

    public sprhgf cfr_renamed_5619(sprhgf arg0, sprhm arg1, sprhgf arg2) {
        sprhgf sprhgf2;
        sprhgf sprhgf3;
        sprhgf sprhgf4;
        if (this.cfr_renamed_2.cfr_renamed_3) {
            sprhgf sprhgf5 = sprhgf4 = arg1.cfr_renamed_3238(arg0, this.cfr_renamed_2.cfr_renamed_93);
            sprhgf3 = sprhgf5;
            sprhgf5.cfr_renamed_751(3);
            sprhgf5.cfr_renamed_5444(arg0);
        } else {
            sprhgf3 = sprhgf4 = arg1.cfr_renamed_3238(arg0, this.cfr_renamed_2.cfr_renamed_93);
        }
        sprhgf3.cfr_renamed_767(this.cfr_renamed_2.cfr_renamed_93);
        sprhgf4.cfr_renamed_756();
        sprhgf sprhgf6 = sprhgf2 = this.cfr_renamed_2.cfr_renamed_3 ? sprhgf4 : new sprchf(sprhgf4).cfr_renamed_3238(arg2, 3);
        sprhgf6.cfr_renamed_767(3);
        return sprhgf6;
    }

    private /* synthetic */ int cfr_renamed_1340(int arg0) {
        if (arg0 == 2048) {
            return 11;
        }
        throw new IllegalStateException(sprrob.cfr_renamed_9("C%Hx\u000f$@>\u000f,Z&C3\u000f#B:C/B/A>J."));
    }

    private /* synthetic */ int[] cfr_renamed_5618(sprdze arg0, int arg1) {
        int n;
        int[] nArray = new int[this.cfr_renamed_2.cfr_renamed_119];
        int n2 = n = -1;
        while (n2 <= 1) {
            int n3 = 0;
            while (n3 < arg1) {
                int n4 = arg0.cfr_renamed_1336();
                if (nArray[n4] != 0) continue;
                ++n3;
                nArray[n4] = n;
            }
            n2 = n += 2;
        }
        return nArray;
    }

    private /* synthetic */ sprhgf cfr_renamed_1333(byte[] arg0, int arg1, int arg2, boolean arg3) {
        Object object;
        int n;
        sprgf sprgf2 = this.cfr_renamed_2.cfr_renamed_2;
        int n2 = sprgf2.cfr_renamed_1218();
        byte[] byArray = new byte[arg2 * n2];
        byte[] byArray2 = arg3 ? this.cfr_renamed_5620(sprgf2, arg0) : arg0;
        int n3 = n = 0;
        while (n3 < arg2) {
            sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprzze sprzze2 = this;
            sprzze2.cfr_renamed_5621(sprgf2, n);
            byte[] byArray3 = sprzze2.cfr_renamed_5614(sprgf2);
            object = byArray3;
            System.arraycopy(byArray3, 0, byArray, n++ * n2, n2);
            n3 = n;
        }
        object = new sprhgf(arg1);
        while (true) {
            int n4;
            int n5 = 0;
            int n6 = n4 = 0;
            while (n6 != byArray.length) {
                int n7 = byArray[n4] & 0xFF;
                if (n7 < 243) {
                    int n8;
                    int n9 = n8 = 0;
                    while (n9 < 4) {
                        int n10 = n7 % 3;
                        ((sprhgf)object).cfr_renamed_3[n5++] = n10 - 1;
                        if (n5 == arg1) {
                            return object;
                        }
                        n7 = (n7 - n10) / 3;
                        n9 = ++n8;
                    }
                    ((sprhgf)object).cfr_renamed_3[n5++] = n7 - 1;
                    if (n5 == arg1) {
                        return object;
                    }
                }
                n6 = ++n4;
            }
            if (n5 >= arg1) {
                return object;
            }
            sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprzze sprzze3 = this;
            sprzze3.cfr_renamed_5621(sprgf2, n);
            ++n;
            byte[] byArray4 = sprzze3.cfr_renamed_5614(sprgf2);
            byArray = byArray4;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5621(sprgf sprgf2, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg1;
        arg0.cfr_renamed_1221((byte)(arg1 >> 24));
        arg0.cfr_renamed_1221((byte)(v1 >> 16));
        v0.cfr_renamed_1221((byte)(v1 >> 8));
        v0.cfr_renamed_1221((byte)n);
    }

    private /* synthetic */ byte[] cfr_renamed_1335(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, byte[] arg4) {
        byte[] byArray = new byte[arg0.length + arg2 + arg3.length + arg4.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
        System.arraycopy(arg3, 0, byArray, arg0.length + arg1.length, arg3.length);
        System.arraycopy(arg4, 0, byArray, arg0.length + arg1.length + arg3.length, arg4.length);
        return byArray;
    }

    @Override
    public int cfr_renamed_1339() {
        sprzze sprzze2 = this;
        return (this.cfr_renamed_2.cfr_renamed_119 * sprzze2.cfr_renamed_1340(sprzze2.cfr_renamed_2.cfr_renamed_93) + 7) / 8;
    }

    private /* synthetic */ byte[] cfr_renamed_5620(sprgf arg0, byte[] arg1) {
        sprgf sprgf2 = arg0;
        byte[] byArray = new byte[sprgf2.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1197(arg1, 0, arg1.length);
        arg0.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte[] cfr_renamed_5615(byte[] arg0, sprygf arg1) {
        sprhgf sprhgf2 = arg1.cfr_renamed_4;
        sprzze sprzze2 = this;
        int n = sprzze2.cfr_renamed_2.cfr_renamed_119;
        int n2 = sprzze2.cfr_renamed_2.cfr_renamed_93;
        int n3 = sprzze2.cfr_renamed_2.cfr_renamed_91;
        int n4 = sprzze2.cfr_renamed_2.cfr_renamed_152;
        int n5 = sprzze2.cfr_renamed_2.cfr_renamed_102;
        int n6 = sprzze2.cfr_renamed_2.cfr_renamed_4;
        int n7 = sprzze2.cfr_renamed_2.cfr_renamed_114;
        int n8 = sprzze2.cfr_renamed_2.cfr_renamed_86;
        boolean bl = sprzze2.cfr_renamed_2.cfr_renamed_137;
        byte[] byArray = sprzze2.cfr_renamed_2.cfr_renamed_272;
        int n9 = arg0.length;
        if (n3 > 255) {
            throw new IllegalArgumentException(sprycb.cfr_renamed_9("W\t^\u000b\u001b\u0013Z\tN\u0000HEY\f\\\u0002^\u0017\u001b\u0011S\u0004UE\nEZ\u0017^EU\nOEH\u0010K\u0015T\u0017O\u0000_"));
        }
        if (n9 > n3) {
            throw new sprddl(new StringBuilder().insert(0, sprrob.cfr_renamed_9("b/\\9N-Jj[%@jC%A-\u0015j")).append(n9).append(">").append(n3).toString());
        }
        int n10 = n4;
        while (true) {
            sprhgf sprhgf3;
            byte[] byArray2 = new byte[n10 / 8];
            this.cfr_renamed_0.nextBytes(byArray2);
            byte[] byArray3 = new byte[n3 + 1 - n9];
            byte[] byArray4 = new byte[n5 / 8];
            System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length);
            byArray4[byArray2.length] = (byte)n9;
            System.arraycopy(arg0, 0, byArray4, byArray2.length + 1, arg0.length);
            System.arraycopy(byArray3, 0, byArray4, byArray2.length + 1 + arg0.length, byArray3.length);
            sprhgf sprhgf4 = sprhgf.cfr_renamed_776(byArray4, n);
            byte[] byArray5 = sprhgf2.cfr_renamed_783(n2);
            sprzze sprzze3 = this;
            byte[] byArray6 = sprzze3.cfr_renamed_523(byArray5, n7 / 8);
            sprhgf sprhgf5 = sprzze3.cfr_renamed_1334(sprzze3.cfr_renamed_1335(byArray, arg0, n9, byArray2, byArray6), byArray4).cfr_renamed_3238(sprhgf2, n2);
            sprhgf sprhgf6 = sprhgf3 = (sprhgf)sprhgf5.clone();
            sprhgf6.cfr_renamed_762(4);
            byte[] byArray7 = sprhgf6.cfr_renamed_783(4);
            sprhgf sprhgf7 = this.cfr_renamed_1333(byArray7, n, n8, bl);
            sprhgf sprhgf8 = sprhgf4;
            sprhgf8.cfr_renamed_5444(sprhgf7);
            sprhgf8.cfr_renamed_756();
            if (sprhgf8.cfr_renamed_780(-1) < n6) {
                n10 = n4;
                continue;
            }
            if (sprhgf4.cfr_renamed_780(0) < n6) {
                n10 = n4;
                continue;
            }
            if (sprhgf4.cfr_renamed_780(1) >= n6) {
                sprhgf sprhgf9 = sprhgf5;
                int n11 = n2;
                sprhgf5.cfr_renamed_5454(sprhgf4, n2);
                sprhgf9.cfr_renamed_766(n11);
                return sprhgf9.cfr_renamed_783(n11);
            }
            n10 = n4;
        }
    }
}

