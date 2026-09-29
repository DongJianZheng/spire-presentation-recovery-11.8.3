/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjfo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprhio
extends sprujo {
    @sprtea
    public float[] cfr_renamed_16658(int arg0) {
        int n;
        float[] fArray = new float[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            fArray[n++] = super.cfr_renamed_16457();
            n2 = n;
        }
        return fArray;
    }

    @sprtea
    public sprsuja[][] cfr_renamed_16480() {
        int n;
        sprhio sprhio2 = this;
        int n2 = super.cfr_renamed_12261();
        super.cfr_renamed_12261();
        sprsuja[][] sprsujaArray = new sprsuja[n2][];
        int[] nArray = this.cfr_renamed_16070(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprsujaArray[n4] = this.cfr_renamed_16454(nArray[n4]);
            n3 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public String cfr_renamed_16478(int arg0) {
        int n;
        byte[] byArray = super.cfr_renamed_16065(arg0);
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray2 = byArray;
        int n2 = byArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            byte by = byArray2[n];
            stringBuilder.append((char)(by & 0xFF));
            n3 = ++n;
        }
        return stringBuilder.toString();
    }

    public sprgeja cfr_renamed_16590() {
        return new sprgeja(this.cfr_renamed_16457(), this.cfr_renamed_16457(), this.cfr_renamed_16457(), this.cfr_renamed_16457());
    }

    @sprtea
    public sprsuja[] cfr_renamed_16471() {
        sprhio sprhio2 = this;
        return sprhio2.cfr_renamed_16454(super.cfr_renamed_12261());
    }

    @sprtea
    public int[] cfr_renamed_16455(int arg0) {
        int n;
        int[] nArray = new int[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            nArray[n++] = super.cfr_renamed_12137() & 0xFF;
            n2 = n;
        }
        return nArray;
    }

    @sprtea
    public sprgeja cfr_renamed_16068() {
        sprhio sprhio2 = this;
        int n = sprhio2.cfr_renamed_12261();
        int n2 = sprhio2.cfr_renamed_12261();
        int n3 = sprhio2.cfr_renamed_12261();
        int n4 = sprhio2.cfr_renamed_12261();
        return sprgeja.cfr_renamed_14827(sprrgga.cfr_renamed_12461(n, n3), sprrgga.cfr_renamed_12461(n2, n4), sprrgga.cfr_renamed_2548(n, n3), sprrgga.cfr_renamed_2548(n2, n4));
    }

    @sprtea
    public String cfr_renamed_16262(int arg0) {
        byte[] byArray = super.cfr_renamed_16065(arg0 * 2);
        return sprszca.cfr_renamed_12801().cfr_renamed_14565(byArray);
    }

    @sprtea
    public sprsuja[] cfr_renamed_16071(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprhio sprhio2 = this;
            int n3 = super.cfr_renamed_12261();
            int n4 = super.cfr_renamed_12261();
            sprsujaArray[n++] = new sprsuja(n3, n4);
            n2 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public sprsuja cfr_renamed_16647() {
        sprhio sprhio2 = this;
        float f = super.cfr_renamed_16457();
        float f2 = super.cfr_renamed_16457();
        return new sprsuja(f, f2);
    }

    @sprtea
    public sprsuja[] cfr_renamed_16075() {
        sprhio sprhio2 = this;
        return sprhio2.cfr_renamed_16071(super.cfr_renamed_12261());
    }

    @sprtea
    public sprsuja cfr_renamed_16067() {
        sprhio sprhio2 = this;
        int n = super.cfr_renamed_12261();
        int n2 = super.cfr_renamed_12261();
        return new sprsuja(n, n2);
    }

    @sprtea
    public sprjfo cfr_renamed_16077() {
        sprhio sprhio2 = this;
        int n = sprhio2.cfr_renamed_12261();
        int n2 = sprhio2.cfr_renamed_12261();
        int n3 = sprhio2.cfr_renamed_12261();
        int n4 = sprhio2.cfr_renamed_12261();
        return new sprjfo(n, n2, n3, n4);
    }

    @sprtea
    public sprphja cfr_renamed_16076() {
        sprhio sprhio2 = this;
        int n = super.cfr_renamed_12261();
        int n2 = super.cfr_renamed_12261();
        return new sprphja(n, n2);
    }

    @sprtea
    public sprwbp cfr_renamed_16078() {
        sprhio sprhio2 = this;
        int n = super.cfr_renamed_12137() & 0xFF;
        int n2 = super.cfr_renamed_12137() & 0xFF;
        int n3 = super.cfr_renamed_12137() & 0xFF;
        super.cfr_renamed_12137();
        return new sprwbp(n, n2, n3);
    }

    @sprtea
    public float[] cfr_renamed_16783() {
        sprhio sprhio2 = this;
        return sprhio2.cfr_renamed_16658(super.cfr_renamed_12261());
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
    public sprqgp cfr_renamed_16486() {
        sprhio sprhio2 = this;
        float f = sprhio2.cfr_renamed_16457();
        float f2 = sprhio2.cfr_renamed_16457();
        float f3 = sprhio2.cfr_renamed_16457();
        float f4 = sprhio2.cfr_renamed_16457();
        float f5 = sprhio2.cfr_renamed_16457();
        float f6 = sprhio2.cfr_renamed_16457();
        return new sprqgp(f, f2, f3, f4, f5, f6);
    }

    @sprtea
    public sprwbp cfr_renamed_16637() {
        sprhio sprhio2 = this;
        int n = super.cfr_renamed_12137() & 0xFF;
        int n2 = super.cfr_renamed_12137() & 0xFF;
        int n3 = super.cfr_renamed_12137() & 0xFF;
        int n4 = super.cfr_renamed_12137() & 0xFF;
        return new sprwbp(n4, n3, n2, n);
    }

    @sprtea
    public int[] cfr_renamed_16070(int arg0) {
        int n;
        int[] nArray = new int[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            nArray[n++] = super.cfr_renamed_12261();
            n2 = n;
        }
        return nArray;
    }

    @sprtea
    public sprsuja[] cfr_renamed_16454(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprhio sprhio2 = this;
            short s = super.cfr_renamed_12254();
            short s2 = super.cfr_renamed_12254();
            sprsujaArray[n++] = new sprsuja(s, s2);
            n2 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public sprhio(spreen arg0) {
        super(arg0);
    }

    @sprtea
    public int[] cfr_renamed_16084() {
        sprhio sprhio2 = this;
        return sprhio2.cfr_renamed_16070(super.cfr_renamed_12261());
    }

    @sprtea
    public sprsuja[][] cfr_renamed_16069() {
        int n;
        sprhio sprhio2 = this;
        int n2 = super.cfr_renamed_12261();
        super.cfr_renamed_12261();
        sprsuja[][] sprsujaArray = new sprsuja[n2][];
        int[] nArray = this.cfr_renamed_16070(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprsujaArray[n4] = this.cfr_renamed_16071(nArray[n4]);
            n3 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public sprsuja[] cfr_renamed_16631(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprsujaArray[n++] = this.cfr_renamed_16647();
            n2 = n;
        }
        return sprsujaArray;
    }
}

