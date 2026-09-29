/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcj;
import com.spire.presentation.packages.sprcwd;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprlje;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprsce;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwue;
import com.spire.presentation.packages.sprxrc;
import com.spire.presentation.packages.spryje;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprqtd {
    public static final int cfr_renamed_119 = 5;
    private spryje cfr_renamed_91;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 1;

    /*
     * WARNING - void declaration
     */
    public sprqtd(InputStream inputStream) throws IOException {
        this(new sprgle((InputStream)arg0));
        void arg0;
    }

    public int cfr_renamed_648() {
        return this.cfr_renamed_91.cfr_renamed_4115().cfr_renamed_97().intValue();
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprqtd)) {
            return false;
        }
        sprqtd sprqtd2 = (sprqtd)arg0;
        return this.cfr_renamed_91.equals(sprqtd2.cfr_renamed_91);
    }

    public spryje cfr_renamed_568() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_4284() throws sprbud {
        sprlje sprlje2 = this.cfr_renamed_91.cfr_renamed_4285();
        if (sprlje2 == null) {
            return null;
        }
        if (!sprlje2.cfr_renamed_4286().equals(sprcj.cfr_renamed_3)) {
            return sprlje2.cfr_renamed_3262();
        }
        try {
            sprvva sprvva2 = sprvva.cfr_renamed_184(sprlje2.cfr_renamed_3262().cfr_renamed_186());
            return new sprcwd(sprsce.cfr_renamed_23(sprvva2));
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprskea.cfr_renamed_9("kVtFwAv\u0004\u007fAxK\u007fMuC;KyN~Go\u001e;")).append(exception).toString(), exception);
        }
    }

    public sprqtd(spryje spryje2) {
        this.cfr_renamed_91 = spryje2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprqtd(sprgle arg0) throws IOException {
        try {
            this.cfr_renamed_91 = spryje.cfr_renamed_23(arg0.cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprxrc.cfr_renamed_9("RUSRPFRQ[\u0014MQLDPZLQ\u0005\u0014")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprskea.cfr_renamed_9("IzH}KiI~@;V~WkKuW~\u001e;")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (sprwue sprwue2) {
            throw new sprqwd(new StringBuilder().insert(0, sprxrc.cfr_renamed_9("RUSRPFRQ[\u0014MQLDPZLQ\u0005\u0014")).append(sprwue2.getMessage()).toString(), sprwue2);
        }
        if (this.cfr_renamed_91 == null) {
            throw new sprqwd(sprskea.cfr_renamed_9("IzH}KiI~@;V~WkKuW~\u001e;Jt\u0004iAhTtJhA;@zPz\u0004}KnJ\u007f"));
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_91.cfr_renamed_91();
    }

    /*
     * WARNING - void declaration
     */
    public sprqtd(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public int hashCode() {
        return this.cfr_renamed_91.hashCode();
    }
}

