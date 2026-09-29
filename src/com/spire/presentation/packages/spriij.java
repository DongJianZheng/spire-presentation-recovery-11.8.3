/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprknb;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprxll;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class spriij
extends BasicPermission {
    private final int cfr_renamed_137;
    private static final String cfr_renamed_79 = "ecimplicitlyca";
    private static final int cfr_renamed_107 = 1;
    private static final String cfr_renamed_132 = "dhdefaultparams";
    private static final int cfr_renamed_102 = 32;
    private static final String cfr_renamed_93 = "additionalecparameters";
    private static final int cfr_renamed_86 = 2;
    private static final int cfr_renamed_152 = 16;
    private static final String cfr_renamed_112 = "threadlocaldhdefaultparams";
    private static final int cfr_renamed_119 = 8;
    private static final int cfr_renamed_91 = 4;
    private static final String cfr_renamed_0 = "acceptableeccurves";
    private static final String cfr_renamed_1 = "all";
    private static final String cfr_renamed_2 = "threadlocalecimplicitlyca";
    private static final int cfr_renamed_3 = 63;
    private final String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spriij(String string, String string2) {
        void arg0;
        void arg1;
        void v0 = arg1;
        super((String)arg0, (String)v0);
        this.cfr_renamed_4 = v0;
        this.cfr_renamed_137 = this.cfr_renamed_2463(string2);
    }

    /*
     * WARNING - void declaration
     */
    public spriij(String string) {
        void arg0;
        spriij spriij2 = this;
        super((String)arg0);
        spriij2.cfr_renamed_4 = cfr_renamed_1;
        spriij2.cfr_renamed_137 = 63;
    }

    @Override
    public String getActions() {
        return this.cfr_renamed_4;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.cfr_renamed_137;
    }

    @Override
    public boolean implies(Permission arg0) {
        if (!(arg0 instanceof spriij)) {
            return false;
        }
        if (!this.getName().equals(arg0.getName())) {
            return false;
        }
        spriij spriij2 = (spriij)arg0;
        return (this.cfr_renamed_137 & spriij2.cfr_renamed_137) == spriij2.cfr_renamed_137;
    }

    private /* synthetic */ int cfr_renamed_2463(String arg0) {
        StringTokenizer stringTokenizer = new StringTokenizer(sprkoe.cfr_renamed_425(arg0), sprknb.cfr_renamed_9("N\u001d"));
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String string = stringTokenizer.nextToken();
            if (string.equals(cfr_renamed_2)) {
                n |= 1;
                continue;
            }
            if (string.equals(cfr_renamed_79)) {
                n |= 2;
                continue;
            }
            if (string.equals(cfr_renamed_112)) {
                n |= 4;
                continue;
            }
            if (string.equals(cfr_renamed_132)) {
                n |= 8;
                continue;
            }
            if (string.equals(cfr_renamed_0)) {
                n |= 0x10;
                continue;
            }
            if (string.equals(cfr_renamed_93)) {
                n |= 0x20;
                continue;
            }
            if (!string.equals(cfr_renamed_1)) continue;
            n |= 0x3F;
        }
        if (n == 0) {
            throw new IllegalArgumentException(sprxll.cfr_renamed_9("!>?>;':p$5&==#'9;>'p$1'#14t$;p91';"));
        }
        return n;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spriij) {
            spriij spriij2 = (spriij)arg0;
            return this.cfr_renamed_137 == spriij2.cfr_renamed_137 && this.getName().equals(spriij2.getName());
        }
        return false;
    }
}

