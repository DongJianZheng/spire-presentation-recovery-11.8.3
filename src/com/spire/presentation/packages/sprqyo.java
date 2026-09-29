/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazia;
import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.sprbki;
import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprhxo;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpop;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrup;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwro;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprqyo
implements Cloneable {
    private spreen cfr_renamed_0;
    private String cfr_renamed_1;
    private String cfr_renamed_2;
    private Object cfr_renamed_3;
    private sprdso cfr_renamed_4;

    public void cfr_renamed_17137(spreen arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprpdja cfr_renamed_17138() {
        return sprmvo.cfr_renamed_17139(this.cfr_renamed_0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ 4 << 1;
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

    public sprqyo(String arg0, String arg1) {
        sprqyo sprqyo2 = this;
        sprqyo sprqyo3 = this;
        String string = arg0;
        sprqyo sprqyo4 = this;
        sprqyo4.cfr_renamed_3 = new Object();
        sprpop.cfr_renamed_12469(string, sprrxj.cfr_renamed_9("AtCa\u007ft\\p"));
        sprqyo3.cfr_renamed_1 = string;
        sprqyo2.cfr_renamed_2 = arg1;
        sprqyo3.cfr_renamed_0 = new sprpdja();
        sprqyo2.cfr_renamed_4 = new sprdso(arg0);
    }

    public String cfr_renamed_17140(sprwro arg0) {
        if (arg0.cfr_renamed_17126()) {
            throw new IllegalStateException(sprbki.cfr_renamed_9("B(#/m2f4m'ofw'q!f2#/pff>s#`2f\"#.f4fh"));
        }
        return sprhxo.cfr_renamed_17141(this.cfr_renamed_1, arg0.cfr_renamed_4750());
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_696() {
        return this.cfr_renamed_2;
    }

    public sprdso cfr_renamed_13276() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_17142(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqyo cfr_renamed_12099() {
        sprqyo sprqyo2 = (sprqyo)this.cfr_renamed_12100();
        Object object = this.cfr_renamed_3;
        synchronized (object) {
            sprqyo sprqyo3 = this;
            sprqyo2.cfr_renamed_17137(new sprpdja());
            sprqyo3.cfr_renamed_13232().cfr_renamed_11548(0L);
            sprmvo.cfr_renamed_12186(sprqyo3.cfr_renamed_13232(), sprqyo2.cfr_renamed_13232());
            return sprqyo2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_17143(String arg0) throws Exception {
        sprgfja sprgfja2 = sprbhja.cfr_renamed_14624(arg0);
        try {
            sprqyo sprqyo2 = this;
            sprqyo2.cfr_renamed_0.cfr_renamed_11548(0L);
            sprmvo.cfr_renamed_12186(sprqyo2.cfr_renamed_0, sprgfja2);
            sprqyo2.cfr_renamed_0.cfr_renamed_11548(0L);
            return;
        }
        finally {
            this.cfr_renamed_0.cfr_renamed_2637();
        }
    }

    public String cfr_renamed_4780() {
        char[] cArray = new char[1];
        cArray[0] = 46;
        return sprraia.cfr_renamed_15325(sprazia.cfr_renamed_17144(this.cfr_renamed_1), cArray);
    }

    public spreen cfr_renamed_13232() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public String cfr_renamed_17145(String arg0) {
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return "";
        }
        sprwro sprwro2 = this.cfr_renamed_4.cfr_renamed_17129(arg0);
        if (sprwro2 == null) {
            return "";
        }
        if (sprwro2.cfr_renamed_17126()) {
            String string = sprwro2.cfr_renamed_4750();
            if (sprrup.cfr_renamed_17146(string)) {
                string = sprrup.cfr_renamed_17147(string);
                string = sprrup.cfr_renamed_17148(string);
            }
            return string;
        }
        if (sprrup.cfr_renamed_14053(sprwro2.cfr_renamed_4750())) {
            return sprwro2.cfr_renamed_4750();
        }
        return this.cfr_renamed_17140(sprwro2);
    }
}

