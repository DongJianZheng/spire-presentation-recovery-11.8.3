/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.spraue;
import com.spire.presentation.packages.spreoq;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprrhq;
import com.spire.presentation.packages.sprrl;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.InputStream;

public class sprsqd {
    private spraue cfr_renamed_3;
    private sprnte cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4180(spraa arg0) throws sprlqd {
        try {
            sprnte sprnte2 = this.cfr_renamed_3.cfr_renamed_2589();
            sprpa sprpa2 = arg0.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_410());
            sprpa2.cfr_renamed_470().write(((sprxue)sprnte2.cfr_renamed_480()).cfr_renamed_186());
            return sprzra.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_580(), sprpa2.cfr_renamed_580());
        }
        catch (sprfya sprfya2) {
            throw new sprlqd(new StringBuilder().insert(0, sprrhq.cfr_renamed_9(":\t.\u0005#\u0002o\u0013 G,\u0015*\u0006;\u0002o\u0003&\u0000*\u0014;G,\u0006#\u0004:\u000b.\u0013 \u0015uG")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, spreoq.cfr_renamed_9("dupy}~1kctr~bh1x~ue~\u007fo+;")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_4.cfr_renamed_696();
    }

    public sprnte cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprsqd(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_3.cfr_renamed_410();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrl cfr_renamed_4181() throws sprlqd {
        sprnte sprnte2 = this.cfr_renamed_3.cfr_renamed_2589();
        try {
            return new sprard(sprnte2.cfr_renamed_696(), ((sprxue)sprnte2.cfr_renamed_480()).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprlqd(sprrhq.cfr_renamed_9("*\u001f,\u0002?\u0013&\b!G=\u0002.\u0003&\t(G+\u000e(\u0002<\u0013*\u0003o\u0014;\u0015*\u0006\"I"), exception);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprsqd(sprnte sprnte2) throws sprlqd {
        this.cfr_renamed_4 = sprnte2;
        try {
            void arg0;
            this.cfr_renamed_3 = spraue.cfr_renamed_23(arg0.cfr_renamed_480());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(spreoq.cfr_renamed_9("\\z}}~i|~u;rt\u007fotue5"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprrhq.cfr_renamed_9("\u0002\u0006#\u0001 \u0015\"\u0002+G,\b!\u0013*\t;I"), illegalArgumentException);
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public sprsqd(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }
}

