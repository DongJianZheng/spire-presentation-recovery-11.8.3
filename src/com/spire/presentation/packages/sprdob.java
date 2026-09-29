/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdus;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprugd;
import com.spire.presentation.packages.sprzra;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprdob
implements AlgorithmParameterSpec {
    private static Map cfr_renamed_2 = new HashMap();
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdob(sprtzd sprtzd2, byte[] byArray) {
        this(sprdob.cfr_renamed_2316((sprtzd)arg0));
        void arg0;
        this.cfr_renamed_3 = sprzra.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_1205() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        byte[] byArray = new byte[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, byArray.length);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprdob(byte[] byArray, byte[] byArray2) {
        this((byte[])arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_3 = new byte[byArray2.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_3, 0, ((void)arg1).length);
    }

    /*
     * WARNING - void declaration
     */
    public sprdob(String string, byte[] byArray) {
        this((String)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_3 = new byte[byArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_3, 0, ((void)arg1).length);
    }

    public byte[] cfr_renamed_2387() {
        return this.cfr_renamed_4;
    }

    static {
        cfr_renamed_2.put(sprji.cfr_renamed_2, sprseo.cfr_renamed_9("\u0010\u007f\u0014"));
        cfr_renamed_2.put(sprji.cfr_renamed_0, sprdus.cfr_renamed_9(">t9"));
        cfr_renamed_2.put(sprji.cfr_renamed_152, sprseo.cfr_renamed_9("\u0010\u007f\u0016"));
        cfr_renamed_2.put(sprji.cfr_renamed_79, sprdus.cfr_renamed_9(">t?"));
    }

    public sprdob(String string) {
        sprdob sprdob2 = this;
        this.cfr_renamed_3 = null;
        sprdob2.cfr_renamed_4 = null;
        sprdob2.cfr_renamed_4 = sprugd.cfr_renamed_2388(string);
    }

    /*
     * WARNING - void declaration
     */
    public sprdob(byte[] byArray) {
        void arg0;
        sprdob sprdob2 = this;
        this.cfr_renamed_3 = null;
        sprdob2.cfr_renamed_4 = null;
        sprdob2.cfr_renamed_4 = new byte[byArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }

    private static /* synthetic */ String cfr_renamed_2316(sprtzd arg0) {
        String string = (String)cfr_renamed_2.get(arg0);
        if (string == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprseo.cfr_renamed_9(" <><:%;r\u001a\u001b\u0011hu")).append(arg0).toString());
        }
        return string;
    }
}

