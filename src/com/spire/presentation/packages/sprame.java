/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprhfp;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtpe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxqo;
import java.io.IOException;
import java.util.Enumeration;

public class sprame
extends sprkra {
    public String cfr_renamed_137;
    public sprvae cfr_renamed_79;
    public byte[] cfr_renamed_107;
    public sprtzd cfr_renamed_132;
    private int cfr_renamed_102;
    private sprtpe cfr_renamed_93;
    public byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    public sprtzd cfr_renamed_112;
    public byte[] cfr_renamed_119;
    public String cfr_renamed_91;
    private static int cfr_renamed_0;
    public int cfr_renamed_1;
    private static int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    public static byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprame(sprgwe sprgwe2) throws IOException {
        void arg0;
        sprame sprame2 = this;
        sprame sprame3 = this;
        sprame sprame4 = this;
        this.cfr_renamed_152 = null;
        sprame4.cfr_renamed_3 = null;
        sprame4.cfr_renamed_132 = null;
        sprame3.cfr_renamed_112 = null;
        sprame3.cfr_renamed_86 = null;
        sprame2.cfr_renamed_91 = null;
        sprame2.cfr_renamed_79 = null;
        if (sprgwe2.cfr_renamed_4576() == 103) {
            sprbne sprbne2 = sprbne.cfr_renamed_23(arg0.cfr_renamed_4578(16));
            this.cfr_renamed_4707(sprgwe.cfr_renamed_23(sprbne2.cfr_renamed_85(0)));
            this.cfr_renamed_3 = sprgwe.cfr_renamed_23(sprbne2.cfr_renamed_85(sprbne2.cfr_renamed_84() - 1)).cfr_renamed_4577();
            return;
        }
        this.cfr_renamed_4707((sprgwe)arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprame cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprame) {
            return (sprame)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return new sprame(sprgwe.cfr_renamed_23(arg0));
        }
        catch (IOException iOException) {
            throw new spraqe(new StringBuilder().insert(0, sprxqo.cfr_renamed_9("\u0012)\u0006%\u000b\"G3\bg\u0017&\u00154\u0002g\u0003&\u0013&]g")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public byte[] cfr_renamed_2571() {
        return this.cfr_renamed_152;
    }

    public sprvae cfr_renamed_1157() {
        return this.cfr_renamed_93.cfr_renamed_1157();
    }

    public sprtpe cfr_renamed_2570() {
        return this.cfr_renamed_93;
    }

    private /* synthetic */ void cfr_renamed_4707(sprgwe arg0) throws IOException {
        if (arg0.cfr_renamed_4576() == 33) {
            Enumeration enumeration = sprbne.cfr_renamed_23(arg0.cfr_renamed_4578(16)).cfr_renamed_329();
            block4: while (enumeration.hasMoreElements()) {
                sprgwe sprgwe2 = sprgwe.cfr_renamed_23(enumeration.nextElement());
                switch (sprgwe2.cfr_renamed_4576()) {
                    case 78: {
                        this.cfr_renamed_93 = sprtpe.cfr_renamed_23(sprgwe2);
                        this.cfr_renamed_102 |= cfr_renamed_2;
                        continue block4;
                    }
                    case 55: {
                        while (false) {
                        }
                        this.cfr_renamed_152 = sprgwe2.cfr_renamed_4577();
                        this.cfr_renamed_102 |= cfr_renamed_0;
                        continue block4;
                    }
                }
                throw new IOException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("}+B$X,Pe@$Si\u0014+[1\u0014$Zew\u0013\u0014\u0006Q7@,R,W$@ \u0014\u0017Q4A G1\u0014 X Y Z1\u000e")).append(sprgwe2.cfr_renamed_4576()).toString());
            }
        } else {
            throw new IOException(new StringBuilder().insert(0, sprxqo.cfr_renamed_9("\t(\u0013g\u0006g$\u00065\u0003/\b+\u0003\"\u00158\u0004\"\u00153\u000e!\u000e$\u00063\u0002G.\tg\u0015\"\u00162\u00024\u0013}")).append(arg0.cfr_renamed_4576()).toString());
        }
    }

    static {
        cfr_renamed_2 = 1;
        cfr_renamed_0 = 2;
        byte[] byArray = new byte[1];
        byArray[0] = 0;
        cfr_renamed_4 = byArray;
    }

    public boolean cfr_renamed_4708() {
        return this.cfr_renamed_3 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_93);
        try {
            sprlre2.cfr_renamed_49(new sprgwe(false, 55, new sprlqe(this.cfr_renamed_152)));
            return new sprgwe(33, sprlre2);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprhfp.cfr_renamed_9("0Z$V)Qe@*\u0014&[+B F1\u00146]\"Z$@0F \u0015"));
        }
    }

    public byte[] cfr_renamed_4709() {
        return this.cfr_renamed_3;
    }
}

