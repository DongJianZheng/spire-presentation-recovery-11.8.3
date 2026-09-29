/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruqm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzofa;
import java.util.Enumeration;

public class sprzum
extends sprqqe {
    private final sprhmm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private spruqm cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_11322(sprrvm arg0, sprco arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_5004(arg1);
        }
    }

    public sprktm cfr_renamed_4889() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprzum sprzum2 = this;
        sprrvm2.cfr_renamed_5004(sprzum2.cfr_renamed_2);
        sprzum sprzum3 = this;
        sprzum3.cfr_renamed_11322(sprrvm2, sprzum3.cfr_renamed_3);
        sprzum2.cfr_renamed_11322(sprrvm2, sprzum3.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprhmm cfr_renamed_641() {
        return this.cfr_renamed_2;
    }

    public sprzum(sprhmm arg0) {
        this(arg0, null, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprzum(sprhmm sprhmm2, sprktm sprktm2, spruqm spruqm2) {
        void arg2;
        void arg1;
        void arg0;
        if (sprhmm2 == null) {
            throw new IllegalArgumentException(sprzofa.cfr_renamed_9("Ua\u0019x!e\u0013e\u0007b;\u007f\u0014~U1\u0011p\u001c\u007f\u001deRs\u00171\u001cd\u001e}"));
        }
        sprzum sprzum2 = this;
        sprzum2.cfr_renamed_2 = arg0;
        sprzum2.cfr_renamed_3 = arg1;
        this.cfr_renamed_4 = arg2;
    }

    public spruqm cfr_renamed_4890() {
        return this.cfr_renamed_4;
    }

    public static sprzum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzum) {
            return (sprzum)arg0;
        }
        if (arg0 != null) {
            return new sprzum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprzum(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_2 = sprhmm.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (e instanceof sprktm) {
                this.cfr_renamed_3 = sprktm.cfr_renamed_23(e);
                continue;
            }
            this.cfr_renamed_4 = spruqm.cfr_renamed_23(e);
        }
    }
}

