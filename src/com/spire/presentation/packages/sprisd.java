/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprnrd;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprsjg;
import com.spire.presentation.packages.spruhe;
import java.util.Collection;
import java.util.Iterator;

public class sprisd
implements sprmn {
    private spruhe cfr_renamed_3;
    private spro cfr_renamed_4;

    public static /* synthetic */ spruhe cfr_renamed_4250(sprisd arg0) {
        return arg0.cfr_renamed_3;
    }

    @Override
    public sprrj cfr_renamed_461() {
        sprisd sprisd2 = this;
        return new sprisd(sprisd2.cfr_renamed_3, sprisd2.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_3232(sprcud arg0, sprcyd arg1) throws sprrrd {
        Collection collection = this.cfr_renamed_4.cfr_renamed_152(new sprnrd(this));
        if (collection.isEmpty()) {
            throw new sprrrd(new StringBuilder().insert(0, sprapm.cfr_renamed_9("v$yVS\u0019GV")).append(this.cfr_renamed_3).append(sprsjg.cfr_renamed_9("C|\ffCt\fg\rv")).toString());
        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (((spreud)iterator.next()).cfr_renamed_4235(arg1.cfr_renamed_114()) == null) continue;
            throw new sprrrd(sprapm.cfr_renamed_9("5P\u0004A\u001fS\u001fV\u0017A\u0013\u0015\u0004P\u0000Z\u001dP\u0012"));
        }
        this.cfr_renamed_3 = arg1.cfr_renamed_1485();
    }

    /*
     * WARNING - void declaration
     */
    public sprisd(spruhe spruhe2, spro spro2) {
        void arg0;
        sprisd sprisd2 = this;
        sprisd2.cfr_renamed_3 = arg0;
        sprisd2.cfr_renamed_4 = spro2;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprisd sprisd2 = (sprisd)arg0;
        sprisd sprisd3 = this;
        sprisd3.cfr_renamed_3 = sprisd2.cfr_renamed_3;
        sprisd3.cfr_renamed_4 = sprisd2.cfr_renamed_4;
    }
}

