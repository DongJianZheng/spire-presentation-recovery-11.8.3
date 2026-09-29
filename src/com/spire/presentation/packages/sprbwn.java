/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwzn;

@sprtea
public class sprbwn
implements Cloneable {
    private sprwzn cfr_renamed_107;
    private float cfr_renamed_132;
    private float cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private sprewn cfr_renamed_152;
    private sprwbp cfr_renamed_112;
    private int cfr_renamed_119;
    private sprqgp cfr_renamed_91;
    private float cfr_renamed_0;
    private float cfr_renamed_1;
    private sprwbp cfr_renamed_2;
    private sprwzn cfr_renamed_3;
    private float cfr_renamed_4;

    @sprtea
    public float cfr_renamed_12534() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public sprwbp cfr_renamed_14779(boolean arg0) {
        if (arg0) {
            return this.cfr_renamed_14784();
        }
        return this.cfr_renamed_14785();
    }

    @sprtea
    public void cfr_renamed_12738(float arg0) {
        this.cfr_renamed_102 = arg0;
    }

    @sprtea
    public sprwbp cfr_renamed_14785() {
        return this.cfr_renamed_112;
    }

    @sprtea
    public void cfr_renamed_14786(sprwzn arg0) {
        this.cfr_renamed_107 = arg0;
    }

    @sprtea
    public sprbwn cfr_renamed_12099() {
        ((sprbwn)this.cfr_renamed_12100()).cfr_renamed_91 = this.cfr_renamed_91.cfr_renamed_12099();
        return (sprbwn)this.cfr_renamed_12100();
    }

    @sprtea
    public sprwbp cfr_renamed_14784() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public float cfr_renamed_12523() {
        return this.cfr_renamed_102;
    }

    @sprtea
    public sprwzn cfr_renamed_12739() {
        return this.cfr_renamed_107;
    }

    @sprtea
    public float cfr_renamed_14780() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_12749(float arg0) {
        this.cfr_renamed_1 = arg0;
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

    @sprtea
    public void cfr_renamed_14776(boolean arg0, sprwzn arg1) {
        if (arg0) {
            this.cfr_renamed_14786(arg1);
            return;
        }
        this.cfr_renamed_14787(arg1);
    }

    @sprtea
    public int cfr_renamed_12580() {
        return this.cfr_renamed_93;
    }

    @sprtea
    public void cfr_renamed_14781(boolean arg0, sprwbp arg1) {
        if (arg0) {
            this.cfr_renamed_14788(arg1);
            return;
        }
        this.cfr_renamed_14789(arg1);
    }

    @sprtea
    public sprwzn cfr_renamed_14790() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprewn cfr_renamed_14351() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public void cfr_renamed_12575(int arg0) {
        this.cfr_renamed_86 = arg0;
    }

    @sprtea
    public sprwzn cfr_renamed_14774(boolean arg0) {
        if (arg0) {
            return this.cfr_renamed_12739();
        }
        return this.cfr_renamed_14790();
    }

    @sprtea
    public void cfr_renamed_12732(int arg0) {
        this.cfr_renamed_93 = arg0;
    }

    @sprtea
    public void cfr_renamed_14787(sprwzn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_14788(sprwbp arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public void cfr_renamed_14789(sprwbp arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @sprtea
    public int cfr_renamed_14770() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public void cfr_renamed_14773(float arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public void cfr_renamed_14772(sprewn arg0) {
        this.cfr_renamed_152 = arg0;
    }

    @sprtea
    public int cfr_renamed_12576() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public void cfr_renamed_14791(sprqgp arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @sprtea
    public float cfr_renamed_13149() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public float cfr_renamed_12574() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public sprqgp cfr_renamed_12491() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public sprbwn() {
        sprbwn sprbwn2 = this;
        sprbwn sprbwn3 = this;
        sprbwn sprbwn4 = this;
        this.cfr_renamed_91 = new sprqgp();
        sprbwn4.cfr_renamed_107 = sprwzn.cfr_renamed_14201();
        this.cfr_renamed_3 = sprwzn.cfr_renamed_14201();
        this.cfr_renamed_2 = sprwbp.cfr_renamed_1513;
        this.cfr_renamed_112 = sprwbp.cfr_renamed_1513;
        sprbwn3.cfr_renamed_132 = 1.0f;
        sprbwn3.cfr_renamed_102 = 1.0f;
        sprbwn2.cfr_renamed_1 = 1.0f;
        sprbwn2.cfr_renamed_0 = 10.0f;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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

    @sprtea
    public void cfr_renamed_12577(float arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @sprtea
    public void cfr_renamed_12731(float arg0) {
        this.cfr_renamed_132 = arg0;
    }

    @sprtea
    public void cfr_renamed_14777(int arg0) {
        this.cfr_renamed_119 = arg0;
    }
}

