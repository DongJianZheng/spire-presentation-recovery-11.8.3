/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprgio
extends sprrzn {
    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return sprlny.cfr_renamed_9("/\t$U\u000b\n9\u0018/\u001d$\u001c");
    }

    @sprtea
    public sprgio cfr_renamed_15225(String arg0) {
        sprgio sprgio2 = this;
        sprgio2.cfr_renamed_15421(sprmwd.cfr_renamed_9("\u0016f$t2q9"), arg0);
        return sprgio2;
    }

    @sprtea
    public sprgio() {
        super("Keywords");
    }

    @sprtea
    public sprdz cfr_renamed_13204() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477("Keywords");
        sprvrx<String> sprvrx2 = new sprvrx<String>(sprdz2.size());
        String string = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            string = ((sprnco)iterator.next()).cfr_renamed_15495();
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(string);
        }
        return sprvrx2;
    }

    @sprtea
    public sprgio(sprnco arg0) {
        super(arg0);
    }
}

