/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprjyc;
import com.spire.presentation.packages.sprmcl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprttk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprugl;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprwdl;
import com.spire.presentation.packages.sprwjl;

public class spryel
implements sprpl {
    private static final int cfr_renamed_86 = 4;
    private final int cfr_renamed_152;
    private final byte[] cfr_renamed_112;
    private final int cfr_renamed_119;
    private final int[] cfr_renamed_91;
    private final int cfr_renamed_0;
    private String cfr_renamed_1;
    private static final int cfr_renamed_2 = 16;
    private final int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        int n = sprpxe.cfr_renamed_439(arg0, arg1);
        int n2 = sprpxe.cfr_renamed_439(arg0, arg1 + 4);
        int n3 = sprpxe.cfr_renamed_439(arg0, arg1 + 8);
        int n4 = sprpxe.cfr_renamed_439(arg0, arg1 + 12);
        int n5 = spryel.cfr_renamed_10325(n ^ n3);
        int n6 = spryel.cfr_renamed_10325(n2 ^ n4);
        spryel spryel2 = this;
        spryel spryel3 = this;
        spryel3.cfr_renamed_91[0] = spryel3.cfr_renamed_91[0] ^ (n ^ n6);
        spryel3.cfr_renamed_91[1] = spryel3.cfr_renamed_91[1] ^ (n2 ^ n5);
        spryel3.cfr_renamed_91[2] = spryel3.cfr_renamed_91[2] ^ (n3 ^ n6);
        spryel2.cfr_renamed_91[3] = spryel2.cfr_renamed_91[3] ^ (n4 ^ n5);
        spryel2.cfr_renamed_91[4] = spryel2.cfr_renamed_91[4] ^ n6;
        spryel2.cfr_renamed_91[5] = spryel2.cfr_renamed_91[5] ^ n5;
        if (spryel2.cfr_renamed_3 == 16) {
            spryel spryel4 = this;
            spryel4.cfr_renamed_91[6] = spryel4.cfr_renamed_91[6] ^ n6;
            spryel4.cfr_renamed_91[7] = spryel4.cfr_renamed_91[7] ^ n5;
            sprttk.cfr_renamed_10324(sprwdl.cfr_renamed_2413(), this.cfr_renamed_91, arg2);
            return;
        }
        sprttk.cfr_renamed_10329(sprwdl.cfr_renamed_2413(), this.cfr_renamed_91, arg2);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg1 > arg0.length - arg2) {
            throw new sprddl(new StringBuilder().insert(0, this.cfr_renamed_1).append(sprvqo.cfr_renamed_9("W8\u0019!\u0002%W3\u00027\u00114\u0005q\u0003>\u0018q\u00049\u0018#\u0003")).toString());
        }
        if (arg2 < 1) {
            return;
        }
        int n2 = 16 - this.cfr_renamed_4;
        if (arg2 <= n2) {
            spryel spryel2 = this;
            System.arraycopy(arg0, arg1, spryel2.cfr_renamed_112, this.cfr_renamed_4, arg2);
            spryel2.cfr_renamed_4 += arg2;
            return;
        }
        int n3 = 0;
        if (this.cfr_renamed_4 > 0) {
            spryel spryel3 = this;
            System.arraycopy(arg0, arg1, spryel3.cfr_renamed_112, spryel3.cfr_renamed_4, n2);
            spryel spryel4 = this;
            spryel4.cfr_renamed_1337(spryel3.cfr_renamed_112, 0, spryel4.cfr_renamed_152);
            n3 += n2;
        }
        int n4 = arg2;
        while ((n = n4 - n3) > 16) {
            int n5 = arg1 + n3;
            spryel spryel5 = this;
            n3 += 16;
            spryel5.cfr_renamed_1337(arg0, n5, spryel5.cfr_renamed_152);
            n4 = arg2;
        }
        System.arraycopy(arg0, arg1 + n3, this.cfr_renamed_112, 0, n);
        this.cfr_renamed_4 = n;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_1;
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_4 == 16) {
            spryel spryel2 = this;
            spryel2.cfr_renamed_1337(spryel2.cfr_renamed_112, 0, this.cfr_renamed_152);
            spryel2.cfr_renamed_4 = 0;
        }
        this.cfr_renamed_112[this.cfr_renamed_4++] = arg0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        spryel spryel2;
        if (arg1 > arg0.length - this.cfr_renamed_0) {
            throw new sprwjl(new StringBuilder().insert(0, this.cfr_renamed_1).append(sprjyc.cfr_renamed_9("-QcHxL-Zx^k]\u007f\u0018yWb\u0018~PbJy")).toString());
        }
        if (this.cfr_renamed_4 < 16) {
            spryel spryel3 = this;
            spryel spryel4 = this;
            int[] nArray = spryel3.cfr_renamed_91;
            spryel spryel5 = spryel4;
            int n = (spryel4.cfr_renamed_3 >> 1) - 1;
            nArray[n] = nArray[n] ^ 0x1000000;
            spryel3.cfr_renamed_112[this.cfr_renamed_4] = -128;
            while (++spryel5.cfr_renamed_4 < 16) {
                spryel spryel6 = this;
                spryel5 = spryel6;
                this.cfr_renamed_112[spryel6.cfr_renamed_4] = 0;
            }
        } else {
            spryel spryel7 = this;
            int[] nArray = spryel7.cfr_renamed_91;
            int n = (spryel7.cfr_renamed_3 >> 1) - 1;
            nArray[n] = nArray[n] ^ 0x2000000;
        }
        spryel spryel8 = this;
        spryel spryel9 = this;
        spryel9.cfr_renamed_1337(spryel8.cfr_renamed_112, 0, spryel9.cfr_renamed_119);
        sprpxe.cfr_renamed_5171(spryel8.cfr_renamed_91, 0, 4, arg0, arg1);
        if (spryel8.cfr_renamed_3 == 16) {
            spryel spryel10 = this;
            sprttk.cfr_renamed_10324(sprwdl.cfr_renamed_2413(), spryel10.cfr_renamed_91, spryel10.cfr_renamed_152);
            spryel spryel11 = this;
            sprpxe.cfr_renamed_5171(spryel11.cfr_renamed_91, 0, 4, arg0, arg1 + 16);
            spryel spryel12 = this;
            spryel2 = spryel12;
            sprttk.cfr_renamed_10324(sprwdl.cfr_renamed_2413(), spryel12.cfr_renamed_91, this.cfr_renamed_152);
            sprpxe.cfr_renamed_5171(spryel11.cfr_renamed_91, 0, 4, arg0, arg1 + 32);
        } else {
            spryel spryel13 = this;
            sprttk.cfr_renamed_10329(sprwdl.cfr_renamed_2413(), spryel13.cfr_renamed_91, spryel13.cfr_renamed_152);
            spryel spryel14 = this;
            spryel2 = spryel14;
            sprpxe.cfr_renamed_5171(spryel14.cfr_renamed_91, 0, 4, arg0, arg1 + 16);
        }
        spryel2.cfr_renamed_41();
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public spryel(sprmcl sprmcl2) {
        void arg0;
        spryel spryel2 = this;
        spryel2.cfr_renamed_112 = new byte[16];
        spryel2.cfr_renamed_4 = 0;
        switch (sprugl.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                spryel spryel3 = this;
                while (false) {
                }
                spryel spryel4 = this;
                spryel spryel5 = this;
                this.cfr_renamed_1 = "ESCH-256";
                spryel5.cfr_renamed_0 = 32;
                spryel5.cfr_renamed_152 = 7;
                spryel4.cfr_renamed_119 = 11;
                spryel4.cfr_renamed_3 = 12;
                break;
            }
            case 2: {
                spryel spryel3 = this;
                spryel spryel6 = this;
                spryel spryel7 = this;
                this.cfr_renamed_1 = "ESCH-384";
                spryel7.cfr_renamed_0 = 48;
                spryel7.cfr_renamed_152 = 8;
                spryel6.cfr_renamed_119 = 12;
                spryel6.cfr_renamed_3 = 16;
                break;
            }
            default: {
                throw new IllegalArgumentException(sprvqo.cfr_renamed_9(">?\u00010\u001b8\u0013q\u00134\u00118\u00198\u00038\u0018?W>\u0011q$\u0012?\u00066\u0014:\u001cW8\u0019\"\u00030\u00192\u0012"));
            }
        }
        spryel3.cfr_renamed_91 = new int[this.cfr_renamed_3];
    }

    @Override
    public int cfr_renamed_3248() {
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
        spryel spryel2 = this;
        sproze.cfr_renamed_556(spryel2.cfr_renamed_91, 0);
        sproze.cfr_renamed_492(spryel2.cfr_renamed_112, (byte)0);
        spryel2.cfr_renamed_4 = 0;
    }

    private static /* synthetic */ int cfr_renamed_10325(int arg0) {
        return spruaf.cfr_renamed_493(arg0, 16) ^ arg0 & 0xFFFF;
    }
}

