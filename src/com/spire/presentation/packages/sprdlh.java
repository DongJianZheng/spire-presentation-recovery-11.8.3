/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeea;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.spryzg;

public class sprdlh
extends sprqmh
implements sprlm {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 3;
    private final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprdlh sprdlh2 = this;
        return new sprycn(sprdlh2.cfr_renamed_0, sprdlh2.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprdlh(sprnvm arg0) {
        sprnvm sprnvm2 = arg0;
        this.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprnvm2.cfr_renamed_312()) {
            case 1: {
                this.cfr_renamed_3 = sprfan.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 0: 
            case 2: 
            case 3: {
                this.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 4: {
                this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbeea.cfr_renamed_9("K\u0017T\u0018N\u0010FYA\u0011M\u0010A\u001c\u0002\u000fC\u0015W\u001c\u0002")).append(arg0.cfr_renamed_312()).toString());
    }

    public static sprdlh cfr_renamed_8391(byte[] arg0) {
        return new sprdlh(3, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public static sprdlh cfr_renamed_8392(sproug arg0) {
        return new sprdlh(3, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }

    public static sprdlh cfr_renamed_8393(byte[] arg0) {
        return new sprdlh(0, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public static sprdlh cfr_renamed_8394(spryzg arg0) {
        return new sprdlh(4, arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public byte[] cfr_renamed_7976() {
        switch (this.cfr_renamed_0) {
            case 2: {
                byte[] byArray = sprfvg.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_186();
                byte[] byArray2 = new byte[byArray.length + 1];
                byArray2[0] = 2;
                System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
                return byArray2;
            }
            case 3: {
                byte[] byArray = sprfvg.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_186();
                byte[] byArray3 = new byte[byArray.length + 1];
                byArray3[0] = 3;
                System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
                return byArray3;
            }
            case 4: {
                sprszm sprszm2 = sprszm.cfr_renamed_23(this.cfr_renamed_3);
                byte[] byArray = sprfvg.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_186();
                byte[] byArray4 = sprfvg.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186();
                byte[] byArray5 = new byte[1];
                byArray5[0] = 4;
                return sproze.cfr_renamed_527(byArray5, byArray, byArray4);
            }
            case 0: {
                throw new IllegalStateException(sprizd.cfr_renamed_9("Ewr9Q.\u001d9R#\u001d>P'Q2P2S#X3"));
            }
        }
        throw new IllegalStateException(sprbeea.cfr_renamed_9("\fL\u0012L\u0016U\u0017\u0002\tM\u0010L\r\u0002\u001aJ\u0016K\u001aG"));
    }

    public sprco cfr_renamed_8395() {
        return this.cfr_renamed_3;
    }

    public static sprdlh cfr_renamed_8396(sproug arg0) {
        return new sprdlh(2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprdlh(int n, sprco sprco2) {
        void arg0;
        sprdlh sprdlh2 = this;
        sprdlh2.cfr_renamed_0 = arg0;
        sprdlh2.cfr_renamed_3 = sprco2;
    }

    public static sprdlh cfr_renamed_8397(byte[] arg0) {
        return new sprdlh(2, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public static sprdlh cfr_renamed_8398(sproug arg0) {
        return new sprdlh(0, arg0);
    }

    public static sprdlh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdlh) {
            return (sprdlh)arg0;
        }
        if (arg0 != null) {
            return new sprdlh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprdlh cfr_renamed_8399() {
        return new sprdlh(1, sprpen.cfr_renamed_4);
    }
}

