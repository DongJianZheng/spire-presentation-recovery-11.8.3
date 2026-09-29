/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprckm;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprhsm;
import com.spire.presentation.packages.sprjlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqum;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxgk;
import com.spire.presentation.packages.spryae;
import java.io.IOException;
import java.util.Enumeration;

public class sprkom
extends sprqqe {
    private sprckm cfr_renamed_96;
    private static final int cfr_renamed_105 = 8;
    private sprnvm cfr_renamed_137;
    private static final int cfr_renamed_79 = 32;
    private sprnvm cfr_renamed_107;
    private sprnvm cfr_renamed_132;
    private sprfnm cfr_renamed_102;
    private static final int cfr_renamed_93 = 16;
    public sprrzm cfr_renamed_86;
    private sprnvm cfr_renamed_152;
    private sprnvm cfr_renamed_112;
    public static final int cfr_renamed_119 = 127;
    private static final int cfr_renamed_91 = 64;
    private static final int cfr_renamed_0 = 2;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 13;
    private static final int cfr_renamed_4 = 1;

    private /* synthetic */ void cfr_renamed_11246(sprnvm arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_11239(64, 2)) {
            this.cfr_renamed_107 = arg0;
            this.cfr_renamed_1 |= 2;
            return;
        }
        throw new IllegalArgumentException(spryae.cfr_renamed_9("\u0017--b8,y\u000b*-nzht\r#>1w\u000b\n\u0011\f\u0007\u000b\u001d\u0010\u0006\u001c\f\r\u000b\u001f\u000b\u001a\u0003\r\u000b\u0016\f\u0006\f\f\u000f\u001b\u0007\u000bb-#>"));
    }

    public sprrnm cfr_renamed_4719() {
        if ((this.cfr_renamed_1 & 0x20) == 32) {
            return new sprrnm(sproug.cfr_renamed_23(this.cfr_renamed_152.cfr_renamed_10766(false, 4)).cfr_renamed_186());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_11247(sprnvm arg0) throws IOException {
        sprnvm sprnvm2;
        if (!arg0.cfr_renamed_11239(64, 78)) {
            throw new IOException(sprxgk.cfr_renamed_9("APg\u0011wPd\u00119\u0011m^w\u0011b_#Xp^4\t2\u0007#rFcWxEx@pWt\\rL\u007fWtMe\\eF|S}BeF"));
        }
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_10766(false, 16));
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block9: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 64);
            switch (sprnvm2.cfr_renamed_312()) {
                case 41: {
                    this.cfr_renamed_11248(sprnvm2);
                    continue block9;
                }
                case 2: {
                    this.cfr_renamed_11246(sprnvm2);
                    continue block9;
                }
                case 73: {
                    this.cfr_renamed_11249(sprfnm.cfr_renamed_23(sprnvm2.cfr_renamed_10766(false, 16)));
                    continue block9;
                }
                case 32: {
                    this.cfr_renamed_11250(sprnvm2);
                    continue block9;
                }
                case 76: {
                    this.cfr_renamed_11251(new sprckm(sprnvm2));
                    continue block9;
                }
                case 37: {
                    this.cfr_renamed_11252(sprnvm2);
                    continue block9;
                }
                case 36: {
                    this.cfr_renamed_11253(sprnvm2);
                    continue block9;
                }
            }
            break;
        }
        this.cfr_renamed_1 = 0;
        throw new IOException(new StringBuilder().insert(0, spryae.cfr_renamed_9("\u0017--b8b/#5+=b016uasob\u001817s\r#>%<&\u0016 3':6y68%y")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        block4: {
            try {
                if (this.cfr_renamed_1 != 127) break block4;
                return this.cfr_renamed_4745();
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (this.cfr_renamed_1 == 13) {
            return this.cfr_renamed_4746();
        }
        return null;
    }

    private /* synthetic */ sprkom(sprnvm sprnvm2) throws IOException {
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_11247(sprnvm2);
    }

    private /* synthetic */ void cfr_renamed_11248(sprnvm arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_11239(64, 41)) {
            this.cfr_renamed_132 = arg0;
            this.cfr_renamed_1 |= 1;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxgk.cfr_renamed_9("\u007flE#Pm\u0011JBl\u0006;\u00005ebVp\u001fJ\u007fWtQrKpMvFnScLwJ}F\u0011wPd\u00119")).append(arg0.cfr_renamed_312()).toString());
    }

    private /* synthetic */ sprxgf cfr_renamed_4746() throws IOException {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_132);
        sprrvm3.cfr_renamed_5004(sprjlm.cfr_renamed_11237(73, this.cfr_renamed_102));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_137);
        return sprjlm.cfr_renamed_11236(78, new sprcen(sprrvm2));
    }

    public sprfnm cfr_renamed_1157() {
        return this.cfr_renamed_102;
    }

    public sprnvm cfr_renamed_4747() {
        return this.cfr_renamed_132;
    }

    public sprckm cfr_renamed_4715() throws IOException {
        if ((this.cfr_renamed_1 & 0x10) == 16) {
            return this.cfr_renamed_96;
        }
        throw new IOException(spryae.cfr_renamed_9("\u0001<0-+?+:#-'y\n6.='+b\u00187-*6001860-7b7--b*'-"));
    }

    public sprhsm cfr_renamed_4725() throws IOException {
        if ((this.cfr_renamed_1 & 2) == 2) {
            return new sprhsm(sproug.cfr_renamed_23(this.cfr_renamed_107.cfr_renamed_10766(false, 4)).cfr_renamed_186());
        }
        throw new IOException(sprxgk.cfr_renamed_9("@TqEjWjRbEj^m\u0011bDwYlCjEz\u0011qTeTqTmRf\u0011m^w\u0011pTw"));
    }

    private /* synthetic */ void cfr_renamed_11249(sprfnm arg0) {
        this.cfr_renamed_102 = sprfnm.cfr_renamed_23(arg0);
        this.cfr_renamed_1 |= 4;
    }

    private /* synthetic */ void cfr_renamed_11251(sprckm arg0) {
        this.cfr_renamed_96 = arg0;
        this.cfr_renamed_1 |= 0x10;
    }

    public static sprkom cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprkom) {
            return (sprkom)arg0;
        }
        if (arg0 != null) {
            return new sprkom(sprnvm.cfr_renamed_6501(arg0, 64));
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_11250(sprnvm arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_11239(64, 32)) {
            this.cfr_renamed_137 = arg0;
            this.cfr_renamed_1 |= 8;
            return;
        }
        throw new IllegalArgumentException(spryae.cfr_renamed_9("\f66y#7b\u001016uaso\u00168%*l\u001a\u0003\u000b\u0006\u0011\r\u0015\u0006\u001c\u0010\u0006\f\u0018\u000f\u001cb-#>"));
    }

    private /* synthetic */ void cfr_renamed_11253(sprnvm arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_11239(64, 36)) {
            this.cfr_renamed_112 = arg0;
            this.cfr_renamed_1 |= 0x40;
            return;
        }
        throw new IllegalArgumentException(sprxgk.cfr_renamed_9("\u007flE#Pm\u0011JBl\u0006;\u00005ebVp\u001fBaS}JrBeJ~MnFiSxQpWxL\u007f\\uBeF\u0011wPd"));
    }

    public sprrnm cfr_renamed_4711() throws IOException {
        if ((this.cfr_renamed_1 & 0x40) == 64) {
            return new sprrnm(sproug.cfr_renamed_23(this.cfr_renamed_152.cfr_renamed_10766(false, 4)).cfr_renamed_186());
        }
        throw new IOException(spryae.cfr_renamed_9(":'+60$0!86<b\u001c:)++#-+6,y\u000686<b7--b*'-"));
    }

    private /* synthetic */ void cfr_renamed_11252(sprnvm arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_11239(64, 37)) {
            this.cfr_renamed_152 = arg0;
            this.cfr_renamed_1 |= 0x20;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxgk.cfr_renamed_9("M^w\u0011b_#xp^4\t2\u0007WPdB-pSaOx@pWxL\u007f\\tEwFrWxUt\\uBeF\u0011wPd\u00119")).append(arg0.cfr_renamed_312()).toString());
    }

    private /* synthetic */ sprxgf cfr_renamed_4745() throws IOException {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(7);
        sprkom sprkom2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm sprrvm5 = sprrvm2;
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_132);
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_107);
        sprrvm4.cfr_renamed_5004(sprjlm.cfr_renamed_11237(73, this.cfr_renamed_102));
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_137);
        sprrvm2.cfr_renamed_5004(sprkom2.cfr_renamed_96);
        sprrvm3.cfr_renamed_5004(sprkom2.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_112);
        return sprjlm.cfr_renamed_11236(78, new sprcen(sprrvm2));
    }

    public int cfr_renamed_4727() {
        return this.cfr_renamed_1;
    }

    public sprqum cfr_renamed_4723() {
        return new sprqum(sproug.cfr_renamed_23(this.cfr_renamed_137.cfr_renamed_10766(false, 4)).cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprkom(sprnvm sprnvm2, sprhsm sprhsm2, sprfnm sprfnm2, sprqum sprqum2, sprckm sprckm2, sprrnm sprrnm2, sprrnm sprrnm3) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprkom sprkom2 = this;
        sprkom sprkom3 = this;
        sprkom sprkom4 = this;
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_11248((sprnvm)arg0);
        sprkom4.cfr_renamed_11246(sprjlm.cfr_renamed_11235(2, arg1.cfr_renamed_91()));
        sprkom4.cfr_renamed_11249((sprfnm)arg2);
        sprkom3.cfr_renamed_11250(sprjlm.cfr_renamed_11235(32, arg3.cfr_renamed_91()));
        sprkom3.cfr_renamed_11251((sprckm)arg4);
        sprkom2.cfr_renamed_11252(sprjlm.cfr_renamed_11235(37, arg5.cfr_renamed_4572()));
        sprkom2.cfr_renamed_11253(sprjlm.cfr_renamed_11235(36, arg6.cfr_renamed_4572()));
    }
}

