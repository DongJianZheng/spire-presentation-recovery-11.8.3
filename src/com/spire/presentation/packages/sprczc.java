/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbc;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprek;
import com.spire.presentation.packages.sprnbd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprrbd;
import com.spire.presentation.packages.sprtwc;
import com.spire.presentation.packages.sprvvc;
import com.spire.presentation.packages.sprxc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprye;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class sprczc
extends sprvvc
implements sprek {
    public sprxc cfr_renamed_112;
    public Vector cfr_renamed_119;
    public short[] cfr_renamed_91;
    public short cfr_renamed_0;
    public short[] cfr_renamed_1;
    public sprye cfr_renamed_2;
    public int[] cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public short[] cfr_renamed_3049() {
        short[] sArray = new short[1];
        sArray[0] = 0;
        return sArray;
    }

    @Override
    public sprpxc cfr_renamed_2824() {
        return sprpxc.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_3053(sprxc arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @Override
    public void cfr_renamed_3059(Hashtable arg0) throws IOException {
        if (arg0 != null) {
            if (arg0.containsKey(sprzsc.cfr_renamed_0)) {
                throw new spryad(47);
            }
            if (sprrbd.cfr_renamed_3023(arg0) != null) {
                throw new spryad(47);
            }
            this.cfr_renamed_1 = sprrbd.cfr_renamed_3016(arg0);
            if (this.cfr_renamed_1 != null && !sprrbd.cfr_renamed_3010(this.cfr_renamed_4)) {
                throw new spryad(47);
            }
        }
    }

    @Override
    public void cfr_renamed_3056(sprpxc arg0) throws IOException {
        if (!this.cfr_renamed_3268().cfr_renamed_2742(arg0)) {
            throw new spryad(70);
        }
    }

    @Override
    public void cfr_renamed_3057(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprpxc cfr_renamed_3268() {
        return sprpxc.cfr_renamed_91;
    }

    @Override
    public sprzc cfr_renamed_3054() {
        return null;
    }

    @Override
    public Hashtable cfr_renamed_3051() throws IOException {
        Hashtable hashtable = null;
        if (sprzsc.cfr_renamed_2756(this.cfr_renamed_112.cfr_renamed_2824())) {
            int n;
            short[] sArray = new short[5];
            sArray[0] = 6;
            sArray[1] = 5;
            sArray[2] = 4;
            sArray[3] = 3;
            sArray[4] = 2;
            short[] sArray2 = sArray;
            short[] sArray3 = new short[1];
            sArray3[0] = 1;
            short[] sArray4 = sArray3;
            sprczc sprczc2 = this;
            sprczc2.cfr_renamed_119 = new Vector();
            int n2 = n = 0;
            while (n2 < sArray2.length) {
                int n3;
                int n4 = n3 = 0;
                while (n4 < sArray4.length) {
                    this.cfr_renamed_119.addElement(new sprzuc(sArray2[n], sArray4[n3++]));
                    n4 = n3;
                }
                n2 = ++n;
            }
            this.cfr_renamed_119.addElement(new sprzuc(2, 2));
            hashtable = sprbcd.cfr_renamed_2832(hashtable);
            sprzsc.cfr_renamed_2651(hashtable, this.cfr_renamed_119);
        }
        if (sprrbd.cfr_renamed_3009(this.cfr_renamed_3048())) {
            sprczc sprczc3 = this;
            int[] nArray = new int[2];
            nArray[0] = 23;
            nArray[1] = 24;
            sprczc3.cfr_renamed_3 = nArray;
            short[] sArray = new short[3];
            sArray[0] = 0;
            sArray[1] = 1;
            sArray[2] = 2;
            sprczc3.cfr_renamed_91 = sArray;
            Hashtable hashtable2 = hashtable = sprbcd.cfr_renamed_2832(hashtable);
            sprrbd.cfr_renamed_3007(hashtable2, this.cfr_renamed_3);
            sprrbd.cfr_renamed_3011(hashtable2, this.cfr_renamed_91);
        }
        return hashtable;
    }

    @Override
    public sprbc cfr_renamed_2860() throws IOException {
        switch (this.cfr_renamed_0) {
            case 0: {
                return new sprtwc();
            }
        }
        throw new spryad(80);
    }

    @Override
    public Vector cfr_renamed_3038() throws IOException {
        return null;
    }

    public sprczc(sprye sprye2) {
        this.cfr_renamed_2 = sprye2;
    }

    @Override
    public sprpxc cfr_renamed_3047() {
        return this.cfr_renamed_2824();
    }

    @Override
    public void cfr_renamed_2416(Vector arg0) throws IOException {
        if (arg0 != null) {
            throw new spryad(10);
        }
    }

    @Override
    public void cfr_renamed_3043(sprbuc arg0) throws IOException {
    }

    @Override
    public void cfr_renamed_3058(short arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprczc() {
        this(new sprnbd());
    }

    @Override
    public void cfr_renamed_3055(byte[] arg0) {
    }
}

