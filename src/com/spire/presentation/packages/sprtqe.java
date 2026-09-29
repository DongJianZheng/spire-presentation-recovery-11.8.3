/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmpe;
import com.spire.presentation.packages.sprmpp;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprome;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxse;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzvo;

public class sprtqe
extends sprkra {
    private static final int cfr_renamed_79 = 0;
    private static final int cfr_renamed_107 = 3;
    private sprome cfr_renamed_132;
    private sprkme cfr_renamed_102;
    private sprxse cfr_renamed_93;
    private static final int cfr_renamed_86 = 2;
    private sprooe cfr_renamed_152;
    private static final int cfr_renamed_112 = 1;
    private int cfr_renamed_119;
    private sprere cfr_renamed_91;
    private static final int cfr_renamed_0 = 1;
    private sprszd cfr_renamed_1;
    private sprnje cfr_renamed_2;
    private spriae cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public sprome cfr_renamed_4776() {
        return this.cfr_renamed_132;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_152;
    }

    public spriae cfr_renamed_598() {
        return this.cfr_renamed_3;
    }

    public sprxse cfr_renamed_4777() {
        return this.cfr_renamed_93;
    }

    public sprkme cfr_renamed_4778() {
        return this.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprtqe(sprbne sprbne2) {
        sprtqe sprtqe2;
        void arg0;
        sprvva sprvva2;
        this.cfr_renamed_119 = 1;
        int n = 0;
        spra spra2 = sprbne2.cfr_renamed_85(0);
        ++n;
        try {
            sprvva2 = sprooe.cfr_renamed_23(spra2);
            int n2 = n++;
            this.cfr_renamed_119 = sprvva2.cfr_renamed_97().intValue();
            spra2 = arg0.cfr_renamed_85(n2);
            sprtqe2 = this;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            sprtqe2 = this;
        }
        sprtqe2.cfr_renamed_132 = sprome.cfr_renamed_23(spra2);
        void v2 = arg0;
        spra2 = v2.cfr_renamed_85(n);
        int n3 = ++n;
        this.cfr_renamed_2 = sprnje.cfr_renamed_23(spra2);
        spra2 = v2.cfr_renamed_85(n3);
        int n4 = ++n;
        this.cfr_renamed_152 = sprooe.cfr_renamed_23(spra2);
        spra2 = v2.cfr_renamed_85(n4);
        this.cfr_renamed_93 = sprxse.cfr_renamed_23(spra2);
        block12: while (true) {
            int n5 = ++n;
            while (true) {
                if (n5 >= arg0.cfr_renamed_84()) {
                    return;
                }
                spra2 = arg0.cfr_renamed_85(n);
                ++n;
                try {
                    sprvva2 = spryte.cfr_renamed_23(spra2);
                    switch (((spryte)sprvva2).cfr_renamed_312()) {
                        case 0: {
                            this.cfr_renamed_102 = sprkme.cfr_renamed_341((spryte)sprvva2, false);
                            break;
                        }
                        case 1: {
                            this.cfr_renamed_3 = spriae.cfr_renamed_23(sprbne.cfr_renamed_341((spryte)sprvva2, false));
                            break;
                        }
                        case 2: {
                            this.cfr_renamed_91 = sprere.cfr_renamed_341((spryte)sprvva2, false);
                            break;
                        }
                        case 3: {
                            this.cfr_renamed_4 = sprbne.cfr_renamed_341((spryte)sprvva2, false);
                            break;
                        }
                    }
                    continue block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    try {
                        this.cfr_renamed_1 = sprszd.cfr_renamed_23(spra2);
                        n5 = n;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        n5 = n;
                        continue;
                    }
                }
                break;
            }
        }
    }

    public static sprtqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtqe) {
            return (sprtqe)arg0;
        }
        if (arg0 != null) {
            return new sprtqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_4767(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprtqe(sprome sprome2, sprnje sprnje2, sprooe sprooe2, sprxse sprxse2) {
        void arg2;
        void arg1;
        void arg0;
        sprtqe sprtqe2 = this;
        sprtqe sprtqe3 = this;
        this.cfr_renamed_119 = 1;
        sprtqe3.cfr_renamed_132 = arg0;
        sprtqe3.cfr_renamed_2 = arg1;
        sprtqe2.cfr_renamed_152 = arg2;
        sprtqe2.cfr_renamed_93 = sprxse2;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ void cfr_renamed_4770(sprnje arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_119 != 1) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_119));
        }
        sprlre sprlre3 = sprlre2;
        sprtqe sprtqe2 = this;
        sprlre sprlre4 = sprlre2;
        sprlre4.cfr_renamed_49(this.cfr_renamed_132);
        sprlre4.cfr_renamed_49(this.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprtqe2.cfr_renamed_152);
        sprlre3.cfr_renamed_49(sprtqe2.cfr_renamed_93);
        if (this.cfr_renamed_102 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_102));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_91));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 3, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        return new sprpse(sprlre2);
    }

    public sprnje cfr_renamed_592() {
        return this.cfr_renamed_2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprmpp.cfr_renamed_9("\u0006*\u0001/\u0001\u00190\b\u000b\u0012$\u0013b\u0007H"));
        if (this.cfr_renamed_119 != 1) {
            stringBuffer.append(sprzvo.cfr_renamed_9("C\"G4\\([}\u0015") + this.cfr_renamed_119 + "\n");
        }
        stringBuffer.append(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("&\n\u0010\u001935,\u001a-Fb")).append(this.cfr_renamed_132).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprzvo.cfr_renamed_9("*P4F&R\"|*E5\\)A}\u0015")).append(this.cfr_renamed_2).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\u000f'\u000e+\u001d.27\u0011 \u00190Fb")).append(this.cfr_renamed_152).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprzvo.cfr_renamed_9("5P4E([4P\u0013\\*P}\u0015")).append(this.cfr_renamed_93).append("\n").toString());
        if (this.cfr_renamed_102 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\u00184/6\u001d6\t1Fb")).append(this.cfr_renamed_102).append("\n").toString());
        }
        if (this.cfr_renamed_3 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprzvo.cfr_renamed_9("7Z+\\$L}\u0015")).append(this.cfr_renamed_3).append("\n").toString());
        }
        if (this.cfr_renamed_91 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\u000e'\r\u0011\u0015%\u0012#\b7\u000e'Fb")).append(this.cfr_renamed_91).append("\n").toString());
        }
        if (this.cfr_renamed_4 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprzvo.cfr_renamed_9("V\"G3F}\u0015")).append(this.cfr_renamed_4).append("\n").toString());
        }
        if (this.cfr_renamed_1 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\u0019:\b'\u00121\u0015-\u00121Fb")).append(this.cfr_renamed_1).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprzvo.cfr_renamed_9(":?"));
        return stringBuffer2.toString();
    }

    public sprmpe[] cfr_renamed_626() {
        if (this.cfr_renamed_4 != null) {
            return sprmpe.cfr_renamed_4749(this.cfr_renamed_4);
        }
        return null;
    }

    public static sprtqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprtqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprere cfr_renamed_4779() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ void cfr_renamed_4774(sprome arg0) {
        this.cfr_renamed_132 = arg0;
    }
}

