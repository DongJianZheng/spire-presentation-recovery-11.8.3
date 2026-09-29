/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import java.util.ArrayList;

@sprtea
public class sprooo
extends sprflo {
    private static final int cfr_renamed_3 = 15;
    private ArrayList<String> cfr_renamed_4;

    @sprtea
    public static ArrayList<String> cfr_renamed_11774(byte[] arg0) {
        return new sprooo(arg0).cfr_renamed_137();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprooo(byte[] byArray) {
        super(new sprdfo((byte[])arg0), new sprlmo(null));
        void arg0;
    }

    private /* synthetic */ ArrayList<String> cfr_renamed_137() {
        sprooo sprooo2 = this;
        sprooo sprooo3 = this;
        sprooo2.cfr_renamed_4 = new ArrayList();
        sprooo2.cfr_renamed_13697(false);
        return sprooo2.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_16062() {
        if (this.cfr_renamed_16063().cfr_renamed_324() == 1574) {
            sprooo sprooo2 = this;
            short s = sprooo2.cfr_renamed_16064().cfr_renamed_12254();
            int n = sprooo2.cfr_renamed_16064().cfr_renamed_13218() & 0xFFFF;
            if (s == 15) {
                String string;
                String string2 = string = sprszca.cfr_renamed_14249().cfr_renamed_14565(this.cfr_renamed_16064().cfr_renamed_16065(n));
                sprovja.cfr_renamed_16066(this.cfr_renamed_4, string2.substring(0, 0 + (string2.length() - 1)));
            }
        } else if (this.cfr_renamed_16063().cfr_renamed_324() == 2610) {
            this.cfr_renamed_16064().cfr_renamed_16067();
            sprooo sprooo3 = this;
            int n = sprooo3.cfr_renamed_16064().cfr_renamed_13218() & 0xFFFF;
            short s = sprooo3.cfr_renamed_16064().cfr_renamed_12254();
            if (s != 0) {
                this.cfr_renamed_16064().cfr_renamed_16068();
            }
            if (n != 0) {
                sprovja.cfr_renamed_16066(this.cfr_renamed_4, sprszca.cfr_renamed_14249().cfr_renamed_14565(this.cfr_renamed_16064().cfr_renamed_16065(n)));
            }
        }
        return true;
    }
}

