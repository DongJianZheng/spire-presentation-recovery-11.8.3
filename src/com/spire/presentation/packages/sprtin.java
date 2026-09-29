/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrp;
import com.spire.presentation.packages.sprdr;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtyo;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprxy;
import java.util.Iterator;

@sprtea
public final class sprtin
implements sprdr {
    private static Object cfr_renamed_1 = new Object();
    private sprdr cfr_renamed_2;
    private sprtyo cfr_renamed_3;
    private boolean cfr_renamed_4 = false;

    /*
     * WARNING - void declaration
     */
    public sprtin(sprdr sprdr2) {
        void arg0;
        sprtin sprtin2 = this;
        this.cfr_renamed_3 = new sprtyo();
        if (sprdr2 == null) {
            throw new NullPointerException(sprbrp.cfr_renamed_9("L]IHENS"));
        }
        this.cfr_renamed_2 = arg0;
    }

    private /* synthetic */ sprtin() {
        sprtin sprtin2 = this;
        this.cfr_renamed_3 = new sprtyo();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cfr_renamed_11540(boolean arg0) {
        sprtin sprtin2;
        if (this.cfr_renamed_4) {
            return;
        }
        if (arg0) {
            Object object = cfr_renamed_1;
            synchronized (object) {
                if (this.cfr_renamed_2 != null) {
                    this.cfr_renamed_2 = null;
                }
                if (this.cfr_renamed_3 != null) {
                    Iterator iterator = this.cfr_renamed_3.cfr_renamed_205().iterator();
                    while (iterator.hasNext()) {
                        if ((sprxy)iterator.next() == null) continue;
                    }
                    this.cfr_renamed_3 = null;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 1, 7] lbl15 : MonitorExitStatement: MONITOREXIT : var2_2
                sprtin2 = this;
            }
        } else {
            sprtin2 = this;
        }
        sprtin2.cfr_renamed_4 = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public sprxy cfr_renamed_12966(String arg0, int arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprudz.cfr_renamed_9("AbIywlSe"));
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = sprraia.cfr_renamed_13080(arg0);
        objectArray[1] = arg1;
        String string = sprraia.cfr_renamed_11562(sprbrp.cfr_renamed_9("Q\fW\u0006Q\rW"), objectArray);
        Object object = null;
        Object[] objectArray2 = new sprxy[1];
        objectArray2[0] = object;
        Object[] objectArray3 = objectArray2;
        boolean bl = this.cfr_renamed_13081().cfr_renamed_12146(string, objectArray3) && object != null;
        object = objectArray3[0];
        if (bl) {
            return object;
        }
        Object object2 = cfr_renamed_1;
        synchronized (object2) {
            objectArray3[0] = object;
            boolean bl2 = !this.cfr_renamed_13081().cfr_renamed_12146(string, objectArray3);
            object = objectArray3[0];
            if (bl2) {
                sprtin sprtin2 = this;
                object = sprtin2.cfr_renamed_2.cfr_renamed_12966(arg0, arg1);
                sprtin2.cfr_renamed_13081().cfr_renamed_12160(string, object);
            }
            return object;
        }
    }

    private /* synthetic */ sprtyo cfr_renamed_13081() {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprudz.cfr_renamed_9("IN~WbThC-HoMhDy\u001d-elTdDYBuS^OlWhUNFnOh"));
        }
        return this.cfr_renamed_3;
    }

    @Override
    public void dispose() {
        this.cfr_renamed_11540(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public sprxy cfr_renamed_12967(String arg0, byte[] arg1, int arg2) {
        if (arg0 == null) {
            throw new NullPointerException("fontId");
        }
        if (arg1 == null) {
            throw new NullPointerException(sprbrp.cfr_renamed_9("ZER^~FSH"));
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = arg2;
        String string = sprraia.cfr_renamed_11562(sprudz.cfr_renamed_9("v\u0017p\u001dv\u0016p"), objectArray);
        Object object = null;
        Object[] objectArray2 = new sprxy[1];
        objectArray2[0] = object;
        Object[] objectArray3 = objectArray2;
        boolean bl = this.cfr_renamed_13081().cfr_renamed_12146(string, objectArray3) && object != null;
        object = objectArray3[0];
        if (bl) {
            return object;
        }
        Object object2 = cfr_renamed_1;
        synchronized (object2) {
            objectArray3[0] = object;
            boolean bl2 = !this.cfr_renamed_13081().cfr_renamed_12146(string, objectArray3);
            object = objectArray3[0];
            if (bl2) {
                sprtin sprtin2 = this;
                object = sprtin2.cfr_renamed_2.cfr_renamed_12967(arg0, arg1, arg2);
                sprtin2.cfr_renamed_13081().cfr_renamed_12160(string, object);
            }
            return object;
        }
    }
}

