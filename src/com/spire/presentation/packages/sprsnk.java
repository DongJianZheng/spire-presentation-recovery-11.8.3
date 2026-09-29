/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprciaa;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfxia;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.spryye;

public class sprsnk
implements sprvm {
    private final sprgf cfr_renamed_2;
    private final sprwn cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        void v0;
        spryye spryye2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprbj2 instanceof sprbgk) {
            spryye2 = (spryye)((sprbgk)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            spryye2 = (spryye)arg1;
            v0 = arg0;
        }
        if (v0 != false && !spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprciaa.cfr_renamed_9("\u0013H\u0007O\tO\u0007\u0001\u0012D\u0011T\tS\u0005R@Q\u0012H\u0016@\u0014D@J\u0005X"));
        }
        if (arg0 == false && spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprfxia.cfr_renamed_9("\u001b!\u001f-\u000b-\u000e%\u0019-\u0002*M6\b5\u0018-\u001f!\u001ed\u001d1\u000f(\u0004'M/\b="));
        }
        sprsnk sprsnk2 = this;
        sprsnk2.cfr_renamed_41();
        sprsnk2.cfr_renamed_3.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprmml, sprddl {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprciaa.cfr_renamed_9("f\u0005O\u0005S\tB3H\u0007O\u0005S@O\u000fU@H\u000eH\u0014H\u0001M\tR\u0005E@G\u000fS@R\tF\u000e@\u0014T\u0012D@F\u0005O\u0005S\u0001U\tN\u000e\u000f"));
        }
        sprsnk sprsnk2 = this;
        byte[] byArray = new byte[sprsnk2.cfr_renamed_2.cfr_renamed_1218()];
        sprsnk2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return sprsnk2.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprfxia.cfr_renamed_9("*!\u0003!\u001f-\u000e\u0017\u0004#\u0003!\u001fd\u0003+\u0019d\u0004*\u00040\u0004%\u0001-\u001e!\td\u000b+\u001fd\u001b!\u001f-\u000b-\u000e%\u0019-\u0002*"));
        }
        sprsnk sprsnk2 = this;
        byte[] byArray = new byte[sprsnk2.cfr_renamed_2.cfr_renamed_1218()];
        sprsnk2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = this.cfr_renamed_3.cfr_renamed_1337(arg0, 0, arg0.length);
            if (byArray2.length < byArray.length) {
                byte[] byArray3 = new byte[byArray.length];
                System.arraycopy(byArray2, 0, byArray3, byArray3.length - byArray2.length, byArray2.length);
                byArray2 = byArray3;
            }
            return sproze.cfr_renamed_559(byArray2, byArray);
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsnk(sprwn sprwn2, sprgf sprgf2) {
        void arg0;
        sprsnk sprsnk2 = this;
        sprsnk2.cfr_renamed_3 = arg0;
        sprsnk2.cfr_renamed_2 = sprgf2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }
}

