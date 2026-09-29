/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sprjrf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.spruml;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprprh
implements AlgorithmParameterSpec {
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private static Map cfr_renamed_4 = new HashMap();

    public byte[] cfr_renamed_2387() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    private static /* synthetic */ String cfr_renamed_7555(sprlem arg0) {
        String string = (String)cfr_renamed_4.get(arg0);
        if (string == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjrf.cfr_renamed_9("\u0003{\u001d{\u0019b\u001859\\2/V")).append(arg0).toString());
        }
        return string;
    }

    public byte[] cfr_renamed_1205() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprprh(String string) {
        sprprh sprprh2 = this;
        this.cfr_renamed_2 = null;
        sprprh2.cfr_renamed_3 = null;
        sprprh2.cfr_renamed_3 = spruml.cfr_renamed_2388(string);
    }

    /*
     * WARNING - void declaration
     */
    public sprprh(String string, byte[] byArray) {
        this((String)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_2 = new byte[byArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_2, 0, ((void)arg1).length);
    }

    /*
     * WARNING - void declaration
     */
    public sprprh(byte[] byArray, byte[] byArray2) {
        this((byte[])arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_2 = new byte[byArray2.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_2, 0, ((void)arg1).length);
    }

    /*
     * WARNING - void declaration
     */
    public sprprh(sprlem sprlem2, byte[] byArray) {
        this(sprprh.cfr_renamed_7555((sprlem)arg0));
        void arg0;
        this.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_3345() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    static {
        cfr_renamed_4.put(sprqo.cfr_renamed_145, sprjdda.cfr_renamed_9("U^Q"));
        cfr_renamed_4.put(sprqo.cfr_renamed_724, sprjrf.cfr_renamed_9("384"));
        cfr_renamed_4.put(sprqo.cfr_renamed_102, sprjdda.cfr_renamed_9("U^S"));
        cfr_renamed_4.put(sprqo.cfr_renamed_79, sprjrf.cfr_renamed_9("382"));
        cfr_renamed_4.put(sprdt.cfr_renamed_0, sprjdda.cfr_renamed_9("@\u0012b\u0012}^J"));
    }

    /*
     * WARNING - void declaration
     */
    public sprprh(byte[] byArray) {
        void arg0;
        sprprh sprprh2 = this;
        this.cfr_renamed_2 = null;
        sprprh2.cfr_renamed_3 = null;
        sprprh2.cfr_renamed_3 = new byte[byArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, ((void)arg0).length);
    }
}

