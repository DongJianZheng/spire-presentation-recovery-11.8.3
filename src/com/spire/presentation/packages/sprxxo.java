/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprezh;
import com.spire.presentation.packages.sprfso;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprmcja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpt;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxto;
import com.spire.presentation.packages.sprycb;

@sprtea
public final class sprxxo
extends sprvqo {
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_13227(spreen arg0) {
        this.cfr_renamed_18604(arg0, new sprfso());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_14127(spreen arg0) {
        sprmcja sprmcja2;
        byte[] byArray;
        sprmcja sprmcja3;
        String string;
        block4: {
            block3: {
                string = this.cfr_renamed_13261().cfr_renamed_13302().replace(" ", "");
                sprmcja3 = new sprmcja(arg0);
                sprmcja3.cfr_renamed_11735(sprycb.cfr_renamed_9("J}\nU\u0011h\u0000O,U\fOE\u00145I\nX6^\u0011\u001b\u0003R\u000b_\u0017^\u0016T\u0010I\u0006^EY\u0000\\\fU"));
                sprpdja sprpdja2 = new sprpdja();
                try {
                    sprmcja sprmcja4 = new sprmcja(sprpdja2);
                    sprpdja sprpdja3 = sprpdja2;
                    sprmcja sprmcja5 = sprmcja4;
                    sprmcja5.cfr_renamed_11735(sprezh.cfr_renamed_9("Tzf|sJfzf"));
                    sprmcja5.cfr_renamed_2947();
                    this.cfr_renamed_13227(sprpdja3);
                    byArray = sprpdja3.cfr_renamed_4529();
                    if (sprpdja2 == null) break block3;
                    sprmcja2 = sprmcja3;
                }
                catch (Throwable throwable) {
                    if (sprpdja2 != null) {
                        sprpdja2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
                sprpdja2.cfr_renamed_2637();
                break block4;
            }
            sprmcja2 = sprmcja3;
        }
        sprmcja2.cfr_renamed_11676(sprycb.cfr_renamed_9("J@UFE@TF"), string, byArray.length);
        sprmcja sprmcja6 = sprmcja3;
        sprmcja3.cfr_renamed_11735(sprezh.cfr_renamed_9("d{u|b`shnbb.(OTMNGOk\u007fJbmhjb.agkzb|'mqv'k\u007fkd"));
        sprmcja6.cfr_renamed_11735(sprxxo.cfr_renamed_18250(byArray));
        sprmcja6.cfr_renamed_11735(">");
        sprmcja6.cfr_renamed_2947();
    }

    @Override
    public boolean cfr_renamed_14867() {
        return false;
    }

    private /* synthetic */ void cfr_renamed_18604(spreen arg0, sprpt arg1) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_13323().cfr_renamed_11861()) {
            int n3;
            int n4 = n3 = ((Integer)this.cfr_renamed_13323().cfr_renamed_13485(n)).intValue();
            sprdsp2.cfr_renamed_12962(n4, n4);
            n2 = ++n;
        }
        sprjzo sprjzo2 = new sprjzo();
        sprjzo2.cfr_renamed_18466(this.cfr_renamed_13261(), sprdsp2, arg0, this.cfr_renamed_4, arg1);
    }

    @Override
    public sprrpp cfr_renamed_13482(sprqt arg0) {
        this.cfr_renamed_18607(arg0, 0, sprycb.cfr_renamed_9("5Z\u0017H\fU\u0002\u001b\u0002W\u001cK\r\u001b\u0001Z\u0011ZET\u0003\u001b*K\u0000U1B\u0015^Mx#}L\u001b\u0003T\u000bOER\u0016\u001b\u000bT\u0011\u001b\u0016N\u0015K\nI\u0011^\u0001\u0015"));
        return new sprrpp();
    }

    @Override
    public void cfr_renamed_16893(spreen arg0) {
        this.cfr_renamed_18604(arg0, new sprxto());
    }

    @Override
    public int cfr_renamed_18605(int arg0) {
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxxo(sprfzo sprfzo2, boolean bl) {
        void arg0;
        sprxxo sprxxo2 = this;
        super((sprfzo)arg0);
        sprxxo2.cfr_renamed_18606();
        sprxxo2.cfr_renamed_4 = bl;
    }

    private static /* synthetic */ String cfr_renamed_18250(byte[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (n > 0 && n % 36 == 0) {
                sprghha.cfr_renamed_14118(stringBuilder);
            }
            Object[] objectArray = new Object[1];
            Byte by = arg0[n];
            objectArray[0] = by;
            sprghha.cfr_renamed_12289(stringBuilder, sprezh.cfr_renamed_9("u74\u007f<z"), objectArray);
            n2 = ++n;
        }
        return stringBuilder.toString();
    }
}

