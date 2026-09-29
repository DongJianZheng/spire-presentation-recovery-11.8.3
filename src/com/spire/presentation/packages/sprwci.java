/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprehea;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.spruml;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprwci
implements AlgorithmParameterSpec {
    private byte[] cfr_renamed_2;
    private static Map cfr_renamed_3 = new HashMap();
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwci(String string, byte[] byArray) {
        this((String)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = new byte[byArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    public sprwci(String string) {
        sprwci sprwci2 = this;
        this.cfr_renamed_4 = null;
        sprwci2.cfr_renamed_2 = null;
        sprwci2.cfr_renamed_2 = spruml.cfr_renamed_2388(string);
    }

    /*
     * WARNING - void declaration
     */
    public sprwci(byte[] byArray, byte[] byArray2) {
        this((byte[])arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = new byte[byArray2.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    public byte[] cfr_renamed_9207() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_3345() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    static {
        cfr_renamed_3.put(sprqo.cfr_renamed_145, sprjth.cfr_renamed_9("h&l"));
        cfr_renamed_3.put(sprqo.cfr_renamed_724, sprehea.cfr_renamed_9("MIJ"));
        cfr_renamed_3.put(sprqo.cfr_renamed_102, sprjth.cfr_renamed_9("h&n"));
        cfr_renamed_3.put(sprqo.cfr_renamed_79, sprehea.cfr_renamed_9("MIL"));
        cfr_renamed_3.put(sprdt.cfr_renamed_0, sprjth.cfr_renamed_9("}j_j@&w"));
    }

    private static /* synthetic */ String cfr_renamed_7555(sprlem arg0) {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprehea.cfr_renamed_9("}\nc\ng\u0013fDG-L^(")).append(arg0).toString());
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprwci(sprlem sprlem2, byte[] byArray) {
        this(sprwci.cfr_renamed_7555((sprlem)arg0));
        void arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprwci(byte[] byArray) {
        void arg0;
        sprwci sprwci2 = this;
        this.cfr_renamed_4 = null;
        sprwci2.cfr_renamed_2 = null;
        sprwci2.cfr_renamed_2 = new byte[byArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_2, 0, ((void)arg0).length);
    }
}

