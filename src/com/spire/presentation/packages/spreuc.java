/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasg;
import com.spire.presentation.packages.sprmzn;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class spreuc {
    public short cfr_renamed_3;
    public Object cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_3074(short arg0, Object arg1) {
        switch (arg0) {
            case 0: {
                return arg1 instanceof String;
            }
        }
        throw new IllegalArgumentException(sprasg.cfr_renamed_9("\u001dN[M_\u0007\u001aII\u0000[N\u001aUTSOPJOHT_D\u001aV[LOE"));
    }

    public String cfr_renamed_3075() {
        if (!spreuc.cfr_renamed_3074((short)0, this.cfr_renamed_4)) {
            throw new IllegalStateException(sprmzn.cfr_renamed_9("+\u0003m\u0000iJ,\u0004\u007fMb\u0002xMmMD\u0002\u007f\u0019B\fa\b,\u001ex\u001fe\u0003k"));
        }
        return (String)this.cfr_renamed_4;
    }

    public short cfr_renamed_3076() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static spreuc cfr_renamed_2661(InputStream arg0) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg0);
        switch (s) {
            case 0: {
                byte[] byArray = sprzsc.cfr_renamed_2629(arg0);
                if (byArray.length < 1) {
                    throw new spryad(50);
                }
                String string = sprywa.cfr_renamed_427(byArray);
                return new spreuc(s, string);
            }
        }
        throw new spryad(50);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        spreuc spreuc2 = this;
        sprzsc.cfr_renamed_2676(spreuc2.cfr_renamed_3, arg0);
        switch (spreuc2.cfr_renamed_3) {
            case 0: {
                byte[] byArray = sprywa.cfr_renamed_431((String)this.cfr_renamed_4);
                if (byArray.length < 1) {
                    throw new spryad(80);
                }
                sprzsc.cfr_renamed_2624(byArray, arg0);
                return;
            }
        }
        throw new spryad(80);
    }

    public Object cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spreuc(short s, Object object) {
        void arg0;
        void arg1;
        if (!spreuc.cfr_renamed_3074(s, arg1)) {
            throw new IllegalArgumentException(sprasg.cfr_renamed_9("\u0007TAWE\u001d\u0000SS\u001aNUT\u001aAT\u0000SNIT[NYE\u001aO\\\u0000NH_\u0000YOHR_CN\u0000NYJE"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }
}

