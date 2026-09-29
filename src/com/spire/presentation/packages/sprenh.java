/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprelh;
import com.spire.presentation.packages.sprisda;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsrp;
import com.spire.presentation.packages.spruxm;
import com.spire.presentation.packages.sprxgf;
import java.security.AccessController;

public class sprenh
extends sprqqe {
    private final sprco cfr_renamed_2;
    public static final sprenh cfr_renamed_3 = new sprenh(false, null);
    private final boolean cfr_renamed_4;

    public <T> T cfr_renamed_8134(Class<T> arg0) {
        if (this.cfr_renamed_4) {
            if (this.cfr_renamed_2.getClass().isInstance(arg0)) {
                return arg0.cast(this.cfr_renamed_2);
            }
            return AccessController.doPrivileged(new sprelh(this, arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (!this.cfr_renamed_4) {
            return spruxm.cfr_renamed_4;
        }
        return this.cfr_renamed_1397().cfr_renamed_119();
    }

    public sprco cfr_renamed_1397() {
        if (!this.cfr_renamed_4) {
            return cfr_renamed_3;
        }
        return this.cfr_renamed_2;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.cfr_renamed_4 ? 1 : 0);
        n = 31 * n + (this.cfr_renamed_2 != null ? this.cfr_renamed_2.hashCode() : 0);
        return n;
    }

    public static <T> T cfr_renamed_8135(Class<T> arg0, Object arg1) {
        sprenh sprenh2 = sprenh.cfr_renamed_23(arg1);
        if (!sprenh2.cfr_renamed_4) {
            return null;
        }
        return sprenh2.cfr_renamed_8134(arg0);
    }

    public static sprenh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprenh) {
            return (sprenh)arg0;
        }
        if (arg0 instanceof sprco) {
            return new sprenh(true, (sprco)arg0);
        }
        return cfr_renamed_3;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        if (!super.equals(arg0)) {
            return false;
        }
        sprenh sprenh2 = (sprenh)arg0;
        if (this.cfr_renamed_4 != sprenh2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.equals(sprenh2.cfr_renamed_2);
        }
        return sprenh2.cfr_renamed_2 == null;
    }

    public static /* synthetic */ sprco cfr_renamed_8136(sprenh arg0) {
        return arg0.cfr_renamed_2;
    }

    public boolean cfr_renamed_8117() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        if (this.cfr_renamed_4) {
            return new StringBuilder().insert(0, sprisda.cfr_renamed_9("6\u001e-\u00076\u00008\u0002Q")).append(this.cfr_renamed_2).append(")").toString();
        }
        return sprsrp.cfr_renamed_9("\u0017n\u0005i\u0018x");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprenh(boolean bl, sprco sprco2) {
        void arg0;
        sprenh sprenh2 = this;
        sprenh2.cfr_renamed_4 = arg0;
        sprenh2.cfr_renamed_2 = sprco2;
    }
}

