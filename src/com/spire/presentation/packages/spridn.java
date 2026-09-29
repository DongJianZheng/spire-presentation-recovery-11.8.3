/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.spribn;
import com.spire.presentation.packages.sprief;
import com.spire.presentation.packages.spriym;
import com.spire.presentation.packages.sprkzm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.spruhj;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public abstract class spridn
extends sprxgf
implements sprse<sprco> {
    public final sprco[] cfr_renamed_2;
    public sprco[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new spribn(spridn.class, 17);

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean cfr_renamed_4920(byte[] byArray, byte[] byArray2) {
        int n;
        void arg1;
        byte[] arg0;
        int n2 = arg0[0] & 0xDF;
        int n3 = byArray2[0] & 0xDF;
        if (n2 != n3) {
            return n2 < n3;
        }
        int n4 = Math.min(arg0.length, ((void)arg1).length) - 1;
        int n5 = n = 1;
        while (n5 < n4) {
            if (arg0[n] != arg1[n]) {
                return (arg0[n] & 0xFF) < (arg1[n] & 0xFF);
            }
            n5 = ++n;
        }
        return (arg0[n4] & 0xFF) <= (arg1[n4] & 0xFF);
    }

    public sprzy cfr_renamed_4828() {
        int n = this.cfr_renamed_84();
        return new spriym(this, n);
    }

    public static spridn cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spridn) {
            return (spridn)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof spridn) {
                return (spridn)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (spridn)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfp.cfr_renamed_9("URZ_VW\u0013G\\\u0013P\\]@GAFPG\u0013@VG\u0013UA\\^\u0013QJGVhn\t\u0013")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("/\b1\b5\u00114F5\u00040\u00039\u0012z\u000f4F=\u0003./4\u0015.\u00074\u0005?\\z")).append(arg0.getClass().getName()).toString());
    }

    public static spridn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (spridn)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = (sprco[])this.cfr_renamed_2.clone();
            spridn.cfr_renamed_11486(this.cfr_renamed_3);
        }
        return new sprocn(true, this.cfr_renamed_3);
    }

    public Enumeration cfr_renamed_329() {
        return new sprkzm(this);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        spridn spridn2 = this;
        return new sprsgn(spridn2.cfr_renamed_2, spridn2.cfr_renamed_3);
    }

    @Override
    public Iterator<sprco> iterator() {
        return new sprief<sprco>(this.cfr_renamed_4529());
    }

    /*
     * WARNING - void declaration
     */
    public spridn(sprco[] sprcoArray, sprco[] sprcoArray2) {
        void arg0;
        spridn spridn2 = this;
        spridn2.cfr_renamed_2 = arg0;
        spridn2.cfr_renamed_3 = sprcoArray2;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_2.length;
    }

    public spridn() {
        spridn spridn2 = this;
        spridn2.cfr_renamed_2 = sprrvm.cfr_renamed_2;
        spridn2.cfr_renamed_3 = spridn2.cfr_renamed_2;
    }

    @Override
    public int hashCode() {
        int n = this.cfr_renamed_2.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 += this.cfr_renamed_2[n].cfr_renamed_119().hashCode();
        }
        return n2;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public spridn(boolean bl, sprco[] sprcoArray) {
        void arg1;
        spridn spridn2 = this;
        spridn2.cfr_renamed_2 = arg1;
        spridn2.cfr_renamed_3 = bl || ((void)arg1).length < 2 ? arg1 : null;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        int n;
        if (!(arg0 instanceof spridn)) {
            return false;
        }
        spridn spridn2 = (spridn)arg0;
        int n2 = this.cfr_renamed_84();
        if (spridn2.cfr_renamed_84() != n2) {
            return false;
        }
        sprocn sprocn2 = (sprocn)this.cfr_renamed_4615();
        sprocn sprocn3 = (sprocn)spridn2.cfr_renamed_4615();
        int n3 = n = 0;
        while (n3 < n2) {
            sprxgf sprxgf2;
            sprxgf sprxgf3 = sprocn2.cfr_renamed_2[n].cfr_renamed_119();
            if (sprxgf3 != (sprxgf2 = sprocn3.cfr_renamed_2[n].cfr_renamed_119()) && !sprxgf3.cfr_renamed_11432(sprxgf2)) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_11487(sprco arg0) {
        try {
            return arg0.cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprdfp.cfr_renamed_9("PR]]\\G\u0013V]P\\WV\u0013\\QYVPG\u0013RWWVW\u0013G\\\u0013`vg"));
        }
    }

    public sprco cfr_renamed_85(int arg0) {
        return this.cfr_renamed_2[arg0];
    }

    public String toString() {
        StringBuffer stringBuffer;
        int n = this.cfr_renamed_84();
        if (0 == n) {
            return "[]";
        }
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int n2 = 0;
        while (true) {
            stringBuffer2.append(this.cfr_renamed_2[n2++]);
            if (n2 >= n) break;
            StringBuffer stringBuffer3 = stringBuffer;
            stringBuffer2 = stringBuffer3;
            stringBuffer3.append(spruhj.cfr_renamed_9("Jz"));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public sprco[] cfr_renamed_4529() {
        return sprrvm.cfr_renamed_11488(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public spridn(sprrvm sprrvm2, boolean bl) {
        spridn spridn2;
        sprco[] sprcoArray;
        void arg1;
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprdfp.cfr_renamed_9("\u0014V_V^V]GeVPG\\A\u0014\u0013PR]]\\G\u0013QV\u0013]F__"));
        }
        if (arg1 != false && arg0.cfr_renamed_84() >= 2) {
            sprcoArray = arg0.cfr_renamed_11489();
            spridn2 = this;
            spridn.cfr_renamed_11486(sprcoArray);
        } else {
            sprcoArray = arg0.cfr_renamed_11217();
            spridn2 = this;
        }
        spridn2.cfr_renamed_2 = sprcoArray;
        this.cfr_renamed_3 = arg1 != false || sprcoArray.length < 2 ? this.cfr_renamed_2 : null;
    }

    /*
     * WARNING - void declaration
     */
    public spridn(sprco[] sprcoArray, boolean bl) {
        void arg1;
        void arg0;
        if (sproze.cfr_renamed_5272(sprcoArray)) {
            throw new NullPointerException(spruhj.cfr_renamed_9("A?\n?\u000b?\b.\u0015}F9\u00074\b5\u0012z\u0004?F4\u00136\nvF5\u0014z\u00055\b.\u00073\bz\b/\n6"));
        }
        sprco[] sprcoArray2 = sprrvm.cfr_renamed_11488((sprco[])arg0);
        if (arg1 != false && sprcoArray2.length >= 2) {
            spridn.cfr_renamed_11486(sprcoArray2);
        }
        this.cfr_renamed_2 = sprcoArray2;
        this.cfr_renamed_3 = arg1 != false || sprcoArray2.length < 2 ? arg0 : null;
    }

    /*
     * WARNING - void declaration
     */
    public spridn(sprco sprco2) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprdfp.cfr_renamed_9("\u0014V_V^V]G\u0014\u0013PR]]\\G\u0013QV\u0013]F__"));
        }
        sprco[] sprcoArray = new sprco[1];
        sprcoArray[0] = arg0;
        this.cfr_renamed_2 = sprcoArray;
        this.cfr_renamed_3 = this.cfr_renamed_2;
    }

    private static /* synthetic */ void cfr_renamed_11486(sprco[] arg0) {
        int n;
        int n2 = arg0.length;
        if (n2 < 2) {
            return;
        }
        sprco sprco2 = arg0[0];
        sprco sprco3 = arg0[1];
        byte[] byArray = spridn.cfr_renamed_11487(sprco2);
        byte[] byArray2 = spridn.cfr_renamed_11487(sprco3);
        if (spridn.cfr_renamed_4920(byArray2, byArray)) {
            sprco sprco4 = sprco3;
            sprco3 = sprco2;
            sprco2 = sprco4;
            byte[] byArray3 = byArray2;
            byArray2 = byArray;
            byArray = byArray3;
        }
        int n3 = n = 2;
        while (n3 < n2) {
            sprco sprco5 = arg0[n];
            byte[] byArray4 = spridn.cfr_renamed_11487(sprco5);
            if (spridn.cfr_renamed_4920(byArray2, byArray4)) {
                arg0[n - 2] = sprco2;
                sprco2 = sprco3;
                byArray = byArray2;
                sprco3 = sprco5;
                byArray2 = byArray4;
            } else if (spridn.cfr_renamed_4920(byArray, byArray4)) {
                arg0[n - 2] = sprco2;
                sprco2 = sprco5;
                byArray = byArray4;
            } else {
                block9: {
                    sprco[] sprcoArray;
                    int n4 = n - 1;
                    while (--n4 > 0) {
                        sprco sprco6 = arg0[n4 - 1];
                        if (spridn.cfr_renamed_4920(spridn.cfr_renamed_11487(sprco6), byArray4)) {
                            sprcoArray = arg0;
                            break block9;
                        }
                        arg0[n4] = sprco6;
                    }
                    sprcoArray = arg0;
                }
                sprcoArray[n4] = sprco5;
            }
            n3 = ++n;
        }
        int n5 = n2;
        arg0[n5 - 2] = sprco2;
        arg0[n5 - 1] = sprco3;
    }
}

