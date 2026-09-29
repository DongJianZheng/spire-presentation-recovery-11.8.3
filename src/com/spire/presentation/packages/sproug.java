/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkyca;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprwdn;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class sproug
extends sprxgf
implements sprme {
    public static final sprqbn cfr_renamed_2 = new sprwdn(sproug.class, 4);
    public static final byte[] cfr_renamed_3 = new byte[0];
    public byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_2414() {
        return this.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sproug(byte[] byArray) {
        void arg0;
        if (byArray == null) {
            throw new NullPointerException(sprlfg.cfr_renamed_9("%\u0001v\u0000k\u001ceU\"\u0011c\u001cl\u001dvR`\u0017\"\u001cw\u001en"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public String toString() {
        return new StringBuilder().insert(0, "#").append(sprkoe.cfr_renamed_184(sprfqe.cfr_renamed_485(this.cfr_renamed_4))).toString();
    }

    public static sproug cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sproug)cfr_renamed_2.cfr_renamed_11433(arg0, arg1);
    }

    public static sproug cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sproug) {
            return (sproug)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sproug) {
                return (sproug)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sproug)cfr_renamed_2.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprkyca.cfr_renamed_9("k_dRhZ-Jb\u001enQcMyLx]y\u001eB}Y{Y\u001e^j_wCy-X\u007fQ`\u001eoGy[Vc7\u001e")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlfg.cfr_renamed_9("k\u001en\u0017e\u0013nRm\u0010h\u0017a\u0006\"\u001blRe\u0017v;l\u0001v\u0013l\u0011gH\"")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return new sprfvg(this.cfr_renamed_4);
    }

    @Override
    public InputStream cfr_renamed_698() {
        return new ByteArrayInputStream(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_186() {
        return this.cfr_renamed_4;
    }

    public static sproug cfr_renamed_11295(byte[] arg0) {
        return new sprfvg(arg0);
    }

    public sprme cfr_renamed_4828() {
        return this;
    }

    @Override
    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_186());
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sproug)) {
            return false;
        }
        sproug sproug2 = (sproug)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sproug2.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return new sprfvg(this.cfr_renamed_4);
    }
}

