/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbv;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfuo;
import com.spire.presentation.packages.sprfxo;
import com.spire.presentation.packages.sprizo;
import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtwo;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwmq;
import com.spire.presentation.packages.sprxap;
import com.spire.presentation.packages.sprxnc;

@sprtea
public class sprhqo
implements sprjt {
    private boolean cfr_renamed_119;
    private sprizo cfr_renamed_91;
    private sprvrx<sprbv> cfr_renamed_0;
    private static final sprusca cfr_renamed_1;
    private sprtwo cfr_renamed_2;
    private static final char cfr_renamed_3 = '>';
    private int cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17330(sprvrx arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @sprtea
    public sprxap cfr_renamed_17331() {
        sprxap sprxap2;
        sprxap sprxap3 = sprxap2 = new sprxap();
        this.cfr_renamed_17332().add(sprxap3);
        return sprxap3;
    }

    @sprtea
    public sprizo cfr_renamed_17333() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public void cfr_renamed_17334(sprtwo arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public sprtwo cfr_renamed_17335() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public int cfr_renamed_17336() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public boolean cfr_renamed_17337() {
        return this.cfr_renamed_119;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public void cfr_renamed_17338(String arg0, sprhqo arg1) {
        switch (cfr_renamed_1.cfr_renamed_12854(arg0)) {
            case 0: {
                arg1.cfr_renamed_17339(1);
                return;
            }
            case 1: {
                arg1.cfr_renamed_17339(2);
                return;
            }
            case 2: {
                arg1.cfr_renamed_17339(3);
                return;
            }
            case 3: {
                arg1.cfr_renamed_17339(4);
                return;
            }
            case 4: {
                arg1.cfr_renamed_17339(5);
                return;
            }
            case 5: {
                arg1.cfr_renamed_17339(6);
                return;
            }
            case 6: {
                arg1.cfr_renamed_17339(7);
                return;
            }
        }
        arg1.cfr_renamed_17339(0);
    }

    @sprtea
    public void cfr_renamed_17340(sprizo arg0) {
        this.cfr_renamed_91 = arg0;
    }

    static {
        String[] stringArray = new String[7];
        stringArray[0] = sprwmq.cfr_renamed_9("MWdVl\\b\u00124");
        stringArray[1] = sprxnc.cfr_renamed_9("\tF G(M&\u0003s");
        stringArray[2] = sprwmq.cfr_renamed_9("MWdVl\\b\u00126");
        stringArray[3] = sprxnc.cfr_renamed_9("\tF G(M&\u0003u");
        stringArray[4] = sprwmq.cfr_renamed_9("MWdVl\\b\u00120");
        stringArray[5] = sprxnc.cfr_renamed_9("\tF G(M&\u0003w");
        stringArray[6] = sprwmq.cfr_renamed_9("TGjF`");
        cfr_renamed_1 = new sprusca(stringArray);
    }

    @sprtea
    public sprfxo cfr_renamed_17341() {
        sprfxo sprfxo2;
        sprfxo sprfxo3 = sprfxo2 = new sprfxo();
        this.cfr_renamed_17332().add(sprfxo3);
        return sprfxo3;
    }

    @sprtea
    public sprvrx<sprbv> cfr_renamed_17332() {
        if (this.cfr_renamed_0 == null) {
            sprhqo sprhqo2 = this;
            sprhqo2.cfr_renamed_0 = new sprvrx();
        }
        return this.cfr_renamed_0;
    }

    @sprtea
    public void cfr_renamed_17339(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void cfr_renamed_2637() {
        for (sprbv sprbv2 : this.cfr_renamed_17332()) {
            if (!(sprbv2 instanceof sprfuo)) continue;
            spresca.cfr_renamed_11777(sprbv2, sprfuo.class).cfr_renamed_2637();
        }
        if (this.cfr_renamed_0 != null) {
            this.cfr_renamed_0.clear();
            this.cfr_renamed_0 = null;
        }
        this.cfr_renamed_2 = null;
        this.cfr_renamed_91 = null;
    }

    @sprtea
    public sprfuo cfr_renamed_17342() {
        sprfuo sprfuo2;
        sprfuo sprfuo3 = sprfuo2 = new sprfuo();
        this.cfr_renamed_17332().add(sprfuo3);
        return sprfuo3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public String cfr_renamed_17343(sprhqo arg0, String arg1) {
        if (arg0.cfr_renamed_17332().size() <= 0) return arg1;
        switch (arg0.cfr_renamed_17336()) {
            case 1: {
                return sprxnc.cfr_renamed_9("\u0000a");
            }
            case 2: {
                return sprwmq.cfr_renamed_9("&\u0011%");
            }
            case 3: {
                return sprxnc.cfr_renamed_9("\u0000b\u0000a");
            }
            case 4: {
                return sprwmq.cfr_renamed_9("&\u0011&\u0011%");
            }
            case 5: {
                return sprxnc.cfr_renamed_9("\u0000b\u0000b\u0000a");
            }
            case 6: {
                return sprwmq.cfr_renamed_9("&\u0011&\u0011&\u0011%");
            }
            case 7: {
                return Character.toString('>');
            }
        }
        return arg1;
    }

    @sprtea
    public void cfr_renamed_17344(boolean arg0) {
        this.cfr_renamed_119 = arg0;
    }
}

