/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sprnme;
import com.spire.presentation.packages.sprnse;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxjg;
import com.spire.presentation.packages.spryte;

public class sprmpe
extends sprkra {
    private sprbne cfr_renamed_2;
    private sprnse cfr_renamed_3;
    private sprnme cfr_renamed_4;

    public static sprmpe[] cfr_renamed_4749(sprbne arg0) {
        int n;
        sprmpe[] sprmpeArray = new sprmpe[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprmpeArray.length) {
            int n3 = n++;
            sprmpeArray[n3] = sprmpe.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprmpeArray;
    }

    public sprmpe(sprnme arg0) {
        this(arg0, null, null);
    }

    public sprnme cfr_renamed_4750() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_4751(sprbne arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public static sprmpe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmpe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprmpe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmpe) {
            return (sprmpe)arg0;
        }
        if (arg0 != null) {
            return new sprmpe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4752(sprnse arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmpe(sprbne sprbne2) {
        void v0;
        void arg0;
        int n = 0;
        spra spra2 = sprbne2.cfr_renamed_85(0);
        ++n;
        this.cfr_renamed_4 = sprnme.cfr_renamed_23(spra2);
        try {
            spra2 = arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_2 = sprbne.cfr_renamed_23(spra2);
            v0 = arg0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            v0 = arg0;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return;
        }
        {
            spra2 = v0.cfr_renamed_85(n);
            ++n;
            spryte spryte2 = spryte.cfr_renamed_23(spra2);
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprnse.cfr_renamed_341(spryte2, false);
                    return;
                }
            }
            return;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprmbka.cfr_renamed_9("7}\u0011{\u0006h&h\u0000_\u000b}\nrCgi"));
        stringBuffer.append(sprxjg.cfr_renamed_9("1\u00157\u0013 \u0000\u007fT") + this.cfr_renamed_4 + "\n");
        if (this.cfr_renamed_2 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprmbka.cfr_renamed_9("\u0000t\u0002u\r&C")).append(this.cfr_renamed_2).append("\n").toString());
        }
        if (this.cfr_renamed_3 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprxjg.cfr_renamed_9("\u0004$\u0000-$7\u001b&=+\u00040\u0000\u007fT")).append(this.cfr_renamed_3).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprmbka.cfr_renamed_9("ai"));
        return stringBuffer2.toString();
    }

    public sprmpe(sprnme arg0, sprnme[] arg1) {
        this(arg0, arg1, null);
    }

    public sprnse cfr_renamed_4753() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpe(sprnme sprnme2, sprnme[] sprnmeArray, sprnse sprnse2) {
        void arg2;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprnmeArray != null) {
            void arg1;
            sprmpe sprmpe2 = this;
            sprmpe2.cfr_renamed_2 = new sprpse((spra[])arg1);
        }
        this.cfr_renamed_3 = arg2;
    }

    public sprmpe(sprnme arg0, sprnse arg1) {
        this(arg0, null, arg1);
    }

    public sprnme[] cfr_renamed_4754() {
        if (this.cfr_renamed_2 != null) {
            return sprnme.cfr_renamed_4749(this.cfr_renamed_2);
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprmpe sprmpe2 = this;
        sprlre2.cfr_renamed_49(sprmpe2.cfr_renamed_4);
        if (sprmpe2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }
}

