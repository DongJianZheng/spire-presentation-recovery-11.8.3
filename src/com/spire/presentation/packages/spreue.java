/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmpe;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprnli;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvub;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class spreue
extends sprkra
implements sprkj {
    private sprbne cfr_renamed_2;
    private sprxue cfr_renamed_3;
    private sprnje cfr_renamed_4;

    public sprnje cfr_renamed_592() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spreue(sprmpe[] sprmpeArray) {
        void arg0;
        spreue spreue2 = this;
        spreue2.cfr_renamed_2 = new sprpse((spra[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spreue(sprmpe sprmpe2) {
        void arg0;
        spreue spreue2 = this;
        spreue2.cfr_renamed_2 = new sprpse((spra)arg0);
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return new sprhse(0 != 0, 0, this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public spreue(byte[] byArray) {
        void arg0;
        spreue spreue2 = this;
        spreue2.cfr_renamed_3 = new sprlqe((byte[])arg0);
    }

    public String toString() {
        if (this.cfr_renamed_3 != null) {
            return new StringBuilder().insert(0, sprvub.cfr_renamed_9("\u0015\n%\nq\u0010[")).append(this.cfr_renamed_3).append(sprnli.cfr_renamed_9("k\u0003")).toString();
        }
        if (this.cfr_renamed_4 != null) {
            return new StringBuilder().insert(0, sprvub.cfr_renamed_9("\u0015\n%\nq\u0010[")).append(this.cfr_renamed_4).append(sprnli.cfr_renamed_9("k\u0003")).toString();
        }
        return new StringBuilder().insert(0, sprvub.cfr_renamed_9("\u0015\n%\nq\u0010[")).append(this.cfr_renamed_2).append(sprnli.cfr_renamed_9("k\u0003")).toString();
    }

    public static spreue cfr_renamed_341(spryte arg0, boolean arg1) {
        return spreue.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public spreue(sprxue sprxue2) {
        this.cfr_renamed_3 = sprxue2;
    }

    public sprxue cfr_renamed_2578() {
        return this.cfr_renamed_3;
    }

    public spreue(sprnje sprnje2) {
        this.cfr_renamed_4 = sprnje2;
    }

    public sprmpe[] cfr_renamed_626() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprmpe[] sprmpeArray = new sprmpe[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprmpeArray.length) {
            int n3 = n++;
            sprmpeArray[n3] = sprmpe.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprmpeArray;
    }

    private /* synthetic */ spreue(sprbne sprbne2) {
        this.cfr_renamed_2 = sprbne2;
    }

    public static spreue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreue) {
            return (spreue)arg0;
        }
        if (arg0 instanceof sprxue) {
            return new spreue((sprxue)arg0);
        }
        if (arg0 instanceof sprbne) {
            return new spreue(sprnje.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spryte) {
            return new spreue(sprbne.cfr_renamed_341((spryte)arg0, false));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvub.cfr_renamed_9("\u0004\u0005:\u0005>\u001c?K>\t;\u000e2\u001fq\u0018$\t<\u0002%\u001f4\u000fq\u001f>K6\u000e%\"?\u0018%\n?\b4Qq")).append(arg0.getClass().getName()).toString());
    }
}

