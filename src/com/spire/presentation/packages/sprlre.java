/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import java.util.Enumeration;
import java.util.Vector;

public class sprlre {
    public Vector cfr_renamed_4;

    public void cfr_renamed_4943(sprlre arg0) {
        Enumeration enumeration;
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_4.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_4.addElement(enumeration3.nextElement());
        }
    }

    public spra cfr_renamed_576(int arg0) {
        return (spra)this.cfr_renamed_4.elementAt(arg0);
    }

    public void cfr_renamed_49(spra arg0) {
        this.cfr_renamed_4.addElement(arg0);
    }

    public sprlre() {
        sprlre sprlre2 = this;
        sprlre2.cfr_renamed_4 = new Vector();
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }
}

