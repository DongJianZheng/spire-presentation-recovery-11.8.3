/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprrgda;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class sprxue
extends sprvva
implements sprwf {
    public byte[] cfr_renamed_4;

    @Override
    public InputStream cfr_renamed_698() {
        return new ByteArrayInputStream(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprxue)) {
            return false;
        }
        sprxue sprxue2 = (sprxue)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprxue2.cfr_renamed_4);
    }

    public static sprxue cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprxue) {
            return sprxue.cfr_renamed_23(sprvva2);
        }
        return sprnle.cfr_renamed_4758(sprbne.cfr_renamed_23(sprvva2));
    }

    @Override
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_186());
    }

    public sprwf cfr_renamed_4828() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxue cfr_renamed_23(Object arg0) {
        sprvva sprvva2;
        if (arg0 == null || arg0 instanceof sprxue) {
            return (sprxue)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprxue.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprrgda.cfr_renamed_9("m$b)n!+1deh*e6\u007f7~&\u007feD\u0006_\u0000_eX\u0011Y\fE\u0002+#y*fei<\u007f P\u00181e")).append(iOException.getMessage()).toString());
            }
        }
        if (arg0 instanceof spra && (sprvva2 = ((spra)arg0).cfr_renamed_119()) instanceof sprxue) {
            return (sprxue)sprvva2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("^G[NPJ[\u000bXI]NT_\u0017BY\u000bPNCbYXCJYHR\u0011\u0017")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_4612() {
        return new sprlqe(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_186() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_4615() {
        return new sprlqe(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprxue(byte[] byArray) {
        void arg0;
        if (byArray == null) {
            throw new NullPointerException(sprrgda.cfr_renamed_9("6\u007f7b+leh$e+d1+'nee0g)"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public String toString() {
        return new StringBuilder().insert(0, "#").append(new String(sprmma.cfr_renamed_485(this.cfr_renamed_4))).toString();
    }

    @Override
    public sprvva cfr_renamed_2414() {
        return this.cfr_renamed_119();
    }
}

