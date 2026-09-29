/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprtem;
import com.spire.presentation.packages.sprugg;
import java.io.IOException;
import java.math.BigInteger;

public class sprvdm
extends sprtem {
    private byte cfr_renamed_2;
    private byte cfr_renamed_3;
    private byte cfr_renamed_4;

    public sprvdm(sprlem arg0, BigInteger arg1, int arg2, int arg3) {
        super(arg0, arg1);
        this.cfr_renamed_4 = 1;
        this.cfr_renamed_2 = (byte)arg2;
        this.cfr_renamed_3 = (byte)arg3;
        this.cfr_renamed_11086();
        this.cfr_renamed_11087();
    }

    public byte cfr_renamed_579() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_11086() {
        switch (this.cfr_renamed_2) {
            case 8: 
            case 9: 
            case 10: {
                return;
            }
        }
        throw new IllegalStateException(sprugg.cfr_renamed_9("Tdom<dpbswuqth<hivh%~`<VTD17)3<jn%oqnjrbyw2"));
    }

    public byte cfr_renamed_9659() {
        return this.cfr_renamed_4;
    }

    public byte cfr_renamed_7877() {
        return this.cfr_renamed_3;
    }

    public sprvdm(sprmam arg0) throws IOException {
        sprmam sprmam2 = arg0;
        super(sprmam2);
        byte[] byArray = new byte[sprmam2.read()];
        if (byArray.length != 3) {
            throw new IllegalStateException(sprmsf.cfr_renamed_9("\b<\u0005x\u00139\u00119\u000e=\u0017=\u0011+C+\n\"\u0006x\f>CkC=\u001b(\u0006;\u0017=\u0007v"));
        }
        arg0.cfr_renamed_4932(byArray);
        sprvdm sprvdm2 = this;
        sprvdm sprvdm3 = this;
        this.cfr_renamed_4 = byArray[0];
        sprvdm3.cfr_renamed_2 = byArray[1];
        sprvdm3.cfr_renamed_3 = byArray[2];
        sprvdm2.cfr_renamed_11086();
        sprvdm2.cfr_renamed_11087();
    }

    private /* synthetic */ void cfr_renamed_11087() {
        switch (this.cfr_renamed_3) {
            case 7: 
            case 8: 
            case 9: {
                return;
            }
        }
        throw new IllegalStateException(sprugg.cfr_renamed_9("Vehq`hwuf<ny|<dpbswuqth<hivh%~`<DYV14.=<jn%oqnjrbyw2"));
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sprvdm sprvdm2 = this;
        sprjah sprjah2 = arg0;
        super.cfr_renamed_11038(sprjah2);
        sprjah sprjah3 = arg0;
        arg0.write(3);
        sprjah3.write(this.cfr_renamed_4);
        sprjah3.write(this.cfr_renamed_2);
        sprjah2.write(sprvdm2.cfr_renamed_3);
    }

    public sprvdm(sprlem arg0, spreuh arg1, int arg2, int arg3) {
        super(arg0, arg1);
        this.cfr_renamed_4 = 1;
        this.cfr_renamed_2 = (byte)arg2;
        this.cfr_renamed_3 = (byte)arg3;
        this.cfr_renamed_11086();
        this.cfr_renamed_11087();
    }
}

