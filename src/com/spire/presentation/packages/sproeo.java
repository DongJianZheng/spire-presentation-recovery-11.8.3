/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sproeo
extends sprrzn
implements sprhz {
    @sprtea
    public sproeo() {
        super("Bookmark");
    }

    @sprtea
    public String cfr_renamed_13190() {
        return this.cfr_renamed_15482("Name");
    }

    @sprtea
    public sproeo cfr_renamed_15914(String arg0) {
        sproeo sproeo2 = this;
        sproeo2.cfr_renamed_15480("Name", arg0);
        return sproeo2;
    }

    @sprtea
    public sproeo(String string) {
        sproeo sproeo2 = this;
        sproeo2();
        sproeo2.cfr_renamed_15914(string);
    }

    @sprtea
    public sproeo(sprnco arg0) {
        super(arg0);
    }
}

