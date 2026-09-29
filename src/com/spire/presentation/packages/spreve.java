/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.util.Hashtable;

public class spreve
extends Hashtable {
    private static final long cfr_renamed_3 = -7457289971962812909L;
    public Hashtable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public Object put(Object object, Object object2) {
        void arg0;
        void arg1;
        spreve spreve2 = this;
        spreve2.cfr_renamed_4.put(arg1, arg0);
        return super.put(object, arg1);
    }

    public Object cfr_renamed_4735(Object arg0) {
        return this.cfr_renamed_4.get(arg0);
    }

    public spreve() {
        spreve spreve2 = this;
        spreve2.cfr_renamed_4 = new Hashtable();
    }
}

