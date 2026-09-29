/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprxzl;
import java.security.spec.ECParameterSpec;

public class sprkki
extends ECParameterSpec {
    private final byte[] cfr_renamed_3;
    private final sprqxk cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkki(sprqxk sprqxk2, ECParameterSpec eCParameterSpec, byte[] byArray) {
        void arg0;
        void arg1;
        sprkki sprkki2 = this;
        super(arg1.getCurve(), arg1.getGenerator(), arg1.getOrder(), arg1.getCofactor());
        sprkki2.cfr_renamed_4 = arg0;
        sprkki2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_2510() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprkki) {
            sprkki sprkki2 = (sprkki)arg0;
            return this.cfr_renamed_4.equals(sprkki2.cfr_renamed_4);
        }
        return false;
    }

    public sprkki(sprqxk arg0) {
        sprqxk sprqxk2 = arg0;
        this(sprqxk2, sprnlj.cfr_renamed_9211(sprqxk2), sprxzl.cfr_renamed_2511());
    }
}

