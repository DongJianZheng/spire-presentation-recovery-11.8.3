/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgvja;
import com.spire.presentation.packages.sprjfo;
import com.spire.presentation.packages.sprkfo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprkko
extends sprujo {
    @sprtea
    public sprsuja[][] cfr_renamed_16069() {
        int n;
        int n2 = super.cfr_renamed_13218();
        sprsuja[][] sprsujaArray = new sprsuja[n2][];
        int[] nArray = this.cfr_renamed_16070(n2 & 0xFFFF);
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            int n4 = n++;
            sprsujaArray[n4] = this.cfr_renamed_16071(nArray[n4]);
            n3 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public String cfr_renamed_16072(int arg0, sprcgo arg1) {
        sprkko sprkko2 = this;
        byte[] byArray = super.cfr_renamed_16065(arg0);
        String string = arg1.cfr_renamed_14565(byArray);
        if (sprkko2.cfr_renamed_16073(string)) {
            string = this.cfr_renamed_16074(string, byArray, arg1);
            return string;
        }
        return string;
    }

    @sprtea
    public sprsuja[] cfr_renamed_16075() {
        sprkko sprkko2 = this;
        return sprkko2.cfr_renamed_16071(super.cfr_renamed_13218() & 0xFFFF);
    }

    @sprtea
    public sprphja cfr_renamed_16076() {
        sprkko sprkko2 = this;
        short s = super.cfr_renamed_12254();
        short s2 = super.cfr_renamed_12254();
        return new sprphja(s2, s);
    }

    @sprtea
    public sprsuja[] cfr_renamed_16071(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprkko sprkko2 = this;
            short s = super.cfr_renamed_12254();
            short s2 = super.cfr_renamed_12254();
            sprsujaArray[n++] = new sprsuja(s, s2);
            n2 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public int[] cfr_renamed_16070(int arg0) {
        int n;
        int[] nArray = new int[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            nArray[n++] = super.cfr_renamed_12254();
            n2 = n;
        }
        return nArray;
    }

    @sprtea
    public sprjfo cfr_renamed_16077() {
        sprkko sprkko2 = this;
        short s = sprkko2.cfr_renamed_12254();
        short s2 = sprkko2.cfr_renamed_12254();
        short s3 = sprkko2.cfr_renamed_12254();
        short s4 = sprkko2.cfr_renamed_12254();
        return new sprjfo(s, s2, s3, s4);
    }

    @sprtea
    public sprwbp cfr_renamed_16078() {
        sprkko sprkko2 = this;
        int n = super.cfr_renamed_12137() & 0xFF;
        int n2 = super.cfr_renamed_12137() & 0xFF;
        int n3 = super.cfr_renamed_12137() & 0xFF;
        super.cfr_renamed_12137();
        return new sprwbp(n, n2, n3);
    }

    @sprtea
    public sprkko(spreen arg0) {
        super(arg0);
    }

    @sprtea
    public sprgeja cfr_renamed_16079() {
        int[] nArray = this.cfr_renamed_16070(4);
        return sprgeja.cfr_renamed_14827(nArray[3], nArray[2], nArray[1], nArray[0]);
    }

    private /* synthetic */ boolean cfr_renamed_16073(String arg0) {
        return arg0.indexOf(65533) >= 0;
    }

    @sprtea
    public sprsuja cfr_renamed_16067() {
        sprkko sprkko2 = this;
        short s = super.cfr_renamed_12254();
        short s2 = super.cfr_renamed_12254();
        return new sprsuja(s2, s);
    }

    @sprtea
    public int[] cfr_renamed_16080(int arg0) {
        int n;
        int[] nArray = new int[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            nArray[n++] = super.cfr_renamed_12254();
            n2 = n;
        }
        return nArray;
    }

    @sprtea
    public sprgeja cfr_renamed_16081() {
        int[] nArray = this.cfr_renamed_16070(4);
        return new sprgeja(nArray[3], nArray[2], nArray[1], nArray[0]);
    }

    @sprtea
    public sprgvja cfr_renamed_16082() {
        sprkko sprkko2 = this;
        short s = super.cfr_renamed_12254();
        short s2 = super.cfr_renamed_12254();
        return new sprgvja(s2, s);
    }

    @sprtea
    public sprgeja cfr_renamed_16068() {
        int[] nArray = this.cfr_renamed_16070(4);
        return sprgeja.cfr_renamed_14827(nArray[0], nArray[1], nArray[2], nArray[3]);
    }

    private /* synthetic */ String cfr_renamed_16074(String arg0, byte[] arg1, sprcgo arg2) {
        if (arg2 instanceof sprkfo && ((sprkfo)arg2).cfr_renamed_16083() != sprszca.cfr_renamed_11605()) {
            return arg0;
        }
        arg2 = new sprkfo(sprszca.cfr_renamed_12817(936));
        return arg2.cfr_renamed_14565(arg1);
    }

    @sprtea
    public int[] cfr_renamed_16084() {
        sprkko sprkko2 = this;
        return sprkko2.cfr_renamed_16070(super.cfr_renamed_13218() & 0xFFFF);
    }
}

