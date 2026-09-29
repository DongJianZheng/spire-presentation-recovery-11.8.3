/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprgme;
import com.spire.presentation.packages.sprnoq;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprstq;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprfpe
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_427(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public static sprfpe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgme) {
            return new sprfpe(((sprgme)arg0).cfr_renamed_186());
        }
        if (arg0 == null || arg0 instanceof sprfpe) {
            return (sprfpe)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                return new sprfpe(((sprgme)sprfpe.cfr_renamed_184((byte[])arg0)).cfr_renamed_186());
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprstq.cfr_renamed_9("=#;\"<$6*x(*?7?x$6m?(,\u00046>,,6.=wx")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnoq.cfr_renamed_9(")I,@'D,\u0005/G*@#Q`L.\u0005'@4l.V4D.F%\u001f`")).append(arg0.getClass().getName()).toString());
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public sprfpe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    public sprfpe(String arg0) {
        this(sprywa.cfr_renamed_431(arg0));
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprfpe)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, ((sprfpe)arg0).cfr_renamed_4);
    }

    public static sprfpe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprgme || sprvva2 instanceof sprfpe) {
            return sprfpe.cfr_renamed_23(sprvva2);
        }
        return new sprfpe(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(20, this.cfr_renamed_4);
    }
}

