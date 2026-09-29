/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.spreds;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjm;
import java.util.Enumeration;

public class sprnbm
extends sprqqe
implements sprlm {
    private spruu cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private static spruu cfr_renamed_2 = sprebm.cfr_renamed_956;
    private sprcen cfr_renamed_3;
    private sprxjm[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnbm(spruu spruu2, sprnbm sprnbm2) {
        void arg1;
        void arg0;
        sprnbm sprnbm3 = this;
        this.cfr_renamed_91 = arg0;
        sprnbm3.cfr_renamed_4 = arg1.cfr_renamed_4;
        sprnbm3.cfr_renamed_3 = sprnbm2.cfr_renamed_3;
    }

    public sprlem[] cfr_renamed_4542() {
        int n;
        int n2;
        int n3 = this.cfr_renamed_4.length;
        int n4 = 0;
        int n5 = n2 = 0;
        while (n5 < n3) {
            sprxjm sprxjm2 = this.cfr_renamed_4[n2];
            n4 += sprxjm2.cfr_renamed_84();
            n5 = ++n2;
        }
        sprlem[] sprlemArray = new sprlem[n4];
        int n6 = 0;
        int n7 = n = 0;
        while (n7 < n3) {
            int n8 = n6;
            n6 = n8 + this.cfr_renamed_4[++n].cfr_renamed_11166(sprlemArray, n8);
            n7 = n;
        }
        return sprlemArray;
    }

    public static spruu cfr_renamed_4328() {
        return cfr_renamed_2;
    }

    public sprxjm[] cfr_renamed_9085(sprlem arg0) {
        int n;
        sprxjm[] sprxjmArray = new sprxjm[this.cfr_renamed_4.length];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_4.length) {
            sprxjm sprxjm2 = this.cfr_renamed_4[n];
            if (sprxjm2.cfr_renamed_11167(arg0)) {
                sprxjmArray[n2++] = sprxjm2;
            }
            n3 = ++n;
        }
        if (n2 < sprxjmArray.length) {
            sprxjm[] sprxjmArray2 = new sprxjm[n2];
            System.arraycopy(sprxjmArray, 0, sprxjmArray2, 0, sprxjmArray2.length);
            sprxjmArray = sprxjmArray2;
        }
        return sprxjmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprnbm(spruu spruu2, sprxjm[] sprxjmArray) {
        void arg0;
        sprnbm sprnbm2 = this;
        sprnbm2.cfr_renamed_91 = arg0;
        sprnbm2.cfr_renamed_4 = (sprxjm[])sprxjmArray.clone();
        sprnbm sprnbm3 = this;
        this.cfr_renamed_3 = new sprcen(this.cfr_renamed_4);
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprnbm) && !(arg0 instanceof sprszm)) {
            return false;
        }
        sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().cfr_renamed_5078(sprxgf2)) {
            return true;
        }
        try {
            return this.cfr_renamed_91.cfr_renamed_11158(this, new sprnbm(sprszm.cfr_renamed_23(((sprco)arg0).cfr_renamed_119())));
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static sprnbm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprnbm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, true));
    }

    /*
     * WARNING - void declaration
     */
    public sprnbm(spruu spruu2, String string) {
        this(arg0.cfr_renamed_3246((String)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_91 = spruu2;
    }

    public sprnbm(sprxjm[] arg0) {
        this(cfr_renamed_2, arg0);
    }

    public String toString() {
        return this.cfr_renamed_91.cfr_renamed_7319(this);
    }

    public sprxjm[] cfr_renamed_4544() {
        return (sprxjm[])this.cfr_renamed_4.clone();
    }

    public static sprnbm cfr_renamed_9063(spruu arg0, Object arg1) {
        if (arg1 instanceof sprnbm) {
            return new sprnbm(arg0, (sprnbm)arg1);
        }
        if (arg1 != null) {
            return new sprnbm(arg0, sprszm.cfr_renamed_23(arg1));
        }
        return null;
    }

    public static sprnbm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnbm) {
            return (sprnbm)arg0;
        }
        if (arg0 != null) {
            return new sprnbm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public int hashCode() {
        if (this.cfr_renamed_1) {
            return this.cfr_renamed_0;
        }
        sprnbm sprnbm2 = this;
        sprnbm2.cfr_renamed_1 = true;
        this.cfr_renamed_0 = sprnbm2.cfr_renamed_91.cfr_renamed_11157(this);
        return sprnbm2.cfr_renamed_0;
    }

    public static void cfr_renamed_11168(spruu arg0) {
        if (arg0 == null) {
            throw new NullPointerException(spreds.cfr_renamed_9("\u0013K\u001eD\u001f^PY\u0015^PY\u0004S\u001cOP^\u001f\n\u001e_\u001cF"));
        }
        cfr_renamed_2 = arg0;
    }

    public sprnbm(String arg0) {
        this(cfr_renamed_2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnbm(spruu spruu2, sprszm sprszm2) {
        void arg1;
        Enumeration enumeration;
        void arg0;
        sprnbm sprnbm2 = this;
        sprnbm2.cfr_renamed_91 = arg0;
        sprnbm2.cfr_renamed_4 = new sprxjm[sprszm2.cfr_renamed_84()];
        boolean bl = true;
        int n = 0;
        Enumeration enumeration2 = enumeration = arg1.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Object e = enumeration.nextElement();
            sprxjm sprxjm2 = sprxjm.cfr_renamed_23(e);
            bl &= sprxjm2 == e;
            enumeration2 = enumeration;
            this.cfr_renamed_4[n++] = sprxjm2;
        }
        sprnbm sprnbm3 = this;
        if (bl) {
            sprnbm3.cfr_renamed_3 = sprcen.cfr_renamed_11169((sprszm)arg1);
            return;
        }
        sprnbm3.cfr_renamed_3 = new sprcen(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprnbm(sprszm arg0) {
        this(cfr_renamed_2, arg0);
    }
}

