/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprebl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfvk;
import com.spire.presentation.packages.sprjal;
import com.spire.presentation.packages.sprliy;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpvk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprial
implements sprmr {
    private int cfr_renamed_272;
    private static int[] cfr_renamed_145;
    private static final int cfr_renamed_114 = 80;
    private static int[] cfr_renamed_96;
    public static final int cfr_renamed_105 = 256;
    private long[] cfr_renamed_137;
    private static final long cfr_renamed_79 = 2004413935125273122L;
    private static final int cfr_renamed_107 = 80;
    public static final int cfr_renamed_132 = 1024;
    private long[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 16;
    private boolean cfr_renamed_86;
    private static final int cfr_renamed_152 = 72;
    private static int[] cfr_renamed_112;
    private int cfr_renamed_119;
    public static final int cfr_renamed_91 = 512;
    private static final int cfr_renamed_0 = 2;
    private static final int cfr_renamed_1 = 72;
    private static int[] cfr_renamed_2;
    private sprebl cfr_renamed_3;
    private long[] cfr_renamed_4;

    public static /* synthetic */ int[] cfr_renamed_2413() {
        return cfr_renamed_96;
    }

    static {
        int n;
        cfr_renamed_112 = new int[80];
        cfr_renamed_145 = new int[cfr_renamed_112.length];
        cfr_renamed_96 = new int[cfr_renamed_112.length];
        cfr_renamed_2 = new int[cfr_renamed_112.length];
        int n2 = n = 0;
        while (n2 < cfr_renamed_112.length) {
            int n3 = n;
            sprial.cfr_renamed_145[n3] = n3 % 17;
            int n4 = n;
            sprial.cfr_renamed_112[n4] = n4 % 9;
            int n5 = n;
            sprial.cfr_renamed_96[n5] = n5 % 5;
            int n6 = n++;
            sprial.cfr_renamed_2[n6] = n6 % 3;
            n2 = n;
        }
    }

    public static long cfr_renamed_3566(long arg0, int arg1, long arg2) {
        return (arg0 << arg1 | arg0 >>> -arg1) ^ arg2;
    }

    public static void cfr_renamed_3561(long arg0, byte[] arg1, int arg2) {
        sprpxe.cfr_renamed_444(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3563(boolean bl, long[] lArray, long[] lArray2) {
        void arg2;
        void arg0;
        this.cfr_renamed_86 = arg0;
        if (lArray != null) {
            void arg1;
            this.cfr_renamed_3559((long[])arg1);
        }
        if (arg2 != null) {
            this.cfr_renamed_3560((long[])arg2);
        }
    }

    public static long cfr_renamed_3564(long arg0, int arg1, long arg2) {
        long l = arg0 ^ arg2;
        return l >>> arg1 | l << -arg1;
    }

    private /* synthetic */ void cfr_renamed_3560(long[] arg0) {
        if (arg0.length != 2) {
            throw new IllegalArgumentException(sprtar.cfr_renamed_9("txEnK/MzS{\u0000mE/\u0012/W`RkS!"));
        }
        sprial sprial2 = this;
        sprial2.cfr_renamed_137[0] = arg0[0];
        sprial2.cfr_renamed_137[1] = arg0[1];
        sprial2.cfr_renamed_137[2] = this.cfr_renamed_137[0] ^ this.cfr_renamed_137[1];
        sprial2.cfr_renamed_137[3] = this.cfr_renamed_137[0];
        sprial2.cfr_renamed_137[4] = this.cfr_renamed_137[1];
    }

    private /* synthetic */ void cfr_renamed_3559(long[] arg0) {
        int n;
        if (arg0.length != this.cfr_renamed_119) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprliy.cfr_renamed_9("9K\u001fF\bE\u0004P\u0005\u0003\u0006F\u0014\u0003\u0000V\u001eWMA\b\u0003\u001eB\u0000FMP\u0004Y\b\u0003\fPMA\u0001L\u000eHM\u000b")).append(this.cfr_renamed_119).append(sprtar.cfr_renamed_9("/W`RkS&")).toString());
        }
        long l = 2004413935125273122L;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            int n3 = n;
            this.cfr_renamed_4[n3] = arg0[n3];
            l ^= this.cfr_renamed_4[n++];
            n2 = n;
        }
        sprial sprial2 = this;
        sprial2.cfr_renamed_4[sprial2.cfr_renamed_119] = l;
        sprial sprial3 = this;
        System.arraycopy(sprial2.cfr_renamed_4, 0, sprial3.cfr_renamed_4, sprial3.cfr_renamed_119 + 1, this.cfr_renamed_119);
    }

    public static /* synthetic */ int[] cfr_renamed_3555() {
        return cfr_renamed_145;
    }

    public static long cfr_renamed_3562(byte[] arg0, int arg1) {
        return sprpxe.cfr_renamed_443(arg0, arg1);
    }

    public int cfr_renamed_3556(long[] arg0, long[] arg1) throws sprddl, IllegalStateException {
        sprial sprial2;
        sprial sprial3 = this;
        if (sprial3.cfr_renamed_4[sprial3.cfr_renamed_119] == 0L) {
            throw new IllegalStateException(sprliy.cfr_renamed_9("9K\u001fF\bE\u0004P\u0005\u0003\bM\nJ\u0003FMM\u0002WMJ\u0003J\u0019J\fO\u0004P\bG"));
        }
        if (arg0.length != this.cfr_renamed_119) {
            throw new sprddl(sprtar.cfr_renamed_9("iaPzT/BzFiE}\u0000{O`\u0000|H`R{"));
        }
        if (arg1.length != this.cfr_renamed_119) {
            throw new sprwjl(sprliy.cfr_renamed_9("l\u0018W\u001dV\u0019\u0003\u000fV\u000bE\bQMW\u0002LMP\u0005L\u001fW"));
        }
        if (this.cfr_renamed_86) {
            sprial sprial4 = this;
            sprial2 = sprial4;
            sprial4.cfr_renamed_3.cfr_renamed_3557(arg0, arg1);
        } else {
            sprial sprial5 = this;
            sprial2 = sprial5;
            sprial5.cfr_renamed_3.cfr_renamed_3558(arg0, arg1);
        }
        return sprial2.cfr_renamed_119;
    }

    public static /* synthetic */ int[] cfr_renamed_3565() {
        return cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_272;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprtar.cfr_renamed_9("tgRjEiI|H\"")).append(this.cfr_renamed_272 * 8).toString();
    }

    public static /* synthetic */ int[] cfr_renamed_2444() {
        return cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_272 > arg0.length) {
            throw new sprddl(sprliy.cfr_renamed_9("$M\u001dV\u0019\u0003\u000fV\u000bE\bQMW\u0002LMP\u0005L\u001fW"));
        }
        if (arg3 + this.cfr_renamed_272 > arg2.length) {
            throw new sprwjl(sprtar.cfr_renamed_9("@U{PzT/BzFiE}\u0000{O`\u0000|H`R{"));
        }
        sprpxe.cfr_renamed_447(arg0, arg1, this.cfr_renamed_102);
        sprial sprial2 = this;
        sprial sprial3 = this;
        sprial2.cfr_renamed_3556(sprial2.cfr_renamed_102, sprial3.cfr_renamed_102);
        sprpxe.cfr_renamed_459(this.cfr_renamed_102, arg2, arg3);
        return sprial3.cfr_renamed_272;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        byte[] byArray;
        byte[] byArray2;
        Object object;
        if (arg1 instanceof spragk) {
            object = (spragk)arg1;
            byArray2 = ((spragk)object).cfr_renamed_1521().cfr_renamed_1521();
            byArray = ((spragk)object).cfr_renamed_3339();
        } else if (arg1 instanceof sprtpk) {
            byArray2 = ((sprtpk)arg1).cfr_renamed_1521();
            byArray = null;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprliy.cfr_renamed_9("j\u0003U\fO\u0004GMS\fQ\fN\bW\bQMS\fP\u001eF\t\u0003\u0019LMw\u0005Q\bF\u000bJ\u001eKMJ\u0003J\u0019\u0003@\u0003")).append(arg1.getClass().getName()).toString());
        }
        object = null;
        long[] lArray = null;
        if (byArray2 != null) {
            if (byArray2.length != this.cfr_renamed_272) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprtar.cfr_renamed_9("tgRjEiI|H/KjY/MzS{\u0000mE/SnMj\u0000|IuE/A|\u0000mL`Cd\u0000'")).append(this.cfr_renamed_272).append(sprliy.cfr_renamed_9("\u0003\u000fZ\u0019F\u001e\n")).toString());
            }
            object = new long[this.cfr_renamed_119];
            sprpxe.cfr_renamed_447(byArray2, 0, (long[])object);
        }
        if (byArray != null) {
            if (byArray.length != 16) {
                throw new IllegalArgumentException(sprtar.cfr_renamed_9("tgRjEiI|H/TxEnK/MzS{\u0000mE/\u00119\u0000mY{E|"));
            }
            lArray = new long[2];
            sprpxe.cfr_renamed_447(byArray, 0, lArray);
        }
        this.cfr_renamed_3563(arg0, (long[])object, lArray);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 256, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprial(int n) {
        void arg0;
        sprial sprial2 = this;
        this.cfr_renamed_137 = new long[5];
        sprial2.cfr_renamed_272 = arg0 / 8;
        sprial2.cfr_renamed_119 = this.cfr_renamed_272 / 8;
        this.cfr_renamed_102 = new long[this.cfr_renamed_119];
        this.cfr_renamed_4 = new long[2 * this.cfr_renamed_119 + 1];
        switch (n) {
            case 256: {
                sprial sprial3 = this;
                this.cfr_renamed_3 = new sprpvk(sprial3.cfr_renamed_4, sprial3.cfr_renamed_137);
                return;
            }
            case 512: {
                sprial sprial4 = this;
                this.cfr_renamed_3 = new sprfvk(sprial4.cfr_renamed_4, sprial4.cfr_renamed_137);
                return;
            }
            case 1024: {
                sprial sprial5 = this;
                this.cfr_renamed_3 = new sprjal(sprial5.cfr_renamed_4, sprial5.cfr_renamed_137);
                return;
            }
        }
        throw new IllegalArgumentException(sprliy.cfr_renamed_9("$M\u001bB\u0001J\t\u0003\u000fO\u0002@\u0006P\u0004Y\b\u0003@\u00039K\u001fF\bE\u0004P\u0005\u0003\u0004PMG\bE\u0004M\bGMT\u0004W\u0005\u0003\u000fO\u0002@\u0006\u0003\u001eJ\u0017FML\u000b\u0003_\u0016[\u000fM\u0016\\\u0011A\u0003\u0002QM\u0012]\u0011Y\u0003\u000fJ\u0019P"));
    }
}

