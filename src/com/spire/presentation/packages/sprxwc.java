/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprczc;
import com.spire.presentation.packages.sprdvc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnad;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprye;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.util.Hashtable;

public abstract class sprxwc
extends sprczc {
    public byte[] cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public static final Integer cfr_renamed_4 = sprnad.cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxwc(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprxwc sprxwc2 = this;
        sprxwc2.cfr_renamed_2 = sprzra.cfr_renamed_158((byte[])arg0);
        sprxwc2.cfr_renamed_3 = sprzra.cfr_renamed_158(byArray2);
    }

    @Override
    public sprmc cfr_renamed_2471() throws IOException {
        switch (this.cfr_renamed_4) {
            case 49178: 
            case 49179: 
            case 49180: {
                sprxwc sprxwc2 = this;
                while (false) {
                }
                return sprxwc2.cfr_renamed_2.cfr_renamed_3060(sprxwc2.cfr_renamed_112, 7, 2);
            }
            case 49181: 
            case 49182: 
            case 49183: {
                sprxwc sprxwc3 = this;
                return sprxwc3.cfr_renamed_2.cfr_renamed_3060(sprxwc3.cfr_renamed_112, 8, 2);
            }
            case 49184: 
            case 49185: 
            case 49186: {
                sprxwc sprxwc4 = this;
                return sprxwc4.cfr_renamed_2.cfr_renamed_3060(sprxwc4.cfr_renamed_112, 9, 2);
            }
        }
        throw new spryad(80);
    }

    @Override
    public void cfr_renamed_3059(Hashtable arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2655(arg0, sprnad.cfr_renamed_4, (short)47)) {
            // empty if block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sproc cfr_renamed_2875() throws IOException {
        switch (this.cfr_renamed_4) {
            case 49178: 
            case 49181: 
            case 49184: {
                return this.cfr_renamed_3070(21);
            }
            case 49179: 
            case 49182: 
            case 49185: {
                return this.cfr_renamed_3070(23);
            }
            case 49180: 
            case 49183: 
            case 49186: {
                return this.cfr_renamed_3070(22);
            }
        }
        throw new spryad(80);
    }

    public sproc cfr_renamed_3070(int arg0) {
        sprxwc sprxwc2 = this;
        return new sprdvc(arg0, sprxwc2.cfr_renamed_119, sprxwc2.cfr_renamed_2, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprxwc(sprye sprye2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprxwc sprxwc2 = this;
        super((sprye)arg0);
        sprxwc2.cfr_renamed_2 = sprzra.cfr_renamed_158((byte[])arg1);
        sprxwc2.cfr_renamed_3 = sprzra.cfr_renamed_158(byArray2);
    }

    @Override
    public Hashtable cfr_renamed_3051() throws IOException {
        Hashtable hashtable = sprbcd.cfr_renamed_2832(super.cfr_renamed_3051());
        sprnad.cfr_renamed_2782(hashtable, this.cfr_renamed_2);
        return hashtable;
    }

    @Override
    public int[] cfr_renamed_3048() {
        int[] nArray = new int[1];
        nArray[0] = 49182;
        return nArray;
    }
}

