/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmky;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;
import java.util.Enumeration;

public class sprcom
extends sprqqe {
    private sprktm cfr_renamed_0;
    private sprgbf cfr_renamed_1;
    private sproug cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private spridn cfr_renamed_4;

    public sprddm cfr_renamed_1254() {
        return this.cfr_renamed_3;
    }

    public sprco cfr_renamed_1227() throws IOException {
        if (this.cfr_renamed_1 == null) {
            return null;
        }
        return sprxgf.cfr_renamed_184(this.cfr_renamed_1.cfr_renamed_186());
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprcom(sprszm arg0) {
        sprcom sprcom2 = this;
        sprcom sprcom3 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprcom2.cfr_renamed_0 = sprktm.cfr_renamed_23(enumeration.nextElement());
        int n = sprcom.cfr_renamed_11198(sprcom3.cfr_renamed_0);
        sprcom2.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration.nextElement());
        sprcom2.cfr_renamed_2 = sproug.cfr_renamed_23(enumeration.nextElement());
        int n2 = -1;
        block4: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
            int n3 = sprnvm2.cfr_renamed_312();
            if (n3 <= n2) {
                throw new IllegalArgumentException(sprmky.cfr_renamed_9("R\u0016M\u0019W\u0011_XT\bO\u0011T\u0016Z\u0014\u001b\u001eR\u001dW\u001c\u001b\u0011UXK\nR\u000eZ\f^XP\u001dBXR\u0016]\u0017"));
            }
            n2 = n3;
            switch (n3) {
                case 0: {
                    this.cfr_renamed_4 = spridn.cfr_renamed_5085(sprnvm2, false);
                    continue block4;
                }
                case 1: {
                    if (n < 1) {
                        throw new IllegalArgumentException(sprilaa.cfr_renamed_9("U\u000b\u0007\u0019\u001e\u0012\u00110\u0017\u0002U[\u0000\u001e\u0003\u000e\u001b\t\u0017\bR\r\u0017\t\u0001\u0012\u001d\u0015R\r@SCRR\u0014\u0000[\u001e\u001a\u0006\u001e\u0000"));
                    }
                    this.cfr_renamed_1 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    continue block4;
                }
            }
            break;
        }
        throw new IllegalArgumentException(sprmky.cfr_renamed_9("N\u0016P\u0016T\u000fUXT\bO\u0011T\u0016Z\u0014\u001b\u001eR\u001dW\u001c\u001b\u0011UXK\nR\u000eZ\f^XP\u001dBXR\u0016]\u0017"));
    }

    /*
     * WARNING - void declaration
     */
    public sprcom(sprddm sprddm2, sprco sprco2, spridn spridn2, byte[] byArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        void arg3;
        sprcom sprcom2 = this;
        sprcom2.cfr_renamed_0 = new sprktm(arg3 != null ? sprhdf.cfr_renamed_2 : sprhdf.cfr_renamed_0);
        sprcom sprcom3 = this;
        sprcom sprcom4 = this;
        sprcom4.cfr_renamed_3 = arg0;
        sprcom4.cfr_renamed_2 = new sprfvg((sprco)arg1);
        sprcom3.cfr_renamed_4 = arg2;
        sprcom3.cfr_renamed_1 = arg3 == null ? null : new sprdye((byte[])arg3);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprcom sprcom2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprcom2.cfr_renamed_2);
        if (sprcom2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public sprcom(sprddm arg0, sprco arg1, spridn arg2) throws IOException {
        this(arg0, arg1, arg2, null);
    }

    private static /* synthetic */ int cfr_renamed_11198(sprktm arg0) {
        int n = arg0.cfr_renamed_5023();
        if (n < 0 || n > 1) {
            throw new IllegalArgumentException(sprilaa.cfr_renamed_9("\u0012\u001c\r\u0013\u0017\u001b\u001fR\r\u0017\t\u0001\u0012\u001d\u0015R\u001d\u001d\tR\u000b\u0000\u0012\u0004\u001a\u0006\u001eR\u0010\u0017\u0002R\u0012\u001c\u001d\u001d"));
        }
        return n;
    }

    public spridn cfr_renamed_82() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_1369() {
        return new sprfvg(this.cfr_renamed_2.cfr_renamed_186());
    }

    public sprgbf cfr_renamed_2314() {
        return this.cfr_renamed_1;
    }

    public static sprcom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprcom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprcom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcom) {
            return (sprcom)arg0;
        }
        if (arg0 != null) {
            return new sprcom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprcom(sprddm arg0, sprco arg1) throws IOException {
        this(arg0, arg1, null, null);
    }

    public sprco cfr_renamed_1229() throws IOException {
        return sprxgf.cfr_renamed_184(this.cfr_renamed_2.cfr_renamed_186());
    }

    public boolean cfr_renamed_9433() {
        return this.cfr_renamed_1 != null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_0;
    }
}

