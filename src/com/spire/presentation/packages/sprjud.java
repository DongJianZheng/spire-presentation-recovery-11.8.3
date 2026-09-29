/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprzsd;
import java.util.ArrayList;
import java.util.List;

public class sprjud {
    private final List cfr_renamed_3;
    private final List cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjud(sprcyd sprcyd2) {
        void arg0;
        sprjud sprjud2 = this;
        this.cfr_renamed_3 = new ArrayList(1);
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3.add(arg0.cfr_renamed_568());
    }

    /*
     * WARNING - void declaration
     */
    public sprjud(spro spro2, spro spro3) throws sprlqd {
        void arg0;
        this.cfr_renamed_3 = sprerd.cfr_renamed_4014((spro)arg0);
        if (spro3 != null) {
            void arg1;
            this.cfr_renamed_4 = sprerd.cfr_renamed_4015((spro)arg1);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public sprzsd cfr_renamed_31() {
        if (this.cfr_renamed_4 != null) {
            return new sprzsd(new sprrve(sprerd.cfr_renamed_4016(this.cfr_renamed_3), sprerd.cfr_renamed_4016(this.cfr_renamed_4)));
        }
        return new sprzsd(new sprrve(sprerd.cfr_renamed_4016(this.cfr_renamed_3), null));
    }

    public sprjud(spro arg0) throws sprlqd {
        this(arg0, null);
    }
}

