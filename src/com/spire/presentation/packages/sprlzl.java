/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlui;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzdm;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprlzl
extends sprqqe {
    private sprktm cfr_renamed_0;
    private sprktm cfr_renamed_1;
    private sprzdm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    private static /* synthetic */ sprco cfr_renamed_4443(Enumeration arg0) {
        if (arg0.hasMoreElements()) {
            return (sprco)arg0.nextElement();
        }
        return null;
    }

    public static sprlzl cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlzl) {
            return (sprlzl)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprlzl((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlui.cfr_renamed_9("%1\u001a>\u00006\b\u007f(\u0017(0\u0001>\u00051<>\u001e>\u0001:\u0018:\u001e,V\u007f")).append(arg0.getClass().getName()).toString());
    }

    public sprktm cfr_renamed_1145() {
        return this.cfr_renamed_0;
    }

    public sprktm cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    public sprktm cfr_renamed_1155() {
        return this.cfr_renamed_1;
    }

    public sprktm cfr_renamed_2616() {
        return this.cfr_renamed_3;
    }

    public static sprlzl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprlzl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprlzl(sprktm sprktm2, sprktm sprktm3, sprktm sprktm4, sprktm sprktm5, sprzdm sprzdm2) {
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (sprktm2 == null) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("zRz\u0002>C3L2V}@8\u00023W1N"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprlui.cfr_renamed_9("K8K\u007f\u000f>\u00021\u0003+L=\t\u007f\u0002*\u00003"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("zSz\u0002>C3L2V}@8\u00023W1N"));
        }
        sprlzl sprlzl2 = this;
        sprlzl sprlzl3 = this;
        sprlzl3.cfr_renamed_1 = arg0;
        sprlzl3.cfr_renamed_0 = arg1;
        sprlzl2.cfr_renamed_4 = arg2;
        sprlzl2.cfr_renamed_3 = arg3;
        this.cfr_renamed_2 = arg4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlzl(sprszm sprszm2) {
        Enumeration enumeration;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprlui.cfr_renamed_9("\u001d\r;L,\t.\u0019:\u0002<\t\u007f\u001f6\u0016:V\u007f")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        sprlzl sprlzl2 = this;
        sprlzl2.cfr_renamed_1 = sprktm.cfr_renamed_23(enumeration.nextElement());
        sprlzl2.cfr_renamed_0 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        sprco sprco2 = sprlzl.cfr_renamed_4443(enumeration2);
        if (sprco2 != null && sprco2 instanceof sprktm) {
            this.cfr_renamed_3 = sprktm.cfr_renamed_23(sprco2);
            sprco2 = sprlzl.cfr_renamed_4443(enumeration);
        }
        if (sprco2 != null) {
            this.cfr_renamed_2 = sprzdm.cfr_renamed_23(sprco2.cfr_renamed_119());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlzl(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, sprzdm sprzdm2) {
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (bigInteger == null) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("zRz\u0002>C3L2V}@8\u00023W1N"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprlui.cfr_renamed_9("K8K\u007f\u000f>\u00021\u0003+L=\t\u007f\u0002*\u00003"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("zSz\u0002>C3L2V}@8\u00023W1N"));
        }
        sprlzl sprlzl2 = this;
        sprlzl2.cfr_renamed_1 = new sprktm((BigInteger)arg0);
        sprlzl sprlzl3 = this;
        sprlzl2.cfr_renamed_0 = new sprktm((BigInteger)arg1);
        sprlzl3.cfr_renamed_4 = new sprktm((BigInteger)arg2);
        sprlzl2.cfr_renamed_3 = new sprktm((BigInteger)arg3);
        this.cfr_renamed_2 = arg4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprlzl sprlzl2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm2.cfr_renamed_5004(sprlzl2.cfr_renamed_4);
        if (sprlzl2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public sprzdm cfr_renamed_2617() {
        return this.cfr_renamed_2;
    }
}

