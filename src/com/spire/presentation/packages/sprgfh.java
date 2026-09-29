/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfnh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprgfh
extends sprqmh
implements sprlm {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 0;
    private final sprco cfr_renamed_0;
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 3;

    public static sprgfh cfr_renamed_8399() {
        return new sprgfh(1, sprpen.cfr_renamed_4);
    }

    public static sprgfh cfr_renamed_8400(BigInteger arg0, BigInteger arg1) {
        return new sprgfh(4, sprfnh.cfr_renamed_7843().cfr_renamed_8401(arg0).cfr_renamed_8402(arg1).cfr_renamed_8403());
    }

    public static sprgfh cfr_renamed_8393(byte[] arg0) {
        return new sprgfh(0, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprgfh(sprnvm arg0) {
        sprnvm sprnvm2 = arg0;
        this.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprnvm2.cfr_renamed_312()) {
            case 1: {
                this.cfr_renamed_0 = sprfan.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 0: 
            case 2: 
            case 3: {
                this.cfr_renamed_0 = sproug.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 4: {
                this.cfr_renamed_0 = sprfnh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprasg.cfr_renamed_9("ITV[LSD\u001aCROSC_\u0000LAVU_\u0000")).append(arg0.cfr_renamed_312()).toString());
    }

    public sprco cfr_renamed_8404() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public byte[] cfr_renamed_7976() {
        switch (this.cfr_renamed_1) {
            case 2: {
                byte[] byArray = sprfvg.cfr_renamed_23(this.cfr_renamed_0).cfr_renamed_186();
                byte[] byArray2 = new byte[byArray.length + 1];
                byArray2[0] = 2;
                System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
                return byArray2;
            }
            case 3: {
                byte[] byArray = sprfvg.cfr_renamed_23(this.cfr_renamed_0).cfr_renamed_186();
                byte[] byArray3 = new byte[byArray.length + 1];
                byArray3[0] = 3;
                System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
                return byArray3;
            }
            case 4: {
                sprfnh sprfnh2 = sprfnh.cfr_renamed_23(this.cfr_renamed_0);
                byte[] byArray = sprfnh2.cfr_renamed_1980().cfr_renamed_186();
                byte[] byArray4 = sprfnh2.spr\u3181().cfr_renamed_186();
                byte[] byArray5 = new byte[1];
                byArray5[0] = 4;
                return sproze.cfr_renamed_527(byArray5, byArray, byArray4);
            }
            case 0: {
                throw new IllegalStateException(sprjpfa.cfr_renamed_9("\u0004Y3\u0017\u0010\u0000\\\u0017\u0013\r\\\u0010\u0011\t\u0010\u001c\u0011\u001c\u0012\r\u0019\u001d"));
            }
        }
        throw new IllegalStateException(sprasg.cfr_renamed_9("ONQNUWT\u0000JOSNN\u0000YHUIYE"));
    }

    public static sprgfh cfr_renamed_8405(sprfnh arg0) {
        return new sprgfh(4, arg0);
    }

    public static sprgfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgfh) {
            return (sprgfh)arg0;
        }
        if (arg0 != null) {
            return new sprgfh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprgfh cfr_renamed_8396(sproug arg0) {
        return new sprgfh(2, arg0);
    }

    public static sprgfh cfr_renamed_8398(sproug arg0) {
        return new sprgfh(0, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprgfh sprgfh2 = this;
        return new sprycn(sprgfh2.cfr_renamed_1, sprgfh2.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprgfh(int n, sprco sprco2) {
        void arg0;
        sprgfh sprgfh2 = this;
        sprgfh2.cfr_renamed_1 = arg0;
        sprgfh2.cfr_renamed_0 = sprco2;
    }

    public static sprgfh cfr_renamed_8391(byte[] arg0) {
        return new sprgfh(3, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public static sprgfh cfr_renamed_8392(sproug arg0) {
        return new sprgfh(3, arg0);
    }

    public sprgfh cfr_renamed_8406(spreuh arg0) {
        byte[] byArray;
        int n = 0;
        byte[] byArray2 = arg0.cfr_renamed_1972(true);
        if (byArray2[0] == 2) {
            n = 2;
            byArray = byArray2;
        } else {
            if (byArray2[0] == 3) {
                n = 3;
            }
            byArray = byArray2;
        }
        byte[] byArray3 = new byte[byArray.length - 1];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
        return new sprgfh(n, new sprfvg(byArray3));
    }

    public static sprgfh cfr_renamed_8407(byte[] arg0) {
        if (arg0[0] == 2) {
            byte[] byArray = new byte[arg0.length - 1];
            System.arraycopy(arg0, 1, byArray, 0, byArray.length);
            return new sprgfh(2, new sprfvg(byArray));
        }
        if (arg0[0] == 3) {
            byte[] byArray = new byte[arg0.length - 1];
            System.arraycopy(arg0, 1, byArray, 0, byArray.length);
            return new sprgfh(3, new sprfvg(byArray));
        }
        if (arg0[0] == 4) {
            return new sprgfh(4, new sprfnh(new sprfvg(sproze.cfr_renamed_533(arg0, 1, 34)), new sprfvg(sproze.cfr_renamed_533(arg0, 34, 66))));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\t\u0017\u000e\u001c\u001f\u0016\u001b\u0017\u0015\n\u0019\u001d\\\u001c\u0012\u001a\u0013\u001d\u0015\u0017\u001bY")).append(arg0[0]).toString());
    }

    public static sprgfh cfr_renamed_8397(byte[] arg0) {
        return new sprgfh(2, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }
}

