/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvhb;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprvtk
implements sprmr {
    private static final int cfr_renamed_0 = 16;
    private final int[] cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n = sprpxe.cfr_renamed_446(arg0, arg1);
        int n2 = sprpxe.cfr_renamed_446(arg0, arg1 + 4);
        int n3 = sprpxe.cfr_renamed_446(arg0, arg1 + 8);
        int n4 = sprpxe.cfr_renamed_446(arg0, arg1 + 12);
        sprvtk sprvtk2 = this;
        int n5 = sprvtk2.cfr_renamed_1[0];
        int n6 = sprvtk2.cfr_renamed_1[1];
        int n7 = sprvtk2.cfr_renamed_1[2];
        int n8 = sprvtk2.cfr_renamed_1[3];
        int n9 = 0;
        int n10 = n;
        while (true) {
            int n11;
            int n12;
            n = n10 ^ cfr_renamed_2[n9] & 0xFF;
            int n13 = n12 = n ^ n3;
            n12 = n13 ^ (spruaf.cfr_renamed_494(n12, 8) ^ spruaf.cfr_renamed_494(n13, 24));
            n ^= n5;
            n3 ^= n7;
            int n14 = n11 = (n2 ^= n6) ^ (n4 ^= n8);
            n11 = n14 ^ (spruaf.cfr_renamed_494(n11, 8) ^ spruaf.cfr_renamed_494(n14, 24));
            n ^= n11;
            n2 ^= n12;
            n3 ^= n11;
            n4 ^= n12;
            if (++n9 > 16) break;
            n2 = spruaf.cfr_renamed_494(n2, 1);
            n3 = spruaf.cfr_renamed_494(n3, 5);
            n12 = n4 = spruaf.cfr_renamed_494(n4, 2);
            n2 ^= n4 | n3;
            n4 = n ^ n3 & ~n2;
            n3 = n12 ^ ~n2 ^ n3 ^ n4;
            n = n12 ^ n3 & (n2 ^= n4 | n3);
            n2 = spruaf.cfr_renamed_494(n2, 31);
            n3 = spruaf.cfr_renamed_494(n3, 27);
            n4 = spruaf.cfr_renamed_494(n4, 30);
            n10 = n;
        }
        sprpxe.cfr_renamed_442(n, arg2, arg3);
        sprpxe.cfr_renamed_442(n2, arg2, arg3 + 4);
        sprpxe.cfr_renamed_442(n3, arg2, arg3 + 8);
        sprpxe.cfr_renamed_442(n4, arg2, arg3 + 12);
        return 16;
    }

    public sprvtk() {
        sprvtk sprvtk2 = this;
        sprvtk2.cfr_renamed_1 = new int[4];
        sprvtk2.cfr_renamed_4 = false;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("[\u001eD\u0011^\u0019VPB\u0011@\u0011_\u0015F\u0015@PB\u0011A\u0003W\u0014\u0012\u0004]P|\u001fW\u001bW\u001f\\P[\u001e[\u0004\u0012]\u0012")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        if (byArray.length != 16) {
            throw new IllegalArgumentException(sprvhb.cfr_renamed_9("n\u0007\\BI\u0007K\u0005Q\n\u0005\fJ\u0016\u0005S\u0017Z\u0005\u0000L\u0016VL"));
        }
        sprpxe.cfr_renamed_5163(byArray, 0, this.cfr_renamed_1, 0, 4);
        if (!arg0) {
            int n;
            int n2;
            sprvtk sprvtk2 = this;
            int n3 = sprvtk2.cfr_renamed_1[0];
            int n4 = sprvtk2.cfr_renamed_1[1];
            int n5 = sprvtk2.cfr_renamed_1[2];
            int n6 = sprvtk2.cfr_renamed_1[3];
            int n7 = n2 = n3 ^ n5;
            n2 = n7 ^ (spruaf.cfr_renamed_494(n2, 8) ^ spruaf.cfr_renamed_494(n7, 24));
            int n8 = n = n4 ^ n6;
            n = n8 ^ (spruaf.cfr_renamed_494(n, 8) ^ spruaf.cfr_renamed_494(n8, 24));
            sprvtk2.cfr_renamed_1[0] = n3 ^= n;
            sprvtk2.cfr_renamed_1[1] = n4 ^= n2;
            sprvtk2.cfr_renamed_1[2] = n5 ^= n;
            sprvtk2.cfr_renamed_1[3] = n6 ^= n2;
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = true;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    @Override
    public String cfr_renamed_1315() {
        return sprsqaa.cfr_renamed_9("|\u001fW\u001bW\u001f\\");
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprvhb.cfr_renamed_9("\u0005\fJ\u0016\u0005\u000bK\u000bQ\u000bD\u000eL\u0011@\u0006")).toString());
        }
        if (arg1 > arg0.length - 16) {
            throw new sprddl(sprsqaa.cfr_renamed_9("\u0019\\\u0000G\u0004\u0012\u0012G\u0016T\u0015@PF\u001f]PA\u0018]\u0002F"));
        }
        if (arg3 > arg2.length - 16) {
            throw new sprwjl(sprvhb.cfr_renamed_9("\rP\u0016U\u0017QBG\u0017C\u0004@\u0010\u0005\u0016J\r\u0005\u0011M\rW\u0016"));
        }
        if (this.cfr_renamed_3) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    static {
        byte[] byArray = new byte[17];
        byArray[0] = -128;
        byArray[1] = 27;
        byArray[2] = 54;
        byArray[3] = 108;
        byArray[4] = -40;
        byArray[5] = -85;
        byArray[6] = 77;
        byArray[7] = -102;
        byArray[8] = 47;
        byArray[9] = 94;
        byArray[10] = -68;
        byArray[11] = 99;
        byArray[12] = -58;
        byArray[13] = -105;
        byArray[14] = 53;
        byArray[15] = 106;
        byArray[16] = -44;
        cfr_renamed_2 = byArray;
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n = sprpxe.cfr_renamed_446(arg0, arg1);
        int n2 = sprpxe.cfr_renamed_446(arg0, arg1 + 4);
        int n3 = sprpxe.cfr_renamed_446(arg0, arg1 + 8);
        int n4 = sprpxe.cfr_renamed_446(arg0, arg1 + 12);
        sprvtk sprvtk2 = this;
        int n5 = sprvtk2.cfr_renamed_1[0];
        int n6 = sprvtk2.cfr_renamed_1[1];
        int n7 = sprvtk2.cfr_renamed_1[2];
        int n8 = sprvtk2.cfr_renamed_1[3];
        int n9 = 16;
        int n10 = n;
        while (true) {
            int n11;
            int n12;
            int n13 = n12 = n10 ^ n3;
            n12 = n13 ^ (spruaf.cfr_renamed_494(n12, 8) ^ spruaf.cfr_renamed_494(n13, 24));
            n ^= n5;
            n3 ^= n7;
            int n14 = n11 = (n2 ^= n6) ^ (n4 ^= n8);
            n11 = n14 ^ (spruaf.cfr_renamed_494(n11, 8) ^ spruaf.cfr_renamed_494(n14, 24));
            n ^= n11;
            n2 ^= n12;
            n3 ^= n11;
            n4 ^= n12;
            byte by = cfr_renamed_2[n9];
            n ^= by & 0xFF;
            if (--n9 < 0) break;
            n2 = spruaf.cfr_renamed_494(n2, 1);
            n3 = spruaf.cfr_renamed_494(n3, 5);
            n12 = n4 = spruaf.cfr_renamed_494(n4, 2);
            n2 ^= n4 | n3;
            n4 = n ^ n3 & ~n2;
            n3 = n12 ^ ~n2 ^ n3 ^ n4;
            n = n12 ^ n3 & (n2 ^= n4 | n3);
            n2 = spruaf.cfr_renamed_494(n2, 31);
            n3 = spruaf.cfr_renamed_494(n3, 27);
            n4 = spruaf.cfr_renamed_494(n4, 30);
            n10 = n;
        }
        sprpxe.cfr_renamed_442(n, arg2, arg3);
        sprpxe.cfr_renamed_442(n2, arg2, arg3 + 4);
        sprpxe.cfr_renamed_442(n3, arg2, arg3 + 8);
        sprpxe.cfr_renamed_442(n4, arg2, arg3 + 12);
        return 16;
    }
}

