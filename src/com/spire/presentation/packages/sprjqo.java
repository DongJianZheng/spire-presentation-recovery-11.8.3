/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruxo;
import com.spire.presentation.packages.sprvzb;
import com.spire.presentation.packages.sprwpo;

@sprtea
public class sprjqo
extends sprwpo {
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_18252(sprruo sprruo2) {
        int n;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        arg0.cfr_renamed_15085(12);
        v1.cfr_renamed_15085(0);
        v1.cfr_renamed_12761(16 + 12 * this.cfr_renamed_18631().cfr_renamed_11861());
        v0.cfr_renamed_12761(this.cfr_renamed_4);
        v0.cfr_renamed_12761(this.cfr_renamed_18631().cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_18631().cfr_renamed_11861()) {
            sprjqo sprjqo2 = this;
            int n3 = sprjqo2.cfr_renamed_18631().cfr_renamed_7861(n);
            void v4 = arg0;
            int n4 = n3;
            arg0.cfr_renamed_12761(n4);
            v4.cfr_renamed_12761(n4);
            v4.cfr_renamed_12761((Integer)sprjqo2.cfr_renamed_18631().cfr_renamed_13485(++n));
            n2 = n;
        }
    }

    public static sprjqo cfr_renamed_18632(sprmzo arg0, spruxo arg1) {
        sprmzo sprmzo2 = arg0;
        sprmzo2.cfr_renamed_14060().cfr_renamed_11548(arg1.cfr_renamed_3274());
        int n = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        sprmzo2.cfr_renamed_13218();
        arg0.cfr_renamed_12261();
        sprmzo sprmzo3 = arg0;
        int n2 = sprmzo3.cfr_renamed_12261();
        int n3 = sprmzo3.cfr_renamed_12261();
        sprdsp sprdsp2 = new sprdsp();
        int n4 = 0;
        int n5 = n4;
        while (n5 < n3) {
            sprmzo sprmzo4 = arg0;
            int n6 = sprmzo4.cfr_renamed_12261();
            int n7 = sprmzo4.cfr_renamed_12261();
            int n8 = sprmzo4.cfr_renamed_12261();
            if (n6 > n7 || n6 < 0 || n8 < 0) {
                throw new IllegalStateException(sprvzb.cfr_renamed_9("1c\u000el\u0014d\u001c->b\n`\u0019yI?X*\u001b`\u0019}_-\fl\u001aa\u001d-\u001dc\f\u007f\u0001#"));
            }
            int n9 = n6;
            while (n9 <= n7) {
                int n10;
                sprdsp2.cfr_renamed_12962(n10, n8);
                ++n8;
                n9 = ++n10;
            }
            n5 = ++n4;
        }
        sprdsp2.cfr_renamed_12962(65535, 0);
        return new sprjqo(arg1.cfr_renamed_18634(), arg1.cfr_renamed_18635(), sprdsp2, n2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjqo(int n, int n2, sprdsp sprdsp2, int n3) {
        super((int)arg0, (int)arg1, (sprdsp)arg2);
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = n3;
    }

    public int cfr_renamed_13895() {
        return this.cfr_renamed_4;
    }
}

