/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdv;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.sprymk;
import java.util.Hashtable;

public class sprmmk
implements sprdv {
    private static final Hashtable cfr_renamed_93;
    private static final long cfr_renamed_86 = 0x800000000000L;
    private sprwj cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 262144;
    private byte[] cfr_renamed_0;
    private long cfr_renamed_1;
    private int cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    static {
        byte[] byArray = new byte[1];
        byArray[0] = 1;
        cfr_renamed_4 = byArray;
        cfr_renamed_93 = new Hashtable();
        cfr_renamed_93.put("SHA-1", spruaf.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-224", spruaf.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-256", spruaf.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-512/256", spruaf.cfr_renamed_279(440));
        cfr_renamed_93.put(sprquo.cfr_renamed_9("|ln\t\u001a\u0015\u001d\u000b\u001d\u0016\u001b"), spruaf.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-384", spruaf.cfr_renamed_279(888));
        cfr_renamed_93.put("SHA-512", spruaf.cfr_renamed_279(888));
    }

    private /* synthetic */ byte[] cfr_renamed_3313(byte[] arg0) {
        sprmmk sprmmk2 = this;
        byte[] byArray = new byte[sprmmk2.cfr_renamed_3.cfr_renamed_1218()];
        sprmmk2.cfr_renamed_3310(arg0, byArray);
        return byArray;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        byte[] byArray;
        byte[] byArray2;
        int n = arg0.length * 8;
        if (n > 262144) {
            throw new IllegalArgumentException(sprkro.cfr_renamed_9("nVMAEQ\u0000LF\u0003BJTP\u0000SEQ\u0000QERUFSW\u0000OINIWEG\u0000WO\u0003\u0012\u0015\u0012\u0012\u0014\u0017"));
        }
        if (this.cfr_renamed_1 > 0x800000000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            byArray2 = new byte[1 + this.cfr_renamed_0.length + arg1.length];
            byArray2[0] = 2;
            System.arraycopy(this.cfr_renamed_0, 0, byArray2, 1, this.cfr_renamed_0.length);
            System.arraycopy(arg1, 0, byArray2, 1 + this.cfr_renamed_0.length, arg1.length);
            sprmmk sprmmk2 = this;
            byArray = sprmmk2.cfr_renamed_3313(byArray2);
            sprmmk2.cfr_renamed_3312(sprmmk2.cfr_renamed_0, byArray);
        }
        sprmmk sprmmk3 = this;
        byArray2 = sprmmk3.cfr_renamed_3311(sprmmk3.cfr_renamed_0, n);
        byArray = new byte[sprmmk3.cfr_renamed_0.length + 1];
        System.arraycopy(this.cfr_renamed_0, 0, byArray, 1, this.cfr_renamed_0.length);
        byArray[0] = 3;
        sprmmk sprmmk4 = this;
        sprmmk sprmmk5 = this;
        byte[] byArray3 = sprmmk5.cfr_renamed_3313(byArray);
        sprmmk5.cfr_renamed_3312(sprmmk5.cfr_renamed_0, byArray3);
        sprmmk4.cfr_renamed_3312(sprmmk5.cfr_renamed_0, this.cfr_renamed_112);
        byte[] byArray4 = new byte[]{(byte)(this.cfr_renamed_1 >> 24), (byte)(this.cfr_renamed_1 >> 16), (byte)(this.cfr_renamed_1 >> 8), (byte)this.cfr_renamed_1};
        this.cfr_renamed_3312(sprmmk4.cfr_renamed_0, byArray4);
        ++sprmmk4.cfr_renamed_1;
        System.arraycopy(byArray2, 0, arg0, 0, arg0.length);
        return n;
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        sprmmk sprmmk2 = this;
        byte[] byArray = sprmmk2.cfr_renamed_3300();
        byte[] byArray2 = sproze.cfr_renamed_526(cfr_renamed_4, this.cfr_renamed_0, byArray, arg0);
        this.cfr_renamed_0 = sprymk.cfr_renamed_9963(sprmmk2.cfr_renamed_3, byArray2, this.cfr_renamed_119);
        byte[] byArray3 = new byte[sprmmk2.cfr_renamed_0.length + 1];
        byArray3[0] = 0;
        System.arraycopy(this.cfr_renamed_0, 0, byArray3, 1, this.cfr_renamed_0.length);
        sprmmk sprmmk3 = this;
        sprmmk3.cfr_renamed_112 = sprymk.cfr_renamed_9963(this.cfr_renamed_3, byArray3, this.cfr_renamed_119);
        sprmmk3.cfr_renamed_1 = 1L;
    }

    /*
     * WARNING - void declaration
     */
    public sprmmk(sprgf sprgf2, int n, sprwj sprwj2, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        if (n > sprymk.cfr_renamed_9962((sprgf)arg0)) {
            throw new IllegalArgumentException(sprquo.cfr_renamed_9("}A^QJW[AK\u0004\\ALQ]M[]\u000fW[VJJHPG\u0004FW\u000fJ@P\u000fWZT_K]PJ@\u000fFV\u0004[LJ\u0004KA]MYE[M@J\u000fBZJLPFKA"));
        }
        if (arg2.cfr_renamed_3225() < arg1) {
            throw new IllegalArgumentException(sprkro.cfr_renamed_9("mOW\u0000FNLUDH\u0003EMTQOSY\u0003FLR\u0003SFCVRJTZ\u0000PTQEMGWH\u0003RFQVIQEG"));
        }
        sprmmk sprmmk2 = this;
        this.cfr_renamed_3 = arg0;
        sprmmk2.cfr_renamed_152 = arg2;
        sprmmk2.cfr_renamed_2 = arg1;
        this.cfr_renamed_119 = (Integer)cfr_renamed_93.get(arg0.cfr_renamed_1315());
        sprmmk sprmmk3 = this;
        byte[] byArray3 = sproze.cfr_renamed_527(sprmmk3.cfr_renamed_3300(), (byte[])arg4, (byte[])arg3);
        this.cfr_renamed_0 = sprymk.cfr_renamed_9963(sprmmk3.cfr_renamed_3, byArray3, this.cfr_renamed_119);
        byte[] byArray4 = new byte[sprmmk3.cfr_renamed_0.length + 1];
        System.arraycopy(this.cfr_renamed_0, 0, byArray4, 1, this.cfr_renamed_0.length);
        sprmmk sprmmk4 = this;
        sprmmk4.cfr_renamed_112 = sprymk.cfr_renamed_9963(this.cfr_renamed_3, byArray4, this.cfr_renamed_119);
        sprmmk4.cfr_renamed_1 = 1L;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_3311(byte[] byArray, int n) {
        int n2;
        void arg0;
        void arg1;
        int n3 = this.cfr_renamed_3.cfr_renamed_1218();
        void var4_4 = arg1 / 8 / n3;
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(arg0, 0, byArray2, 0, ((void)arg0).length);
        byte[] byArray3 = new byte[arg1 / 8];
        byte[] byArray4 = new byte[this.cfr_renamed_3.cfr_renamed_1218()];
        int n4 = n2 = 0;
        while (n4 <= var4_4) {
            this.cfr_renamed_3310(byArray2, byArray4);
            int n5 = byArray3.length - n2 * byArray4.length > byArray4.length ? byArray4.length : byArray3.length - n2 * byArray4.length;
            System.arraycopy(byArray4, 0, byArray3, n2 * byArray4.length, n5);
            this.cfr_renamed_3312(byArray2, cfr_renamed_4);
            n4 = ++n2;
        }
        return byArray3;
    }

    private /* synthetic */ byte[] cfr_renamed_3300() {
        byte[] byArray = this.cfr_renamed_152.cfr_renamed_3300();
        if (byArray.length < (this.cfr_renamed_2 + 7) / 8) {
            throw new IllegalStateException(sprquo.cfr_renamed_9("fJ\\QIBFGFAAP\u000fAAP]K_]\u000fT]KYMKAK\u0004M]\u000fAAP]K_]\u000fW@Q]GJ"));
        }
        return byArray;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_3.cfr_renamed_1218() * 8;
    }

    private /* synthetic */ void cfr_renamed_3312(byte[] arg0, byte[] arg1) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 1;
        while (n4 <= arg1.length) {
            n = (arg0[arg0.length - n2] & 0xFF) + (arg1[arg1.length - n2] & 0xFF) + n3;
            n3 = n > 255 ? 1 : 0;
            int n5 = arg0.length - n2;
            arg0[n5] = (byte)n;
            n4 = ++n2;
        }
        int n6 = n2 = arg1.length + 1;
        while (n6 <= arg0.length) {
            n = (arg0[arg0.length - n2] & 0xFF) + n3;
            n3 = n > 255 ? 1 : 0;
            int n7 = arg0.length - n2;
            arg0[n7] = (byte)n;
            n6 = ++n2;
        }
    }

    private /* synthetic */ void cfr_renamed_3310(byte[] arg0, byte[] arg1) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_3.cfr_renamed_1219(arg1, 0);
    }
}

