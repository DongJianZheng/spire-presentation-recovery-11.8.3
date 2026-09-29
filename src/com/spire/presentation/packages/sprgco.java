/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprcvn;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprmbo;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprppc;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsyn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.spruyn;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprgco
extends sprewn {
    private sproxn cfr_renamed_1;
    private sprcrn cfr_renamed_2;
    private sprcvn cfr_renamed_3;
    private sprsyn cfr_renamed_4;

    @sprtea
    public sproxn cfr_renamed_13411() {
        return this.cfr_renamed_1;
    }

    private static /* synthetic */ void cfr_renamed_14851(sprtvp arg0, int arg1, StringBuilder arg2) {
        if (arg0.cfr_renamed_11861() == 0) {
            return;
        }
        sprghha.cfr_renamed_12279(arg2, sprebp.cfr_renamed_14063(arg1));
        arg2.append('[');
        int n = 0;
        int n2 = n;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprghha.cfr_renamed_12279(arg2, sprebp.cfr_renamed_14063(arg0.cfr_renamed_576(n)));
            arg2.append(' ');
            n2 = ++n;
        }
        StringBuilder stringBuilder = arg2;
        n = stringBuilder.length();
        stringBuilder.setLength(n - 1);
        stringBuilder.append(']');
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14295(sprfy sprfy2) {
        void arg0;
        sprgco sprgco2 = this;
        super.cfr_renamed_14295((sprfy)arg0);
        sprgco2.cfr_renamed_4.cfr_renamed_14291((sprfy)arg0);
        sprgco2.cfr_renamed_14852(sprfy2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14852(sprfy sprfy2) {
        void arg0;
        sprgco sprgco2 = this;
        this.cfr_renamed_3.cfr_renamed_14853(sprgco2.cfr_renamed_2, sprfdf.cfr_renamed_9("c7M1G~k7G=V:V*\u000f\u0006a\u0000"));
        sprgco2.cfr_renamed_2.cfr_renamed_14291((sprfy)arg0);
    }

    @sprtea
    public String cfr_renamed_14854(int arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        sprdsp sprdsp2 = this.cfr_renamed_13411().cfr_renamed_14855();
        sprtvp sprtvp2 = new sprtvp();
        int n2 = 0;
        int n3 = 0;
        boolean bl = sprdsp2.cfr_renamed_11861() > 4000;
        int n4 = n = 0;
        while (n4 < sprdsp2.cfr_renamed_11861()) {
            sprdsp sprdsp3 = sprdsp2;
            int n5 = sprdsp3.cfr_renamed_7861(n);
            int n6 = (Integer)sprdsp3.cfr_renamed_13485(n);
            sprgco sprgco2 = this;
            int n7 = super.cfr_renamed_14370(sprgco2.cfr_renamed_13411().cfr_renamed_14856().cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_14372(n6).cfr_renamed_13470());
            if (n7 != arg0) {
                if (bl && sprtvp2.cfr_renamed_11861() > 0 && n5 == n3 + 1) {
                    n3 = n5;
                    sprtvp2.cfr_renamed_12819(n7);
                } else {
                    sprtvp sprtvp3 = sprtvp2;
                    sprgco.cfr_renamed_14851(sprtvp3, n2, stringBuilder);
                    sprtvp3.cfr_renamed_722();
                    n2 = n5;
                    n3 = n5;
                    sprtvp2.cfr_renamed_12819(n7);
                }
            }
            n4 = ++n;
        }
        sprgco.cfr_renamed_14851(sprtvp2, n2, stringBuilder);
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append(']');
        return stringBuilder2.toString();
    }

    public sprgco(sprgdo arg0, boolean arg1, boolean arg2, sprmbo arg3) {
        sprgco sprgco2 = this;
        super(arg0, arg1, arg2, new spruyn(arg3.cfr_renamed_13411()), arg3);
        sprgco2.cfr_renamed_1 = arg3.cfr_renamed_13411();
        this.cfr_renamed_3 = new sprcvn(this.cfr_renamed_1);
        sprgco2.cfr_renamed_4 = new sprsyn(arg0, this);
        sprgco2.cfr_renamed_2 = new sprcrn(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1.cfr_renamed_14086();
        v1.cfr_renamed_14057(sprppc.cfr_renamed_9("kn=J!"), sprfdf.cfr_renamed_9("|d<L'"));
        v0.cfr_renamed_14057(sprppc.cfr_renamed_9("\u0015\u0017O&N=J!"), sprfdf.cfr_renamed_9("\r\u0007[#Gc"));
        this.cfr_renamed_4572().cfr_renamed_14843((spryjn)arg0);
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_14857();
        v0.cfr_renamed_14057(sprppc.cfr_renamed_9("kx%I!|+T0"), sprraia.cfr_renamed_11562(sprfdf.cfr_renamed_9("\r(\u0012."), objectArray));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = this.cfr_renamed_4.cfr_renamed_4570();
        arg0.cfr_renamed_14057(sprppc.cfr_renamed_9("\u0015\u0000_7Y!T [*N\u0002U*N7"), sprraia.cfr_renamed_11562(sprfdf.cfr_renamed_9("\bYc_\u000e"), objectArray2));
        void v4 = arg0;
        v4.cfr_renamed_14057(sprppc.cfr_renamed_9("\u0015\u0010U\u0011T-Y+^!"), this.cfr_renamed_2.cfr_renamed_4570());
        v4.cfr_renamed_14061();
    }
}

