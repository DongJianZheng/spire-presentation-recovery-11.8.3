/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.PrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprhzh
implements PrivateKey {
    private final Map<String, Object> cfr_renamed_2;
    private final PrivateKey cfr_renamed_3;
    public static final String cfr_renamed_4 = "label";

    public String toString() {
        if (this.cfr_renamed_2.containsKey(cfr_renamed_4)) {
            return this.cfr_renamed_2.get(cfr_renamed_4).toString();
        }
        return this.cfr_renamed_3.toString();
    }

    @Override
    public byte[] getEncoded() {
        return this.cfr_renamed_3.getEncoded();
    }

    public PrivateKey cfr_renamed_1521() {
        return this.cfr_renamed_3;
    }

    public Object cfr_renamed_9194(String arg0) {
        return this.cfr_renamed_2.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhzh(PrivateKey privateKey, Map<String, Object> map) {
        void arg0;
        sprhzh sprhzh2 = this;
        sprhzh2.cfr_renamed_3 = arg0;
        sprhzh2.cfr_renamed_2 = map;
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public sprhzh cfr_renamed_9195(String arg0) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>(this.cfr_renamed_2);
        hashMap.remove(arg0);
        return new sprhzh(this.cfr_renamed_3, Collections.unmodifiableMap(hashMap));
    }

    /*
     * WARNING - void declaration
     */
    public sprhzh(PrivateKey privateKey, String string) {
        void arg1;
        void arg0;
        sprhzh sprhzh2 = this;
        sprhzh2.cfr_renamed_3 = arg0;
        sprhzh2.cfr_renamed_2 = Collections.singletonMap(cfr_renamed_4, arg1);
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprhzh) {
            return this.cfr_renamed_3.equals(((sprhzh)arg0).cfr_renamed_3);
        }
        return this.cfr_renamed_3.equals(arg0);
    }

    public Map<String, Object> cfr_renamed_9196() {
        return this.cfr_renamed_2;
    }

    @Override
    public String getFormat() {
        return this.cfr_renamed_3.getFormat();
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_3.getAlgorithm();
    }

    public sprhzh cfr_renamed_9197(String arg0, Object arg1) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>(this.cfr_renamed_2);
        hashMap.put(arg0, arg1);
        return new sprhzh(this.cfr_renamed_3, Collections.unmodifiableMap(hashMap));
    }
}

