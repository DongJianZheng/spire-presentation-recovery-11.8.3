/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvc;
import java.util.Vector;

public class sprqwc {
    private final short cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private Vector cfr_renamed_4;

    public void cfr_renamed_3154(short arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = arg4 + arg5;
        if (this.cfr_renamed_2 != arg0 || this.cfr_renamed_3.length != arg1 || n2 > arg1) {
            return;
        }
        if (arg5 == 0) {
            sprfvc sprfvc2;
            if (arg4 == 0 && !this.cfr_renamed_4.isEmpty() && (sprfvc2 = (sprfvc)this.cfr_renamed_4.firstElement()).cfr_renamed_3155() == 0) {
                this.cfr_renamed_4.removeElementAt(0);
            }
            return;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.size()) {
            sprfvc sprfvc3 = (sprfvc)this.cfr_renamed_4.elementAt(n);
            if (sprfvc3.cfr_renamed_3156() >= n2) {
                return;
            }
            if (sprfvc3.cfr_renamed_3155() > arg4) {
                sprfvc sprfvc4 = sprfvc3;
                int n4 = Math.max(sprfvc4.cfr_renamed_3156(), arg4);
                int n5 = Math.min(sprfvc4.cfr_renamed_3155(), n2);
                int n6 = n5 - n4;
                System.arraycopy(arg2, arg3 + n4 - arg4, this.cfr_renamed_3, n4, n6);
                if (n4 == sprfvc3.cfr_renamed_3156()) {
                    if (n5 == sprfvc3.cfr_renamed_3155()) {
                        this.cfr_renamed_4.removeElementAt(n);
                        --n;
                    } else {
                        sprfvc3.cfr_renamed_3157(n5);
                    }
                } else if (n5 == sprfvc3.cfr_renamed_3155()) {
                    sprfvc3.cfr_renamed_3158(n4);
                } else {
                    this.cfr_renamed_4.insertElementAt(new sprfvc(n5, sprfvc3.cfr_renamed_3155()), ++n);
                    sprfvc3.cfr_renamed_3158(n4);
                }
            }
            n3 = ++n;
        }
    }

    public void cfr_renamed_41() {
        sprqwc sprqwc2 = this;
        sprqwc2.cfr_renamed_4.removeAllElements();
        sprqwc2.cfr_renamed_4.addElement(new sprfvc(0, this.cfr_renamed_3.length));
    }

    public byte[] cfr_renamed_3128() {
        if (this.cfr_renamed_4.isEmpty()) {
            return this.cfr_renamed_3;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqwc(short s, int n) {
        void arg1;
        void arg0;
        sprqwc sprqwc2 = this;
        sprqwc2.cfr_renamed_4 = new Vector();
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_3 = new byte[n];
        this.cfr_renamed_4.addElement(new sprfvc(0, (int)arg1));
    }

    public short cfr_renamed_324() {
        return this.cfr_renamed_2;
    }
}

