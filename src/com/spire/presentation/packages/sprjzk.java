/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprut;

public class sprjzk
implements sprjs {
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private sprfwk cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_10159(byte[] arg0, byte[] arg1) {
        sprjzk sprjzk2;
        if (arg0 == null) {
            sprjzk sprjzk3 = this;
            sprjzk2 = sprjzk3;
            sprjzk3.cfr_renamed_3.cfr_renamed_5692(new sprtpk(new byte[this.cfr_renamed_0]));
        } else {
            sprjzk sprjzk4 = this;
            sprjzk2 = sprjzk4;
            sprjzk4.cfr_renamed_3.cfr_renamed_5692(new sprtpk(arg0));
        }
        sprjzk2.cfr_renamed_3.cfr_renamed_1197(arg1, 0, arg1.length);
        sprjzk sprjzk5 = this;
        byte[] byArray = new byte[sprjzk5.cfr_renamed_0];
        sprjzk5.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        sprjzk sprjzk2;
        if (!(arg0 instanceof sprivk)) {
            throw new IllegalArgumentException(sprkza.cfr_renamed_9("0\u000e<\u0003X5\u00197\u0019(\u001d1\u001d7\u000be\n \t0\u00117\u001d!X#\u00177X\r\u0013!\u001e\u0007\u00011\u001d6? \u0016 \n$\f*\n"));
        }
        sprivk sprivk2 = (sprivk)arg0;
        if (sprivk2.cfr_renamed_3366()) {
            sprjzk sprjzk3 = this;
            sprjzk2 = sprjzk3;
            sprjzk3.cfr_renamed_3.cfr_renamed_5692(new sprtpk(sprivk2.cfr_renamed_3362()));
        } else {
            sprjzk sprjzk4 = this;
            sprjzk2 = sprjzk4;
            sprjzk4.cfr_renamed_3.cfr_renamed_5692(new sprtpk(this.cfr_renamed_10159(sprivk2.cfr_renamed_1477(), sprivk2.cfr_renamed_3362())));
        }
        sprjzk2.cfr_renamed_1 = sprivk2.cfr_renamed_3365();
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_4 = new byte[this.cfr_renamed_0];
    }

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_3.cfr_renamed_3069();
    }

    /*
     * WARNING - void declaration
     */
    public sprjzk(sprgf sprgf2) {
        void arg0;
        sprjzk sprjzk2 = this;
        this.cfr_renamed_3 = new sprfwk((sprgf)arg0);
        this.cfr_renamed_0 = sprgf2.cfr_renamed_1218();
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        if (this.cfr_renamed_2 + arg2 > 255 * this.cfr_renamed_0) {
            throw new sprddl(sprhnn.cfr_renamed_9("T(X%<\u000e}\u001a<\fr\u000feC~\u0006<\u0016o\u0006xCz\fnC.V)C6CT\u0002o\u000bP\u0006rC~\u001ah\u0006oCs\u0005<\fi\u0017l\u0016h"));
        }
        sprjzk sprjzk2 = this;
        if (sprjzk2.cfr_renamed_2 % sprjzk2.cfr_renamed_0 == 0) {
            this.cfr_renamed_3513();
        }
        int n = arg2;
        sprjzk sprjzk3 = this;
        sprjzk sprjzk4 = this;
        int n2 = sprjzk3.cfr_renamed_2 % sprjzk4.cfr_renamed_0;
        sprjzk sprjzk5 = this;
        int n3 = Math.min(sprjzk3.cfr_renamed_0 - sprjzk5.cfr_renamed_2 % sprjzk5.cfr_renamed_0, n);
        System.arraycopy(sprjzk4.cfr_renamed_4, n2, arg0, arg1, n3);
        sprjzk3.cfr_renamed_2 += n3;
        arg1 += n3;
        int n4 = n -= n3;
        while (n4 > 0) {
            sprjzk sprjzk6 = this;
            sprjzk6.cfr_renamed_3513();
            n3 = Math.min(sprjzk6.cfr_renamed_0, n);
            System.arraycopy(sprjzk6.cfr_renamed_4, 0, arg0, arg1, n3);
            sprjzk6.cfr_renamed_2 += n3;
            arg1 += n3;
            n4 = n -= n3;
        }
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_3513() throws sprddl {
        sprjzk sprjzk2 = this;
        int n = sprjzk2.cfr_renamed_2 / sprjzk2.cfr_renamed_0 + 1;
        if (n >= 256) {
            throw new sprddl(sprkza.cfr_renamed_9("0\u000e<\u0003X&\u0019+\u0016*\fe\u001f \u0016 \n$\f X(\u00177\u001de\f-\u0019+XwMpX'\u0014*\u001b.\u000be\u0017#X\r\u00196\u0010\t\u001d+X6\u0011?\u001d"));
        }
        if (this.cfr_renamed_2 != 0) {
            sprjzk sprjzk3 = this;
            sprjzk3.cfr_renamed_3.cfr_renamed_1197(sprjzk3.cfr_renamed_4, 0, this.cfr_renamed_0);
        }
        sprjzk sprjzk4 = this;
        sprjzk4.cfr_renamed_3.cfr_renamed_1197(sprjzk4.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        sprjzk sprjzk5 = this;
        sprjzk5.cfr_renamed_3.cfr_renamed_1221((byte)n);
        sprjzk5.cfr_renamed_3.cfr_renamed_1219(this.cfr_renamed_4, 0);
    }
}

