/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwkh;
import com.spire.presentation.packages.sprwys;
import com.spire.presentation.packages.sprywa;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class spreqc
extends BasicPermission {
    private static final int cfr_renamed_102 = 4;
    private static final int cfr_renamed_93 = 8;
    private final int cfr_renamed_86;
    private static final String cfr_renamed_152 = "threadlocalecimplicitlyca";
    private static final String cfr_renamed_112 = "threadlocaldhdefaultparams";
    private static final String cfr_renamed_119 = "dhdefaultparams";
    private static final String cfr_renamed_91 = "ecimplicitlyca";
    private static final int cfr_renamed_0 = 15;
    private final String cfr_renamed_1;
    private static final String cfr_renamed_2 = "all";
    private static final int cfr_renamed_3 = 2;
    private static final int cfr_renamed_4 = 1;

    private /* synthetic */ int cfr_renamed_2463(String arg0) {
        StringTokenizer stringTokenizer = new StringTokenizer(sprywa.cfr_renamed_425(arg0), sprwys.cfr_renamed_9("\"]"));
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String string = stringTokenizer.nextToken();
            if (string.equals(cfr_renamed_152)) {
                n |= 1;
                continue;
            }
            if (string.equals(cfr_renamed_91)) {
                n |= 2;
                continue;
            }
            if (string.equals(cfr_renamed_112)) {
                n |= 4;
                continue;
            }
            if (string.equals(cfr_renamed_119)) {
                n |= 8;
                continue;
            }
            if (!string.equals(cfr_renamed_2)) continue;
            n |= 0xF;
        }
        if (n == 0) {
            throw new IllegalArgumentException(sprwkh.cfr_renamed_9("-@3@7Y6\u000e(K*C1]+G7@+\u000e(O+]=JxZ7\u000e5O+E"));
        }
        return n;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spreqc) {
            spreqc spreqc2 = (spreqc)arg0;
            return this.cfr_renamed_86 == spreqc2.cfr_renamed_86 && this.getName().equals(spreqc2.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public spreqc(String string, String string2) {
        void arg0;
        void arg1;
        void v0 = arg1;
        super((String)arg0, (String)v0);
        this.cfr_renamed_1 = v0;
        this.cfr_renamed_86 = this.cfr_renamed_2463(string2);
    }

    @Override
    public boolean implies(Permission arg0) {
        if (!(arg0 instanceof spreqc)) {
            return false;
        }
        if (!this.getName().equals(arg0.getName())) {
            return false;
        }
        spreqc spreqc2 = (spreqc)arg0;
        return (this.cfr_renamed_86 & spreqc2.cfr_renamed_86) == spreqc2.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public spreqc(String string) {
        void arg0;
        spreqc spreqc2 = this;
        super((String)arg0);
        spreqc2.cfr_renamed_1 = cfr_renamed_2;
        spreqc2.cfr_renamed_86 = 15;
    }

    @Override
    public String getActions() {
        return this.cfr_renamed_1;
    }
}

