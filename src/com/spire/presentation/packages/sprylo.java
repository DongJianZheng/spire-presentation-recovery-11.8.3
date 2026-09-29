/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhi;
import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprcoo;
import com.spire.presentation.packages.sprhoo;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprjpo;
import com.spire.presentation.packages.sprleo;
import com.spire.presentation.packages.sprnmo;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvlo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprylo {
    private spriy cfr_renamed_91;
    private boolean cfr_renamed_0;
    private static final int cfr_renamed_1 = 19;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = Integer.MIN_VALUE;
    private sprrpp cfr_renamed_4;

    @sprtea
    public void cfr_renamed_16197(sprrt arg0) {
        sprylo sprylo2;
        int n;
        if (this.cfr_renamed_0) {
            if (this.cfr_renamed_4.cfr_renamed_11861() <= 19) {
                n = this.cfr_renamed_2++;
                n = n | Integer.MIN_VALUE;
                sprylo2 = this;
                arg0.cfr_renamed_16244(n);
            } else {
                n = arg0.cfr_renamed_12977();
                sprylo2 = this;
            }
        } else {
            sprylo sprylo3 = this;
            if (arg0 == null) {
                n = sprylo3.cfr_renamed_2++;
                sprylo2 = this;
            } else {
                n = sprylo3.cfr_renamed_16272();
                sprylo2 = this;
            }
        }
        sprylo2.cfr_renamed_4.cfr_renamed_12962(n, arg0);
    }

    private /* synthetic */ void cfr_renamed_16273(sprwbp arg0) {
        this.cfr_renamed_16197(arg0.cfr_renamed_29() ? new sprvlo() : new sprleo(arg0));
    }

    private /* synthetic */ int cfr_renamed_16272() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_11861()) {
            if (!this.cfr_renamed_4.cfr_renamed_14000(n)) {
                throw new IllegalStateException(sprboo.cfr_renamed_9("\u000f#\u001eN\u0017\f2\u000b;\u001a+N>\u00076\nx\u001d4\u0001,N=\u001c*\u0001*"));
            }
            if (this.cfr_renamed_4.cfr_renamed_576(n) == null) {
                return n;
            }
            n2 = ++n;
        }
        throw new IllegalStateException(sprbhi.cfr_renamed_9("/e\nb\u0003s@d\u000fr\u000es@n\u0013'\u000fr\u0014'\u000fa@u\u0001i\u0007bN"));
    }

    private /* synthetic */ void cfr_renamed_16274(sprwbp arg0) {
        sprylo sprylo2;
        sprnmo sprnmo2 = new sprnmo();
        if (sprwbp.cfr_renamed_13681(arg0, sprwbp.cfr_renamed_1447)) {
            sprylo2 = this;
            sprnmo2.cfr_renamed_16254(5);
        } else {
            sprnmo2.cfr_renamed_12554(arg0);
            sprylo2 = this;
        }
        sprylo2.cfr_renamed_16197(sprnmo2);
    }

    @sprtea
    public void cfr_renamed_16154(int arg0) {
        if (this.cfr_renamed_0) {
            if ((arg0 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                return;
            }
            this.cfr_renamed_4.cfr_renamed_16275(arg0);
            return;
        }
        this.cfr_renamed_4.cfr_renamed_12962(arg0, null);
    }

    private /* synthetic */ void cfr_renamed_16276() {
        sprcoo sprcoo2 = new sprcoo();
        this.cfr_renamed_16197(sprcoo2);
    }

    @sprtea
    public sprrt cfr_renamed_576(int arg0) {
        return (sprrt)this.cfr_renamed_4.cfr_renamed_576(arg0);
    }

    public void cfr_renamed_16277() {
        sprylo sprylo2 = this;
        sprylo sprylo3 = this;
        sprylo sprylo4 = this;
        sprylo sprylo5 = this;
        sprylo sprylo6 = this;
        sprylo sprylo7 = this;
        sprylo7.cfr_renamed_16273(sprwbp.cfr_renamed_955);
        sprylo7.cfr_renamed_16273(sprwbp.cfr_renamed_1513);
        sprylo7.cfr_renamed_16273(sprwbp.cfr_renamed_1534);
        sprylo sprylo8 = this;
        sprylo7.cfr_renamed_16273(new sprwbp(64, 64, 64));
        sprylo7.cfr_renamed_16273(sprwbp.cfr_renamed_1513);
        sprylo7.cfr_renamed_16273(sprwbp.cfr_renamed_1447);
        sprylo7.cfr_renamed_16274(sprwbp.cfr_renamed_955);
        sprylo7.cfr_renamed_16274(sprwbp.cfr_renamed_1513);
        sprylo6.cfr_renamed_16274(sprwbp.cfr_renamed_1447);
        sprylo6.cfr_renamed_16274(sprwbp.cfr_renamed_1447);
        sprylo6.cfr_renamed_16278("Microsoft Sans Serif");
        sprylo5.cfr_renamed_16278(sprboo.cfr_renamed_9("\u001b\u0001-\u001c1\u000b*N\u0016\u000b/"));
        sprylo5.cfr_renamed_16278("Microsoft Sans Serif");
        sprylo4.cfr_renamed_16278(sprbhi.cfr_renamed_9("S\u0001o\u000fj\u0001"));
        sprylo4.cfr_renamed_16278("Microsoft Sans Serif");
        sprylo4.cfr_renamed_16197(new sprjpo());
        sprylo3.cfr_renamed_16278("Microsoft Sans Serif");
        sprylo2.cfr_renamed_16278("Microsoft Sans Serif");
        sprylo3.cfr_renamed_16276();
        sprylo2.cfr_renamed_16276();
    }

    public void cfr_renamed_16279(int arg0) {
        long l;
        long l2 = l = 0L;
        while ((l2 & 0xFFFFFFFFL) < (long)arg0) {
            this.cfr_renamed_16197(null);
            l2 = l + 1L;
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprylo(boolean bl, spriy spriy2) {
        void arg0;
        sprylo sprylo2 = this;
        sprylo sprylo3 = this;
        sprylo3.cfr_renamed_4 = new sprrpp();
        sprylo2.cfr_renamed_0 = arg0;
        sprylo2.cfr_renamed_91 = spriy2;
    }

    private /* synthetic */ void cfr_renamed_16278(String arg0) {
        sprhoo sprhoo2;
        sprhoo sprhoo3 = sprhoo2 = new sprhoo(this.cfr_renamed_91);
        sprhoo3.cfr_renamed_16263(arg0);
        this.cfr_renamed_16197(sprhoo3);
    }
}

