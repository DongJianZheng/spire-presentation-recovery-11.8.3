/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbc;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprnbd;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprqi;
import com.spire.presentation.packages.sprrbd;
import com.spire.presentation.packages.sprtc;
import com.spire.presentation.packages.sprtwc;
import com.spire.presentation.packages.sprvvc;
import com.spire.presentation.packages.sprvyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprye;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class sprtrc
extends sprvvc
implements sprqi {
    public short cfr_renamed_96;
    public int cfr_renamed_105;
    public boolean cfr_renamed_137;
    public boolean cfr_renamed_79;
    public sprpxc cfr_renamed_107;
    public short[] cfr_renamed_132;
    public int[] cfr_renamed_102;
    public boolean cfr_renamed_93;
    public int[] cfr_renamed_86;
    public short[] cfr_renamed_152;
    public sprtc cfr_renamed_112;
    public short cfr_renamed_119;
    public sprpxc cfr_renamed_91;
    public short[] cfr_renamed_0;
    public Vector cfr_renamed_1;
    public Hashtable cfr_renamed_2;
    public sprye cfr_renamed_3;
    public Hashtable cfr_renamed_4;

    @Override
    public void spr\u2102(sprtc arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public boolean cfr_renamed_3266() {
        return true;
    }

    public short[] cfr_renamed_3049() {
        short[] sArray = new short[1];
        sArray[0] = 0;
        return sArray;
    }

    @Override
    public int cfr_renamed_2829() throws IOException {
        int n;
        sprtrc sprtrc2 = this;
        sprtrc sprtrc3 = this;
        boolean bl = sprtrc2.cfr_renamed_3267(sprtrc2.cfr_renamed_102, sprtrc3.cfr_renamed_152);
        int[] nArray = sprtrc3.cfr_renamed_3048();
        int n2 = n = 0;
        while (n2 < nArray.length) {
            int n3 = nArray[n];
            if (sprzra.cfr_renamed_539(this.cfr_renamed_86, n3) && (bl || !sprrbd.cfr_renamed_3010(n3)) && sprzsc.cfr_renamed_2750(n3, this.cfr_renamed_91)) {
                this.cfr_renamed_105 = n3;
                return this.cfr_renamed_105;
            }
            n2 = ++n;
        }
        throw new spryad(40);
    }

    @Override
    public sprvyc cfr_renamed_2878() throws IOException {
        return null;
    }

    public sprpxc cfr_renamed_3268() {
        return sprpxc.cfr_renamed_91;
    }

    @Override
    public void cfr_renamed_2843(sprbbd arg0) throws IOException {
        throw new spryad(80);
    }

    public boolean cfr_renamed_3269() {
        return false;
    }

    @Override
    public sprbuc cfr_renamed_2888() throws IOException {
        return new sprbuc(0L, sprzsc.cfr_renamed_1);
    }

    @Override
    public void cfr_renamed_2851(sprpxc arg0) throws IOException {
        this.cfr_renamed_107 = arg0;
    }

    @Override
    public void cfr_renamed_2852(int[] arg0) throws IOException {
        this.cfr_renamed_86 = arg0;
        this.cfr_renamed_79 = sprrbd.cfr_renamed_3009(this.cfr_renamed_86);
    }

    public abstract int[] cfr_renamed_3048();

    public boolean cfr_renamed_3267(int[] arg0, short[] arg1) {
        int n;
        if (arg0 == null) {
            return sprrbd.cfr_renamed_3025();
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = arg0[n];
            if (sprnvc.cfr_renamed_2990(n3) && (!sprnvc.cfr_renamed_3006(n3) || sprrbd.cfr_renamed_2991(n3))) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    @Override
    public void cfr_renamed_2853(short[] arg0) throws IOException {
        this.cfr_renamed_132 = arg0;
    }

    @Override
    public sprbc cfr_renamed_2860() throws IOException {
        switch (this.cfr_renamed_96) {
            case 0: {
                return new sprtwc();
            }
        }
        throw new spryad(80);
    }

    @Override
    public Hashtable cfr_renamed_2831() throws IOException {
        if (this.cfr_renamed_93 && this.cfr_renamed_3266() && sprzsc.cfr_renamed_2732(this.cfr_renamed_105)) {
            sprbcd.cfr_renamed_2978(this.cfr_renamed_3270());
        }
        if (this.cfr_renamed_119 >= 0) {
            sprbcd.cfr_renamed_2971(this.cfr_renamed_3270(), this.cfr_renamed_119);
        }
        if (this.cfr_renamed_137 && this.cfr_renamed_3269()) {
            sprbcd.cfr_renamed_2972(this.cfr_renamed_3270());
        }
        if (this.cfr_renamed_152 != null && sprrbd.cfr_renamed_3010(this.cfr_renamed_105)) {
            short[] sArray = new short[3];
            sArray[0] = 0;
            sArray[1] = 1;
            sArray[2] = 2;
            this.cfr_renamed_0 = sArray;
            sprrbd.cfr_renamed_3011(this.cfr_renamed_3270(), this.cfr_renamed_0);
        }
        return this.cfr_renamed_2;
    }

    public sprpxc cfr_renamed_3271() {
        return sprpxc.cfr_renamed_1;
    }

    public sprtrc(sprye sprye2) {
        this.cfr_renamed_3 = sprye2;
    }

    @Override
    public void cfr_renamed_2884(Vector arg0) throws IOException {
        if (arg0 != null) {
            throw new spryad(10);
        }
    }

    public Hashtable cfr_renamed_3270() {
        this.cfr_renamed_2 = sprbcd.cfr_renamed_2832(this.cfr_renamed_2);
        return this.cfr_renamed_2;
    }

    @Override
    public sprfrc cfr_renamed_2880() throws IOException {
        return null;
    }

    @Override
    public Vector cfr_renamed_2418() throws IOException {
        return null;
    }

    @Override
    public short cfr_renamed_2830() throws IOException {
        int n;
        short[] sArray = this.cfr_renamed_3049();
        int n2 = n = 0;
        while (n2 < sArray.length) {
            if (sprzra.cfr_renamed_557(this.cfr_renamed_132, sArray[n])) {
                this.cfr_renamed_96 = sArray[n];
                return this.cfr_renamed_96;
            }
            n2 = ++n;
        }
        throw new spryad(40);
    }

    @Override
    public sprpxc cfr_renamed_2683() throws IOException {
        if (this.cfr_renamed_3268().cfr_renamed_2742(this.cfr_renamed_107)) {
            sprtrc sprtrc2 = this;
            sprpxc sprpxc2 = sprtrc2.cfr_renamed_3271();
            if (sprtrc2.cfr_renamed_107.cfr_renamed_2742(sprpxc2)) {
                this.cfr_renamed_91 = this.cfr_renamed_107;
                return this.cfr_renamed_91;
            }
            if (this.cfr_renamed_107.cfr_renamed_3089(sprpxc2)) {
                this.cfr_renamed_91 = sprpxc2;
                return this.cfr_renamed_91;
            }
        }
        throw new spryad(70);
    }

    public sprtrc() {
        this(new sprnbd());
    }

    @Override
    public void cfr_renamed_2855(Hashtable arg0) throws IOException {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4 != null) {
            Hashtable hashtable = arg0;
            this.cfr_renamed_93 = sprbcd.cfr_renamed_2834(arg0);
            this.cfr_renamed_119 = sprbcd.cfr_renamed_2930(hashtable);
            this.cfr_renamed_137 = sprbcd.cfr_renamed_2836(hashtable);
            this.cfr_renamed_1 = sprzsc.cfr_renamed_2641(arg0);
            if (this.cfr_renamed_1 != null && !sprzsc.cfr_renamed_2756(this.cfr_renamed_107)) {
                throw new spryad(47);
            }
            sprtrc sprtrc2 = this;
            Hashtable hashtable2 = arg0;
            sprtrc2.cfr_renamed_102 = sprrbd.cfr_renamed_3023(hashtable2);
            sprtrc2.cfr_renamed_152 = sprrbd.cfr_renamed_3016(hashtable2);
        }
        if (!(this.cfr_renamed_79 || this.cfr_renamed_102 == null && this.cfr_renamed_152 == null)) {
            throw new spryad(47);
        }
    }
}

