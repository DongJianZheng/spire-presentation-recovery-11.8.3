/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajn;
import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfmp;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgho;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprkeo;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprsko;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtnn;
import com.spire.presentation.packages.sprtoo;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryxp;
import java.util.Iterator;

@sprtea
public class sprfho {
    private boolean cfr_renamed_91;
    private sprkeo cfr_renamed_0;
    private static final int cfr_renamed_1 = 63;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 0;
    private static final int cfr_renamed_4 = 1;

    private /* synthetic */ sprboo cfr_renamed_13380() {
        return this.cfr_renamed_0.cfr_renamed_15978();
    }

    private /* synthetic */ void cfr_renamed_16023(byte[] arg0, sprpeja arg1) {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(2);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0.length);
        sprfho sprfho3 = this;
        sprfho3.cfr_renamed_16024(arg1);
        sprfho3.cfr_renamed_13380().cfr_renamed_9854(arg0);
    }

    private /* synthetic */ int cfr_renamed_16025(sprtnn arg0) {
        sprtnn sprtnn2 = arg0;
        int n = this.cfr_renamed_16026(sprtnn2);
        if (sprtnn2.cfr_renamed_12779() != null) {
            this.cfr_renamed_16027(arg0.cfr_renamed_12779());
            return n |= 4;
        }
        if (arg0.cfr_renamed_14163() != null && arg0.cfr_renamed_14164() != null) {
            n |= 8;
            this.cfr_renamed_16028(arg0.cfr_renamed_14163(), arg0.cfr_renamed_14164());
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_16029(sprghp arg0) {
        this.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12553());
    }

    private /* synthetic */ void cfr_renamed_16030(sprtbp arg0) {
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        this.cfr_renamed_13380().cfr_renamed_16017();
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(0);
        int n = 0;
        long l = sprfho2.cfr_renamed_0.cfr_renamed_14060().cfr_renamed_3274();
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprtbp sprtbp2 = arg0;
        sprfho2.cfr_renamed_13380().cfr_renamed_15109(sprtbp2.cfr_renamed_1942());
        if (sprtbp2.cfr_renamed_13151() != 0) {
            n |= 2;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13151());
        }
        if (arg0.cfr_renamed_13152() != 0) {
            n |= 4;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13152());
        }
        if (arg0.cfr_renamed_12576() != 0) {
            n |= 8;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_12576());
        }
        if (!spryxp.cfr_renamed_13682(arg0.cfr_renamed_13149(), 10.0)) {
            n |= 0x10;
            this.cfr_renamed_13380().cfr_renamed_15109(arg0.cfr_renamed_13149());
        }
        if (arg0.cfr_renamed_13153() != 0) {
            n |= 0x20;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13153());
        }
        if (arg0.cfr_renamed_13156() != 0) {
            n |= 0x40;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13156());
        }
        if (!spryxp.cfr_renamed_13682(arg0.cfr_renamed_13154(), 0.0)) {
            n |= 0x80;
            this.cfr_renamed_13380().cfr_renamed_15109(arg0.cfr_renamed_13154());
        }
        if (arg0.cfr_renamed_13153() == 5 && arg0.cfr_renamed_13157() != null) {
            n |= 0x100;
            this.cfr_renamed_13380().cfr_renamed_14093(arg0.cfr_renamed_13157());
        }
        if (arg0.cfr_renamed_16031() != 0) {
            n |= 0x200;
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_16031());
        }
        if (arg0.cfr_renamed_14763().length > 0) {
            n |= 0x400;
            this.cfr_renamed_13380().cfr_renamed_14093(arg0.cfr_renamed_14763());
        }
        this.cfr_renamed_16032(n, l);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_16033(sprgdp sprgdp2) {
        void arg0;
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        long l = sprfho3.cfr_renamed_14060().cfr_renamed_3274();
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13337());
        sprfho3.cfr_renamed_13380().cfr_renamed_16015(arg0.cfr_renamed_12644());
        sprfho3.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12645());
        sprfho3.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12646());
        sprfho3.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12645());
        sprfho2.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12646());
        sprfho2.cfr_renamed_16032(sprfho2.cfr_renamed_16025(sprgdp2), l);
    }

    private /* synthetic */ spreen cfr_renamed_14060() {
        return this.cfr_renamed_0.cfr_renamed_14060();
    }

    private /* synthetic */ void cfr_renamed_16034(sprhlp arg0) {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_12678());
        sprfho2.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12675());
        sprfho2.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_12676());
    }

    private /* synthetic */ void cfr_renamed_16028(float[] arg0, float[] arg1) {
        int n;
        this.cfr_renamed_13380().cfr_renamed_9011(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_13380().cfr_renamed_15109(arg0[n++]);
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < arg0.length) {
            this.cfr_renamed_13380().cfr_renamed_15109(arg1[n++]);
            n3 = n;
        }
    }

    public int cfr_renamed_14064(sprxln sprxln2) {
        sprfho sprfho2 = this;
        int n = this.cfr_renamed_16035();
        sprfho2.cfr_renamed_16036(3, n);
        sprfho2.cfr_renamed_16037(sprxln2);
        sprfho2.cfr_renamed_16038();
        return n;
    }

    private /* synthetic */ int cfr_renamed_16035() {
        sprfho sprfho2 = this;
        int n = sprfho2.cfr_renamed_2++;
        if (sprfho2.cfr_renamed_2 > 63) {
            this.cfr_renamed_2 = 1;
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_16027(sprfmp[] arg0) {
        int n;
        this.cfr_renamed_13380().cfr_renamed_9011(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_13380().cfr_renamed_15109(arg0[n++].cfr_renamed_3274());
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < arg0.length) {
            this.cfr_renamed_13380().cfr_renamed_16014(arg0[n++].cfr_renamed_12553());
            n3 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_15991(sprhhp sprhhp2, int n) {
        void arg1;
        sprfho sprfho2 = this;
        int n2 = this.cfr_renamed_16035();
        sprfho2.cfr_renamed_16036(6, n2);
        sprfho2.cfr_renamed_16039(sprhhp2, (int)arg1);
        sprfho2.cfr_renamed_16038();
        return n2;
    }

    private /* synthetic */ void cfr_renamed_16037(sprxln arg0) {
        int n;
        Iterator iterator;
        sprsko sprsko2 = new sprsko();
        sprfho sprfho2 = this;
        sprsko sprsko3 = sprsko2;
        sprsko3.cfr_renamed_16019(arg0);
        this.cfr_renamed_13380().cfr_renamed_16017();
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(sprsko2.cfr_renamed_13187().size());
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        Iterator iterator2 = iterator = sprsko3.cfr_renamed_13187().iterator();
        while (iterator2.hasNext()) {
            sprsuja sprsuja2 = (sprsuja)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_13380().cfr_renamed_16040(sprsuja2);
        }
        int n2 = n = 0;
        while (n2 < sprsko2.cfr_renamed_13187().size()) {
            int n3 = (Integer)sprsko2.cfr_renamed_16022().get(n);
            int n4 = (Integer)sprsko2.cfr_renamed_16020().get(n);
            int n5 = n3 + (n4 << 4);
            this.cfr_renamed_13380().cfr_renamed_11594((byte)n5);
            n2 = ++n;
        }
        this.cfr_renamed_13380().cfr_renamed_16018(sprsko2.cfr_renamed_13187().size());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_16041(int n, int n2) {
        void arg0;
        this.cfr_renamed_13380().cfr_renamed_15108((int)arg0);
        return n2 ^ arg0 & 0xFFFF;
    }

    private /* synthetic */ void cfr_renamed_16042(sprlrn arg0) {
        int n;
        sprfho sprfho2 = this;
        long l = sprfho2.cfr_renamed_14060().cfr_renamed_3274();
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13337());
        sprlrn sprlrn2 = arg0;
        sprfho2.cfr_renamed_13380().cfr_renamed_16014(sprlrn2.cfr_renamed_13867());
        sprfho2.cfr_renamed_13380().cfr_renamed_16040(arg0.cfr_renamed_13552());
        if (sprlrn2.cfr_renamed_13868() != null) {
            this.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13868().length);
            int n2 = n = 0;
            while (n2 < arg0.cfr_renamed_13868().length) {
                this.cfr_renamed_13380().cfr_renamed_16014(arg0.cfr_renamed_13868()[n++]);
                n2 = n;
            }
        } else {
            this.cfr_renamed_13380().cfr_renamed_9011(0);
        }
        n = 1;
        this.cfr_renamed_16043(arg0.cfr_renamed_6493());
        sprfho sprfho3 = this;
        n = 1 | sprfho3.cfr_renamed_16025(arg0);
        sprfho3.cfr_renamed_16032(n, l);
    }

    public int cfr_renamed_15993() {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_16044();
            this.cfr_renamed_91 = true;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpeja cfr_renamed_16045(byte[] byArray) {
        sprfho sprfho2;
        void arg0;
        sprfho sprfho3 = this;
        this.cfr_renamed_13380().cfr_renamed_16017();
        int n = sprfho3.cfr_renamed_16046((byte[])arg0);
        sprczo sprczo2 = sprsto.cfr_renamed_13321(byArray);
        sprpeja sprpeja2 = new sprpeja(sprczo2.cfr_renamed_13430(), sprczo2.cfr_renamed_13342(), sprczo2.cfr_renamed_1942(), sprczo2.cfr_renamed_1452());
        long l = sprfho3.cfr_renamed_14060().cfr_renamed_3274();
        switch (n) {
            case 0: {
                sprfho2 = this;
                while (false) {
                }
                sprfho sprfho4 = this;
                sprfho4.cfr_renamed_13380().cfr_renamed_9011(1);
                sprfho4.cfr_renamed_16047((byte[])arg0);
                break;
            }
            default: {
                sprfho2 = this;
                sprfho sprfho5 = this;
                sprfho5.cfr_renamed_13380().cfr_renamed_9011(2);
                sprfho5.cfr_renamed_16048((byte[])arg0, n, sprpeja2);
            }
        }
        sprfho2.cfr_renamed_13380().cfr_renamed_16018((int)(this.cfr_renamed_14060().cfr_renamed_3274() - l));
        return sprpeja2;
    }

    private /* synthetic */ void cfr_renamed_16043(sprxln arg0) {
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        long l = this.cfr_renamed_14060().cfr_renamed_3274();
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_16037(arg0);
        long l2 = sprfho3.cfr_renamed_14060().cfr_renamed_3274() - l - 4L;
        long l3 = sprfho2.cfr_renamed_14060().cfr_renamed_3274();
        sprfho2.cfr_renamed_14060().cfr_renamed_11548(l);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011((int)l2);
        sprfho2.cfr_renamed_14060().cfr_renamed_11548(l3);
    }

    public sprgho cfr_renamed_15994(byte[] byArray) {
        sprfho sprfho2 = this;
        int n = this.cfr_renamed_16035();
        sprfho2.cfr_renamed_16036(5, n);
        sprpeja sprpeja2 = sprfho2.cfr_renamed_16045(byArray);
        sprfho2.cfr_renamed_16038();
        return new sprgho(n, sprpeja2);
    }

    private /* synthetic */ void cfr_renamed_16049(byte[] arg0) {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(1);
        sprfho2.cfr_renamed_13380().cfr_renamed_9854(arg0);
        sprfho2.cfr_renamed_13380().cfr_renamed_16018(arg0.length);
    }

    private /* synthetic */ int cfr_renamed_16026(sprajn arg0) {
        if (arg0.cfr_renamed_12672() != null && !arg0.cfr_renamed_12672().cfr_renamed_13656()) {
            this.cfr_renamed_13380().cfr_renamed_16013(arg0.cfr_renamed_12672());
            return 2;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_16050(sprpln sprpln2) {
        this.cfr_renamed_13380().cfr_renamed_16017();
        switch (sprpln2.cfr_renamed_13338()) {
            case 0: {
                void arg0;
                this.cfr_renamed_13380().cfr_renamed_9011(0);
                this.cfr_renamed_16029((sprghp)arg0);
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_13380().cfr_renamed_9011(1);
                this.cfr_renamed_16034((sprhlp)arg0);
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_13380().cfr_renamed_9011(2);
                this.cfr_renamed_16051((sprpip)arg0);
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_13380().cfr_renamed_9011(4);
                this.cfr_renamed_16033((sprgdp)arg0);
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_13380().cfr_renamed_9011(3);
                this.cfr_renamed_16042((sprlrn)arg0);
                return;
            }
        }
        throw new IllegalStateException(sprrmo.cfr_renamed_9("\u0010d r5o&~ neh7\u007f6be~<z "));
    }

    private /* synthetic */ void cfr_renamed_16051(sprpip arg0) {
        if (arg0.cfr_renamed_13509() > 0.0f) {
            this.cfr_renamed_0.cfr_renamed_13269(2, sprseo.cfr_renamed_9("\u00017-&  0r7  !=r:\"41<&,r<!u<:&u! \"%='&06{"));
        }
        if (arg0.cfr_renamed_14742() != null) {
            this.cfr_renamed_0.cfr_renamed_13269(2, sprrmo.cfr_renamed_9("\u0011o=~0x *'x0y-*&e)e7*(k5*,yed*~ey0z5e7~ nk"));
        }
        if (!arg0.cfr_renamed_13533().cfr_renamed_29()) {
            this.cfr_renamed_0.cfr_renamed_13269(2, sprseo.cfr_renamed_9("\u00060*!''7u0''&:u;8327u3'74r<!u<:&u! \"%='&06{"));
        }
        sprfho sprfho2 = this;
        sprpip sprpip2 = arg0;
        sprfho sprfho3 = this;
        long l = sprfho3.cfr_renamed_14060().cfr_renamed_3274();
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho3.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_13337());
        sprfho2.cfr_renamed_16032(sprfho2.cfr_renamed_16026(sprpip2), l);
        sprfho2.cfr_renamed_16045(sprpip2.cfr_renamed_12510());
    }

    private /* synthetic */ void cfr_renamed_16036(int arg0, int arg1) {
        int n = arg1 + (arg0 << 8);
        this.cfr_renamed_15985().cfr_renamed_16016(16392, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_16052(int arg0) {
        switch (arg0) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 0: {
                return 0;
            }
        }
        throw new IllegalStateException(sprrmo.cfr_renamed_9("_+o=z i1o!*(o1k#c)oe~<z "));
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_15057(sprtbp sprtbp2) {
        void arg0;
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        int n = sprfho3.cfr_renamed_16035();
        sprfho3.cfr_renamed_16036(2, n);
        sprfho2.cfr_renamed_16030((sprtbp)arg0);
        sprfho2.cfr_renamed_16050(sprtbp2.cfr_renamed_12551());
        sprfho2.cfr_renamed_16038();
        return n;
    }

    private /* synthetic */ void cfr_renamed_16032(int arg0, long arg1) {
        sprfho sprfho2 = this;
        long l = sprfho2.cfr_renamed_14060().cfr_renamed_3274();
        sprfho2.cfr_renamed_14060().cfr_renamed_11548(arg1);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0);
        sprfho2.cfr_renamed_14060().cfr_renamed_11548(l);
    }

    public int cfr_renamed_15056(sprpln sprpln2) {
        sprfho sprfho2 = this;
        int n = this.cfr_renamed_16035();
        sprfho2.cfr_renamed_16036(1, n);
        sprfho2.cfr_renamed_16050(sprpln2);
        sprfho2.cfr_renamed_16038();
        return n;
    }

    private /* synthetic */ void cfr_renamed_16044() {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_16036(7, 0);
        sprfho2.cfr_renamed_16053();
        sprfho2.cfr_renamed_16038();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ int cfr_renamed_16046(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            int n = this.cfr_renamed_16052(sprsto.cfr_renamed_16054(sprpdja2));
            return n;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_16048(byte[] arg0, int arg1, sprpeja arg2) {
        switch (arg1) {
            case 1: {
                this.cfr_renamed_16023(arg0, arg2);
                return;
            }
            case 2: {
                this.cfr_renamed_16055(arg0);
                return;
            }
        }
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg1);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0.length);
        this.cfr_renamed_13380().cfr_renamed_9854(arg0);
    }

    private /* synthetic */ void cfr_renamed_16055(byte[] arg0) {
        int n = 22;
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(2);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg0.length - n);
        sprfho sprfho3 = this;
        sprfho3.cfr_renamed_13380().cfr_renamed_15098(arg0, 0, n);
        sprfho3.cfr_renamed_13380().cfr_renamed_15112((short)0);
        sprfho3.cfr_renamed_13380().cfr_renamed_15098(arg0, n, arg0.length - n);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_16056(short s, int n) {
        void arg0;
        this.cfr_renamed_13380().cfr_renamed_15112((short)arg0);
        return n ^ arg0;
    }

    private /* synthetic */ void cfr_renamed_16047(byte[] arg0) {
        this.cfr_renamed_16049(arg0);
    }

    private /* synthetic */ void cfr_renamed_16024(sprpeja arg0) {
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        sprpeja sprpeja2 = arg0;
        sprfho sprfho4 = this;
        int n = this.cfr_renamed_16041(52695, 0);
        n = sprfho4.cfr_renamed_16041(39622, n);
        n = sprfho4.cfr_renamed_16041(0, n);
        n = sprfho4.cfr_renamed_16056((short)arg0.cfr_renamed_13430(), n);
        n = this.cfr_renamed_16056((short)sprpeja2.cfr_renamed_13342(), n);
        n = sprfho3.cfr_renamed_16056((short)sprpeja2.cfr_renamed_13341(), n);
        n = sprfho2.cfr_renamed_16056((short)arg0.cfr_renamed_13429(), n);
        n = sprfho2.cfr_renamed_16041((int)sprfho3.cfr_renamed_0.cfr_renamed_14217(), n);
        n = sprfho2.cfr_renamed_16041(0, n);
        n = sprfho2.cfr_renamed_16041(0, n);
        sprfho2.cfr_renamed_13380().cfr_renamed_15112((short)n);
        sprfho2.cfr_renamed_13380().cfr_renamed_15112((short)0);
    }

    private /* synthetic */ sprtoo cfr_renamed_15985() {
        return this.cfr_renamed_0.cfr_renamed_15980();
    }

    private /* synthetic */ void cfr_renamed_16053() {
        sprfho sprfho2 = this;
        sprfho sprfho3 = this;
        sprfho3.cfr_renamed_13380().cfr_renamed_16017();
        long l = 26628L;
        sprfho3.cfr_renamed_13380().cfr_renamed_9011((int)l);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_15104(0xFAAA0000L);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_15109(0.0f);
        sprfho2.cfr_renamed_13380().cfr_renamed_15109(0.0f);
        sprfho2.cfr_renamed_13380().cfr_renamed_15109(1.0f);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
    }

    public void cfr_renamed_16039(sprhhp arg0, int arg1) {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_13380().cfr_renamed_16017();
        sprfho2.cfr_renamed_13380().cfr_renamed_15109(arg0.cfr_renamed_13265());
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(3);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(arg1);
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(0);
        byte[] byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(arg0.cfr_renamed_13460());
        sprfho2.cfr_renamed_13380().cfr_renamed_9011(byArray.length / 2);
        sprfho sprfho3 = this;
        sprfho3.cfr_renamed_13380().cfr_renamed_9854(byArray);
        sprfho3.cfr_renamed_13380().cfr_renamed_16018(byArray.length);
    }

    public sprfho(sprkeo sprkeo2) {
        sprfho sprfho2 = this;
        sprfho2.cfr_renamed_2 = 1;
        sprfho2.cfr_renamed_0 = sprkeo2;
    }

    private /* synthetic */ void cfr_renamed_16038() {
        this.cfr_renamed_15985().cfr_renamed_15970();
    }
}

